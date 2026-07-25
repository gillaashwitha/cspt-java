abstract class DemoAB{
    abstract public void show();
    public void display(){
        IO.println("Display Method");
    }
}
class AbsDemo extends DemoAB
{
    @Override
    public void show()
    {
        IO.println("I am SHOW FROM MEESHO");
    }

    public static void main(String args[])
    {
        AbsDemo dab = new AbsDemo();
        dab.display();
    }
}   
