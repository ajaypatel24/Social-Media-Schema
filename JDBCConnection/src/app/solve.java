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
class solve extends JFrame implements ItemListener, ActionListener {
	
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public solve() {
	} 

	// frame 
	static JFrame f; 

	// label 
	static JLabel l, l1; 

	// combobox 
	static JComboBox c1; 

	static JButton b1;
	
	static JTable j;
	// main class 
	public static void main(String[] args) throws SQLException 
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
		//Connection End

		// Data to be displayed in the JTable 
        String[][] data = { 
            { "Test", "4031", "CSE" }, 
            { "Test2", "6014", "IT" } 
        }; 
  
        // Column Names 
        String[] columnNames = { "Name", "Roll Number", "Department" }; 
  
        // Initializing the JTable 
        j = new JTable(data, columnNames); 
        j.setBounds(30, 40, 200, 300);

		
		
		
		f = new JFrame("frame"); 

		// create a object 
		solve s = new solve(); 

		// set layout of frame 
		f.getContentPane().setLayout(new FlowLayout()); 

		// array of string contating cities 
		String s1[] = { "Option 1", "Option 2", "Option 3", "Option 4", "Quit"}; 

		// create checkbox 
		c1 = new JComboBox(s1); 
		b1 = new JButton("Confirm");
		// add ItemListener 
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int sqlCode = 0; // Variable to hold SQLCODE
				String sqlState = "00000"; // Variable to hold SQLSTATE
				String opt = c1.getSelectedItem()+"";
				switch(opt) {
				case "Option 1":
					try {
						String querySQL = "SELECT * FROM person;";
						System.out.println(querySQL);
						java.sql.ResultSet rs = statement.executeQuery(querySQL);
						while (rs.next()) {
							String name = rs.getString("pid");
							System.out.println(name);
							l1.setText(name); 
						}
						System.out.println("Query Complete");
					} catch (SQLException err) {
						sqlCode = err.getErrorCode(); 
						sqlState = err.getSQLState(); 
						System.out.println("Code: " + sqlCode + "  sqlState: " + sqlState);
					}
					break;
				case "Option 2":
					break;
				case "Option 3":
					break;
				case "Option 4":
					break;
				case "Quit": 
					try {
						statement.close();
						con.close();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					System.exit(0);
					break;
				}
				
				
				System.out.println(""+c1.getSelectedItem()+"");
			}
		});
		c1.addItemListener(s); 

		// create labels 
		l = new JLabel("Select an option "); 
		l1 = new JLabel(""); 

		// set color of text 
		l.setForeground(Color.red); 
		l1.setForeground(Color.blue); 

		// create a new panel 
		JPanel p = new JPanel(); 

		p.add(l); 

		// add combobox to panel 
		p.add(c1); 
		
		p.add(l1); 
		p.add(b1);
		p.add(j);
		// add panel to frame 
		f.getContentPane().add(p); 

		// set the size of frame 
		f.setSize(600, 600); 

		f.show(); 
	} 
	public void itemStateChanged(ItemEvent e) 
	{ 
		// if the state combobox is changed 
		if (e.getSource() == c1) { 
			
			l1.setText(""+c1.getSelectedItem()+""); 
		} 
		
			
		
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	} 
} 
