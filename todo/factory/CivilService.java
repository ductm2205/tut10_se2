package todo.factory;

// Create the CivilService class that extends Course abstract class 
class CivilService extends Course {
	// TO-DO: Implement getDuration() method: set a specific duration and print
	// value
	public void getDuration() {
		this.duration = 2;
		System.out.println(this.duration);
	}

	// TO-DO: Implement getFeePerSemester() method: set a specific fee and print
	// value
	public void getFeePerSemester() {
		this.fee = 480.5;
		System.out.println(this.fee);
	}
}