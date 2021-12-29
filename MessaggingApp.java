package day44_OOPReview.callCentre;

public abstract class MessaggingApp {
	public String name;
	protected boolean isFree;
	boolean allOScompatible;
	private static int count;
	public static final String APP_TYPE="Messenger";
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		MessaggingApp.count = count;
	}
	public MessaggingApp() {
		System.out.println("no arg constructor");
	}
	public MessaggingApp(String name) {
		
		this.name = name;
	}
	public abstract void sendMessage(String msg) ;
	public static void close() {
		System.out.println("MessaggingApp is closing...");
	}
	public void launch() {
		System.out.println("MessaggingApp is launching...");
	}
	
	//yyy
	//zzzz
	

}
