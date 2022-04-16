import java.util.*;
public class base2baseadd {
    public static void b2ba(int n1,int n2,int b){
        int result=0;
        
        int p=1;
        int c=0;
        while(n1>0 || n2>0 || c>0){
            int re1=n1%10;
            int re2=n2%10;
            n1=n1/10;
            n2=n2/10;
            int ner=re1+re2+c;
            c=ner/b;
            ner=ner%b;
            System.out.println(ner);
            result+=p*ner;
            p=p*10;
            
        }
        System.out.println(result);
    }
    public static void main(String[] args){
        System.out.println("Any base 2 base addition.");
        Scanner obj=new Scanner(System.in);
        int n1=obj.nextInt();
        int n2=obj.nextInt();
        int b=obj.nextInt();
        obj.close();
        b2ba(n1,n2,b);
        
    }
    
}
