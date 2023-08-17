
package exchange_r;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class connect_database {

    Connection con = null;

    public static Connection connect_database() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/exchanger", "root", "");
            return con;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "database Connection Problem");
        }
        return null;
    }

}
