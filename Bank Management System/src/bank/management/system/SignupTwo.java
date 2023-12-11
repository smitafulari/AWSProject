
package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignupTwo extends JFrame implements ActionListener {
    private String formno;
    JTextField aadhar,pan;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    private ComboBoxModel educationValue;
    JComboBox<String> religion,category,occupation,education,income;
    String label;

    SignupTwo( String label) {
        this.label = label;
        setLayout(null);
        setTitle("New Account Application Form- Page 2");


        JLabel additionalDetails = new JLabel("Page 2: Additional Deatils:");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);

        JLabel religions = new JLabel("Religion:");
        religions.setFont(new Font("Raleway", Font.BOLD, 20));
        religions.setBounds(100,140,100,30);
        add(religions);
        
        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Cristan","Others"};
        religion = new JComboBox<>(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        JLabel categorys = new JLabel("Category:");
        categorys.setFont(new Font("Raleway", Font.BOLD, 20));
        categorys.setBounds(100,190,200,30);
        add(categorys);
        
        String valCategory[] = {"OBC", "General", "ST", "NT", "SC"};
        category = new JComboBox<>(valCategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);
        
        
        JLabel incomes = new JLabel("Income:");
        incomes.setFont(new Font("Raleway",Font.BOLD, 20));
        incomes.setBounds(100,240,200,30);
        add(incomes);
        
        
        String incomeCategory[] = {"Null", "<1,50,000", "<2,50,000", "<5,00,000","< 10,00,000"};
        income = new JComboBox<>(incomeCategory);
        income.setBounds(300,240,400,30);
        income.setBackground(Color.WHITE);
        add(income);
        
        
        JLabel educationQuali = new JLabel("Educational Qualification:");
        educationQuali.setFont(new Font("Raleway", Font.BOLD, 20 ));
        educationQuali.setBounds(100,290,200,30);
        add(educationQuali);
        
        String educationValues[] = {"Non-graduate", "Graduate", "Post-gradute", "Doctrate", "Lawyer", "Others"};
        education = new JComboBox<>(educationValues); // Use educationValues directly
        education.setBounds(300, 315, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);
        
        
        JLabel occupations = new JLabel("Occupation:");
        occupations.setFont(new Font("Raleway", Font.BOLD, 20));
        occupations.setBounds(100,390,200,30);
        add(occupations);
        
        
        String occupationValues[] = {"Saleried", "Self-employed", "Bussiness", "Student", "Retire", "Others"};
        occupation = new JComboBox<>(occupationValues);
        occupation.setBounds(300,390,400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
       
                
         
        JLabel aadharNo = new JLabel("Aadhar number:");
        aadharNo.setFont(new Font("Raleway", Font.BOLD, 20));
        aadharNo.setBounds(100,440,200,30);
        add(aadharNo);
        
        
        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway", Font.BOLD,14));
        aadhar.setBounds(300,440,400,30);
        add(aadhar);
        

        JLabel panNO = new JLabel("Pan number:");
        panNO .setFont(new Font("Raleway", Font.BOLD, 20));
        panNO .setBounds(100,490,200,30);
        add(panNO );
        
        
        pan= new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD,14));
        pan.setBounds(300,490,400,30);
        add(pan);
        
        
        JLabel senior = new JLabel("Senior Citizen:");
        senior.setFont(new Font("Raleway", Font.BOLD, 20));
        senior.setBounds(100, 540, 200, 30);
        add(senior);

        syes= new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        syes.setForeground(Color.BLACK);
        syes.setBackground(Color.WHITE);
        add(syes);

        sno = new JRadioButton("No");
        sno.setBounds(450, 540, 100, 30);
        sno.setForeground(Color.BLACK);
        sno.setBackground(Color.WHITE);
        add(sno);

        ButtonGroup seniorCitizenGroup = new ButtonGroup();
        seniorCitizenGroup.add(syes);
        seniorCitizenGroup.add(sno);

        JLabel existingAcc = new JLabel("Existing Account:");
        existingAcc.setFont(new Font("Raleway", Font.BOLD, 20));
        existingAcc.setBounds(100, 590, 200, 30);
        add(existingAcc);

        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setForeground(Color.BLACK);
        eyes.setBackground(Color.WHITE);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setBounds(450, 590, 100, 30);
        eno.setForeground(Color.BLACK);
        eno.setBackground(Color.WHITE);
        add(eno);

        ButtonGroup existingAccountGroup = new ButtonGroup();
        existingAccountGroup.add(eyes);
        existingAccountGroup.add(eno);
        
        
        next = new JButton("Next");
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setFont(new Font("Raleway", Font.BOLD, 20));
        next.setBounds(620, 660, 100, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);

        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        String seniorcitizen = null;
        if (syes.isSelected()) {
            seniorcitizen = "Yes";
        } else if (sno.isSelected()) {
            seniorcitizen = "No";
        }
        String span =pan.getText();
        String saadhar = aadhar.getText();
        String existingaccount = null;
        if (eyes.isSelected()) {
            existingaccount = "Yes";
        } else if (eno.isSelected()) {
            existingaccount = "No";
        } 

 
        try {
          
                Conn c = new Conn();
                String query = "INSERT INTO signupTwo (formno, religion, category, income, education, occupation, pan, aadhar, seniorcitizen, existingaccount) " +
               "VALUES ('" + formno + "', '" + sreligion + "', '" + scategory + "', '" + sincome+ "', '" + seducation + "', '" +
               soccupation + "', '" + span + "', '" + saadhar + "', '" + seniorcitizen+ "', '" + existingaccount + "')";
                JOptionPane.showMessageDialog(null, "Data successfully inserted!");
                c.s.executeUpdate(query);
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }   

    public static void main(String args[]) {
        new SignupTwo(" ");
    }
}

