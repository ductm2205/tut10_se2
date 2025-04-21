package todo.factory;

// Create the Computer class that extends Course abstract class 
class Computer extends Course {
	// TO-DO: Implement getDuration() method: set a specific duration and print
	// value
	public void getDuration() {
		this.duration = 12;
		System.out.println(this.duration);
	}

	// TO-DO: Implement getFeePerSemester() method: set a specific fee and print
	// value
	public void getFeePerSemester() {
		this.fee = 650.0;
		System.out.println(this.fee);
	}
}
