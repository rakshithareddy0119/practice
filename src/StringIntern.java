
public class StringIntern {

	public static void main(String[] args) {
		String s1 = new String("java");
		String s2= s1.intern();
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		String s3 =("java");
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));
	}

}
