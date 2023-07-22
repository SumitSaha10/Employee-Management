public class Employee {
    private int id;
    private String name;
    private String department;
    private int salery;

    public Employee(){}
    public Employee(int id, String name, String department, int salery) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salery = salery;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public int getSalery() {
        return salery;
    }
    public void setSalery(int salery) {
        this.salery = salery;
    }

    @Override
    public String toString() {
        return "id: "+id+"\n"+"Name: "+name+"\n"+"Department: "+department+"\n"+"Salery: "+salery+"\n";
    }




}
