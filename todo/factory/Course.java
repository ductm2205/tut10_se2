package todo.factory;

// Create the abstract class called Course
abstract class Course {
	protected int duration; // in semesters
	protected double fee; // in dollars ($)

	// TO-DO: Declare 2 void abstract methods: getDuration(), getFeePerSemester()
	protected abstract void getDuration();

	protected abstract void getFeePerSemester();

	// TO-DO: Declare void method: calculateTotalFee(). Total = duration * fee
	public void calculateTotalFee() {
		double total = this.duration * this.fee;
		System.out.println("Total fee: " + total);
	}

}