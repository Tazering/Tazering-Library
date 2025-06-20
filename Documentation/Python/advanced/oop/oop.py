# Python Object-Oriented Programming
class Employee:

    num_of_emps = 0
    raise_amt = 1.04

    def __init__(self, first, last, pay): # constructor
        self.first = first
        self.last = last
        self.pay = pay
        Employee.num_of_emps += 1
    
    @property
    def fullname(self):
        return f"{self.first} {self.last}"
    
    def apply_raise(self):
        self.pay = int(self.pay * self.raise_amt)
    
    @classmethod
    def set_raise_amt(cls, amount):
        cls.raise_amt = amount

    @classmethod # alternative constructor
    def from_string(cls, emp_str):
        first, last, pay = emp_str.split('-')
        return cls(first, last, pay)

    @staticmethod
    def is_workday(day):
        return day.weekday() != 5 and day.weekday() != 6
    
    # "dunder" means double underscore
    def __repr__(self):
        return f"Employee({self.first}, {self.last}, {self.pay})"

    def __str__(self):
        return f"{self.fullname()} - {self.email}"
    
    def __add__(self, other):
        return self.pay + other.pay

    def __len__(self):
        return len(self.fullname())
    
    @property
    def email(self):
        return f"{self.first.lower()}.{self.last.lower()}@email.com"
    
    @fullname.setter
    def fullname(self, name):
        first, last = name.split(" ")
        self.first = first
        self.last = last
    
    @fullname.deleter
    def fullname(self):
        print("Delete Name!")
        self.first = self.last = None


class Developer(Employee): # Subclass of Employee
    raise_amt = 1.10

    def __init__(self, first, last, pay, prog_lang):
        super().__init__(first, last, pay)
        self.prog_lang = prog_lang
    

class Manager(Employee): # Subclass of Employee

    def __init__(self, first, last, pay, employees = None):
        super().__init__(first, last, pay)
        self.employees = [] if employees is None else employees

    def add_emp(self, emp):
        if emp not in self.employees:
            self.employees.append(emp)
    
    def remove_emp(self, emp):
        if emp in self.employees:
            self.employees.remove(emp)
    
    def print_emps(self):
        for emp in self.employees:
            print(f"--> {emp.fullname()}")
    

emp_1 = Employee("Tyler", "Kim", 50000)

emp_1.fullname = "Corey Schafer"

print(emp_1.first)
print(emp_1.email)
print(emp_1.fullname)

del emp_1.fullname
