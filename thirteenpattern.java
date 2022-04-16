import java.util.Scanner;
public class thirteenpattern {
    public static void main(String[] args){
        System.out.println("permutation combination patter as per input represents triangle.");
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt();
        obj.close();
        for(int i=0;i<x;i++){
            int iCj=1;
            for(int j=0;j<=i;j++){
                System.out.print(iCj+"\t");
                int iCjp1=iCj*(i-j)/(j+1);
                iCj=iCjp1;
            }
            System.out.println("");

            }
        }

    }
    

