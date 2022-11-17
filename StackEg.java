package collectionEg;
import java.util.Stack;
public class StackEg {
		//LIFO->Last In First Out
	public static void main(String[] args) {
		Stack<Integer> st=new Stack<Integer>();//creating a stack
		System.out.println(st.empty());//checking if the stack is empty or not
		//adding element
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(1);
		st.push(13);
		st.push(5);
		System.out.println("After adding elements the stack is empty ? "+st.empty());
		System.out.println(st);
		System.out.println("Top Element : "+st.peek());//access element from the top of the stack
		//The last element which was added to the stack is at the top of the stack
		System.out.println(st.search(1));//searching index number of specific element
		System.out.println("Stack Size : "+st.size());
		System.out.println("Stack Capacity : "+st.capacity());
		for(int i=st.size()-1;i>=0;i--) {
			System.out.print(st.get(i)+" ");
		}
	}

}
