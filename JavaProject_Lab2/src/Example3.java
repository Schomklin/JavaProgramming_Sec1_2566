import java.util.*; //1.import for input data from keyboard
public class Example3 {
	public static void main(String[] args) {
		//2. create class Scanner for input data from keyboard
		Scanner input = new Scanner(System.in);
		//3. display and input data
		System.out.print("Input product name : ");
		String productName = input.nextLine();
		System.out.print("Input product unit : ");
		int productUnit = input.nextInt();
		System.out.print("Input price per unit : ");
		float priceperUnit = input.nextFloat();
		System.out.println(); //เว้น 1 บรรทัด 
		float totalPrice = productUnit * priceperUnit;
		System.out.println("Total Price is "+totalPrice + " baht.");		
	}
}
