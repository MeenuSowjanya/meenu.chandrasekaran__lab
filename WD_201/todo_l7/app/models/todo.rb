class Todo < ApplicationRecord
      def to_pleasant_string
        is_completed = completed ? "[X]" : "[ ]"
        "#{id}. #{is_completed} #{todo_text} #{due_date}"
      end
      def self.overdue
        where("due_date < ?", Date.today)
      end
      def self.duetoday
        where(due_date: Date.today)
      end
      def self.duelater
        where("due_date > ?", Date.today)
      end
      def self.completed
        where(completed: 1)
      end
end
