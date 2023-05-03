import java.util.*;

// this code from previous code StackUsingLinkedList in short form Stack using collection 
// framework always do using framework untill anyone ask to do .

public class StackUsingFramework {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
