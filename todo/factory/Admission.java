package todo.factory;

// Create the Admission class to generate object of sub-classes
class Admission {
	// use admittingCourse method to get object of type Course
	public Course admittingCourse(String courseName) {
		// TO-DO: if courseName is null => return null
		if (courseName.trim().isEmpty()) {
			return null;
		}

		// TO-DO: if courseName is similar to 1 of 3 sub-class's name => return
		// corresponding objects
		switch (courseName.toLowerCase()) {
			case "computer":
				return new Computer();
			case "health":
				return new Health();
			case "civilservice":
				return new CivilService();
			default:
				return null;
		}
	}
}