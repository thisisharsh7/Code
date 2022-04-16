import java.util.*;
public class sixteenpattern {
    public static void main(String[] args){
        System.out.println("Arrow pattern as per input.");
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt();
        obj.close();
        int spc=x/2;
        int str=1;
        for(int i=1;i<=x;i++){
            for(int j=1;j<=spc;j++){
                if(i==x/2+1){System.out.print("*\t");}
                else{
                System.out.print("\t");}
            }
            for(int j=1;j<=str;j++){
                System.out.print("*\t");
            }
            System.out.println("");
            if(i<=x/2){
                str++;
            }else{str--;}

        }
    }
    
}
