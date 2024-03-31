class Employee extends DateOfBirth {
    private String name;
    private int empid;

    public Employee(String name, String birthDate,int empid) {
        super(birthDate);
        this.name = name;
        this.empid=empid;
    }
    public void displayInfo(String currentDate) {
        int age = calculateAge(currentDate);
        System.out.println("Name: " + name + ", Age: " + age+", Empid: "+empid);
    }
public class Main {
    public static void main(String[] args) {
        Employee student1 = new Employee("John", "2000-05-15",101);
        student1.displayInfo("2024-03-31");

        Employee student2 = new Employee("Alice", "2002-10-20",102);
        student2.displayInfo("2024-03-31");
    }
}
}