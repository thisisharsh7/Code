public class xfillshapedpattern {
    public static void main(String[] args){
        System.out.println("X shaped pattern with filling inside it.");
        int str=7;
        int spc=0;
        for(int i=1;i<=7;i++){
            for(int j=1;j<=spc;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=str;j++){
               if(i<=7/2 && i>1 && j>1 && j<str){
                   System.out.print("\t");
               }else{
                System.out.print("*\t");}
            }
            if(i<=7/2){spc++;
            str-=2;}else{str+=2;spc--;}
            System.out.println("");
        }

    }
    
}
