public class Employee {
    double salary = 25000.55;
}
class Programmer extends Employee {
    int bonus = 4500;
    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("Programmer Salary :-"+p.salary);
        System.out.println("Programmer Bonus :-"+p.bonus);
        double x = p.salary;
        double y =p.bonus;
        System.out.println("Programmer Income :-"+(x+y));
    }
}
