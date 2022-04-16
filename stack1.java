import java.util.*;
public class stack1 {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        String str=obj.nextLine();
        Stack<Character> st=new Stack<>();
        obj.close();
        for(int i=0;i<str.length();i++){
            Character ch=str.charAt(i);
            if(ch==')'){
                if(st.peek()=='('){
                    System.out.println(true);
                    return;
                }else{
                    while(st.peek()!='('){
                        st.pop();
                    }st.pop();
                }
            }else{
                st.push(ch);
            }
        }
        System.out.println(false);
        
    }
    
}
