import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JEditorPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;



public class Arxikh extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Arxikh frame = new Arxikh();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Arxikh() {
		setTitle("Kerkyra Hotel - Arxikh Selida");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\u0391\u03BD\u03B1\u03B6\u03AE\u03C4\u03B7\u03C3\u03B7 \u03B4\u03B9\u03B1\u03B8\u03AD\u03C3\u03B7\u03BC\u03C9\u03BD \u03B4\u03C9\u03BC\u03B1\u03C4\u03AF\u03C9\u03BD");
		
		JLabel lblNewLabel_1 = new JLabel("Password:");
		
		JLabel lblNewLabel_2 = new JLabel("\u039A\u03B1\u03BB\u03CE\u03C2 \u03AE\u03C1\u03B8\u03B1\u03C4\u03B5 \u03C3\u03C4\u03BF \u03BE\u03B5\u03BD\u03BF\u03B4\u03BF\u03C7\u03B5\u03AF\u03BF \u03BC\u03B1\u03C2!");
		lblNewLabel_2.setFont(new Font("Calibri", Font.BOLD, 20));
		
		JLabel lblNewLabel_3 = new JLabel("\u0395\u03BC\u03C6\u03AC\u03BD\u03B9\u03C3\u03B7 \u03C0\u03C1\u03BF\u03C3\u03C6\u03BF\u03C1\u03CE\u03BD");
		
		JLabel lblNewLabel_4 = new JLabel("Username:");
		
		JButton btnNewButton_1 = new JButton("\u0391\u03BD\u03B1\u03B6\u03AE\u03C4\u03B7\u03C3\u03B7");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("Kerkyra Hotel - Anazhthsh/Krathsh");
				setBounds(100, 100, 600, 475);
				
				JLabel lblNewLabel = new JLabel("\u0391\u03BD\u03B1\u03B6\u03AE\u03C4\u03B7\u03C3\u03B7 - \u039A\u03C1\u03AC\u03C4\u03B7\u03C3\u03B7 \u0394\u03C9\u03BC\u03B1\u03C4\u03AF\u03BF\u03C5:");
				lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 18));
				
				textField = new JTextField();
				textField.setColumns(10);
				
				textField_1 = new JTextField();
				textField_1.setColumns(10);
				
				JLabel label = new JLabel("\u0397\u03BC\u03B5\u03C1\u03BF\u03BC\u03B7\u03BD\u03AF\u03B1:");
				label.setFont(new Font("Calibri", Font.PLAIN, 13));
				
				JButton btnNewButton = new JButton("\u0391\u03BD\u03B1\u03B6\u03AE\u03C4\u03B7\u03C3\u03B7");
				
				JLabel lblNewLabel_1 = new JLabel("\u039A\u03C1\u03B5\u03B2\u03AC\u03C4\u03B9\u03B1:");
				lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 13));
				
				table = new JTable();
				table.setModel(new DefaultTableModel(
					new Object[][] {
						{"1", "2", "3", "4", "5", "6", "7"},
						{"8", "9", "10", "11", "12", "13", "14"},
						{"15", "16", "17", "18", "19", "20", "21"},
						{"22", "23", "24", "25", "26", "27", "28"},
						{"29", "30", null, null, null, null, null},
					},
					new String[] {
						"\u0394\u03B5\u03C5\u03C4\u03AD\u03C1\u03B1", "\u039A\u03C5\u03C1\u03B9\u03B1\u03BA\u03AE", "\u03A3\u03AC\u03B2\u03B2\u03B1\u03C4\u03BF", "\u03A0\u03B1\u03C1\u03B1\u03C3\u03BA\u03B5\u03C5\u03AE", "\u03A0\u03AD\u03BC\u03C0\u03C4\u03B7", "\u03A4\u03B5\u03C4\u03AC\u03C1\u03C4\u03B7", "\u03A4\u03C1\u03AF\u03C4\u03B7"
					}
				));
				table.getColumnModel().getColumn(0).setPreferredWidth(50);
				table.getColumnModel().getColumn(1).setPreferredWidth(50);
				table.getColumnModel().getColumn(2).setPreferredWidth(55);
				table.getColumnModel().getColumn(3).setPreferredWidth(65);
				table.getColumnModel().getColumn(4).setPreferredWidth(57);
				table.getColumnModel().getColumn(5).setPreferredWidth(53);
				table.getColumnModel().getColumn(6).setPreferredWidth(48);
				GroupLayout groupLayout = new GroupLayout(getContentPane());
				groupLayout.setHorizontalGroup(
					groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(10)
											.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(lblNewLabel_1)
													.addGap(34))
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(label)
													.addGap(18)))
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(textField, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
												.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)))
										.addComponent(btnNewButton))
									.addGap(30)
									.addComponent(table, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel)
									.addPreferredGap(ComponentPlacement.RELATED, 132, GroupLayout.PREFERRED_SIZE)))
							.addGap(141))
				);
				groupLayout.setVerticalGroup(
					groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addContainerGap(241, Short.MAX_VALUE)
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(label))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_1)
										.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(btnNewButton))
								.addComponent(table, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(108))
				);
				getContentPane().setLayout(groupLayout);
			}
		});
		
		JButton btnNewButton_2 = new JButton("Login");


		JButton btnNewButton = new JButton("\u0395\u03BC\u03C6\u03AC\u03BD\u03B9\u03C3\u03B7");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("Kerkyra Hotel - Prosfores");
				setBounds(100, 100, 700, 475);
				
				JLabel lblNewLabel = new JLabel("\u03A0\u03C1\u03BF\u03C3\u03C6\u03BF\u03C1\u03AD\u03C2:");
				lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 18));
				
				JEditorPane editorPane = new JEditorPane();
				editorPane.setText("............................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................");
				GroupLayout groupLayout = new GroupLayout(getContentPane());
				groupLayout.setHorizontalGroup(
					groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addContainerGap(350, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(editorPane, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel))
							.addContainerGap())
				);
				groupLayout.setVerticalGroup(
					groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addContainerGap(198, Short.MAX_VALUE)
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(editorPane, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
							.addGap(93))
				);
				getContentPane().setLayout(groupLayout);
			}
		});
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_3)
									.addGap(65))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel)
									.addPreferredGap(ComponentPlacement.UNRELATED)))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_4)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(btnNewButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
										.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
									.addGap(67)
									.addComponent(lblNewLabel_1))))
						.addComponent(lblNewLabel_2))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_2, GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
						.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
					.addGap(132))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel_2)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1)
						.addComponent(lblNewLabel))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_2)
						.addComponent(btnNewButton)
						.addComponent(lblNewLabel_3))
					.addContainerGap(307, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
