public class fourteenpattern {
    public static void main(String[] args){
        System.out.println("diamond with no.'s pattern.");
        int spc=2;
        int str=1;
        int count=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=spc;j++){
                System.out.print("\t");
                
            }
            int ncount=count;
            for(int j=1;j<=str;j++){
                System.out.print(ncount+"\t");
                if(j<=str/2){ncount++;}
                else{ncount--;}
                
               
            }
            if(i<=5/2){spc--;
                count++;
            str+=2;}
            else{spc++;
                count--;
            str-=2;}
            System.out.println("");
        }
    }
    
}
