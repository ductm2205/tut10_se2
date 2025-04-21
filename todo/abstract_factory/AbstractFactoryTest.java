package todo.abstract_factory;

/* Create the AbstractFactoryTest class which uses the FactoryProducer 
 * to get AbstractFactory in order to get factories 
 * of concrete classes by passing an information such as type.
 */

public class AbstractFactoryTest {
	// TO-DO: Implement the main() method for testing purpose
	public static void main(String[] args) {
		// get shape factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

		// get an object of Shape Rectangle
		Shape rectangle = shapeFactory.getShape("rectangle");

		// call draw method of Shape Rectangle
		rectangle.draw();

		// get an object of Shape Square
		Shape square = shapeFactory.getShape("square");

		// call draw method of Shape Square
		square.draw();

		// get shape factory
		AbstractFactory roundedAbstractFactory = FactoryProducer.getFactory(true);

		// get an object of Shape Rectangle
		Shape roundedRectangle = roundedAbstractFactory.getShape("rectangle");

		// call draw method of Shape Rectangle
		roundedRectangle.draw();

		// get an object of Shape Square
		Shape roundedSquare = roundedAbstractFactory.getShape("square");

		// call draw method of Shape Square
		roundedSquare.draw();

	}
}