import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.Statement;

public class EmpOp {
    public static boolean createEmployee(Employee emp){

        try {
            Connection con = Connect.createCon();
            String q = "insert into empdetails(id,name,department,salary) values(?,?,?,?)";
            PreparedStatement pmst = con.prepareStatement(q);
            pmst.setInt(1, emp.getId());
            pmst.setString(2, emp.getName());
            pmst.setString(3, emp.getDepartment());
            pmst.setInt(4, emp.getSalery());

            pmst.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;

    }

    public static boolean deleteEmployee(int id){

        try {
            Connection con = Connect.createCon();
            String q = "delete from empdetails where id=?";
            PreparedStatement pmst = con.prepareStatement(q);
            pmst.setInt(1, id);
            
            pmst.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;

    }

    public static void showEmployees(){

        try {
            Connection con = Connect.createCon();
            String q = "select * from empdetails";
            Statement smt = con.createStatement();
            ResultSet set = smt.executeQuery(q);

            while (set.next()) {
                int id = set.getInt(1);
                String name = set.getString(2);
                String department = set.getString(3);
                int salary = set.getInt(4);

                System.out.println("id: "+id+"\n"+"Name: "+name+"\n"+"Department: "+department+"\n"+"Salery: "+salary+"\n");
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
