import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        outer : for(int i = 0; i < N; i++) {
        	stack.clear();
        	char[] inputArray = sc.next().toCharArray();
        	
        	for(int j = 0; j < inputArray.length; j++) {
        		if(inputArray[j] == '(') {
        			stack.push(inputArray[j]);        			
        		}
        		else {
        			if(!stack.isEmpty() && stack.peek() == '(') {
        				stack.pop();
        			} else {
        				sb.append("NO\n");
        				continue outer;
        			}
        		}
        	}
        	if(stack.isEmpty()) sb.append("YES\n");
        	else sb.append("NO\n");
        }
        System.out.println(sb.toString());
    }
}
