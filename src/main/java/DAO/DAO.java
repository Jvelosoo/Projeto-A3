package DAO;

import DTO.DTOCadastrarUsuario;
import DTO.DTOCadastrarProdutos;
import DTO.DTOUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {

    public boolean existe(DTOUsuario usuario) throws Exception {
        String sql = "SELECT * FROM tbusuarios WHERE usuario = ? AND senha = ?";

        try (Connection conn = ConexaoBD.obtemConexao()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, usuario.getLogin());
            ps.setString(2, usuario.getSenha());

            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }

    public void inserirUsuario(DTOCadastrarUsuario cadastrarUsuario) throws Exception {
        String sql = "INSERT INTO tbusuarios (nome_completo, nascimento, telefone, cpf, usuario, senha) VALUES (?, ?, ?, ?, ?, ?);";

        try (Connection conn = ConexaoBD.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, cadastrarUsuario.getNomeCompleto());
            ps.setInt(2, cadastrarUsuario.getNascimento());
            ps.setString(3, cadastrarUsuario.getTelefone());
            ps.setString(4, cadastrarUsuario.getCpf());
            ps.setString(5, cadastrarUsuario.getUsuario());
            ps.setString(6, cadastrarUsuario.getSenha());

            ps.executeUpdate();
        }
    }
    
      public void inserirProduto(DTOCadastrarProdutos produto) throws Exception {
        String sql = "INSERT INTO tbprodutos (nome, preco, quantidade, categoria) VALUES (?, ?, ?, ?)";

        try (Connection conn = ConexaoBD.obtemConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, produto.getNome());
            ps.setDouble(2, produto.getPreco());
            ps.setInt(3, produto.getQuantidade());
            ps.setString(4, produto.getCategoria());

            ps.executeUpdate();
        }
      }
}
