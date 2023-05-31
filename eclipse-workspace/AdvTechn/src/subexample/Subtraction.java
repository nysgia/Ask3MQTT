package subexample;
public class Subtraction {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        String result = subtr(a, b);
        System.out.println(result);
    }
    
    public static String subtr(int a, int b) {
    	int x = a-b;
    	String s;
    	if (x > 0 )
    	{
           s ="POSITIVE";
        } else {
        	s ="NEGATIVE";
        }
        return s;
    }
    
}