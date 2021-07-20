import javax.swing.JOptionPane;

public class RunProgram
{
  public static void main(String[] args)
  {
     double num1,num2,num3,sum;
	 String strValue1,strValue2,strValue3;
	 
	 // accept values from user
	 strValue1 = JOptionPane.showInputDialog(null,"Enter first real number","input1",JOptionPane.QUESTION_MESSAGE);
	 strValue2 = JOptionPane.showInputDialog(null,"Enter second real number","input2",JOptionPane.QUESTION_MESSAGE);
	 strValue3 = JOptionPane.showInputDialog(null,"Enter third real number","input3",JOptionPane.QUESTION_MESSAGE);
	// convert values to double
	num1 = Double.parseDouble(strValue1);
	num2 = Double.parseDouble(strValue2);
	num3 = Double.parseDouble(strValue3);
	// calculations 
	sum = num1 + num2 + num3;
	
	//Display the results 
	JOptionPane.showMessageDialog(null,"Sum is" + sum,"Results",JOptionPane.INFORMATION_MESSAGE);
  }

}