class Arithmetic {
    
    public int add(int a, int b) {
        return a + b;
    }
}
class Adder extends Arithmetic {

}

public class Solution {
    public static void main(String[] args) {
        Adder adderObject = new Adder();
        System.out.println("My superclass is: " + adderObject.getClass().getSuperclass().getName());
        int sum = adderObject.add(10, 32);
        System.out.println("The sum is: " + sum);
    }
}

