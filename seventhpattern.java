import java.util.*;
public class seventhpattern {
    public static void main(String[] args){
        System.out.println("Taking input a no. printing the diagonal along it.");
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt();
        obj.close();
        for(int i=1;i<=x;i++){
            for(int j=1;j<=x;j++){
                if(i==j){System.out.print("*\t");}
                else{System.out.print("\t");}
            }
            System.out.println("");
        }
    }
    
}
