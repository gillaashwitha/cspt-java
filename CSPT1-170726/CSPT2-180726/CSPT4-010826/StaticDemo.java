class StaticDemo3
{
    String name;
    String color;
    int price;

    public void show(String name, String color, int price){
        IO.println(name + " " +color+" "+price);
    }

    void main(string args[])
    {
        StaticDemo0 sd = new StaticDemo0();
        sd.name = "Cello";
        sd.color = "blue";
        sd.price = 10;
        sd.show(sd.name, sd.color, sd.price);
        StaicDemo sd1 = new StaticDemo0();
        sd1.name = "parker";
        sd1.color = "black";
        sd1.price = 150;
        sd1.show(sd.name, sd.color, sd.price);

    }
    
}
