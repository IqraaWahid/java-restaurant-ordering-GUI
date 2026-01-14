/*
 * Name: Iqraa Wahid
 * Class Code: ICS4U
 * Date: 18/04/2023
 * Purpose: for background
 */
package IqraaWahidRestaurant;
import java.awt.*;
import javax.swing.*;
public class IPanel extends JPanel  {
	Image  menu;
	public IPanel() {
    	super();
    	Toolkit kit = Toolkit.getDefaultToolkit();
    	menu = kit.getImage("menu.jpg");
	}
	
	public void paintComponent(Graphics comp) {
    	 Graphics2D comp2D = (Graphics2D) comp;
    	 comp2D.drawImage(menu, 0, 0, this);}
	
	public static void main (String[] args) {
		
	}
}
