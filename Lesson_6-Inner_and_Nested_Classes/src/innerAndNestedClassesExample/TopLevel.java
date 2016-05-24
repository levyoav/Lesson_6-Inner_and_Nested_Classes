package innerAndNestedClassesExample;

//The TopLevel class is a TOP-LEVEL class which is not declared inside a class or a method.
public class TopLevel {

	private Inner inner = new Inner(5);
	private int y = 100; //y is an attribute of the TopLevel class.

	//Inner class - It is a non-static class. Must have a reference to the top-level class in order to instantiate it.
	//The name of the inner class MUST differ from the name of the enclosing class. Can be declared as abstract and have any
	//access modifier. Non-static inner classes cannot declare any static members. Only top-level and static inner classes can.
	public class Inner {

		private int x; //x is an attribute of the Inner class.
		//		private String y; //Example for having an attribute with the same name as in the top-level class.
		//		private static int CONSTANT = 1; //Inner class cannot have static members.

		public Inner(int x) {
			super();
			this.x = x;
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public void printX() {
			System.out.println(x);
		}

		//It is possible to access PRIVATE members of the top-level class TopLevel from the inner class Inner.
		//In this case, y does not have the 'super' reference. If an attribute will be defined in the inner class with 
		//the same name 'y' as in the top-level class, but not necessarily of the same type as in the top-level (see commented line above),
		//the reference would be to the y of the inner class.
		public void printY() {
			System.out.println(y);
		}

	}
	//End of inner class.

	public Inner getInner() {
		return inner;
	}

	public void setInner(Inner inner) {
		this.inner = inner;
	}
	
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}


	//Nested class - Is a STATIC INNER CLASS. It is actually an independent top-level class. It can be instantiated without
	//using a top-level class reference, but the package where the top-level class is in must be imported.
	public static class Nested {
		private int z = 4000;
		private static int CONSTANT = 1; //Nested class can have static members.

		public int getZ() {
			return z;
		}

		public void setZ(int z) {
			this.z = z;
		}

		public static int getCONSTANT() {
			return CONSTANT;
		}

		public static void setCONSTANT(int cONSTANT) {
			CONSTANT = cONSTANT;
		}

	}
	//End of nested class.

}
