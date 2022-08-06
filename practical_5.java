
import java.util.*;
class Additions{
    public int add(int a, int b){
        int sum=a+b;
        return sum;
    }
    public int add(int a, int b,int c)
    {
        int mul=a*b*c;
        return mul;
    }
}
public class practical_5 {
    public static void main(String[] args) {
        Additions A = new Additions();

        System.out.println(" METHOD 1 : "+A.add(1,2));
        System.out.println(" METHOD 2 : "+A.add(1,2,3));
        System.out.println("21CE149-Jeet");


    }
}
