import java.util.*;
public class infixstack {
    public static int precedence(char oprtor){
        if(oprtor=='+'){
            return 1;
        }else if(oprtor=='-'){
           return 1;
        }else if(oprtor=='*'){
           return 2;
        }else{
           return 2;
        }
    }
    public static int operation(int v1,int v2,char oprtor){
        if(oprtor=='+'){
            return v1+v2;
        }else if(oprtor=='-'){
            return v1-v2;
        }else if(oprtor=='*'){
            return v1*v2;
        }else{
            return v1/v2;
        }
    }
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        String x=obj.nextLine();
        Stack<Integer> operands=new Stack<>();
        Stack<Character> oprtors=new Stack<>();
        obj.close();
        for(int i=0;i<x.length();i++){
                char ch=x.charAt(i);
            if(ch=='('){
                  oprtors.push(ch);
            }else if(Character.isDigit(ch)){
                 operands.push(ch-'0');//char to integer
            }else if(ch==')'){
               while(oprtors.peek()!='('){
                char oprtr=oprtors.pop();
                int v1=operands.pop();
                int v2=operands.pop();
                int opv=operation(v1,v2,oprtr);
                operands.push(opv);
               }
               oprtors.pop();
            }else if(ch=='*' || ch=='-' || ch=='/' || ch=='+'){
                while(oprtors.size()>0 && oprtors.peek() !='(' && precedence(ch)<=precedence(oprtors.peek())){
                    char oprtr=oprtors.pop();
                    int v1=operands.pop();
                    int v2=operands.pop();
                    int opv=operation(v1,v2,oprtr);
                    operands.push(opv);
                }
                oprtors.push(ch);
            }
            
        }
        while(oprtors.size()!=0){
            char oprtr=oprtors.pop();
            int v1=operands.pop();
            int v2=operands.pop();
            int opv=operation(v1,v2,oprtr);
            operands.push(opv);
           }
        System.out.println(operands.peek());

    }
    
}
