import java.util.*;
public class base2basediff {
    public static void b2bs(int n1,int n2,int b){
        int result=0;
        int p=1;
        while(n1>0 || n2>0){
            int r1=n1%10;
            int r2=n2%10;
            n1=n1/10;
            n2=n2/10;
            if(r1<r2){
                n1=n1-1;
                r1=r1+b;
            }
            result+=p*(r1-r2);
            p=p*10;
        }
        System.out.println(result);
    }
    public static void main(String[] args){
        System.out.println("any base subtraction.");
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt();
        int y=obj.nextInt();
        int b=obj.nextInt();
        obj.close();
        b2bs(x,y,b);
    }
    
}
