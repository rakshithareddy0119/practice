
public class StringMethods {

	public static void main(String[] args) {
		String s1= " Raja Ram Mohan Roy";
//		String s1= "34@gr ";
		System.out.println("length="+s1.length());
		
		System.out.println("---------------------");
//		s1.toUpperCase();  (wrong
//		String UpperCases2= s1.toUpperCase(); (wrong)
		String s2= s1.toUpperCase();
		System.out.println("original string="+s1);
		System.out.println("Upper Case string="+s2);
		System.out.println("---------------------");
		
		String s3= s1.toLowerCase();
		System.out.println("original string="+s1);
		System.out.println("Lower Case string="+s3);
		System.out.println("---------------------");
		
		String s21= "          Raja Ram Mohan Roy        ";
		String s4= s21.trim();
		System.out.println("original string="+s21);
		System.out.println("trimmed string="+s4);
		System.out.println("---------------------");
		
		String s31= "Raja Ram Mohan Roy";
		boolean string=s31.startsWith("Raja");
		System.out.println(string);
		System.out.println("---------------------");
		
		String s41= "    Raja Ram Mohan Roy";
		String s5= s41.trim();
		boolean string1=s41.startsWith("aja");
		System.out.println(string1);
		System.out.println("---------------------");
		
		String s51= "Raja Ram Mohan Roy";
		boolean string2=s51.endsWith("Roy");
		System.out.println(string);
		System.out.println("---------------------");
		
		String s6= "Raja Ram Mohan Roy";
	    String substring=s6.substring(6);
		System.out.println("original string="+s6);
		System.out.println("sub string="+substring);
		System.out.println("---------------------");
		
		String s7= "Raja Ram Mohan Roy";
	    String substring1=s7.substring(9,14);
		System.out.println("original string="+s7);
		System.out.println("sub string="+substring1);
		System.out.println("---------------------");
		
		String s8= "Raja Ram Mohan Roy";
	    boolean string3=s8.contains(s8);
		System.out.println("original string="+s8);
		System.out.println("contains=" +string3);
		System.out.println("---------------------");
		
		String s9= "Raja Ram Mohan Roy";
	    boolean string4=s9.contains("Raja");
		System.out.println("original string="+s9);
		System.out.println("contains string4=" +string4);
		
		 boolean string5=s9.contains("Raju");
		 System.out.println("contains string5=" +string5);
		 
		 boolean string6=s9.contains("Mohan");
		 System.out.println("contains string6=" +string6);
		System.out.println("---------------------");
		
		String s10= "Raja Ram Mohan Roy";
	    String replacedstring=s10.replace('a', '@');
		System.out.println("original string="+s10);
		System.out.println("replaced string=" +replacedstring);
		
		String replacedstring1=s10.replace('R', 'r');
		System.out.println("original string="+s10);
		System.out.println("replaced string=" +replacedstring1);
		
		String replacedstring2=s10.replace("Raja", "Ramu");
		System.out.println("original string="+s10);
		System.out.println("replaced string=" +replacedstring2);
		System.out.println("---------------------");
		
		String s11= "Raja Ram Mohan Roy";
		char[] crr= s11.toCharArray();
		System.out.println("original string="+s10);
		for(char c : crr) {
		System.out.print(c+ " ");
		}
		System.out.println();
		System.out.println("original string="+s10);
		for(int i=crr.length-1;i>=0;i--) {
		System.out.print(crr[i]);	
	}
		System.out.println();
		System.out.println("original string="+s10);
		for(int j=0;j<crr.length;j++) {
		System.out.print(crr[j]);	
	}
		System.out.println("original string="+s10);
		for(char c : crr) {
		System.out.print(c);
		}
		System.out.println("---------------------");
		
		String s12= "Raja Ram Mohan Roy";
		String[] srr= s12.split(" ");
		System.out.println("original string="+s12);
		for(int i=srr.length-1;i>=0;i--) {
			System.out.print(srr[i]+" ");	
		}
		System.out.println();
		System.out.println("original string="+s12);
		for(int j=0;j<srr.length;j++) {
		System.out.print(srr[j]);	
		}
		System.out.println("---------------------");
		String s13= "Raja Ram Mohan Roy";
		char c = s13.charAt(10);
		System.out.println("character at specified index="+c);
		
		char c1 = s13.charAt(100);
		System.out.println("character at specified index="+c1);
	}
	}
	
