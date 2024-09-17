
abstract class Task{
	public abstract void trackProgress();
}

class DevelopmentTask extends Task
{
	public void trackProgress() {
		
		System.out.println("Tracking progress of development task 1, 2 completed...");
		System.out.println("Tracking progress of development task 3, 4 is on process...");
	}
}

class DesignTask extends Task
{
	public void trackProgress() {
		System.out.println("Tracking progress of design task 1, 2 completed...");
		System.out.println("Tracking progress of design task 3, 4 is on process...");
	}
}

public class EmployeeAbstraction {

	public static void main(String[] args) {
		DevelopmentTask dt = new DevelopmentTask();
		dt.trackProgress();
		DesignTask d = new DesignTask();
		d.trackProgress();
	}

}
