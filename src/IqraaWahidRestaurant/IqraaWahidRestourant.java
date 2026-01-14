/*
 * Name: Iqraa Wahid
 * Class Code: ICS4U
 * Date: 18/04/2023
 * Purpose: restaurant with background at the back and components on top
 */
package IqraaWahidRestaurant;
import javax.swing.*;
import java.awt.Image;
import java.awt.event.* ;

public class IqraaWahidRestourant extends JFrame implements ItemListener{
	
	//import, resize and add pictures to label for PIZZA
	ImageIcon pizzaP = new ImageIcon ("pizza.jpg");
	Image img1 =pizzaP.getImage() ;   
	//scaled image to fit 100x70
	Image newimg1 = img1.getScaledInstance(100, 70, java.awt.Image.SCALE_SMOOTH ) ; 
	ImageIcon pizzapic1 = new ImageIcon( newimg1 );
	JLabel pizzalbl = new JLabel(pizzapic1);
		 
	//import, resize and add pictures to label for SHAWARMA
	ImageIcon shawarmaP = new ImageIcon ("shawarma.jpg");
	Image img2 =shawarmaP.getImage() ;   
	//scaled image to fit 100x70
	Image newimg2 = img2.getScaledInstance(100, 70, java.awt.Image.SCALE_SMOOTH ) ; 
	ImageIcon shawarmapic1 = new ImageIcon( newimg2 );
	JLabel shawarmalbl = new JLabel(shawarmapic1);
		
	//import, resize and add pictures to label for BIRYANI
	ImageIcon biryaniP = new ImageIcon ("biryani.jpg");
	Image img3 =biryaniP.getImage() ;   
	//scaled image to fit 100x70
	Image newimg3 = img3.getScaledInstance(100, 70, java.awt.Image.SCALE_SMOOTH ) ; 
	ImageIcon biryanipic1 = new ImageIcon( newimg3 );
	JLabel biryanilbl = new JLabel(biryanipic1);

	//import, resize and add pictures to label for POTATO WEDGES
	ImageIcon wedgesP = new ImageIcon ("wedges.jpg");
	Image img4 =wedgesP.getImage() ;   
	//scaled image to fit 100x70
	Image newimg4 = img4.getScaledInstance(100, 70, java.awt.Image.SCALE_SMOOTH ) ; 
	ImageIcon wedgespic1 = new ImageIcon( newimg4 );
	JLabel wedgeslbl = new JLabel(wedgespic1);
	
	//import, resize and add pictures to label for ICE CREAM
	ImageIcon iceCreamP = new ImageIcon ("iceCream.jpg");
	Image img5 =iceCreamP.getImage() ;   
	//scaled image to fit 100x70
	Image newimg5 = img5.getScaledInstance(100, 70, java.awt.Image.SCALE_SMOOTH ) ; 
	ImageIcon iceCreamspic1 = new ImageIcon( newimg5 );
	JLabel iceCreamlbl = new JLabel(iceCreamspic1);
	
	 //prices of the items:
	 double  appleJ=3.00;//price of apple juice
	 double orangeJ=2.00;//price of orange juice
	 double mangoJ=3.20;//price of mango juice
	 double peachJ=3.00;//price of peach juice
	 double biryani=10.50;//price of biryani
	 double strawberry=2.25;//price of strawberry ice cream
	 double pista=3.25;//price of pista ice cream
	 double mango=2.50;//price of mango ice cream
	 double potWedges=4.50;//price of potato wedges
	 double cheese=2.00;//price of cheese pizza
	 double pepproni=2.50;//price of pepproni pizza
	 double chicken=4.75;//price of chicken pizza
	 double coke=2.49;//price of coke
	 double sprite=3.00;//price of sprite
	 double shawarma=9.50;//price of sprite
	 
	 //total counter variable:
	 double total = 0.00;//total cost starts at zero dollars
	
	 //creating labels in panel 1:
	 JLabel  label= new JLabel("Welcome to Iqraa Wahid's Pizza 786!");// create the label for greeting
	 
	 //creating a textbox with the menu
	 JTextArea menu = new JTextArea( 7, 25 ) ;
	 
	 //creating panel1
	 JPanel panel1 = new JPanel();      //creating panel 1
	 
	// Creating three radio buttons and the ButtonGroup container for them
	 JRadioButton rad1 = new JRadioButton( "Apple Juice" ) ;
	 JRadioButton rad2 = new JRadioButton( "Orange Juice" ) ;
	 JRadioButton rad3 = new JRadioButton( "Mango Juice" ) ;
	 JRadioButton rad6 = new JRadioButton( "Peach Juice" ) ;
	 
	// Creating two radio buttons and the ButtonGroup container for them
	 JRadioButton rad4 = new JRadioButton( "Coke" ) ;
	 JRadioButton rad5 = new JRadioButton( "Sprite" ) ;
	 ButtonGroup wines = new ButtonGroup(); 

	 //creating three check boxes
	 JCheckBox chk1 = new JCheckBox( "Pakistani Biryani" ) ; 
	 JCheckBox chk2 = new JCheckBox( "Pakistani Shawarma" ) ;
	 JCheckBox chk3 = new JCheckBox( "Potato Wedges" ) ;  
	 JCheckBox chk4 = new JCheckBox( "Clear" ) ;
	 JCheckBox chk5 = new JCheckBox( "Order" ) ;
	 
	 //creating three textboxes:
	 JTextArea textArea = new JTextArea( 10, 20 ) ;  //item selected
	 JTextArea textArea2 = new JTextArea( 10, 20 ) ;//cost of each item selected
	 
	 //array pizza to keep the options for the combobox
	 String[] pizza = { "Cheese Pizza", "Pepproni(halal) Pizza", "Chicken Pizza" } ; 
	 JComboBox box = new JComboBox( pizza ) ;
	 
	//array iceCream to keep the options for the combobox
	 String[] iceCream= { "Strawberry Ice Cream", "Pista Ice Cream", "Mango Ice Cream" } ; 
	 JComboBox box2 = new JComboBox( iceCream ) ;
	 
	 //constructor
	 public IqraaWahidRestourant() {
		  super("Iqraa's Restaurant");
		  setSize( 580,595 );
		  setDefaultCloseOperation( EXIT_ON_CLOSE );
		  
		  //adding the background using the backImage code
		  IPanel kit = new IPanel();
		  kit.setLayout(null);
		  kit.setBounds(0,0,550,500);
		  add(kit);
		  
		  
		  //adding the photos on the background:
		  pizzalbl.setBounds(10,460,100,100);//pizza destination
		  pizzalbl.setVisible(true);//allow visibility of pizza
		  kit.add(pizzalbl); //add pizza to frame
		  
		  shawarmalbl.setBounds(120,460,100,100);//shawarma destination
		  shawarmalbl.setVisible(true);//allow visibility of shawarma
		  kit.add(shawarmalbl); //add shawarma to frame
		  
		  biryanilbl.setBounds(230,460,100,100);//biryani destination
		  biryanilbl.setVisible(true);//allow visibility of biryani
		  kit.add(biryanilbl); //add biryani to frame
		  
		  wedgeslbl.setBounds(340,460,100,100);//potato wedges destination
		  wedgeslbl.setVisible(true);//allow visibility of potato wedges
		  kit.add(wedgeslbl); //add potato wedges to frame
		  
		  iceCreamlbl.setBounds(450,460,100,100);//ice Cream destination
		  iceCreamlbl.setVisible(true);//allow visibility of ice cream
		  kit.add(iceCreamlbl); //add ice cream to frame
		  
		  label.setBounds(180,15,250,20);//label destination
		  label.setVisible(true);
		  kit.add( label ) ; //adding greeting on the background
		  
		  //adding the ItemListener to radio buttons, checkboxes and comboboxes
		  rad1.addItemListener( this ) ; 
		  rad2.addItemListener( this ) ;
		  rad3.addItemListener( this ) ;
		  rad6.addItemListener( this ) ; 
		  rad4.addItemListener( this ) ;
		  rad5.addItemListener( this ) ;
		  chk1.addItemListener( this ) ;
		  chk2.addItemListener( this ) ;
		  chk3.addItemListener( this ) ;
		  chk4.addItemListener( this ) ;
		  chk5.addItemListener( this ) ;
		  box.addItemListener( this ) ;
		  box2.addItemListener( this ) ;
		  
		  //adding text to textbox menu:
		  menu.append("Menu:\n" + "Juices(Apple - $3.00, Orange - $2.00, Mango - $3.20, Peach - $3.00)\n" + "Pakistani Biryani - $10.50\n" + "Pakistani Shawarma - $9.50\n" + "Potato Wedges - $4.50\n" + "Ice Cream(Strawberry - $2.25, Pista - $3.25, Mango - $2.50)\n " + "Pizza(Cheese - $2.00, Pepproni(halal) - $2.50, Chicken - $4.75)\n" + "Canned Drinks(Coke - $2.49 & Sprite - $3.00)\n");
		  menu.setBounds(10,40,375,130);//label destination
		  menu.setVisible(true);
		  kit.add( menu) ; //adding greeting on the background
		  
		  //adding the components to the background:
		  kit.add( rad1 ); 
		  rad1.setBounds(410,40,105,25);//label destination
		  rad1.setVisible(true);
		  kit.add(rad1) ; //adding greeting on the background
		  
		  kit.add( rad2 );
		  rad2.setBounds(410,60,105,25);//label destination
		  rad2.setVisible(true);
		  kit.add(rad2) ; //adding greeting on the background
		  
		  kit.add( rad3 );
		  rad3.setBounds(410,80,105,25);//label destination
		  rad3.setVisible(true);
		  kit.add(rad3) ; //adding greeting on the background
		  
		  kit.add( rad6 );
		  rad6.setBounds(410,100,105,25);//label destination
		  rad6.setVisible(true);
		  kit.add(rad6) ; //adding greeting on the background
		  
		  kit.add( rad5 );
		  rad5.setBounds(410,130,60,25);//label destination
		  rad5.setVisible(true);
		  kit.add(rad5) ; //adding greeting on the background
		  
		  kit.add( rad4 ); 
		  rad4.setBounds(410,150,60,25);//label destination
		  rad4.setVisible(true);
		  kit.add(rad4) ; //adding greeting on the background
		  
		  kit.add( chk1 );
		  chk1.setBounds(410,180,145,25);//label destination
		  chk1.setVisible(true);
		  kit.add(chk1) ; //adding greeting on the background
		  
		  kit.add( chk2 );
		  chk2.setBounds(410,200,145,25);//label destination
		  chk2.setVisible(true);
		  kit.add(chk2) ; //adding greeting on the background
		  
		  kit.add( chk3 );
		  chk3.setBounds(410,220,145,25);//label destination
		  chk3.setVisible(true);
		  kit.add(chk3) ; //adding greeting on the background
		  
		  kit.add( box2 );
		  box2.setBounds(10,200,170,25);//label destination
		  box2.setVisible(true);
		  kit.add(box2) ; //adding greeting on the background
		  
		  kit.add( box );
		  box.setBounds(200,200,170,25);//label destination
		  box.setVisible(true);
		  kit.add(box) ; //adding greeting on the background
		  
		  kit.add( textArea );
		  textArea.setBounds(10,240,170,200);//label destination
		  textArea.setVisible(true);
		  kit.add(textArea) ; //adding greeting on the background
		  
		  kit.add( textArea2 );
		  textArea2.setBounds(200,240,200,200);//label destination
		  textArea2.setVisible(true);
		  kit.add(textArea2) ; //adding greeting on the background
		  
		  kit.add( chk5 );
		  chk5.setBounds(480,440,60,25);//label destination
		  chk5.setVisible(true);
		  kit.add(chk5) ; //adding greeting on the background
		  
		  kit.add( chk4 );
		  chk4.setBounds(480,420,60,25);//label destination
		  chk4.setVisible(true);
		  kit.add(chk4) ; //adding greeting on the background
		  
		  setVisible( true );//making visibility true
	 }
	 
	//You must override this event-handler method itemsStateChanged with ItemEvent object as a parameter
	 public void itemStateChanged( ItemEvent event ){
		 //getItemsSelectable() method identifies the originating component
		 //for apple juice
		 if(event.getItemSelectable() == rad1){
			 textArea.append( "Apple juice selected\n" ) ;
			 textArea2.append( "Apple juice is $3.00\n" ) ;
			 total=total+appleJ ;
		 }
		 //for orange juice
		 if( event.getItemSelectable() == rad2) {
			 textArea.append( "Orange juice selected\n" ) ;
			 textArea2.append( "Orange juice is $2.00\n" ) ;
			 total=total + orangeJ ;
		 }
		 //for mango juice
		 if( event.getItemSelectable() == rad3) {
			 textArea.append( "Mango juice selected\n" ) ;
		 	 textArea2.append( "Mango juice is $3.20\n" ) ;
		 	 total=total + mangoJ ;
	 	 }
	 
		//getItemsSelectable() method identifies the originating component
		 //for coke 
		 if( event.getItemSelectable() == rad4) {
			  textArea.append( "Coke selected\n" ) ;
			  textArea2.append( "Coke is $2.49\n" ) ;
			  total=total + coke ;
		  }
		  
		 //for sprite
		  if( event.getItemSelectable() == rad5) {
			  textArea.append( "Sprite selected\n" ) ;
			  textArea2.append( "Sprite is $3.00\n" ) ;
			  total=total + sprite ;
		  }
		 
		 //for peach juice
		 if( event.getItemSelectable() == rad6) {
			 textArea.append( "Peach juice selected\n" ) ;
			 textArea2.append( "Peach juice is $3.00\n" ) ;
			 total=total + peachJ ;
		 }
		 
		 //getStateChange() method returns what item is selected
		 //for Pakistani biryani
		 if( ( event.getItemSelectable() == chk1) && ( event.getStateChange() == ItemEvent.SELECTED ) ) {
			 textArea.append( "Pakistani Biryani selected\n" ) ;
			 textArea2.append( "Pakistani Biryani is $10.50\n" ) ;
			 total=total+biryani;
		 }
		 
		 //for Pakistani shawarma
		 if( ( event.getItemSelectable() == chk2) && ( event.getStateChange() == ItemEvent.SELECTED ) ) {
			 textArea.append( "Pakistani Shawarma selected\n" ) ;
			 textArea2.append( "Pakistani Shawarma is $9.50\n" ) ;		 
			 total=total+shawarma;
		 }
		 
		 //for potato wedges
		 if( ( event.getItemSelectable() == chk3) && ( event.getStateChange() == ItemEvent.SELECTED ) ) {
			 textArea.append( "Potato Wedges selected\n" ) ;
			 textArea2.append( "Potato Wedges are $4.50\n" ) ;
			 total=total+potWedges ;
		 }
		 
		 //for box pizza types:
		 //event.getItem().toString() change the name of selected item to string to be printed in the textArea
		 if( ( event.getItemSelectable() == box ) && ( event.getStateChange() == ItemEvent.SELECTED ) ) textArea.append( event.getItem().toString() + " selected\n"  );
		 if( ( event.getItemSelectable() == box ) && ( event.getStateChange() == ItemEvent.SELECTED ) && event.getItem().toString().equals("Cheese Pizza")) textArea2.append(" Cheese pizza will be $2.00\n");
		 if( ( event.getItemSelectable() == box ) && ( event.getStateChange() == ItemEvent.SELECTED ) && event.getItem().toString().equals("Cheese Pizza")) total=total+cheese;
		 if( ( event.getItemSelectable() == box ) && ( event.getStateChange() == ItemEvent.SELECTED ) && event.getItem().toString().equals("Pepproni(halal) Pizza")) textArea2.append(" Pepproni(halal) pizza will be $2.50\n");
		 if( ( event.getItemSelectable() == box ) && ( event.getStateChange() == ItemEvent.SELECTED ) && event.getItem().toString().equals("Pepproni(halal) Pizza")) total=total+pepproni;
		 if( ( event.getItemSelectable() == box ) && ( event.getStateChange() == ItemEvent.SELECTED ) && event.getItem().toString().equals("Chicken Pizza")) textArea2.append(" Chicken pizza will be $4.75\n");
		 if( ( event.getItemSelectable() == box ) && ( event.getStateChange() == ItemEvent.SELECTED ) && event.getItem().toString().equals("Chicken Pizza")) total=total+chicken;

		 //for ice cream types:
		 if( ( event.getItemSelectable() == box2 ) && ( event.getStateChange() == ItemEvent.SELECTED ) ) textArea.append( event.getItem().toString() + " selected\n"  );
		 if( ( event.getItemSelectable() == box2 ) && ( event.getStateChange() == ItemEvent.SELECTED ) && event.getItem().toString().equals("Strawberry Ice Cream")) textArea2.append(" Strawberry ice cream will be $2.25\n");
		 if( ( event.getItemSelectable() == box2 ) && ( event.getStateChange() == ItemEvent.SELECTED ) && event.getItem().toString().equals("Strawberry Ice Cream")) total=total+strawberry;
		 if( ( event.getItemSelectable() == box2 ) && ( event.getStateChange() == ItemEvent.SELECTED ) && event.getItem().toString().equals("Pista Ice Cream")) textArea2.append("Pista ice cream will be $3.25\n");
		 if( ( event.getItemSelectable() == box2 ) && ( event.getStateChange() == ItemEvent.SELECTED ) && event.getItem().toString().equals("Pista Ice Cream")) total=total+pista;
		 if( ( event.getItemSelectable() == box2 ) && ( event.getStateChange() == ItemEvent.SELECTED ) && event.getItem().toString().equals("Mango Ice Cream")) textArea2.append("Mango ice cream will be $2.50\n");
		 if( ( event.getItemSelectable() == box2 ) && ( event.getStateChange() == ItemEvent.SELECTED ) && event.getItem().toString().equals("Mango Ice Cream")) total=total+mango;

		 //when clear is clicked, all the textboxes are empties and the total cost drops to zero:
		 if( ( event.getItemSelectable() == chk4) && ( event.getStateChange() == ItemEvent.SELECTED ) ) {
			 textArea.setText( "" ) ;
			 textArea2.setText( "" ) ;
			 total=0.00 ;
		 }
		 //output the price when order is clicked
		 if( ( event.getItemSelectable() == chk5) && ( event.getStateChange() == ItemEvent.SELECTED ) ) {
			 textArea2.append( "Your total is: $" + total ) ;
		 }
	 }

	 public static void main( String[] args ){
		 IqraaWahidRestourant gui = new IqraaWahidRestourant();//call to constructor
		 		 //IPanel kit = new IPanel();//call to constructor
	 }
}