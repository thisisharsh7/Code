import java.util.*;
public class mimimalstack1{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        Stack<Integer> minst=new Stack<>();
        int n=sc.nextInt();
        for(int i=0;i<n-1;i++){
            int x=sc.nextInt();
            st.push(x);
            if(minst.size()==0 || x<minst.peek()){
                minst.push(x);
            }
        }
        sc.close();
        System.out.println("minimum in stack "+minst.peek());
    }
}