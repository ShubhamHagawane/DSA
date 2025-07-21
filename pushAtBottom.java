
import java.util.*;
public class pushAtBottom {

    public static void func(Stack<Integer> s , int val){
        if(s.isEmpty()){
            s.push(val);
            return;
        }
        int tp = s.pop();
        func(s, val);
        s.push(tp);
    }
    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        
        func(s, 4);

        while (!s.isEmpty()) {
            System.out.println(s.pop() +" ");
            
        }
    }
}
