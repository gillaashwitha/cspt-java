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
}