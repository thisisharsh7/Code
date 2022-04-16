import java.util.*;
public class secondfunction {
    public static void btod(int n,int b){
        int result=0;
        int p=1;
        while(n>0){
            int r=n%10;
            n=n/10;
            result+=p*r;
            p=p*b;
            }
        System.out.println(result);
    }
    public static void main(String[] args){
        System.out.println("base 2 decimal");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int b=obj.nextInt();
        obj.close();
        btod(n,b);

    }
}
