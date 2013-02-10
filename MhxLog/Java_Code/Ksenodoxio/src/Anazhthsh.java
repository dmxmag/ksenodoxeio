import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTree;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.ListSelectionModel;
import javax.swing.JSlider;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Anazhthsh extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;


	public Anazhthsh() {
		setTitle("Kerkyra Hotel - Anazhthsh/Krathsh");
		setBounds(100, 100, 750, 475);
		
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
}
