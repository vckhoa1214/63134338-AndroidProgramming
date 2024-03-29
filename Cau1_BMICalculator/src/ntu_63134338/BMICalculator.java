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
        
        cbHeightUnit = new JComboBox<>(new String[] {"cm", "m"});
        cbHeightUnit.setFont(new Font("Tahoma", Font.PLAIN, 16));
        cbHeightUnit.setBounds(360, 20, 50, 30);
        contentPane.add(cbHeightUnit);
        
        JLabel lblWeight = new JLabel("Cân nặng (kg):");
        lblWeight.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblWeight.setBounds(20, 60, 120, 30);
        contentPane.add(lblWeight);
        
        txtWeight = new JTextField();
        txtWeight.setFont(new Font("Tahoma", Font.PLAIN, 16));
        txtWeight.setBounds(150, 60, 200, 30);
        contentPane.add(txtWeight);
        
        JLabel lblGender = new JLabel("Giới tính:");
        lblGender.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblGender.setBounds(20, 100, 120, 30);
        contentPane.add(lblGender);
        
        cbGender = new JComboBox<>(new String[] {"Nam", "Nữ"});
        cbGender.setFont(new Font("Tahoma", Font.PLAIN, 16));
        cbGender.setBounds(150, 100, 200, 30);
        contentPane.add(cbGender);
        
        JButton btnCalculate = new JButton("Tính BMI");
        btnCalculate.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnCalculate.setBounds(150, 140, 200, 30);
        btnCalculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateBMI();
            }
        });
        contentPane.add(btnCalculate);
        
        JLabel lblBMI = new JLabel("Chỉ số BMI:");
        lblBMI.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblBMI.setBounds(20, 180, 120, 30);
        contentPane.add(lblBMI);
        
        txtBMI = new JTextField();
        txtBMI.setEditable(false);
        txtBMI.setFont(new Font("Tahoma", Font.PLAIN, 16));
        txtBMI.setBounds(150, 180, 200, 30);
        contentPane.add(txtBMI);
        
        JLabel lblStatus = new JLabel("Trạng thái:");
        lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblStatus.setBounds(20, 220, 120, 30);
        contentPane.add(lblStatus);
        
        txtStatus = new JTextField();
        txtStatus.setEditable(false);
        txtStatus.setFont(new Font("Tahoma", Font.PLAIN, 16));
        txtStatus.setBounds(150, 220, 200, 30);
        contentPane.add(txtStatus);
	}
        
	private void calculateBMI() {
        double height = Double.parseDouble(txtHeight.getText());
        if (cbHeightUnit.getSelectedItem().equals("cm")) {
            height /= 100; // convert cm to m
        }
        double weight = Double.parseDouble(txtWeight.getText());
        double bmi = weight / (height * height);
        txtBMI.setText(String.format("%.2f", bmi));

        String status;
        if (bmi < 18.5) {
            status = "Quá gầy";
        } else if (bmi < 24.9) {
            status = "Bình thường";
        } else if (bmi < 29.9) {
            status = "Hơi béo";
        } else {
            status = "Béo phì";
        }
        txtStatus.setText(status);
    }

}
