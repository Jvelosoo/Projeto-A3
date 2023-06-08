package DTO;

public class DTOProdutos {

    private int id;
    private String nome;
    private double preco;
    private int quantidade;
    private String categoria;
    private String vendedor;

    public DTOProdutos(String nome, double preco, int quantidade, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;
    }

    public DTOProdutos(String nome, String preco, String quantidade, String categoria, String id ) {
        this.nome = nome;
        this.preco = Double.parseDouble(preco);
        this.quantidade = Integer.parseInt(quantidade);
        this.categoria = categoria;
        this.id = Integer.parseInt(id);
    
    }

    public DTOProdutos(String nome, String preco, String quantidade, String categoria, String id, String vendedor) {
        this.nome = nome;
        this.preco = Double.parseDouble(preco);
        this.quantidade = Integer.parseInt(quantidade);
        this.categoria = categoria;
        this.id = Integer.parseInt(id);
        this.vendedor = vendedor;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
