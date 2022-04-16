import java.util.*;
public class pythagoreantriplets {
    public static void main (String[] args){
        System.out.println("Three inputs as a no.'s and checking if they pythagoras rule or not.");
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt();
        int y=obj.nextInt();
        int z=obj.nextInt();
        int a=x*x;
        int b=y*y;
        int c=z*z;
        obj.close();
        if(x>y && x>z){boolean flag=(a==(b+c));
            System.out.println(flag);}
        else if(y>z && y>x){boolean flag=(b==(a+c));
            System.out.println(flag);}
        else{boolean flag=(c==(a+b));
            System.out.println(flag);}
        
    }
    }
