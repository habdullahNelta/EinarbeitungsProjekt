package HelfMethoden;

import javax.swing.*;


public class GUI {

    private  static   String Test;
    //To-Do


    public static String getTest() {
        return Test;
    }

    public static void setTest(String test) {
        Test = test;
    }

    public void DialogTest(String Text) {

        String backupDir = "Test";
        //create a jframe
        JFrame frame = new JFrame("JOptionPane showMessageDialog example");
        //show a joptionpane dialog using showMessageDialog
        JOptionPane.showMessageDialog(frame, Text);
    }




}
