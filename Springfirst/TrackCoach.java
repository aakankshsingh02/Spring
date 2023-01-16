package Springfirst;

public class TrackCoach implements coach {
	private Happyy happy;
	//public TrackCoach() {}
	public TrackCoach ( Happyy theHappyy) {
		happy= theHappyy;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run 5km";
	}

	@Override
	public String getHappy() {
		// TODO Auto-generated method stub
		return "Always be: "+happy.getHappy();
	}

}
