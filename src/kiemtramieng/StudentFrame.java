/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiemtramieng;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author vuvan
 */
public class StudentFrame extends JFrame{

    
        
        private JFrame frame;
        private JPanel panel;
        private JMenuBar menuBar;
        private JMenu studentManager;
        private JMenu classRoom;
        private JMenu aboutMe;

        private JMenuItem addStudent;
        private JMenuItem listStudent;
        private JMenuItem addClass;
        private JMenuItem listClass;
        private JMenuItem Admin;

        public StudentFrame() {
            this.setSize(800, 500);
            this.setLocationRelativeTo(null);
            this.setLayout(null);

            menuBar = new JMenuBar();
            

            //Student Manager:      
            studentManager = new JMenu("Student Manager");
           

            addStudent = new JMenuItem("Add Student");
            addStudent.setActionCommand("addstd");
            addStudent.addActionListener(new stdHandle());
            
            listStudent = new JMenuItem("List Student");
            listStudent.setActionCommand("liststd");
            listStudent.addActionListener(new stdHandle());

            //Class Room:     
            classRoom = new JMenu("Class Room Manager");
            addClass = new JMenuItem("Add Class");
            addClass.setActionCommand("addcls");
            addClass.addActionListener(new stdHandle());
            
            listClass= new JMenuItem("List Class");
            listClass.setActionCommand("listcls");
            listClass.addActionListener(new stdHandle());
            
                   
            

            //About me:
            aboutMe = new JMenu("About Me");
            Admin = new JMenuItem("Admin");
            Admin.setActionCommand("adm");
            Admin.addActionListener(new stdHandle());
           

            studentManager.add(addStudent);
            studentManager.add(listStudent);
            classRoom.add(addClass);
            classRoom.add(listClass);
            aboutMe.add(Admin);

            menuBar.add(studentManager);
            menuBar.add(classRoom);
            menuBar.add(aboutMe);
            
//            addStudent.addActionListener(new addStudentHandle());
//            listStudent.addActionListener(new listStudentHandle());
//            addClass.addActionListener(new addClassHandle());
//            listClass.addActionListener(new listClassHandle());
//            Admin.addActionListener(new aboutMeHandle());
            
            setJMenuBar(menuBar);

            
            this.setVisible(true);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

    

    public static void main(String[] args) {
        StudentFrame stdFrame = new StudentFrame();
    }

}

//    class addStudentHandle implements ActionListener{
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        JOptionPane.showConfirmDialog(null, "Hello Friend.");
//    }
//    }
//    
//    class listStudentHandle implements ActionListener{
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//           JOptionPane.showConfirmDialog(null, "This is List Student.");
//        }
//    }
//
//    class addClassHandle implements ActionListener{
// 
//    @Override
//    public void actionPerformed(ActionEvent e) {
//       JOptionPane.showConfirmDialog(null, "Welcome class.");
//    }
//}
//
//    class listClassHandle implements ActionListener{
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        JOptionPane.showConfirmDialog(null, "This is List Class");
//    }
//}
//
//    class aboutMeHandle implements ActionListener{
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        JOptionPane.showMessageDialog(null, "Hi. i'm Truong.");
//}
//    }   

class stdHandle implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getActionCommand().equals("addstd")){
           JOptionPane.showConfirmDialog(null, "Hello Friend.");
       }
       
       if(e.getActionCommand().equals("liststd")){
           JOptionPane.showConfirmDialog(null, "This is List Student.");
 
       }
       
       if(e.getActionCommand().equals("addcls")){
           JOptionPane.showConfirmDialog(null, "Welcome Class.");
       }
       
       if(e.getActionCommand().equals("listcls")){
           JOptionPane.showConfirmDialog(null, "This is List Class.");
       }
       
       if(e.getActionCommand().equals("adm")){
           JOptionPane.showMessageDialog(null, "Hi i'm Truong.");
       }
       
    }
}
    
