package Management;

import java.util.ArrayList;

public class EmployeeRecords {
    ArrayList<Employee> employees = new ArrayList<>();

    public EmployeeRecords() {
        employees.add(new Employee(1, "Sriram", 45, "Management", "CEO", ""));
        employees.add(new Employee(2, "Raja", 42, "HR", "HR Manager", "Sriram"));
        employees.add(new Employee(3, "Priya", 38, "Management", "Digital Marketing", "Sriram"));
        employees.add(new Employee(4, "Karthik", 40, "Finance", "CFO", "Sriram"));
        employees.add(new Employee(5, "Meena", 35, "IT", "Project Manager", "Raja"));
        employees.add(new Employee(6, "Arun", 29, "IT", "Software Engineer", "Meena"));
        employees.add(new Employee(7, "Divya", 32, "HR", "Recruiter", "Raja"));
        employees.add(new Employee(8, "Vijay", 34, "Finance", "Accountant", "Karthik"));
        employees.add(new Employee(9, "Lakshmi", 28, "IT", "UI/UX Designer", "Meena"));
        employees.add(new Employee(10, "Santhosh", 30, "Sales", "Sales Executive", "Priya"));
    }
    public void AddEmployee(int newEmployee_Id, String newEmployee_name, int newEmployee_Age, String newEmployeeDepartment, String newEmployeeDesignation, String newEmployeeReporting) {
        employees.add(new Employee(newEmployee_Id, newEmployee_name, newEmployee_Age, newEmployeeDepartment, newEmployeeDesignation, newEmployeeReporting));

    }
}