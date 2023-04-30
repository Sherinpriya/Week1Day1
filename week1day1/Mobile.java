package week1day1;

public class Mobile {

	public void makeCall() {
		
	
	          String mobileModel = "Oneplus";
			  float mobileWeight = 20.5f;
			  
			  System.out.println("The mobile model is " + mobileModel);
			  System.out.println("The mobile weight is " + mobileWeight);
	}		  
			  
	public void sendMsg() {
		
	
		      boolean isFullyCharged = true;
		      int mobileCost = 35000;
		       
		      System.out.println("Is the mobile is fully charged " + isFullyCharged);
		      System.out.println("The mobile cost is " + mobileCost);
	}
		      
	
public static void main(String[] args) {
	
           Mobile obj = new Mobile();
           obj.makeCall();
           obj.sendMsg();
           System.out.println("This is my mobile");
}
}
