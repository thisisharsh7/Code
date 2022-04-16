import java.util.*;
public class primefactorization {
    public static void main (String[] args){
        System.out.println("Prime factorization of a input no..");
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        scn.close();
        for(int div=2;div*div<=n;div++){
            while(n%div==0){
                n=n/div;
                System.out.print(div+" ");
            }

        }
        if(n!=1){System.out.print(n);}

    }
    
}
