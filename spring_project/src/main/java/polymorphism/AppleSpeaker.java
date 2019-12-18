package polymorphism;



public class AppleSpeaker implements Speaker{

	@Override
	public void volumeUp() {
		System.out.println("appleSpeaker : volumeUp");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("appleSpeaker : volumeDown");
		
	}

}
