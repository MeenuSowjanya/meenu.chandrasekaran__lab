
def get_command_line_argument

  if ARGV.empty?
    puts "Usage: ruby lookup.rb <domain>"
    exit
  end
  ARGV.first
  
end


domain = get_command_line_argument

dns_raw = File.readlines("zone")

IP_ADDRESS_REGEX = /^((?:(?:^|\.)(?:\d|[1-9]\d|1\d{2}|2[0-4]\d|25[0-5])){4})$/
URL_REGEX = /^((?!-)[A-Za-z0-9-]{1, 63}(?<!-)\\.)+[A-Za-z]{2, 6}$/
def is_valid_ip_address? ip
    ip =~ IP_ADDRESS_REGEX
end
def is_valid_url? url 
  url =~ URL_REGEX
end

def parse_dns(dns_raw)

  valid_record_types = ["A","CNAME"]

  dns_raw.
    select { |line| valid_record_types.include? ((line.split(",")[0])) }.
    map { |line| line.split(",") }.
    reject do |record|
    record.length != 3
  end
    .each_with_object({}) do |record, records|
    if (((is_valid_ip_address? (records[record[1]].strip)) || (is_valid_url? (records[record[1]].strip)))
    records[record[1].strip()] = { record_type: record[0].strip(), destination: record[2].strip() }
    end
  end

end

def resolve(dns_records, lookup_chain, domain)

  record = dns_records[domain]

  if (!record)

    lookup_chain[0] = "Error: Record not found for " + domain
    return lookup_chain

  elsif record[:record_type] == "A"

    return lookup_chain << record[:destination]

  elsif record[:record_type] == "CNAME"

    lookup_chain << record[:destination]
    resolve(dns_records, lookup_chain, record[:destination])

  else

    lookup_chain[0] = "Invalid record type for " + domain
    return lookup_chain
  end
end

dns_records = parse_dns(dns_raw)

lookup_chain = [domain]
lookup_chain = resolve(dns_records, lookup_chain, domain)

puts lookup_chain.join(" => ")
