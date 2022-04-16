import java.util.*;
public class gcdlcm {
    public static void main(String[] args){
       System.out.println("GCD and LCM of input no.'s will be printed.");
       Scanner obj=new Scanner(System.in);
       int x=obj.nextInt();
       int y=obj.nextInt();
       int n1=x;
       int n2=y;
       obj.close();
       while(x%y!=0){int rem=x%y;
        x=y;
        y=rem;
        }
        int gcd=y;
        int lcm=(n1*n2)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
    
    
}
