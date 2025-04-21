package todo.factory;

// Creating the Health class that extends Course abstract class 
class Health extends Course {
	// TO-DO: Implement getDuration() method: set a specific duration and print
	// value
	public void getDuration() {
		this.duration = 24;
		System.out.println(this.duration);
	}

	// TO-DO: Implement getFeePerSemester() method: set a specific fee and print
	// value
	public void getFeePerSemester() {
		this.fee = 780.0;
		System.out.println(this.fee);
	}
}// end of Health class.