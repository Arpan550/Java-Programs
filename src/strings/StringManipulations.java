class StringManipulations{
	public static void main(String args[]){
		String str1="Arpan";
		String str2=new String("Ratan");
		char[] ch={'h','e','l','l','o'};
		String str3=new String(ch);
System.out.println("Creating by character array: "+str3);
		String str=str3+str1;
		System.out.println(str);
		String str4=str3.concat(str2);
		System.out.println(str4);
String str5="Hello ".concat(str2);
		System.out.println(str5);
	}
}