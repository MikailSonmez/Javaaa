
package asdasd;
import javax.swing.JOptionPane;

public class PeopleMain {
    
    
    
    public static void main(String[] args){

        
        Person john = new Person(21, "John");
        Person susan = new Person(25,"Susan");
        susan.birthday();
        
        JOptionPane.showMessageDialog(null, 
                "The Year " + john.getName() + " was born is " + john.getYearBorn());
        
        JOptionPane.showMessageDialog(null, 
                "\n Name : "+susan.getName()+
                "\n Age :" + susan.getAge()+
                "\n The year born : "+susan.getYearBorn());
        
    }
    
}