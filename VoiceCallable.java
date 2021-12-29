package day44_OOPReview.callCentre;

public interface VoiceCallable {
	boolean CAN_CALL=true;//jvm understands this is public static final boolean 
	void call(String contact);//abstract method
	//static we need to implement
	public static void decline() {
		System.out.println("Mike decline voice call...");
	}
    //default method
	public default void accept() {
		System.out.println("Mike finally accept voice call");
	}
}
