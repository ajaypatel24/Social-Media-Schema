package app;

// Java Program to create a simple JComboBox 
// and add elements to it 
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

class SocialMediaDatabaseInterface extends JFrame implements ItemListener, ActionListener {

	private static final long serialVersionUID = 1L;

	// frame
	static JFrame f;
	static JFrame Logon;

	// label
	static JLabel l;

	// combobox
	static JComboBox<?> comboBox;

	static JTextField FirstName;
	static JTextField LastName;
	static JTextField Email;
	static JTextField Password;

	static JButton b1;
	static JButton b2;

	static JTable j;

	// main class
	public static void main(String[] args) throws SQLException {
		// create a new frame

		// Connection Start
		try {
			DriverManager.registerDriver(new org.postgresql.Driver());
		} catch (Exception cnfe) {
			System.out.println("Class not found");
		}

		Logon = new JFrame("Login");

		// Login
		JTextField Username = new JTextField(10);
		JPasswordField Pass = new JPasswordField(10);
		JButton Login = new JButton("Login");
		JLabel Feedback = new JLabel("Enter Credentials to Access GUI");
		JLabel Entry = new JLabel("");
		JLabel Uname = new JLabel("Username");
		JLabel P = new JLabel("Password");

		JPanel Authentication = new JPanel();
		BoxLayout layout0 = new BoxLayout(Authentication, BoxLayout.PAGE_AXIS);
		Authentication.setLayout(layout0);

		Authentication.add(Box.createRigidArea(new Dimension(5, 0)));
		Authentication.add(Uname);
		Authentication.add(Username);
		Authentication.add(P);
		Authentication.add(Pass);
		Authentication.add(Login);
		Authentication.add(Feedback);

		Logon.getContentPane().add(Authentication);

		Logon.setSize(400, 300);
		Logon.getContentPane().setLayout(new FlowLayout());
		Logon.setResizable(false);
		Logon.show();

		String url = "jdbc:postgresql://comp421.cs.mcgill.ca:5432/cs421";
		Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					Connection test = DriverManager.getConnection(url, Username.getText(), Pass.getText());
					Statement statement = test.createStatement();
					Entry.setText("true");
					Feedback.setText("Authenticated");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				} catch (SQLException e4) {
					System.out.println(e4.getErrorCode());
					Entry.setText("false");
					Feedback.setText("Username-Password Combination is wrong");
				}
			}
		});

		while (!Entry.getText().equals("true")) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
		}

		Logon.dispatchEvent(new WindowEvent(Logon, WindowEvent.WINDOW_CLOSING)); // close login window

		Connection con = DriverManager.getConnection(url, Username.getText(), Pass.getText());
		Statement statement = con.createStatement();
		System.out.println("Successful Connection");
		// Connection Ends

		// Initializing the JTable
		f = new JFrame("database GUI");
		f.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		f.getContentPane().setLayout(null);

		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(10, 47, 403, 205);
		f.getContentPane().add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));

		JLabel lblNewLabel = new JLabel("Add new user");
		JLabel lblNewLabel2 = new JLabel("View tables where user is admin");

		// Home
		Font font = new Font("Courier", Font.BOLD, 14);
		JLabel Group = new JLabel("Comp 421");
		JLabel Group2 = new JLabel("Question 2");
		JLabel Group3 = new JLabel("Group 38");
		Group.setFont(font);
		Group2.setFont(font);
		Group3.setFont(font);

		// Add User Option 1
		JLabel FirstName = new JLabel("First Name");
		JLabel LastName = new JLabel("Last Name");
		JLabel Email = new JLabel("Email");
		JLabel Password = new JLabel("Password");

		JTextField FirstNameField = new JTextField(20);
		JTextField LastNameField = new JTextField(20);
		JTextField EmailField = new JTextField(20);
		JPasswordField PasswordField = new JPasswordField(20);

		JButton ConfirmAdd = new JButton("Add User");

		// Part of Option 2, preQuery

		JComboBox<String> Admin = new JComboBox<String>();
		String[] ColumnName = { "Admin of Table" };
		JTable aTable = new JTable();
		DefaultTableModel aModel = (DefaultTableModel) aTable.getModel();
		aModel.setColumnIdentifiers(ColumnName);

		// Option 3
		JLabel UserToAdmin = new JLabel("");
		JLabel Information = new JLabel("");
		JRadioButton Yes = new JRadioButton("Yes");
		JRadioButton No = new JRadioButton("No");
		ButtonGroup bg = new ButtonGroup();
		bg.add(Yes);
		bg.add(No);
		JButton PromoteUser = new JButton("Promote");

		String PageQuery = "SELECT count(DISTINCT page_id) FROM page";
		java.sql.ResultSet PageResult = statement.executeQuery(PageQuery);
		int PageCountInt = 0;
		while (PageResult.next()) {
			String PageCountFinal = PageResult.getString("count");
			PageCountInt = Integer.parseInt(PageCountFinal);
		}

		String[] pages = new String[PageCountInt];

		String PageQueryNames = "SELECT page_name FROM page";
		java.sql.ResultSet PageNameResult = statement.executeQuery(PageQueryNames);
		int counter2 = 0;
		while (PageNameResult.next()) {
			String PageNameFinal = PageNameResult.getString("page_name");
			pages[counter2] = PageNameFinal;
			counter2++;
		}

		JComboBox<?> PageDropdown = new JComboBox<Object>(pages);

		// Option 4

		JLabel UserInformation = new JLabel("Enter a Name");
		JLabel EventInformation = new JLabel("Event Information");
		JTextField UserEvent = new JTextField(20);
		JTable EventTable = new JTable();
		String[] ColumnNameEvent = { "Events" };
		DefaultTableModel EventModel = (DefaultTableModel) EventTable.getModel();
		EventModel.setColumnIdentifiers(ColumnNameEvent);
		JButton Search = new JButton("Search Events");
		String[] LowCount = { "0", "1", "2" };
		JComboBox JoinEvent = new JComboBox(LowCount);
		JButton JoinNewEvent = new JButton("Join Event");
		JComboBox<String> LowParticipationEvents = new JComboBox<String>();
		JLabel NumberParticipants = new JLabel("Number of Participants");
		JLabel EventId = new JLabel("Event ID");

		// Option 5
		JLabel Info5 = new JLabel("Enter First Name");
		JTextField UserName = new JTextField(20);
		JComboBox<String> Post = new JComboBox<String>();
		JButton Find = new JButton("Find");
		JButton SeePost = new JButton("See Post");
		JLabel TextLabel = new JLabel("");
		
		JPanel Home = new JPanel();
		Home.add(Group);
		Home.add(Group2);
		Home.add(Group3);
		layeredPane.add(Home, "home");
		JPanel Option1 = new JPanel();
		BoxLayout layout1 = new BoxLayout(Option1, BoxLayout.Y_AXIS);
		Option1.setLayout(layout1);
		Option1.add(Box.createRigidArea(new Dimension(5, 0)));
		Option1.add(lblNewLabel);
		Option1.add(FirstName);
		Option1.add(FirstNameField);
		Option1.add(LastName);
		Option1.add(LastNameField);
		Option1.add(Email);
		Option1.add(EmailField);
		Option1.add(Password);
		Option1.add(PasswordField);
		Option1.add(ConfirmAdd);
		layeredPane.add(Option1, "name_2074080574799800");

		JPanel Option2 = new JPanel();

		BoxLayout layout2 = new BoxLayout(Option2, BoxLayout.Y_AXIS);
		Option2.setLayout(layout2);
		Option2.add(Box.createRigidArea(new Dimension(5, 0)));
		Option2.add(Admin);
		Option2.add(aTable);
		Option2.add(lblNewLabel2);
		layeredPane.add(Option2, "name_2074097485636900");

		JPanel Option3 = new JPanel();

		BoxLayout layout3 = new BoxLayout(Option3, BoxLayout.Y_AXIS);
		Option3.setLayout(layout3);
		Option3.add(Box.createRigidArea(new Dimension(5, 0)));
		Option3.add(UserToAdmin);
		Option3.add(Information);
		Option3.add(Yes);
		Option3.add(No);
		Option3.add(PageDropdown);
		Option3.add(PromoteUser);
		layeredPane.add(Option3, "name_2074111329535300");

		JPanel Option4 = new JPanel();

		BoxLayout layout4 = new BoxLayout(Option4, BoxLayout.Y_AXIS);
		Option4.setLayout(layout4);
		Option4.add(Box.createRigidArea(new Dimension(5, 0)));
		Option4.add(UserInformation);
		Option4.add(UserEvent);
		Option4.add(EventTable);
		Option4.add(EventInformation);
		Option4.add(Search);
		Option4.add(NumberParticipants);
		Option4.add(JoinEvent);
		Option4.add(EventId);
		Option4.add(LowParticipationEvents);
		Option4.add(JoinNewEvent);
		layeredPane.add(Option4, "name_2074113974014000");
		
		JPanel Option5 = new JPanel();
		
		BoxLayout layout5 = new BoxLayout(Option5, BoxLayout.Y_AXIS);
		Option5.setLayout(layout5);
		Option5.add(Info5);
		Option5.add(UserName);
		Option5.add(Find);
		Option5.add(Post);
		Option5.add(SeePost);
		Option5.add(TextLabel);
		
		layeredPane.add(Option5, "name_opt5");

		String s1[] = { "Home", "Option 1", "Option 2", "Option 3", "Option 4", "Option 5", "Quit" };
		JLabel OptionSelected = new JLabel("");
		JComboBox<?> comboBox = new JComboBox<Object>(s1);
		JLabel status = new JLabel("");
		comboBox.setBounds(311, 11, 102, 22);
		f.getContentPane().add(OptionSelected);
		f.getContentPane().add(comboBox);
		f.getContentPane().add(status);
		JPanel p = new JPanel();
		// create a object
		SocialMediaDatabaseInterface s = new SocialMediaDatabaseInterface();

		// set layout of frame
		f.getContentPane().setLayout(new FlowLayout());

		// array of string contating cities

		// add ItemListener
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				status.setText("");
				String opt = comboBox.getSelectedItem() + "";
				if (opt.equals("Home")) {
					OptionSelected.setText("");
					layeredPane.removeAll();
					layeredPane.add(Home);
					layeredPane.repaint();
					layeredPane.revalidate();

				}
				if (opt.equals("Option 1")) { // Insert person into table
					OptionSelected.setText("Add new User");

					ConfirmAdd.addActionListener(new ActionListener() {

						public void actionPerformed(ActionEvent e) {
							int sqlCode = 0; // Variable to hold SQLCODE
							String sqlState = "00000"; // Variable to hold SQLSTATE
							try {

								String First = FirstNameField.getText();
								String Last = LastNameField.getText();
								String Email = EmailField.getText();
								String Pass = PasswordField.getText();
								String insertSQL = "INSERT INTO accountuser (email, first_name, last_name, password) "
										+ "VALUES (" + "'" + Email + "'" + "," + "'" + First + "'" + ", " + "'" + Last
										+ "'" + ", " + "'" + Pass + "'" + ")";

								statement.executeUpdate(insertSQL);
								status.setText("Insert Complete");

								FirstNameField.setText("");
								LastNameField.setText("");
								EmailField.setText("");
								PasswordField.setText("");
							} catch (SQLException e1) {
								sqlCode = e1.getErrorCode();
								sqlState = e1.getSQLState();
								lblNewLabel.setText(sqlState);
								System.out.println("SQLcode: " + sqlCode);
								System.out.println("SQLState: " + sqlState);
							}
						}
					});

					layeredPane.removeAll();
					layeredPane.add(Option1);
					layeredPane.repaint();
					layeredPane.revalidate();

				}
				if (opt.equals("Option 2")) { // Query for all pages admins
					OptionSelected.setText("");
					aModel.setRowCount(0);
					try {
						java.sql.ResultSet AdminResult = statement.executeQuery(AdminQuery());
						while (AdminResult.next()) {
							String name = AdminResult.getString("first_name");
							Admin.addItem(name);
						}
					} catch (SQLException e5) {
						System.out.println(e5.getErrorCode());
					}
					Admin.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {

							aModel.setRowCount(0);
							String AdminSelection = Admin.getSelectedItem() + "";
							int sqlCode = 0; // Variable to hold SQLCODE
							String sqlState = "00000"; // Variable to hold SQLSTATE
							try {
								String querySQL = "SELECT page_name From (page NATURAL JOIN manages) NATURAL JOIN accountuser WHERE first_name = "
										+ "'" + AdminSelection + "'";
								java.sql.ResultSet rs = statement.executeQuery(querySQL);
								java.sql.ResultSetMetaData rsmd = rs.getMetaData();
								int colNo = rsmd.getColumnCount();
								while (rs.next()) {
									Object[] objects = new Object[colNo];
									for (int i = 0; i < colNo; i++) {
										objects[i] = rs.getObject(i + 1);
									}
									aModel.addRow(objects);
								}
								aTable.setModel(aModel);

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
				if (opt.equals("Option 3")) {

					OptionSelected.setText("Promote popular Users to Admin");

					PageDropdown.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							UserToAdmin.setText("");
							Information.setText("");
							int sqlCode = 0; // Variable to hold SQLCODE
							String sqlState = "00000"; // Variable to hold SQLSTATE
							try {
								String s = (String) PageDropdown.getSelectedItem();
								String PageQuery = "SELECT email, first_name, page_name, page_id, MAX(mycount) "
										+ "FROM (SELECT first_name, page_id, page_name, email, count(*) mycount FROM Post NATURAL JOIN Page NATURAL JOIN accountuser WHERE page_name = "
										+ "'" + s + "'" + " GROUP BY email, page_name, first_name, page_id) q "
										+ "GROUP BY first_name,page_name,email,page_id ORDER BY max DESC LIMIT 1";

								String FirstName = "";
								String PostCount = "";
								String Email = "";
								String Page_Id = "";

								java.sql.ResultSet rs = statement.executeQuery(PageQuery);

								while (rs.next()) {
									FirstName = rs.getString("first_name");
									PostCount = rs.getString("max");
									Email = rs.getString("email");
									Page_Id = rs.getString("page_id");
									String Question = FirstName + " has made the mosts posts on " + s + " with "
											+ PostCount + " posts";
									String Promote = "Promote to page Admin?";
									UserToAdmin.setText(Question);
									Information.setForeground(Color.black);
									Information.setText(Promote);
								}

							} catch (SQLException err) {
								sqlCode = err.getErrorCode();
								sqlState = err.getSQLState();
								System.out.println("Code: " + sqlCode + "  sqlState: " + sqlState);
							}

						}
					});

					Yes.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							PromoteUser.setEnabled(true);
						}
					});
					No.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							PromoteUser.setEnabled(false);
						}
					});
					PromoteUser.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							int sqlCode = 0; // Variable to hold SQLCODE
							String sqlState = "00000"; // Variable to hold SQLSTATE
							String Name = "";
							try {
								String Email = "";
								String Page_Id = "";
								String Page_Name = "";
								String s = (String) PageDropdown.getSelectedItem();
								String PageQuery = "SELECT email, first_name, page_name, page_id, MAX(mycount) "
										+ "FROM (SELECT first_name, page_id, page_name, email, count(*) mycount FROM Post NATURAL JOIN Page NATURAL JOIN accountuser WHERE page_name = "
										+ "'" + s + "'" + " GROUP BY email, page_name, first_name, page_id) q "
										+ "GROUP BY first_name,page_name,email,page_id ORDER BY max DESC LIMIT 1";

								java.sql.ResultSet rs = statement.executeQuery(PageQuery);

								while (rs.next()) {
									Email = rs.getString("email");
									Page_Id = rs.getString("page_id");
									Page_Name = rs.getString("page_name");
									Name = rs.getString("first_name");
									String query = InsertQuery(Page_Id, Email);
									if (Yes.isSelected()) {
										statement.execute(query);
										UserToAdmin.setText("");
										Information.setForeground(Color.green);
										Information.setText(Name + " has been promoted to admin of " + Page_Name);
									} else {

									}
								}

							} catch (SQLException err) {
								sqlCode = err.getErrorCode();
								sqlState = err.getSQLState();
								if (sqlState.equalsIgnoreCase("23505")) {
									UserToAdmin.setText("");
									Information.setForeground(Color.red);
									Information.setText("User " + Name + " is already the admin of this page");
								}
								System.out.println("Code: " + sqlCode + "  sqlState: " + sqlState);
							}

						}
					});

					layeredPane.removeAll();
					layeredPane.add(Option3);
					layeredPane.repaint();
					layeredPane.revalidate();
				}
				if (opt.equals("Option 4")) {

					OptionSelected.setText("View user events and join new events");

					JoinEvent.addActionListener(new ActionListener() {

						public void actionPerformed(ActionEvent e) {
							status.setText("");
							int sqlCode = 0; // Variable to hold SQLCODE
							String sqlState = "00000"; // Variable to hold SQLSTATE
							try {

								int c = Integer.parseInt(JoinEvent.getSelectedItem() + "");
								String CountOfEvent = EventCount(String.valueOf(c));
								String ListOfEvent = EventQuery(String.valueOf(c));
								int length = 0;
								int counter3 = 0;
								String Event;
								java.sql.ResultSet EventCounter = statement.executeQuery(CountOfEvent);

								while (EventCounter.next()) {
									length = Integer.parseInt(EventCounter.getString("count"));
								}
								UserInformation.setText("Enter a User Name");
								java.sql.ResultSet EventList = statement.executeQuery(ListOfEvent);
								LowParticipationEvents.removeAllItems();
								while (EventList.next()) {
									Event = EventList.getString("eid");
									LowParticipationEvents.addItem(Event);

								}

							} catch (SQLException err) {
								sqlCode = err.getErrorCode();
								sqlState = err.getSQLState();
								System.out.println("Code: " + sqlCode + "  sqlState: " + sqlState);
							}
						}

					});

					JoinNewEvent.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							int sqlCode = 0; // Variable to hold SQLCODE
							String sqlState = "00000"; // Variable to hold SQLSTATE
							try {
								String eid = LowParticipationEvents.getSelectedItem() + "";
								String email = UserEvent.getText();

								String AccountQuery = "SELECT email FROM accountuser WHERE first_name = " + "'" + email
										+ "'";

								java.sql.ResultSet AccountQ = statement.executeQuery(AccountQuery);

								while (AccountQ.next()) {
									email = AccountQ.getString("email");
								}

								String InsertQuery = "INSERT INTO participates (eid, email) " + "VALUES (" + "'" + eid
										+ "'" + "," + "'" + email + "'" + ")";

								statement.executeUpdate(InsertQuery);
								EventModel.setRowCount(0);
								status.setText("Successfully joined new event");
								status.setForeground(Color.green);

							}

							catch (SQLException err) {
								sqlCode = err.getErrorCode();
								sqlState = err.getSQLState();
								System.out.println("Code: " + sqlCode + "  sqlState: " + sqlState);
							}
						}

					});

					Search.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							status.setText("");
							EventModel.setRowCount(0);
							int sqlCode = 0; // Variable to hold SQLCODE
							String sqlState = "00000"; // Variable to hold SQLSTATE
							try {
								String ValidUser = ValidUserQuery(UserEvent.getText());
								java.sql.ResultSet VUser = statement.executeQuery(ValidUser);
								while (VUser.next()) {
									ValidUser = VUser.getString("count");
								}

								if (Integer.parseInt(ValidUser) == 0) {
									JoinNewEvent.setEnabled(false);
									status.setForeground(Color.red);
									status.setText("User does not exist");
								} else {
									JoinNewEvent.setEnabled(true);
									status.setText("");
								}
								String querySQL = "SELECT eid, first_name,email FROM participates NATURAL JOIN accountuser WHERE first_name = "
										+ "'" + UserEvent.getText() + "'" + " ORDER BY eid";
								java.sql.ResultSet rs = statement.executeQuery(querySQL);
								java.sql.ResultSetMetaData rsmd = rs.getMetaData();
								int colNo = rsmd.getColumnCount();
								while (rs.next()) {
									Object[] objects = new Object[colNo];
									for (int i = 0; i < colNo; i++) {
										objects[i] = rs.getObject(i + 1);
									}
									EventModel.addRow(objects);
								}
								EventTable.setModel(EventModel);

							} catch (SQLException err) {
								sqlCode = err.getErrorCode();
								sqlState = err.getSQLState();
								System.out.println("Code: " + sqlCode + "  sqlState: " + sqlState);
							}
						}
					});

					layeredPane.removeAll();
					layeredPane.add(Option4);
					layeredPane.repaint();
					layeredPane.revalidate();
				}
				
				if (opt.contentEquals("Option 5")) {
					OptionSelected.setText("View all posts of a given user");
					
					Find.addActionListener(new ActionListener() {
						int sqlCode = 0; // Variable to hold SQLCODE
						String sqlState = "00000"; // Variable to hold SQLSTATE
						public void actionPerformed(ActionEvent e) {
							Post.removeAllItems();
							String post;
							try {
							String User = UserName.getText();
							
							String ValidUser = ValidUserQuery(UserName.getText());
							java.sql.ResultSet VUser = statement.executeQuery(ValidUser);
							while (VUser.next()) {
								ValidUser = VUser.getString("count");
							}

							if (Integer.parseInt(ValidUser) == 0) {
								Post.setEnabled(false);
								status.setForeground(Color.red);
								status.setText("User does not exist");
							} else {
								Post.setEnabled(true);
								status.setText("");
							}
							
							String PostQuery = UserPostQuery(User);
							System.out.println(PostQuery);
							java.sql.ResultSet set = statement.executeQuery(PostQuery);
							
							
							
							java.sql.ResultSet EventList = statement.executeQuery(PostQuery);
							Post.removeAllItems();
							while (EventList.next()) {
								post = EventList.getString("pid");
								Post.addItem(post);

							}
							
							}
							catch (SQLException e6) {
								sqlCode = e6.getErrorCode();
								sqlState = e6.getSQLState();
								System.out.println("Code: " + e6.getMessage() + "  sqlState: " + sqlState);
								
							}
							
							
							
						}
					});
					SeePost.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							try {
							String t ="";
							String s = (String) Post.getSelectedItem();
							String UserText = UserPostTextQuery(s);
							
							java.sql.ResultSet rs = statement.executeQuery(UserText);
							
							while (rs.next()) {
								t = rs.getString("text");
							}
							TextLabel.setText(t);
							
							
							}
							catch (SQLException e7) {
								System.out.println(e7.getErrorCode());
							}
							
						}
					});
					
					layeredPane.removeAll();
					layeredPane.add(Option5);
					layeredPane.repaint();
					layeredPane.revalidate();
				}

				if (opt.contentEquals("Quit")) {

					try {
						statement.close();
						con.close();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					System.exit(0);

				}

			}
		});
		comboBox.addItemListener(s);
		// add panel to frame
		f.getContentPane().add(p);

		f.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// int x=e.getX();
				// int y=e.getY();
				// System.out.println(x+","+y);//these co-ords are relative to the component
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
		// set the size of frame
		f.setSize(450, 400);

		f.show();
	}

	public static String InsertQuery(String Page_Id, String Email) {
		String insertSQL = "INSERT INTO manages (page_id, email)" + " VALUES (" + Page_Id + "," + "'" + Email + "'"
				+ ")";
		return insertSQL;
	}

	public static String ValidUserQuery(String name) {
		String CountQuery = "SELECT count(*) FROM accountuser WHERE first_name = " + "'" + name + "'";
		return CountQuery;
	}

	public static String EventQuery(String count) {
		String EventQuery = "SELECT eid,mycount FROM "
				+ "(SELECT event.eid, count(email) mycount FROM participates RIGHT JOIN event ON participates.eid = event.eid GROUP BY event.eid ORDER BY mycount) q "
				+ "WHERE mycount = " + count;
		return EventQuery;

	}

	public static String EventCount(String count) {
		String EventQuery = "SELECT count(*) FROM "
				+ "(SELECT event.eid, count(email) mycount FROM participates RIGHT JOIN event ON participates.eid = event.eid GROUP BY event.eid ORDER BY mycount) q "
				+ "WHERE mycount = " + count;
		return EventQuery;

	}

	public static String AdminQuery() {
		String AdminQuery = "SELECT DISTINCT first_name FROM accountuser NATURAL JOIN manages";
		return AdminQuery;
	}
	
	public static String UserPostQuery(String User) {
		String UserPostQuery = "SELECT pid FROM post NATURAL JOIN accountuser WHERE first_name = "
							+ "'" + User + "'";
							
		System.out.println(UserPostQuery);
		return UserPostQuery;
	}
	public static String UserPostTextQuery(String pid) {
		String UserPostText = "SELECT text FROM post WHERE pid = " 
								+ pid;
		return UserPostText;
	}


	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub

	}
}
