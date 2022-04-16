import java.util.*;
public class reverse {
    public static void main(String[] args){
        System.out.println("Input no. will be reversed.");
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        scn.close();
        while(x!=0){
            System.out.println(x%10);
            x=x/10;
        }
    }
    
}
