package innerAndNestedClassesExample;

//Even though the TopLevel class is in the same package, in order to access the Inner and Nested classes,
//they need to be imported from the TopLevel class.
import innerAndNestedClassesExample.TopLevel.Inner;
import innerAndNestedClassesExample.TopLevel.Nested;

public class TopLevelTest {

	public static void main(String[] args) {

		//Instances of the static nested class Nested are independent and are created without using a reference of 
		//the top-level class TopLevel.
		Nested nested = new Nested(); 
		System.out.println(nested.getZ());
		System.out.println(Nested.getCONSTANT()); //Accessing the static member in a static way.

		//Instances of the inner class Inner are dependent on the top-level class TopLevel instance and are created
		//by using the reference of TopLevel.
		TopLevel topLvl = new TopLevel();
		Inner inner = topLvl.new Inner(5);
		
		System.out.println(inner.getX()); //Printing the x attribute of the Inner class.
		System.out.println(topLvl.getY()); //Printing the y attribute of the TopLevel class using the topLvl reference to that class. 
		inner.printY(); //Printing the y attribute of the TopLevel class using the Inner class reference.
	}

}
