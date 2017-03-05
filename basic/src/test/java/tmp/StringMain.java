package tmp;

public class StringMain {

	public StringMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		String aa = "aaa";
		String aa2 = "aaa";
		
		String a = new String("aaa");
		String a2 = new String("aaa");
		
		System.out.println("aa == aa2 : " + (aa == aa2));
		System.out.println("aa.equals(aa2) : " + (aa.equals(aa2)));
		
		System.out.println("a == a2 : " + (a == a2));
		System.out.println("a.equals(a2) : " + (a.equals(a2)));
		
		System.out.println("aa == a : " + (aa == a));
		System.out.println("aa.equals(a) : " + (aa.equals(a)));

	}

}
