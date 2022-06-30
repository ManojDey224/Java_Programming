package java2;

public class VarArge3 {

	static void vaTest(int ...v) {
		System.out.println("vaTest(int...v): " +"Number of Arge :" +v.length +"contents :");
		for(int x: v)
			System.out.print(x + " ");
			System.out.println();
	}
	
	static void vaTest(boolean ...v) {
		System.out.println("vaTest(boolean...v): " +"Number of Arge :" +v.length +"contents :");
		for(boolean x: v)
			System.out.print(x + " ");
			System.out.println();
	}
	static void vaTest(String msg, int ...v) {
		System.out.println("vaTest(String, int...): " +"msg :" +v.length +"contents :");
		for(int x: v)
			System.out.print(x + " ");
			System.out.println();
	}
	
	
	public static void main(String[] args) {
		vaTest(1,2,3);
		vaTest("Testing: ",10,20);
		vaTest(true,false,false);

	}

}
