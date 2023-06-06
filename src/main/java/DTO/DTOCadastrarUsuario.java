/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.sql.Date;




public class DTOCadastrarUsuario {
    private String nomeCompleto;
    private int nascimento;
    private String telefone;
    private String cpf;
    private String usuario;
    private String senha;

    public DTOCadastrarUsuario() {
        // Construtor vazio
    }

    public DTOCadastrarUsuario(String nomeCompleto, int nascimento, String telefone, String cpf, String usuario, String senha) {
        this.nomeCompleto = nomeCompleto;
        this.nascimento = nascimento;
        this.telefone = telefone;
        this.cpf = cpf;
        this.usuario = usuario;
        this.senha = senha;
    }

    public DTOCadastrarUsuario(String nome, int nascimento1, String nascimento, int cpf1, String telefone, String cpf) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getNascimento() {
        return nascimento;
    }

    public void setNascimento(int nascimento) {
        this.nascimento = nascimento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}