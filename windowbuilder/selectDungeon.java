package windowbuilder;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import character.Me;
import grade.Freshman;
import grade.Junior;
import grade.Senior;
import grade.Sophomore;
import inventory.Inventory;

public class selectDungeon extends JFrame {

	private JPanel contentPane;
	static selectDungeon frame;

	/**
	 * Launch the application.
	 */
			public void run(Me me,Inventory invent) {
				try {
					frame = new selectDungeon(me,invent);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

	/**
	 * Create the frame.
	 */
	public selectDungeon(Me me,Inventory invent) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(180, 180, 200, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Select the subject");
		lblNewLabel.setBounds(35, 13, 127, 16);
		contentPane.add(lblNewLabel);
		
		
	
		JButton btnNewButton = new JButton("Education Require");
		if(me.get_clear_education_require()==true) {
			btnNewButton = new JButton("Education Require(Clear!)");

		}
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Info.quitFrame();
				int grade = me.getGrade();
				new Thread(){
					public void run() {
				switch(grade) {
					case 1: 
						new Freshman("Introductory Engineering","Python","Handong Insung GyeoYook","Introductory Physics");
						Freshman.Education_r(me, invent);
						break;
					case 2:
						new Sophomore("Data Structure","Java","ERC","Statistic");
						Sophomore.Education_r(me, invent);
						break;
					case 3:
						new Junior("OS","Gong Pu Gi","EAP","linear Algebra");
						Junior.Education_r(me, invent);
						break;
					case 4:
						 new Senior("Graduation","Graduation","Graduation","Graduation");
						 Senior.Education_r(me, invent);
						 break;
					default:
						break;
				}
				//frame.setVisible(false);
			}
			}.start();
			}
		});
		btnNewButton.setBounds(20, 41, 200, 29);
		contentPane.add(btnNewButton);
		
		
		JButton btnNewButton_1 = new JButton("Major Require");
		if(me.get_clear_major_require()==true) {
			btnNewButton_1 = new JButton("Major Require(Clear!)");
		}
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Info.quitFrame();
				int grade = me.getGrade();
				new Thread() {
					 public void run() {
						switch(grade) {
							case 1: 
								Freshman first = new Freshman("Introductory Engineering","Python","Handong Insung GyeoYook","Introductory Physics");
								Freshman.Major_r(me, invent);
								break;
							case 2:
								new Sophomore("Data Structure","Java","ERC","Statistic");
								Sophomore.Major_r(me, invent);
								break;
							case 3:
								new Junior("OS","Gong Pu Gi","EAP","linear Algebra");
								Junior.Major_r(me, invent);
								break;
							case 4:
								 new Senior("Graduation","Graduation","Graduation","Graduation");
								 Senior.Major_r(me, invent);
								 break;
							default:
								break;
						}
						//frame.setVisible(false);
					}
				}.start();
			}
		});
		btnNewButton_1.setBounds(20, 70, 200, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Education select");
		if(me.get_clear_education_select()==true) {
			btnNewButton_2 = new JButton("Education select(Clear!)");
		}
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Info.quitFrame();
				int grade = me.getGrade();
				new Thread() {
					 public void run() {
							switch(grade) {
								case 1: 
									new Freshman("Introductory Engineering","Python","Handong Insung GyeoYook","Introductory Physics");
									Freshman.Education_s(me, invent);
									break;
								case 2:
									new Sophomore("Data Structure","Java","ERC","Statistic");
									Sophomore.Education_s(me, invent);
									break;
								case 3:
									new Junior("OS","Gong Pu Gi","EAP","linear Algebra");
									Junior.Education_s(me, invent);
									break;
								case 4:
									 new Senior("Graduation","Graduation","Graduation","Graduation");
									 Senior.Education_s(me, invent);
									 break;
								default:
									break;
							}
						//	frame.setVisible(false);
					 }
				}.start();
			}
		});
		btnNewButton_2.setBounds(20, 102, 200, 29);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Major select");
		if(me.get_clear_major_select()==true) {
			btnNewButton_3 = new JButton("Major select(Clear!)");
		}
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Info.quitFrame();
				int grade = me.getGrade();
				new Thread() {
					 public void run() {
						switch(grade) {
							case 1: 
								new Freshman("Introductory Engineering","Python","Handong Insung GyeoYook","Introductory Physics");
								Freshman.Major_s(me, invent);
								break;
							case 2:
								new Sophomore("Data Structure","Java","ERC","Statistic");
								Sophomore.Major_s(me, invent);
								break;
							case 3:
								new Junior("OS","Gong Pu Gi","EAP","linear Algebra");
								Junior.Major_s(me, invent);
								break;
							case 4:
								 new Senior("Graduation","Graduation","Graduation","Graduation");
								 Senior.Major_s(me, invent);
								 break;
							default:
								break;
							}
						//frame.setVisible(false);
					 }
				}.start();
			}
		});
		btnNewButton_3.setBounds(20, 132, 200, 29);
		contentPane.add(btnNewButton_3);
	}
	public static void quitFrame() {
		frame.setVisible(false);
	}
}
