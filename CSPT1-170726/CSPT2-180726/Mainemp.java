abstract class Employee{
    abstract public double slary();
    abstract public string info();
    
}
class Manager extends Employee{
    public double slary(double a)
    {
        return a;
    }
    public string info(string t)
    {
        return t;
    }
}
class Programmer extends Employee{
    public double slary(double a)
    {
        return a;
    }
    public string info(string t)
    {
        return t;
    }
}
class MainEmp
{
    void main()
    {
        Manager m = new Manager();
        Programmer p = new Programmer();
        IO.println(m.slary)
    }
}
