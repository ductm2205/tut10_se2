package todo.prototype;

/* Create the ShapeDraw class which uses ShapeCache class 
to get clones of shapes stored in a Hashtable. */
public class ShapeDraw {
	// TO-DO: Implement the main() method for testing purpose
	public static void main(String[] args) {
		// run loadCache() method
		ShapeCache.loadCache();

		/*
		 * create 3 cloned shapes with 3 different types Hint: use getShape() &
		 * getType() methods
		 */
		Shape circle = ShapeCache.getShape("1");
		System.out.println(circle.getType());

		Shape square = ShapeCache.getShape("2");
		System.out.println(square.getType());

		Shape rectangle = ShapeCache.getShape("3");
		System.out.println(rectangle.getType());
	}
}