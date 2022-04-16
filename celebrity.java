import java.util.*;
public class celebrity{
    public static void findcelebrity(int[][] arr){
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            st.push(i);
        }
        while(st.size()>=2){
            int i=st.pop();
            int j=st.pop();
            if(arr[i][j]==1){
                //i is not celbrity
                st.push(j);
            }else{
                st.push(i);
            }
        }
        int pot=st.pop();
        for(int i=0;i<arr.length;i++){
            if(i!=pot){
                if(arr[i][pot]==0 || arr[pot][i]==1){
                    System.out.println("none");
                    return;
                }
            }
        }
        System.out.println(pot);
    }
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
               arr[i][j]=obj.nextInt();
            }
        }
        obj.close();
        findcelebrity(arr);
    }
}