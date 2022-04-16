import java.util.*;
public class base2basemultiply {
    public static int getsum(int n1,int n2,int b){
        int result=0;
        int c=0;
        int p=1;
        while(n1>0 || n2>0 || c>0){
            int r1=n1%10;
            int r2=n2%10;
            n1=n1/10;
            n2=n2/10;
            int sm=r1+r2+c;
            c=sm/b;
            sm=sm%b;
            result+=sm*p;
            p=p*10;
            
        }

        return result;
    }
    public static void tmb2b(int n1,int n2,int b){
        int p=1;
        int result=0;
        while(n2>0){
            int r2=n2%10;
            n2=n2/10;
            int sdm=mb2b(n1,r2,b);
            result=getsum(result,sdm*p,b);
            p=p*10;

        }

        System.out.println(result);
    }
    
    public static int mb2b(int n1,int d,int b){
        int result=0;
        int c=0;
        int p=1;
        while(n1>0 || c>0){
            int r1=n1%10;
            n1=n1/10;
            int m1=r1*d+c;
            c=m1/b;
            m1=m1%b;
            result+=m1*p;
            p=p*10;}

        
        return result;
    }
    public static void main(String[] args){
        System.out.println("Multiplying base to base as given input.");
        Scanner obj=new Scanner(System.in);
        int n1=obj.nextInt();
        int n2=obj.nextInt();
        int b=obj.nextInt();
        obj.close();
        tmb2b(n1,n2,b);
    }
    
}
