package Springfirst;

public class BaseballCoach implements coach {
	
	private Happyy happy;
	public BaseballCoach(Happyy theHappyy) {
		happy= theHappyy;
	}
	@Override
	public String getDailyWorkout() {
		return "Spend 10 minutes in practice"; 
	}

	@Override
	public String getHappy() {
		
		
		return happy.getHappy();
	}
}
