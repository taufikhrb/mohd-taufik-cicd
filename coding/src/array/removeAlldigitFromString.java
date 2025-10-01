package array;

public class removeAlldigitFromString {
	public static void main(String[] args) {
		String str="8765rfgvbnju76tgjiu87yh";
		String f=str.replaceAll("[0-9]", "");
		System.out.println(f);
	}

}
