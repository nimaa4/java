/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Home extends JFrame{
    String username;
    public static void main(String[] args) {
        new Home("").setVisible(true);
    }
    
    public Home(String username) {
        super("Travel and Tourism Management System");
	this.username = username;
        setForeground(Color.CYAN);
        setLayout(null); 

        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1000,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
	JLabel NewLabel = new JLabel(i3);
	NewLabel.setBounds(0, 0, 1950, 1000); 
        add(NewLabel);
        
        JLabel l1 = new JLabel("Travel and Tourism Management System");
	l1.setForeground(Color.WHITE);
        l1.setFont(new Font("Tahoma", Font.PLAIN, 55));
	l1.setBounds(500, 60, 1000, 100);
	NewLabel.add(l1);
		
		
//        JMenuBar menuBar = new JMenuBar();
//	setJMenuBar(menuBar);
		
//        JMenu m1 = new JMenu("CUSTOMER");
//        m1.setForeground(Color.BLUE);
//	menuBar.add(m1);
        JPanel m1 = new JPanel();
        m1.setLayout(null);
        m1.setBackground(new Color(133, 193, 233));
        m1.setBounds(0, 0, 300, 800);
        add(m1);
		
        JButton mi1 = new JButton("ADD CUSTOMER");
        mi1.setBounds(0, 0, 300, 50);
        mi1.setForeground(Color.black);
        mi1.setBackground(new Color(133, 193, 233));
        mi1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        mi1.setMargin(new Insets(0, 0, 0, 60));
	m1.add(mi1);
        
        JButton mi2 = new JButton("UPDATE CUSTOMER DETAIL");
        mi2.setBounds(0, 50, 300, 50);
        mi2.setForeground(Color.black);
        mi2.setBackground(new Color(133, 193, 233));
        mi2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        mi2.setMargin(new Insets(0, 0, 0, 30));
	m1.add(mi2);
        
        JButton mi3 = new JButton("VIEW CUSTOMER DETAILS");
        mi3.setBounds(0, 100, 350, 50);
        mi3.setForeground(Color.black);
        mi3.setBackground(new Color(133, 193, 233));
        mi3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        mi3.setMargin(new Insets(0, 0, 0, 60));
	m1.add(mi3);
        
        JButton mi4 = new JButton("DELETE CUSTOMER DETAILS");
        mi4.setBounds(0, 150, 350, 50);
        mi4.setForeground(Color.black);
        mi4.setBackground(new Color(133, 193, 233));
        mi4.setFont(new Font("Tahoma", Font.PLAIN, 20));
        mi4.setMargin(new Insets(0, 0, 0, 60));
	m1.add(mi4);
        
        mi1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddCustomer(username).setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        mi2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new UpdateCustomer(username).setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        mi3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new ViewCustomers(username).setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        mi4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new DeleteCustomer(username).setVisible(true);
                }catch(Exception e ){}
            }
	});
        	
//	JMenu m2 = new JMenu("PACKAGES");
//        m2.setForeground(Color.RED);
//	menuBar.add(m2);

        JButton mi6 = new JButton("CHECK PACKAGE");
        mi6.setBounds(0, 200, 350, 50);
        mi6.setForeground(Color.black);
        mi6.setBackground(new Color(133, 193, 233));
        mi6.setFont(new Font("Tahoma", Font.PLAIN, 20));
        mi6.setMargin(new Insets(0, 0, 0, 60));
	m1.add(mi6);
        
        JButton mi7 = new JButton("BOOK PACKAGE");
        mi7.setBounds(0, 250, 350, 50);
        mi7.setForeground(Color.black);
        mi7.setBackground(new Color(133, 193, 233));
        mi7.setFont(new Font("Tahoma", Font.PLAIN, 20));
        mi7.setMargin(new Insets(0, 0, 0, 60));
	m1.add(mi7);
        
        JButton mi5 = new JButton("VIEW BOOKED PACKAGE");
        mi5.setBounds(0, 300, 350, 50);
        mi5.setForeground(Color.black);
        mi5.setBackground(new Color(133, 193, 233));
        mi5.setFont(new Font("Tahoma", Font.PLAIN, 20));
        mi5.setMargin(new Insets(0, 0, 0, 60));
	m1.add(mi5);
                
        mi6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new CheckPackage().setVisible(true);
                }catch(Exception e ){}
            }
	});
        

        mi7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new BookPackage(username).setVisible(true);
                }catch(Exception e ){}
            }
	});
        

	mi5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new ViewPackage(username).setVisible(true);
                }catch(Exception e ){}
                
            }
	});
        
        
//        JMenu m3 = new JMenu("HOTELS");
//        m3.setForeground(Color.BLUE);
//	menuBar.add(m3);
        
        JButton mi8 = new JButton("BOOK HOTELS");
        mi8.setBounds(0, 350, 350, 50);
        mi8.setForeground(Color.black);
        mi8.setBackground(new Color(133, 193, 233));
        mi8.setFont(new Font("Tahoma", Font.PLAIN, 20));
        mi8.setMargin(new Insets(0, 0, 0, 60));
	m1.add(mi8);
        
        JButton mi9 = new JButton("VIEW BOOKED HOTEL");
        mi9.setBounds(0, 400, 350, 50);
        mi9.setForeground(Color.black);
        mi9.setBackground(new Color(133, 193, 233));
        mi9.setFont(new Font("Tahoma", Font.PLAIN, 20));
        mi9.setMargin(new Insets(0, 0, 0, 60));
	m1.add(mi9);
        
        mi8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new BookHotel(username).setVisible(true);
            }
	});
        
        
        
        mi9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new ViewBookedHotel(username).setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        
 
//        JMenu m5 = new JMenu("PAYMENT");
//        m5.setForeground(Color.BLUE);
//	menuBar.add(m5);
        
        JButton mi10 = new JButton("PAY USING PAYTM");
        mi10.setBounds(0, 450, 350, 50);
        mi10.setForeground(Color.black);
        mi10.setBackground(new Color(133, 193, 233));
        mi10.setFont(new Font("Tahoma", Font.PLAIN, 20));
        mi10.setMargin(new Insets(0, 0, 0, 60));
	m1.add(mi10);
        
        mi10.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Payment().setVisible(true);
            }
	});
        
       
        
        
        
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
	setVisible(true);
        getContentPane().setBackground(Color.WHITE);
    }
}