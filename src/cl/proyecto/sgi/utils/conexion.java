package cl.proyecto.sgi.utils;
import java.sql.Connection;
import java.sql.DriverManager;

public class conexion {
    private final String USER="root";
    private final String DATABASE="";
    private final String PASSWORD="";
    private final String SERVER="localhost";
    protected Connection conexion;
    
    public Connection getConnection(){
        return conexion;
        
    }
    
    public boolean conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String ruta="jdbc:mysql://"+SERVER+":3306/"+DATABASE;
            this.conexion=DriverManager.getConnection(ruta, USER, PASSWORD);
            return true;
        }catch(Exception ex){
            return false;
        }
    }
    
    public void desconectar(){
        try{
            this.conexion.close();
        }catch(Exception ex){
            System.out.println("Error: "+ ex);
        }
    }
}
