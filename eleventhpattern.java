import java.util.*;
public class eleventhpattern {
    public static void main(String[] args){
        System.out.println("Number pattern as per input.");
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt();
        int count=0;
        obj.close();
        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                count++;
                System.out.print(count+"\t");
            }
            System.out.println("");
        }
    }
    
}
