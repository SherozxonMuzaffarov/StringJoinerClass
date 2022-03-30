import java.util.StringJoiner;

public class Main {

	public static void main(String[] args) {

//		StringJoiner st = new StringJoiner(",","{","}");  //passing comma(,) and bracket as delimiter
//		//adding values to StringJoiner
//		st.add("hello");  
//		st.add("world");
//		st.add("from");
//		st.add("String");
//		st.add("Joiner");
//		System.out.println(st);
	//	
//		//Creating StringJoiner with : (colon) delimiter 
//		StringJoiner st2 = new StringJoiner(":","[","]");
//		st2.add("hello");
//		st2.add("world");
//		st2.add("from");
//		st2.add("String");
//		st2.add("Joiner");
//		System.out.println(st2);
	//	
//		//merging two String Joiner
//		StringJoiner st3 = st2.merge(st);
//		System.out.println("st3: " + st3);
		
		
		 
		StringJoiner st4 = new StringJoiner(",");
		
		//print nothing because it is empty
		System.out.println(st4);
		
		//we can set default empty value
		st4.setEmptyValue("it is default empty value");
		System.out.println(st4);
		
		//adding values to StringJoiner
		st4.add("hello");  
		st4.add("world");
		System.out.println(st4);
		
		//return length of StringJoiner
		int length = st4.length();
		System.out.println("Length: "+length);
		
		//return StringJoiner as StringType
		String string = st4.toString();
		System.out.println(string);
		
		//now, we can apply String methods on it
		char ch = string.charAt(4);
		System.out.println("Character at index 4: " + ch);
		
		//adding one more element
		st4.add("Bro");
		System.out.println(st4);
		
		//return length
		int newLength = st4.length();
		System.out.println("New Length: " + newLength);
		

	}

}
