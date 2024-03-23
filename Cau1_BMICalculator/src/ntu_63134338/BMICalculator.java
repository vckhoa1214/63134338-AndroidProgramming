package ntu_63134338;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class BMICalculator extends JFrame {

	
	private JPanel contentPane;
    private JTextField txtHeight;
    private JTextField txtWeight;
    private JTextField txtBMI;
    private JTextField txtStatus;
    private JComboBox<String> cbGender;
    private JComboBox<String> cbHeightUnit;


	public BMICalculator() {
		setTitle("BMI Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 482, 400);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblHeight = new JLabel("Chiều cao:");
        lblHeight.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblHeight.setBounds(20, 20, 120, 30);
        contentPane.add(lblHeight);
        
        txtHeight = new JTextField();
        txtHeight.setFont(new Font("Tahoma", Font.PLAIN, 16));
        txtHeight.setBounds(150, 20, 200, 30);
        contentPane.add(txtHeight);
	}

}
