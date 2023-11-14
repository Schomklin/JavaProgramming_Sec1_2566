import javax.swing.*; //1. import library for input data from dialog box
public class Example4 {
	public static void main(String[] args) {
		//2. input data from dialog box
		String productName = JOptionPane.showInputDialog("Input product name : ");
		
	/*	//input unit price from dialog box
		String strUnit = JOptionPane.showInputDialog("Input prduct unit : ");
		//convert string to int
		int productUnit = Integer.parseInt(strUnit); */
		
		//input and convert data from dialog box
		int productUnit = Integer.parseInt(
				JOptionPane.showInputDialog("Input prduct unit : "));
		
		
		//input price per unit from dialog box
		String strPrice = JOptionPane.showInputDialog("Input price per unit : ");; 
		float pricePerUnit = Float.parseFloat(strPrice);				
		
		//calculate total price 
		float totalPrice = productUnit * pricePerUnit;
		
		//display data to dialog box
		JOptionPane.showMessageDialog(null, "Total Price is "
				+totalPrice );		 

	}

}
