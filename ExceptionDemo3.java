package HITdayPrograms;
public class ExceptionDemo3 {
	public static void main(String[] args) {
		String cardValidity=args[0];
		ATM atmUser=new ATM();
		try {
			atmUser.insertCard("invalid");
		}catch(InvalidCardException ice) {
			System.out.println(ice);
			System.out.println("Action or logic ....for invalid card...");
		}
		System.out.println("normal transaction....");
		
	}
}
class ATM{
	public void insertCard(String cardValidity)throws InvalidCardException {
		if(cardValidity.equals("valid")) {
			System.out.println("I will process the card....");
		}
		else {
				throw new InvalidCardException();	
			}
		}
}