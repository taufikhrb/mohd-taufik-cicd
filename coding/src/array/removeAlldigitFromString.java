package array;

public class removeAlldigitFromString {
	public static void main(String[] args) {
		String str="231";
		int i=Integer.valueOf(str);
		System.out.println(i);
		String f=str.replaceAll("[0-9]", "");
		System.out.println(f);
	}

}
