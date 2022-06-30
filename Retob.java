package java2;

class Test3{
	int a;
	Test3(int i){
		a = i;
	}
	Test3 incrByTen() {
		Test3 temp = new Test3(a+10);
		return temp;
	}
}
public class Retob {

	public static void main(String[] args) {
		Test3 obj1=new Test3(2);
		Test3 obj2;
		obj2 = obj1.incrByTen();
		System.out.println("obj1.a : " +obj1.a);
		System.out.println("obj2.a: " +obj2.a);
		obj2=obj2.incrByTen();
		System.out.println("obj2.a afterb the seacond increase :" +obj2.a);

	}

}
