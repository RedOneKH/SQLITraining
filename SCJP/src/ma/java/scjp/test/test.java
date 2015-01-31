package ma.java.scjp.test;

public class test {

	char k = (char) 70000;
	byte b = (byte) 128;

	public test(String s) {
		System.out.println(" Top " + b);
	}

	public void printNumberType(int i) {
		System.out.println("Inside Integer...");
	}

	public static void printNumberType(short s) {
		System.out.println("Inside Short...");
	}

	public static void main(String[] args) {
		byte b = 3;
		new test("").printNumberType(b);

		switch (b) {
		case 1: // Can have multiple statements
			System.out.println("Case 1");
			printNumberType(b);
			break; // ****** Don't forget it !!!!
		case 2:
			System.out.println("Case 2");
			break;
		default:
			System.out.println("Default");
		}

		System.out.println("A##B#C".split("\0").length);

	}
}

class testo extends test {
	public testo(String s) {
		super("");
		System.out.println("Down");
	}

}
