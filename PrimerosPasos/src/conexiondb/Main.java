package conexiondb;

import java.sql.Connection;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection miConexion;
        miConexion=ConexionDB.GetConnection();
     
        if(miConexion!=null)
        {
            JOptionPane.showMessageDialog(null, "Conexión Realizada Correctamente");
        }

	}

}