package ex4;


public class EmployeeManagement {
    private Employee[] employees;
    private int count;

    public EmployeeManagement(int capacity) {
        employees = new Employee[capacity];
        count = 0;
    }

    public void addEmployee(Employee employee) {
        if (count == employees.length) {
            System.out.println("Employee array is full. Cannot add more employees.");
            return;
        }
        employees[count++] = employee;
    }

    public Employee searchEmployee(String employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                return employees[i];
            }
        }
        return null;
    }

    public void traverseEmployees() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    public void deleteEmployee(String employeeId) {
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Employee not found.");
            return;
        }
        // Shift elements to the left to fill the gap
        for (int i = index; i < count - 1; i++) {
            employees[i] = employees[i + 1];
        }
        employees[--count] = null; // Clear the last element
    }

    public static void main(String[] args) {
        EmployeeManagement empManagement = new EmployeeManagement(5);

        // Adding employees
        empManagement.addEmployee(new Employee("E001", "Alice", "Manager", 75000));
        empManagement.addEmployee(new Employee("E002", "Bob", "Developer", 60000));
        empManagement.addEmployee(new Employee("E003", "Charlie", "Designer", 55000));

        // Traversing employees
        System.out.println("All Employees:");
        empManagement.traverseEmployees();

        // Searching for an employee
        System.out.println("\nSearch Employee E002:");
        Employee emp = empManagement.searchEmployee("E002");
        System.out.println(emp != null ? emp : "Employee not found");

        // Deleting an employee
        System.out.println("\nDelete Employee E001:");
        empManagement.deleteEmployee("E001");
        empManagement.traverseEmployees();
    }
}
