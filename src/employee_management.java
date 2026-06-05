import java.util.ArrayList;
import java.util.Scanner;

class Employee{
    int employeeId;
    String employeeName;
    String department;
    double salary;
    Employee(int employeeId,String employeeName,String Department,double salary){
        this.salary=salary;
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.department =Department;
    }
    public void displayEmployee(){
        System.out.println("Employee name: "+this.employeeName);
        System.out.println("Employee Id: "+this.employeeId);
        System.out.println("department: "+this.department);
        System.out.println("Salary: "+this.salary);
    }
    public void updateSalary(double newsalary){
        this.salary=newsalary;
    }
}
class EmployeeManager{
    ArrayList<Employee> array=new ArrayList<>();
    public void addEmployee(Employee employee){
        for(Employee e : array){
            if(e.employeeId == employee.employeeId){
                System.out.println("Employee ID already exists");
                return;
            }
        }

        array.add(employee);
        System.out.println("Employee Added Successfully");
    }
    public void displayEmployees(){
        if(array.isEmpty()){
            System.out.println("No Employees Found");
            return;
        }
        for(Employee employee:array){
            employee.displayEmployee();
            System.out.println();
        }
    }
    public void searchEmployeeById(int id){
        for(Employee employee:array){
            if(employee.employeeId==id){
                System.out.println("employee found and details are as follows");
                employee.displayEmployee();
                return;
            }
        }
            System.out.println("Employee not found");
    }
    public void updateEmployeeSalary(int id,double salary){
        for(Employee employee:array){
            if(employee.employeeId==id){
                employee.updateSalary(salary);
                System.out.println("Salary Updated Successfully!");
                return;
            }
        }
            System.out.println("Employee not found");
    }
    public void deleteEmployee(int id){
        boolean found = false;
        for(int i = 0; i < array.size(); i++){
            if(array.get(i).employeeId == id){
                array.remove(i);
                System.out.println("Employee deleted successfully");
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Employee Not Found");
        }
    }
}
public class employee_management {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        EmployeeManager employeeManager=new EmployeeManager();
        int action;
        while (true){
            System.out.println("Look at the Activites Performed bys us");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Salary");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.println("Select an action to perform: ");
            action= scanner.nextInt();
            if(action==1){
                System.out.println("enter Employee Id: ");
                int employee_Id=scanner.nextInt();
                scanner.nextLine();
                System.out.println("enter employee name");
                String employee_Name=scanner.nextLine();
                System.out.println("enter department: ");
                String department1= scanner.nextLine();
                System.out.println("enter salary:");
                double salary1= scanner.nextDouble();
                Employee employee1=new Employee(employee_Id,employee_Name,department1,salary1);
                employeeManager.addEmployee(employee1);
            }
            else if(action==2){
                employeeManager.displayEmployees();
            } else if (action==3) {
                System.out.println("Enter Employee ID:");
                int id = scanner.nextInt();
                employeeManager.searchEmployeeById(id);
            } else if (action==4) {
                System.out.println("Enter Employee ID:");
                int id = scanner.nextInt();
                System.out.println("enter salary: ");
                double new_salary=scanner.nextDouble();
                employeeManager.updateEmployeeSalary(id,new_salary);
            } else if (action==5) {
                System.out.println("Enter Employee ID:");
                int id = scanner.nextInt();
                employeeManager.deleteEmployee(id);
            }
            else if(action==6){
                System.out.println("Exited Successfully!");
                break;
            }
            else{
                System.out.println("Invalid Choice");
            }
        }

    }
}
