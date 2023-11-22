
public class StringBufferDemo1 {

	public static void main(String[] args) {
		StringBuffer StringBuffer=new StringBuffer(4);
		System.out.println("size="+StringBuffer.length());
		System.out.println("capacity="+StringBuffer.capacity());
		System.out.println("***********************");
		StringBuffer.append("java");
		System.out.println("size="+StringBuffer.length());
		System.out.println("capacity="+StringBuffer.capacity());
		System.out.println("***********************");
		StringBuffer.append("scripts");
		System.out.println("size="+StringBuffer.length());
		System.out.println("capacity="+StringBuffer.capacity());
	}

}
