import java.util.*;
public class set {
   public static void main(String[] args){
       System.out.println("Enter the no. as input and output will be a digit seperated by line in that no.");
       Scanner obj=new Scanner(System.in);
       int x=obj.nextInt();
       obj.close();
       int y=x;
       int count=0;
       while(y!=0){
           y=y/10;
           count++;
       }
       int power=(int)Math.pow(10,count-1);
       do{
            System.out.println(x/power);
            x=x%power;
            power=power/10;
       }while(power!=0);
   }
    
}
