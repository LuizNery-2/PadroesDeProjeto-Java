package org.example.database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//Exemplo Singleton
public class ConexaoDB {
    private static ConexaoDB instaciaDB;
    private Connection conexao;

    private ConexaoDB(){
            try {
                String url = "jdbc:postgresql://localhost:5432/TestePadroesJava";
                String usuario = "postgres";
                String senha = "123456789";

                conexao = DriverManager.getConnection(url,usuario,senha);
            }catch (SQLException e){
                e.printStackTrace();
            }

    }

    public static ConexaoDB getInstancia(){
        if (instaciaDB == null){
            instaciaDB = new ConexaoDB();
        }
        return  instaciaDB;
    }

    public Connection getConexao(){
        return conexao;
    }

    public void salvarTransacao(String tipoPagamento, double valor){
        try {
            String sql = "INSERT INTO transacoes (tipo, valor) VALUES (?, ?)";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, tipoPagamento);
            stmt.setDouble(2, valor);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
