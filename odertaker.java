package odd_numbers;
import javax.swing.JOptionPane;

public class ordertaker {
	
	public static void main(String[] args) {
		
		int maindish=Integer.valueOf(JOptionPane.showInputDialog(null,"[1]Fried Chicken P30 \n [2] Adobo P45 \n [3] Chicken Soap P45 \n [4] Bulalo P50 \n Select MainDish"));
	    int quantity=Integer.valueOf(JOptionPane.showInputDialog(null,"enter quantity"));    
	    int Drinks=Integer.valueOf(JOptionPane.showInputDialog(null,"[1] Coke P15  \n [2} Juice P10 \n [3] None"));
	    int quantity2=Integer.valueOf(JOptionPane.showInputDialog(null,"enter quantity"));
	        int totalBill=0;
	        int change=0;
	        String remarks=new String();
	        int sum=0;
	        
	        switch(maindish){
	            case 1:
	                remarks="Fried Chicken";
	                maindish=+quantity;
	                break;
	            case 2:
	                remarks="Adobo";
	                maindish=+quantity;
	                break;
	            case 3:
	                remarks="Chicken Soap";
	                maindish=+quantity;
	                break;
	            case 4:
	                remarks="Bulalo";
	                maindish=+quantity;
	                break;
	        }
	        switch(Drinks){
	            case 1:
	                remarks="Coke";
	                Drinks=+quantity2;
	                break;
	            case 2:
	                remarks="Juice";
	                Drinks=+quantity2;
	                break;
	            case 3:
	                remarks="none";
	                break;
	        }
	        sum=maindish+Drinks;
	        JOptionPane.showMessageDialog(null," TotalBill: " +sum);
	        int cash=Integer.valueOf(JOptionPane.showInputDialog(null,"cash"));
	        //sum= cash - sum;//sakto	        	
	        //JOptionPane.showMessageDialog(null,"Change "+sum);
	        //cash =- sum;
	        //sum=cash-sum;
	        int total = 0;
	        total = sum - cash;
	        
	        if ( cash < sum) {
	        	JOptionPane.showMessageDialog(null,"Your money is : "+ cash + " Lower than sum of:" +sum);
	        }
	        else {
	        	JOptionPane.showMessageDialog(null,"Your change is: "+total);
	        }
	        
	      
	                
	        
		
	}
		
}

