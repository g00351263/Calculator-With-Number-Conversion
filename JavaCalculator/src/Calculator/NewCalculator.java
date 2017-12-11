/*Authour Raja Naseer Ahmed Khan
 * B.Sc 2nd Year, Software Development.
 * G.M.I.T. Dublin Road, Campus, Galway City.
 * Calculator Project with Number System Coverter
 */
package Calculator;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class NewCalculator extends NumberConversionFull implements ActionListener{

	///Objects of frame/panel/text////

		JFrame frame = new JFrame();
		JPanel panel = new JPanel( );
		JTextArea txt = new JTextArea( 2, 8 );
	
		DecimalFormat df = new DecimalFormat("#.00"); // formating to 2 decimal place
		DecimalFormat db = new DecimalFormat("#"); // no decimal place
	
////////Buttons///////////////////////

    JButton button1= new JButton("1");
    JButton button2= new JButton("2");
	JButton button3= new JButton("3");
	JButton button4= new JButton("4");
	JButton button5= new JButton("5");
	JButton button6= new JButton("6");
	JButton button7= new JButton("7");
	JButton button8= new JButton("8");
	JButton buttonDot= new JButton(".");
	JButton button9= new JButton("9");
	JButton button0= new JButton("0");
	JButton buttonSub= new JButton("-");
	JButton buttonMul= new JButton("x");
	JButton buttonDiv = new JButton("/");
	JButton buttonAdd= new JButton("+");
	JButton buttonequal= new JButton("=");
	JButton buttonclear= new JButton("C");
	JButton btnhex = new JButton("HEX");
	JButton btnbin = new JButton("Bin");
	JButton btnoct = new JButton("OCT");

	//////////////////Variables/////////////////////////////
	
	 double number1,number2,result;
	 int addc=0,multic=0, divc=0,subc=0, hexi =  0, bini = 0, octi =0;
	 int conv;
	 
//// constructor//////////////////////////////
     public NewCalculator(){
    	 
////// How to close App/////////////
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
 ////////////////// Frame Properties//// 
  frame.setVisible(true);
  frame.setSize(340,470);
  frame.setTitle("Calculator");
  frame.setResizable(false);
         
  //// adding components to frame////////          
frame.add(panel);
   panel.setBackground(Color.DARK_GRAY);
   Border border = 
   BorderFactory.createLineBorder(Color.RED, 5);
   panel.setBorder(border);
        
 
   panel.add(txt);
   Font font = new Font("Verdana", Font.BOLD,33 );
   txt.setFont(font);
   Border D =	BorderFactory.createLineBorder(Color.BLUE, 5);
   txt.setBorder(D);
   txt.setForeground(Color.WHITE);
   txt.setBackground(Color.BLACK);
   txt.setLineWrap(true);
   txt.setWrapStyleWord(true);
   txt.setPreferredSize(new Dimension(2,10));
 
 ///Border style for buttons//////////////
	Border bBorder = BorderFactory.createLineBorder(Color.BLACK,1);

	//////buttons sizes and shapes/colors/////			
				
				button1.setPreferredSize(new Dimension(96,43));				
				button1.setFont(new Font("Arial", Font.PLAIN, 28));	
				button1.setBorder(bBorder);

				button2.setPreferredSize(new Dimension(96,43));
				button2.setFont(new Font("Arial", Font.PLAIN, 28));				
				button2.setBorder(bBorder);

				button3.setPreferredSize(new Dimension(96,43));
				button3.setFont(new Font("Arial", Font.PLAIN, 28));				
				button3.setBorder(bBorder);

				button4.setPreferredSize(new Dimension(96,43));
				button4.setFont(new Font("Arial", Font.PLAIN, 28));				
				button4.setBorder(bBorder);

				button5.setPreferredSize(new Dimension(96,43));
				button5.setFont(new Font("Arial", Font.PLAIN, 28));				
				button5.setBorder(bBorder);

				button6.setPreferredSize(new Dimension(96,43));
				button6.setFont(new Font("Arial", Font.PLAIN, 28));				
				button6.setBorder(bBorder);

				button7.setPreferredSize(new Dimension(96,43));
				button7.setFont(new Font("Arial", Font.PLAIN, 28));				
				button7.setBorder(bBorder);

				button8.setPreferredSize(new Dimension(96,43));
				button8.setFont(new Font("Arial", Font.PLAIN, 28));				
				button8.setBorder(bBorder);

				button9.setPreferredSize(new Dimension(96,43));
				button9.setFont(new Font("Arial", Font.PLAIN, 28));				
				button9.setBorder(bBorder);

				button0.setPreferredSize(new Dimension(96,43));
				button0.setFont(new Font("Arial", Font.PLAIN, 28));				
				button0.setBorder(bBorder);

				buttonAdd.setPreferredSize(new Dimension(96,43));
				buttonAdd.setFont(new Font("Arial", Font.PLAIN, 28));				
				buttonAdd.setBorder(bBorder);

				buttonSub.setPreferredSize(new Dimension(96,43));
				buttonSub.setFont(new Font("Arial", Font.PLAIN, 28));				
				buttonSub.setBorder(bBorder);

				buttonMul.setPreferredSize(new Dimension(96,43));
				buttonMul.setFont(new Font("Arial", Font.PLAIN, 28));				
				buttonMul.setBorder(bBorder);

				buttonDiv.setPreferredSize(new Dimension(96,43));
				buttonDiv.setFont(new Font("Arial", Font.PLAIN, 28));				
				buttonDiv.setBorder(bBorder);

				buttonequal.setPreferredSize(new Dimension(96,43));
				buttonequal.setFont(new Font("Arial", Font.PLAIN, 28));				
				buttonequal.setBorder(bBorder);

				buttonDot.setPreferredSize(new Dimension(96,43));
				buttonDot.setFont(new Font("Arial", Font.PLAIN, 28));				
				buttonDot.setBorder(bBorder);

				buttonclear.setPreferredSize(new Dimension (198,43));
				buttonclear.setFont(new Font("Arial", Font.PLAIN, 28));				
				buttonclear.setBorder(bBorder);
   
				/////// Adding buttons to panel//////////      
         panel.add(button1);
         panel.add(button2);
         panel.add(button2);
         panel.add(button3);
         panel.add(button4);
         panel.add(button5);
         panel.add(button6);
         panel.add(button7);
         panel.add(button8);
         panel.add(button9);
         panel.add(button0);
         panel.add(buttonDot);
         panel.add(buttonSub);
         panel.add(buttonMul);
         panel.add(buttonDiv);  
         panel.add(buttonAdd);
         panel.add(buttonequal);
         panel.add(buttonclear);
         	
         	panel.add(btnhex);
			panel.add(btnbin);
			panel.add(btnoct);
         
	///// getting object click reference/////////
         button1.addActionListener(this);
         button2.addActionListener(this);
         button3.addActionListener(this);
         button4.addActionListener(this);
         button5.addActionListener(this);
         button6.addActionListener(this);
         button7.addActionListener(this);
         button8.addActionListener(this);
         button9.addActionListener(this);
         button0.addActionListener(this);
         buttonDot.addActionListener(this);
         buttonAdd.addActionListener(this);
         buttonSub.addActionListener(this);
         buttonMul.addActionListener(this);
         buttonDiv.addActionListener(this);
         buttonequal.addActionListener(this);
         buttonclear.addActionListener(this);
         btnhex.addActionListener(this);
         btnoct.addActionListener(this);
         btnbin.addActionListener(this);
     } 

/// action to be performed on click//////////////////
     
 public void actionPerformed(ActionEvent e){
		 
		Object source = e.getSource();
	
		if(source== buttonclear){
               number1 = 0.0;
               number2 = 0.0;
               txt.setText("");
				 }           
		if(source == button1){
			txt.append("1");
		}
		if(source == button2){
			txt.append("2");
		} 
		if(source == button3){
			txt.append("3");	
		}
		if(source == button4){
			txt.append("4");
		}
		if(source == button5){
			txt.append("5");
		}
		if(source == button6){
			txt.append("6");
		}
		if(source == button7){
			txt.append("7");
		}
		if(source == button8){
			txt.append("8");
		}
		if(source == button9){
			txt.append("9");
		}
		if(source == button0){
			txt.append("0");
		}
		if(source == buttonDot){
			txt.append(".");
	    }
		if(source == buttonAdd){
			number1 =number_reader();
			txt.setText("");
			addc = 1;
			multic =0;
			divc = 0;
			subc =0 ;
	   	}
		if(source == buttonSub){
			number1 =number_reader();
			txt.setText("");
			addc = 0;
			multic =0;
			divc = 0;
			subc =1;
         }
		if(source == buttonDiv){
			number1 =number_reader();
			txt.setText("");
			addc = 0;
			multic =0;
			divc = 1;
			subc =0 ;
	   	 }
			if(source == buttonMul){
			number1 =number_reader();
			txt.setText("");		
			addc = 0;
			multic =1;
			divc = 0;
			subc =0 ;
		 }
			
	//////////////////NumberConversions/////////////////
			if(source == btnhex) {
				number2 = read2();
				conv = (int)number2;
				txt.setText(NumberConversion.toHex(conv));
				addc = 0;
				multic =0;
				divc = 0;
				subc =0 ;
				octi = 0;
				bini = 0;
				hexi = 1;
				}

			if(source == btnoct) {
				number1 = number_reader();
			txt.setText(NumberConversionFull.toOct((int)number1));
			addc = 0;
			multic =0;
			divc = 0;
			subc =0 ;
				octi = 1;
				bini = 0;
				hexi = 0;
				}
			if(source == btnbin) {
				number1 = number_reader();
				txt.setText(Integer.toBinaryString((int)number1));
				addc = 0;
				multic =0;
				divc = 0;
				subc =0 ;
				octi = 0;
				bini = 1;
				hexi = 0;
				}	
			
	//// numbers calculations////////////////////
			
		if(source == buttonequal){
			if(addc > 0){
				number2 = read2();
				txt.setText(Double.toString(number1+number2));
			}
			if(subc>0){
				number2 = read2();
				txt.setText(Double.toString(number1-number2));		  
		  }
			if(multic>0){
				number2 = read2();
				result = number1 * number2;
				txt.setText(Double.toString(result));		  
		  }
			if(divc>0){
				number2 = read2();
				result = number1 + number2;
				if(result % 2 == 0) {
					txt.setText(db.format(number1/number2)); // format results to 2 decimal places
				}
				else
				{
					txt.setText(df.format(number1/number2));
				}	  
 			}
		  }
 		} 
//////////////////// Number readers///////////////////////			 
public double number_reader(){
	double num1;
	String s;
	s=txt.getText();
	num1 = Double.valueOf(s);
	return num1;
         }
public double read2() { // reading the text from text box and parsing it to double
	double num1;
	String s;
	s=txt.getText();
	num1 = Double.valueOf(s);
	return num1;
	}

}
