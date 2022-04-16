import java.util.*;
public class fifteenpatttern {
    public static void main (String[] args){
        System.out.println("Triangle pattern filled  with space and a number pattern as per input.");
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt();
        obj.close();
        int spc=2*x-3;
        int str=1;
        for(int i=1;i<=x;i++){
            int val=1;
            for(int j=0;j<str ;j++){
                System.out.print( val+"\t");
                val++;
                
            }
            for(int j=1;j<=spc;j++){
                System.out.print("\t");
            }if(i==x){str--;
            val--;}
            
            for(int j=0;j<str ;j++){
                val--;
                System.out.print(val+"\t");
            }
            
            System.out.println("");
            str++;
            spc-=2;
            
            
        }  
            
        
    }
    
}
