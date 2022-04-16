import java.util.*;
public class mergemeeting {
    public static void mergeit(int[][] arr){
        Pair[] pairs=new Pair[arr.length];
        for(int i=0;i<arr.length;i++){
            pairs[i]=new Pair(arr[i][0],arr[i][1]);
        }
            Arrays.sort(pairs);
            Stack<Pair> st=new Stack<>();
            for(int i=0;i<pairs.length;i++){
                if(i==0){
                    st.push(pairs[i]);
                }else{
                    Pair top=st.peek();
                    if(pairs[i].st>top.et){
                        st.push(pairs[i]);
                    }else{
                        top.et=Math.max(top.et,pairs[i].et);
                    }
                }
            }


    }
    public static class Pair implements Comparable<Pair>{
        int st;
        int et;
        Pair(int st, int et){
            this.st=st;
            this.et=et;
        }
        public int compareTo(Pair other){
            if(this.st != other.st){
                return this.st-other.st;
            }else{
                return this.et-other.st;
            }
        }
    }
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[][] arr=new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=obj.nextInt();
            }
        }
        obj.close();
        mergeit(arr);
    }
    
}
