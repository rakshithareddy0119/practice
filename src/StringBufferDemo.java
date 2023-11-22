
public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer StringBuffer=new StringBuffer();
		System.out.println("size="+StringBuffer.length());
		System.out.println("capacity="+StringBuffer.capacity());
		System.out.println("-----------------------");
		System.out.println(StringBuffer.capacity());//default capacity is 16
		StringBuffer.append("j");
		System.out.println("size="+StringBuffer.length());
		System.out.println("capacity="+StringBuffer.capacity());
		System.out.println("-----------------------");
		StringBuffer StringBuffer1=new StringBuffer("j");
		System.out.println("size="+StringBuffer1.length());
		System.out.println("capacity="+StringBuffer1.capacity());
		System.out.println("-----------------------");
		StringBuffer StringBuffer2=new StringBuffer("java");
		StringBuffer.append("j");
		System.out.println("size="+StringBuffer2.length());
		System.out.println("capacity="+StringBuffer2.capacity());
		System.out.println("-----------------------");
		StringBuffer StringBuffer3=new StringBuffer();
		StringBuffer3.append("java");
		System.out.println("size="+StringBuffer3.length());
		System.out.println("capacity="+StringBuffer3.capacity());
		System.out.println("-----------------------");
		StringBuffer StringBuffer4=new StringBuffer();
		StringBuffer4.append("i am learning ja");
		System.out.println("size="+StringBuffer4.length());
		System.out.println("capacity="+StringBuffer4.capacity());
		System.out.println("-----------------------");
		StringBuffer StringBuffer5=new StringBuffer();
		StringBuffer5.append("i am learning java");
		System.out.println("size="+StringBuffer5.length());
		System.out.println("capacity="+StringBuffer5.capacity());
		System.out.println("-----------------------");
		
	}

}
