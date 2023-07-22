import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Office Management");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                System.out.println("Press 1 for add employee");
                System.out.println("Press 2 for deleting employee");
                System.out.println("Press 3 for showing employee");
                System.out.println("Press 4 to exit");

                int c = Integer.parseInt(br.readLine());

                if (c==1) {
                    System.out.println("Enter employee id");
                    int id = Integer.parseInt(br.readLine());
                    System.out.println("Enter employee name");
                    String name = br.readLine();
                    System.out.println("Enter employee department");
                    String department = br.readLine();
                    System.out.println("Enter employee salary");
                    int salary = Integer.parseInt(br.readLine());

                    Employee emp = new Employee(id,name,department,salary);
                    boolean ans = EmpOp.createEmployee(emp);
                    if (ans) {
                        System.out.println("Employee successfully added");
                    } else {
                        System.out.println("Failed to add employee");
                    }

                }

                if (c==2) {
                    System.out.println("Enter employee id");
                    int id = Integer.parseInt(br.readLine());

                    boolean ans = EmpOp.deleteEmployee(id);
                    if (ans) {
                        System.out.println("Employee successfully deleted");
                    } else {
                        System.out.println("Failed to delete employee");
                    }
                }
                if (c==3) {
                    EmpOp.showEmployees();
                }
                if (c==4) {
                    break;
                }else{}
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
