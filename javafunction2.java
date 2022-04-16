import java.util.*;
public class javafunction2 {
    public static void dab(int n,int b){
        int result=0;
        int count=0;
        while(n>0){
            int r=n%b;
            count++;
            int pow=(int)Math.pow(10,count-1);
            result+=pow*r;
            n=n/b;

        }
        System.out.println(result);
    }
    public static void main(String[] args){
     System.out.println("Number sYstem.");
      Scanner obj=new Scanner(System.in);
      int x=obj.nextInt();
      int b=obj.nextInt();
      obj.close();
      dab(x,b);
    }
    
}
