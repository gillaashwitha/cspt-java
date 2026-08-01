class StaticDemo2
{
    static
{
    IO.println("this is static block");
}
public static void main (String args[]){
    IO.println("Class Main Method");
}
void main(){
    IO.println("Instance Main Method");
}
void main2(){{
    IO.println("Instance Main Method");
}
public dtatic void main(string args){
    main1();
    main2();
}
}