import javax.swing.*;
import java.util.*;
import java.text.*;

public class Withdrawal {
	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Random rand = new Random();
		int balance = rand.nextInt(9) * 100000;
		
		int withdrawMoney = Integer.parseInt(
				JOptionPane.showInputDialog("Your balance : "+ frm.format(balance) 
						+ "\nInput money to withdraw: "));
		//if/elseif for check condition
		


	}

}
