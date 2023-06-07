package DAO;

import DTO.DTOCadastrarUsuario;
import DTO.DTOProdutos;
import DTO.DTOUsuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;

public class DAO {

    public static void updateProduto(DTOProdutos produto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

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

    public void inserirProduto(DTOProdutos produto) throws Exception {
        String sql = "INSERT INTO tbprodutos (nome, preco, quantidade, categoria) VALUES (?, ?, ?, ?)";

        try (Connection conn = ConexaoBD.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, produto.getNome());
            ps.setDouble(2, produto.getPreco());
            ps.setInt(3, produto.getQuantidade());
            ps.setString(4, produto.getCategoria());

            ps.executeUpdate();
        }
    }

    public class TelaListagemProdutosDAO {

        public static void deleteProduto(int id) throws SQLException {
            String sql = "DELETE FROM tbprodutos WHERE id = ?";

            try (Connection conn = ConexaoBD.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setInt(1, id);
                ps.executeUpdate();
            }
        }

        public static void updateProduto(String nome, String preco, String quantidade, String categoria, String id) throws SQLException {
            String sql = "UPDATE tbprodutos SET nome = ?, preco = ?, quantidade = ?, categoria = ? WHERE id = ?";

            try (Connection conn = ConexaoBD.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, nome);
                ps.setDouble(2, Double.parseDouble(preco));
                ps.setInt(3, Integer.parseInt(quantidade));
                ps.setString(4, categoria);
                ps.setInt(5, Integer.parseInt(id));

                ps.executeUpdate();
            }
        }

        public static void preencherTabelaComProdutos(JTable table) throws SQLException {
            String sql = "SELECT * FROM tbprodutos";

            try (Connection conn = ConexaoBD.obtemConexao(); Statement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY); ResultSet rs = stmt.executeQuery(sql)) {

                // Definir as colunas da tabela
                String[] colunas = {"ID", "Nome", "Preço", "Quantidade", "Categoria"};

                // Contar o número de linhas retornadas pelo ResultSet
                int rowCount = getRowCount(rs);

                // Criar uma matriz de objetos para armazenar os dados da tabela
                Object[][] data = new Object[rowCount][5];

                // Preencher a matriz de dados com os valores do ResultSet
                int row = 0;
                while (rs.next()) {
                    data[row][0] = rs.getInt("id");
                    data[row][1] = rs.getString("nome");
                    data[row][2] = rs.getDouble("preco");
                    data[row][3] = rs.getInt("quantidade");
                    data[row][4] = rs.getString("categoria");
                    row++;
                }

                // Criar o modelo da tabela e configurá-lo com os dados
                TableModel model = new DefaultTableModel(data, colunas);
                table.setModel(model);
            }
        }

        private static int getRowCount(ResultSet rs) throws SQLException {
            int rowCount = 0;
            if (rs.last()) {
                rowCount = rs.getRow();
                rs.beforeFirst();
            }
            return rowCount;
        }

    }

    private static int getRowCount(ResultSet rs) throws SQLException {
        int rowCount = 0;
        if (rs.last()) {
            rowCount = rs.getRow();
            rs.beforeFirst();
        }
        return rowCount;
    }
}
