import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.metal.OceanTheme;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
class editor extends JFrame implements ActionListener {


	private JMenuBar mb = new JMenuBar();
	private JTextArea t = new JTextArea();
	private JMenu m1 = new JMenu("File");

	private JMenuItem mi1 = new JMenuItem("New");
	private JMenuItem mi2 = new JMenuItem("Open");
	private JMenuItem mi3 = new JMenuItem("Save");
	private JMenuItem mi9 = new JMenuItem("Print");


	private JMenu m2 = new JMenu("Edit");               // Create amenu for menu


    // Create menu items
	private JMenuItem mi4 = new JMenuItem("cut");
	private JMenuItem mi5 = new JMenuItem("copy");
	private JMenuItem mi6 = new JMenuItem("paste");




    editor()
    {

       setSize(400,500);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setTitle("To-Do Notepad");



        try {
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");

            // Set theme to ocean
            MetalLookAndFeel.setCurrentTheme(new OceanTheme());
        }
        catch (Exception e) {
        }



        // Add action listener
        mi1.addActionListener(this);
        mi2.addActionListener(this);
        mi3.addActionListener(this);
        mi9.addActionListener(this);

        m1.add(mi1);
        m1.add(mi2);
        m1.add(mi3);
        m1.add(mi9);




        // Add action listener
        mi4.addActionListener(this);
        mi5.addActionListener(this);
        mi6.addActionListener(this);

        m2.add(mi4);
        m2.add(mi5);
        m2.add(mi6);

        JMenuItem mc = new JMenuItem("close");

        mc.addActionListener(this);

        mb.add(m1);
        mb.add(m2);
        mb.add(mc);


        setJMenuBar(mb);
        add(t);
        setSize(500, 500);
        show();
    }

    // If a button is pressed
    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();

        if (s.equals("cut")) {
            t.cut();
        }
        else if (s.equals("copy")) {
            t.copy();
        }
        else if (s.equals("paste")) {
            t.paste();
        }
        else if (s.equals("Save")) {
                                                                          // Create an object of JFileChooser class
            JFileChooser j = new JFileChooser("f:");

                                                                          // Invoke the showsSaveDialog function to show the save dialog
            int r = j.showSaveDialog(null);

            if (r == JFileChooser.APPROVE_OPTION) {

                                                                           // Set the label to the path of the selected directory
                File fi = new File(j.getSelectedFile().getAbsolutePath());

                try {
                                                                             // Create a file writer
                    FileWriter wr = new FileWriter(fi, false);

                                                                             // Create buffered writer to write
                    BufferedWriter w = new BufferedWriter(wr);

                                                                             // Write
                    w.write(t.getText());

                    w.flush();
                    w.close();
                }
                catch (Exception evt) {
                    JOptionPane.showMessageDialog(this, evt.getMessage());
                }
            }
                                                                            // If the user cancelled the operation
            else
                JOptionPane.showMessageDialog(this, "the user cancelled the operation");
        }
        else if (s.equals("Print")) {
            try {
                // print the file
                t.print();
            }
            catch (Exception evt) {
                JOptionPane.showMessageDialog(this, evt.getMessage());
            }
        }
        else if (s.equals("Open")) {
                                                                // Create an object of JFileChooser class
            JFileChooser j = new JFileChooser("f:");

                                                                 // Invoke the showsOpenDialog function to show the save dialog
            int r = j.showOpenDialog(null);

            // If the user selects a file
            if (r == JFileChooser.APPROVE_OPTION) {
                // Set the label to the path of the selected directory
                File fi = new File(j.getSelectedFile().getAbsolutePath());

                try {
                    // String
                    String s1 = "", sl = "";

                    // File reader
                    FileReader fr = new FileReader(fi);

                    // Buffered reader
                    BufferedReader br = new BufferedReader(fr);

                    // Initilize sl
                    sl = br.readLine();

                    // Take the input from the file
                    while ((s1 = br.readLine()) != null) {
                        sl = sl + "\n" + s1;
                    }

                    // Set the text
                    t.setText(sl);
                }
                catch (Exception evt) {
                    JOptionPane.showMessageDialog(this, evt.getMessage());
                }
            }
            // If the user cancelled the operation
            else
                JOptionPane.showMessageDialog(this, "No file Selected");
        }
        else if (s.equals("New")) {
            t.setText("");
        }
        else if (s.equals("close")) {
            setVisible(false);
        }
    }

    // Main class
    public static void main(String args[])
    {
        editor e = new editor();
    }
}