import java.util.*;
public class prime {
    public static void main(String[] args){
        System.out.print("Prime no.'s btw the Inputs you provide.");
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt();
        int y=obj.nextInt();
        for(int i=x;i<y;i++){
            if(i%2!=0 && i%3!=0){System.out.println(i);}
            else if(i==3 || i==2){System.out.println(i);}
        }
        
        obj.close();
    }
    
}
