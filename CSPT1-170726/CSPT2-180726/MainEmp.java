class Employee { 
    public void calculateSalary() { 
        System.out.println("Employee Salary"); 
    } 
    
    public String displayInfo(String t) { 
        return "Employee : " + t; 
    } 
} 

class Manager extends Employee { 
    @Override 
    public void calculateSalary() {  
        // Fixed the syntax error here
        System.out.println("Manager Salary = 80000"); 
    } 
    
    @Override 
    public String displayInfo(String t) { 
        return "Manager : " + t; 
    } 
} 

class Programmer extends Employee { 
    @Override 
    public void calculateSalary() { 
        System.out.println("Programmer Salary = 60000"); 
    } 
    
    @Override 
    public String displayInfo(String t) { 
        return "Programmer : " + t; 
    } 
} 

public class MainEmp { 
    public static void main(String[] args) { 
        Manager m = new Manager(); 
        Programmer p = new Programmer(); 
        
        m.calculateSalary(); 
        System.out.println(m.displayInfo("Project Manager")); 
        
        p.calculateSalary(); 
        System.out.println(p.displayInfo("Java Developer")); 
    } 
}
