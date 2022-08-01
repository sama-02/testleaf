package week1.day1;

public class Mobile {

	public void sendMessage(){
		System.out.println("Sending Message");
	}
	public void shareDocument(){
		System.out.println("Sharing Document");
	}
	public void call(){
		System.out.println("Calling");
	}
	
	public static void main(String[] args) {
	
	Mobile mob= new Mobile();
	mob.sendMessage();
	mob.shareDocument();
	mob.call();
	
	}
	
}
