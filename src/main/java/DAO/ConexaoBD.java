package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexaoBD {
    private static String host = "localhost";
    private static String porta = "3306";
    private static String db = "bd_perante"; //Nome do banco de dados que será acessado
    private static String usuario = "root";  //Usuário de conexão com o MySQL Workbench
    private static String senha = ""; //Senha de conexão com o MySQL Workbench
    
    
    public static Connection obtemConexao(){
        try{
            //"jdbc:mysql://localhost:3306/db_usuario?useTimezone=true&serverTimezone=UTC"
            Connection c = DriverManager.getConnection("jdbc:mysql://" + host + ":" + porta + "/" + db + 
                    "?useTimezone=true&serverTimezone=UTC", usuario, senha);
            return c;
        }catch(SQLException e){
            return null;
        }
    }
    
}
