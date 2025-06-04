// Creating an Employee class
class Employee1 {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

//Create a class cellphone with methods to print "ringing..." , "vibrating..." etc.
class cellPhone{
    public void ringing(){
        System.out.println("Ringing...");
    }

    public void vibrate(){
        System.out.println("Vibrating...");
    }
}
public class OOP01_Ex {
    public static void main(String[] args) {

        Employee1 Eren = new Employee1();
        Employee1 Mikasa = new Employee1();
        Employee1 Armin = new Employee1();

        Eren.salary = 90000;
        Eren.name = "Eren Yeager";

        Mikasa.salary = 100000;
        Mikasa.name = "Mikasa Ackerman";

        Armin.salary = 89200;
        Armin.name = "Armin Arlet";

        // Printing salaries and names
        System.out.println("Salary of " + Eren.getName() + ": " + Eren.getSalary());
        System.out.println("Salary of " + Mikasa.getName() + ": " + Mikasa.getSalary());
        System.out.println("Salary of " + Armin.getName() + ": " + Armin.getSalary());

        // Updating Armin's name
        Armin.setName("Levi Ackerman");
        System.out.println("Updated name of Armin: " + Armin.getName());

        cellPhone first = new cellPhone();

        first.ringing();
        first.vibrate();

    }
}
