package java2;

public class Box4 {
	double width;
	double height;
	double depth;
public void volume() {
		System.out.println("Volume is ");
		System.out.println("width * height * depth ");
	}
}
	class BoxDemo4{
		public static void main(String[] args) {
			Box4 mybox1= new Box4();
			Box4 mybox2= new Box4();
			mybox1.width=10;
			mybox1.height=20;
			mybox1.depth=30;
			
			mybox2.width=6;
			mybox2.height=4;
			mybox2.depth=5;
			
			mybox1.volume();
			mybox2.volume();
		}
	}
