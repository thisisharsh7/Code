import java.util.*;
public class rd3function {
    public static void aBa(int n,int b1,int b2){
        int result=0;
        int p=1;
        while(n>0){
            int r=n%b2;
            n=n/b2;
            result+=p*r;
            p=p*b1;
        }
        System.out.println(result);
    }
    public static void main(String[] args){
        System.out.println("Any base to any no.");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int b1=obj.nextInt();
        int b2=obj.nextInt();
        obj.close();
        aBa(n,b1,b2);
        
        

    }
    
}
