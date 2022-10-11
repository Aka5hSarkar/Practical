package JavaClass;
import java.util.StringTokenizer;
class StringTokenizerExample {
	
	public static void main(String[] args) {
		StringTokenizer t=new StringTokenizer("my name is akash");
		while (t.hasMoreTokens()) {
			System.out.println(t.nextToken(" "));
		}
		StringTokenizer st=new StringTokenizer("I am akash,living in kolkata");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken(","));
		}
	}

}
