class Person{
    String name ="Ashwitha";
    int age = 19;
    void displayPerson(){
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}
class Employee extends Person{
    int EmployeeId = 6619;
    double salary = 30000;
    void displayEmployee() {
         displayPerson();
            System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}
class Manager extends Employee{
    double bonus = 5000;
    String department = "HR";
    void displayManager() {
        displayEmployee();
        System.out.println("bonus : " + bonus);
        System.out.println("Department  : " + department);
    }
}
class Main3 {
    public static void main(String args[]){
        Manager m = new Manager();
        m.displayManager();
    }
}
