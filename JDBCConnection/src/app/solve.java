package app;
// Java Program to create a simple JComboBox 
// and add elements to it 
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.awt.*; 
import javax.swing.*;
import javax.swing.table.DefaultTableModel; 
class solve extends JFrame implements ItemListener, ActionListener {
	
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	

	

	// frame 
	static JFrame f; 

	// label 
	static JLabel l, l1; 

	// combobox 
	static JComboBox comboBox; 

	static JTextField FirstName;
	static JTextField LastName;
	static JTextField Email;
	static JTextField Password;
	
	static JButton b1;
	static JButton b2;
	
	static JTable j;
	
	// main class 
	public static void main (String [] args) throws SQLException 
	{ 
		// create a new frame 
		
		System.out.println("hello");
		//Connection Start
		try {
			DriverManager.registerDriver(new org.postgresql.Driver());
		} catch (Exception cnfe) {
			System.out.println("Class not found");
		}

		@SuppressWarnings("resource")
		Scanner stdin = new Scanner (System.in);
		System.out.print("Username: ");
		String user = stdin.next();
		
		System.out.print("Password: ");
		String pass = stdin.next();
		
		String url = "jdbc:postgresql://comp421.cs.mcgill.ca:5432/cs421";
		Connection con = DriverManager.getConnection(url, user, pass);
		Statement statement = con.createStatement();
		System.out.println("Successful Connection");
		//Connection Ends
  
        // Initializing the JTable 
        f = new JFrame("frame"); 
        f.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        f.getContentPane().setLayout(null);
    	
    	JLayeredPane layeredPane = new JLayeredPane();
    	layeredPane.setBounds(10, 47, 403, 205);
    	f.getContentPane().add(layeredPane);
    	layeredPane.setLayout(new CardLayout(0, 0));
    	
    	
    	
    	
    	JLabel lblNewLabel = new JLabel("Add new user");
    	JLabel lblNewLabel2 = new JLabel("Opt 2 selected");
    	JLabel lblNewLabel3 = new JLabel("Opt 3 selected");
    	JLabel lblNewLabel4 = new JLabel("Opt 4 selected");
    	
    	//Add User
    	JLabel FirstName = new JLabel("First Name");
    	JLabel LastName = new JLabel("Last Name");
    	JLabel Email = new JLabel("Email");
    	JLabel Password = new JLabel("Password");
    	
    	JTextField FirstNameField = new JTextField(20);
    	JTextField LastNameField = new JTextField(20);
    	JTextField EmailField = new JTextField(20);
    	JTextField PasswordField = new JTextField(20);
    	
    	//View All pages run by list of admins
    	JButton Choose = new JButton("Select");
    	
    	//Part of Option 2, preQuery
    	String AdminCounter = "SELECT DISTINCT(count(first_name)) FROM accountuser NATURAL JOIN manages";
    	String AdminQuery = "SELECT DISTINCT first_name FROM accountuser NATURAL JOIN manages";
    	int AdminCountInt=0;
    	java.sql.ResultSet AdminCount = statement.executeQuery(AdminCounter);
    	while (AdminCount.next()) {
    		String AdminCountFinal = AdminCount.getString("count");
    		AdminCountInt = Integer.parseInt(AdminCountFinal);
    		System.out.println(AdminCountInt);
    		
    	}
    	String[] admins = new String[AdminCountInt-1];
    	
    	java.sql.ResultSet AdminResult = statement.executeQuery(AdminQuery);
    	int counter = 0;
		while (AdminResult.next()) {
			String name = AdminResult.getString("first_name");
			admins[counter] = name;
			counter++;
		}
		
    	JComboBox Admin = new JComboBox(admins);
    	JLabel Tester = new JLabel("Tester:");
    	String[] ColumnName = {"Admin of Table"};
    	JTable aTable = new JTable();
    	DefaultTableModel aModel = (DefaultTableModel) aTable.getModel();
    	aModel.setColumnIdentifiers(ColumnName);
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	//Option 3
    	
    	JPanel Option1 = new JPanel();
    	BoxLayout layout1 = new BoxLayout(Option1, BoxLayout.Y_AXIS);
    	Option1.setLayout(layout1);
    	Option1.add(lblNewLabel);
    	Option1.add(FirstName);
    	Option1.add(FirstNameField);
    	Option1.add(LastName);
    	Option1.add(LastNameField);
    	Option1.add(Email);
    	Option1.add(EmailField);
    	Option1.add(Password);
    	Option1.add(PasswordField);
    	layeredPane.add(Option1, "name_2074080574799800");
    	
    	JPanel Option2 = new JPanel();
    	
    	BoxLayout layout2 = new BoxLayout(Option2, BoxLayout.Y_AXIS);
    	Option2.setLayout(layout2);
    	Option2.add(Tester);
    	Option2.add(Choose);
    	Option2.add(Admin);
    	Option2.add(aTable);
    	layeredPane.add(Option2, "name_2074097485636900");
    	
    	JPanel Option3 = new JPanel();
    	/*
    	BoxLayout layout3 = new BoxLayout(Option3, BoxLayout.Y_AXIS);
    	Option3.setLayout(layout3);
    	Option3.add(lblNewLabel);
    	Option3.add(FirstName);
    	Option3.add(FirstNameField);
    	Option3.add(LastName);
    	Option3.add(LastNameField);
    	Option3.add(Email);
    	Option3.add(EmailField);
    	Option3.add(Password);
    	Option3.add(PasswordField);
    	layeredPane.add(Option3, "name_2074111329535300");
    	
    	JPanel Option4 = new JPanel();
    	BoxLayout layout4 = new BoxLayout(Option4, BoxLayout.Y_AXIS);
    	Option4.setLayout(layout4);
    	Option4.add(lblNewLabel);
    	Option4.add(FirstName);
    	Option4.add(FirstNameField);
    	Option4.add(LastName);
    	Option4.add(LastNameField);
    	Option4.add(Email);
    	Option4.add(EmailField);
    	Option4.add(Password);
    	Option4.add(PasswordField);
    	layeredPane.add(Option4, "name_2074113974014000");
    	
    	*/
    	
    	
    	Option2.add(lblNewLabel2);
    	//Option3.add(lblNewLabel3);
    	//Option4.add(lblNewLabel4);
    	
    	
    	String s1[] = { "Option 1", "Option 2", "Option 3", "Option 4", "Quit"}; 
    	@SuppressWarnings("unchecked")
		JComboBox comboBox = new JComboBox(s1);
    	comboBox.setBounds(311, 11, 102, 22);
    	f.getContentPane().add(comboBox);
 
		
		
		JPanel p = new JPanel(); 
		// create a object 
		solve s = new solve(); 

		// set layout of frame 
		f.getContentPane().setLayout(new FlowLayout()); 

		// array of string contating cities 
		

		// create checkbox 
		b1 = new JButton("Confirm");
		// add ItemListener 
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int sqlCode = 0; // Variable to hold SQLCODE
				String sqlState = "00000"; // Variable to hold SQLSTATE
				String opt = comboBox.getSelectedItem()+"";
				if(opt.equals("Option 1")) { //Insert person into table
					layeredPane.removeAll();
					layeredPane.add(Option1);
					layeredPane.repaint();
					layeredPane.revalidate();
					System.out.println("hello");
					String First = FirstNameField.getText();
					String Last = LastNameField.getText();
					String Email = EmailField.getText();
					String Pass = PasswordField.getText();
					System.out.println(First + " " + Last + " " + Email + " " + Pass);
					String insertSQL = "INSERT INTO accountuser (email, first_name, last_name, password) " +  
									   "VALUES (" + "'" + Email + "'" + "," + "'" + First + "'" + ", " + "'" + Last + "'" + ", " + "'" + Pass + "'" +")";
					System.out.println(insertSQL);
					try {
						statement.executeUpdate(insertSQL);
						lblNewLabel.setText("Insert Complete");
					} catch (SQLException e1) {
						sqlCode = e1.getErrorCode();
						sqlState = e1.getSQLState();
						lblNewLabel.setText(sqlState);
						System.out.println("SQLcode: " + sqlCode);
						System.out.println("SQLState: " + sqlState);
					}
					System.out.println("Successful Insert");
					
					
					}	
				if(opt.equals("Option 2")) { //Query for all pages admins 
					
					
					Choose.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							aModel.setRowCount(0);
							String AdminSelection = Admin.getSelectedItem()+"";
							Tester.setText(AdminSelection);
							int sqlCode = 0; // Variable to hold SQLCODE
							String sqlState = "00000"; // Variable to hold SQLSTATE
							try {
								String querySQL = "SELECT page_name From (page NATURAL JOIN manages) NATURAL JOIN accountuser WHERE first_name = " + "'" + AdminSelection + "'";
								System.out.println(querySQL);
								java.sql.ResultSet rs = statement.executeQuery(querySQL);
								java.sql.ResultSetMetaData rsmd = rs.getMetaData();
								int colNo = rsmd.getColumnCount();
								while (rs.next()) {
									Object[] objects = new Object[colNo];
									for (int i = 0; i < colNo; i++) {
										objects[i] = rs.getObject(i+1);
									}
									aModel.addRow(objects);
									//String name = rs.getString("page_name");
									//System.out.println(name);
									//l1.setText(name); 
								}
								aTable.setModel(aModel);
								System.out.println("Query Complete");
							} catch (SQLException err) {
								sqlCode = err.getErrorCode(); 
								sqlState = err.getSQLState(); 
								System.out.println("Code: " + sqlCode + "  sqlState: " + sqlState);
							}
						}
					});
					layeredPane.removeAll();
					layeredPane.add(Option2);
					layeredPane.repaint();
					layeredPane.revalidate();
					
					
					
				}
				if(opt.equals("Option 3")) {
					layeredPane.removeAll();
					//layeredPane.add(Option3);
					layeredPane.repaint();
					layeredPane.revalidate();
					l1.setText("3"); 
				}
				if(opt.equals("Option 4")) {
					layeredPane.removeAll();
					//layeredPane.add(Option4);
					layeredPane.repaint();
					layeredPane.revalidate();
					l1.setText("4"); 
				}
				if(opt.contentEquals("Quit")) {
				
					try {
						statement.close();
						con.close();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					System.exit(0);
					
				}
				
				
				System.out.println(""+comboBox.getSelectedItem()+"");
			}
		});
		comboBox.addItemListener(s); 

		// create labels 
		l = new JLabel("Select an option "); 
		l1 = new JLabel(""); 

		// set color of text 
		l.setForeground(Color.red); 
		l1.setForeground(Color.blue); 

		// create a new panel 
		

		p.add(l); 

		// add combobox to panel 
		
		p.add(l1); 
		p.add(b1);
		// add panel to frame 
		f.getContentPane().add(p); 

		// set the size of frame 
		f.setSize(600, 600); 

		f.show(); 
	} 
	
	
	public void itemStateChanged(ItemEvent e) 
	{ 
		// if the state combobox is changed 
		if (e.getSource() == comboBox) { 
			
			l1.setText(""+comboBox.getSelectedItem()+""); 
		} 
		
			
		
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	} 
} 
