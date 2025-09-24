package Management;

import java.util.*;
import java.util.logging.Filter;

public class TaskManagement {
    EmployeeRecords employeeRecords = new EmployeeRecords();

    public void ShowRecords() {
        System.out.println("All Employee Records:");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.printf("%-5s %-15s %-5s %-15s %-20s %-15s \n","ID","Name","Age","Department","Designation","Reporting To");
        System.out.println("----------------------------------------------------------------------------------");
        for(Employee employee: employeeRecords.employees){
            System.out.printf("%-5d %-15s %-5d %-15s %-20s %-15s \n",employee.employee_id,employee.name,employee.age,employee.department,employee.designation,employee.reporting);
        }
        System.out.println("--------------------------------------------------------------------------------------");
    }
    public void ManagerReport() {
        Scanner tempScan = new Scanner(System.in);
        System.out.println("Enter the Manager Name:");
        String ManagerName = tempScan.nextLine();
        System.out.println("--------------------------------");
        System.out.println("Employees Under "+ManagerName+":");
        for(Employee employee : employeeRecords.employees) {
            if(ManagerName.equalsIgnoreCase(employee.reporting)) {
                System.out.println(employee.name);
            }
        }
        System.out.println("--------------------------------");

    }
    public void SummaryReports() {
        System.out.println("1.Summary Records By Department");
        System.out.println("2.Summary Records By Designation");
        Scanner tempScan= new Scanner(System.in);
        int SummaryChoice = tempScan.nextInt();
        switch(SummaryChoice) {
            case 1:
                SummaryByDepartment();
                break;
            case 2:
                SummaryByDesignation();
                break;
        }


    }
    public void SummaryByDepartment() {
        HashMap<String, Integer> ReportCount = new HashMap<>();
        for(Employee employee : employeeRecords.employees) {
            ReportCount.put(employee.department, ReportCount.getOrDefault(employee.department, 0) + 1);
        }

        System.out.println("Summary Report By Department");
        System.out.printf("%-15s %-5s\n","Department","Employees");
        System.out.println("--------------------------------------");
        for(Map.Entry<String, Integer> report : ReportCount.entrySet()) {
            System.out.printf("%-15s  %-5d\n",report.getKey() , report.getValue());
        }
        System.out.println("--------------------------------------");
    }
    public void SummaryByDesignation() {
        HashMap<String, Integer> ReportCount = new HashMap<>();
        for(Employee employee : employeeRecords.employees) {
            ReportCount.put(employee.designation, ReportCount.getOrDefault(employee.designation, 0) + 1);
        }

        System.out.println("Summary Report By Designation");
        System.out.printf("%-15s %-5s\n","Designation","Employees");
        System.out.println("--------------------------------------");
        for(Map.Entry<String, Integer> report : ReportCount.entrySet()) {
            System.out.printf("%-15s  %-5d\n",report.getKey() , report.getValue());
        }
        System.out.println("--------------------------------------");
    }
    public void ReportingTo() {
        System.out.println("Enter the Employee Name");
        Scanner tempScan = new Scanner(System.in);
        String EmployeeName = tempScan.nextLine();
        System.out.print(EmployeeName+"-> ");
        while(EmployeeName != ""){
            for(Employee employee: employeeRecords.employees){
                if(EmployeeName.equalsIgnoreCase(employee.name)){
                    System.out.print(employee.reporting!=""?employee.reporting+"->":"");
                    EmployeeName = employee.reporting;
                }
            }
        }
        System.out.println();
    }
    public void RemoveEmployee() {
        System.out.println("Enter The Employee Name To Remove");
        Scanner tempScan = new Scanner(System.in);
        String RemoveEmployeeName = tempScan.next();
        System.out.println("----Warning-----");
        System.out.println("You Are Trying To Remove " + RemoveEmployeeName + " SO Choose One Option");
        System.out.println("1.Add Another Employee for This Position");
        System.out.println("2. Assign Immediate Employee for This Position");
        int RemoveChoice = tempScan.nextInt();
        switch(RemoveChoice) {
            case 1:
                System.out.println("Enter another Employee to replace:");
                String ReplaceEmployee = tempScan.next();

                String tempReplace = ReplaceEmployee;

                ReplaceAndRemove(tempReplace, RemoveEmployeeName, false);
                break;
            case 2:
                ImmediateFinder(RemoveEmployeeName);
        }

    }
    public void ReplaceAndRemove(String ReplaceEmployeeName, String RemoveEmployeeName, boolean Immediate) {

        for(Employee employee : employeeRecords.employees) {
            if(RemoveEmployeeName.equalsIgnoreCase(employee.reporting)) {
                employee.reporting = ReplaceEmployeeName;
            }
        }
        employeeRecords.employees.removeIf(e -> e.name.equalsIgnoreCase(RemoveEmployeeName));
        Scanner tempScan = new Scanner(System.in);
        if(!Immediate) {
            System.out.println("Enter the Employee_Id");
            int newEmployee_Id = tempScan.nextInt();

            System.out.println("Enter The Employee Age");
            int newEmployeeAge = tempScan.nextInt();
            tempScan.nextLine();
            System.out.println("Enter The Employee Department");
            String newEmployeeDept = tempScan.next();
            System.out.println("Enter The Employee Designation");
            String newEmployeeDesignation = tempScan.next();
            System.out.println("Enter The Employee Reporting");
            String newEmployeeReporting = tempScan.next();
            employeeRecords.AddEmployee(newEmployee_Id, ReplaceEmployeeName, newEmployeeAge, newEmployeeDept, newEmployeeDesignation, newEmployeeReporting);
        }
    }
    public void ImmediateFinder(String RemoveEmployeeName) {
        int ImmediateCount = 0;
        for(Employee employee : employeeRecords.employees) {
            if(ImmediateCount == 1) {
                ReplaceAndRemove(employee.name, RemoveEmployeeName, true);
                break;
            }
            if(RemoveEmployeeName.equalsIgnoreCase(employee.name)) {
                ImmediateCount = 1;
            }
        }
    }
    public void SearchAndUpdate() {
        Scanner tempScan = new Scanner(System.in);
        while(true) {
            System.out.println("1. Filter By Numeric");
            System.out.println("2. Filter By String");
            int FilterChoice = tempScan.nextInt();
            switch (FilterChoice) {
                case 1:
                    FilterNumber();
                    break;
                case 2:
                  //  FilterString();
                    break;
            }
        }
    }
    public void FilterNumber() {
        Scanner tempScan = new Scanner(System.in);
        System.out.println("Filter By Age");
        System.out.println("Filter By Id");
        int FilterChoice = tempScan.nextInt();
        while(true) {
            switch(FilterChoice) {
                case 1:
                    FilterByAge();
                    break;
                case 2:
                   // FilterByID();
                    break;
            }
        }
    }
    public void FilterByAge() {
        Scanner tempScan = new Scanner(System.in);

        System.out.println("1.Filter By Equals");
        System.out.println("2.Filter By NotEquals");
        System.out.println("3.Filter By GreaterThan");
        System.out.println("4.Filter By LesserThan");
        int FilterChoice = tempScan.nextInt();
        switch (FilterChoice) {
            case 1:
                //checkEquals(FilterChoice);
        }
    }
    public void FilterById() {

    }
}
