import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener {

    // Components of the Form
    private Container c;
    private JLabel title;
    private JLabel name;
    private JTextField tname;
    private JLabel no;
    private JTextField tno;
    private JLabel category;
    private JRadioButton face;
    private JRadioButton eye;
    private JRadioButton lip;
    private ButtonGroup gengp;
    private JLabel product;
    private JComboBox makeup;
    private JLabel price;
    private JLabel add;
    private JTextArea tadd;
    private JCheckBox term;
    private JButton sub;
    private JButton reset;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;

    private String makeups[] = { "Select","Foundation", "Concealer", "Blusher", "Mascara", "Eyeshadow",
            "Lipstick", "Lip tint"};

    // constructor, to initialize the components
    // with default values.
    public MyFrame()
    {
        setTitle("Makeup");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Makeup Form");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);

        name = new JLabel("Customer Name");
        name.setFont(new Font("Arial", Font.PLAIN, 18));
        name.setSize(150, 20);
        name.setLocation(100, 100);
        c.add(name);

        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(260, 100);
        c.add(tname);

        no = new JLabel("Phone No");
        no.setFont(new Font("Arial", Font.PLAIN, 18));
        no.setSize(150, 25);
        no.setLocation(100, 150);
        c.add(no);

        tno = new JTextField();
        tno.setFont(new Font("Arial", Font.PLAIN, 15));
        tno.setSize(190, 20);
        tno.setLocation(260, 150);
        c.add(tno);

        category = new JLabel("Category");
        category.setFont(new Font("Arial", Font.PLAIN, 18));
        category.setSize(100, 25);
        category.setLocation(100, 200);
        c.add(category);

        face = new JRadioButton("Face");
        face.setFont(new Font("Arial", Font.PLAIN, 15));
        face.setSelected(true);
        face.setSize(75, 20);
        face.setLocation(200, 200);
        c.add(face);

        eye = new JRadioButton("Eye");
        eye.setFont(new Font("Arial", Font.PLAIN, 15));
        eye.setSelected(false);
        eye.setSize(80, 20);
        eye.setLocation(275, 200);
        c.add(eye);

        lip = new JRadioButton("Lip");
        lip.setFont(new Font("Arial", Font.PLAIN, 15));
        lip.setSelected(false);
        lip.setSize(85, 20);
        lip.setLocation(355, 200);
        c.add(lip);

        gengp = new ButtonGroup();
        gengp.add(face);
        gengp.add(eye);
        gengp.add(lip);

        product = new JLabel("Product");
        product.setFont(new Font("Arial", Font.PLAIN, 18));
        product.setSize(100, 20);
        product.setLocation(100, 250);
        c.add(product);

        makeup = new JComboBox(makeups);
        makeup.setFont(new Font("Arial", Font.PLAIN, 15));
        makeup.setSize(120, 25);
        makeup.setLocation(200, 250);
        c.add(makeup);

        price = new JLabel("");
        price.setFont(new Font("Arial", Font.PLAIN, 18));
        price.setSize(120, 25);
        price.setLocation(350, 250);
        c.add(price);

        add = new JLabel("Address");
        add.setFont(new Font("Arial", Font.PLAIN, 18));
        add.setSize(100, 20);
        add.setLocation(100, 300);
        c.add(add);

        tadd = new JTextArea();
        tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        tadd.setSize(200, 75);
        tadd.setLocation(200, 300);
        tadd.setLineWrap(true);
        c.add(tadd);

        term = new JCheckBox("Confirmed order");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setSize(250, 20);
        term.setLocation(200, 400);
        c.add(term);

        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 450);
        sub.addActionListener(this);
        c.add(sub);

        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 450);
        reset.addActionListener(this);
        c.add(reset);

        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(300, 400);
        tout.setLocation(500, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);

        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 18));
        res.setSize(500, 25);
        res.setLocation(150, 500);
        c.add(res);

        resadd = new JTextArea();
        resadd.setFont(new Font("Arial", Font.PLAIN, 15));
        resadd.setSize(200, 75);
        resadd.setLocation(580, 175);
        resadd.setLineWrap(true);
        c.add(resadd);

        setVisible(true);
    }

    // method actionPerformed()
    // to get the action performed
    // by the user and act accordingly
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == sub) {
            if (term.isSelected()) {
                String data1;
                String data = "Customer Name : "+ tname.getText() + "\n" + "Phone No. : "
                        + tno.getText() + "\n";

                if (face.isSelected()) {
                    data1 = "Category   : Face" + "\n";
                } else if (eye.isSelected()) {
                    data1 = "Category   : Eye" + "\n";
                } else {
                    data1 = "Category   : Lip" + "\n";
                }

                String data2 = "Product     : " + (String)makeup.getSelectedItem() + "\n" + "Total          : RM 39.90" + "\n";
                        //+ price.getText() + "\n";

                String data3 = "Address    : " + tadd.getText();
                tout.setText(data + data1 + data2 + data3);
                tout.setEditable(false);
                res.setText("Thank you for your order " + tname.getText() + "!");
            }
            else {
                tout.setText("");
                resadd.setText("");
                res.setText("Please confirm your order");
            }
        }

        else if (e.getSource() == reset) {
            String def = "";
            tname.setText(def);
            tadd.setText(def);
            tno.setText(def);
            price.setText(def);
            res.setText(def);
            tout.setText(def);
            term.setSelected(false);
            makeup.setSelectedIndex(0);
            resadd.setText(def);
        }
    }
}

// Driver Code
public class Main {

    public static void main(String[] args) throws Exception{
        MyFrame f = new MyFrame();
    }
}
