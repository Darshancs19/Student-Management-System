

package projectsms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class Teacher4Login extends Login{
    
    Teacher4Login(){
        
        submit.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
 
            String name=usernameField.getText();
            String pass= passField.getText();
 
                if(name.equals("Falguni Roy") && pass.equals("1234")){
                        JOptionPane.showMessageDialog(null,"Welcome");
                    frame.dispose();
                    Teacher4Module director = new Teacher4Module();
                }
                else{
                    JOptionPane.showMessageDialog(null,"Wrong Password");
                    usernameField.setText("");
                    passField.setText("");
                }
        }
        
        });
        
    }
    
}


