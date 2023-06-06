package DTO;

public class DTOUsuario {
    private String login;
    private String senha;

    public DTOUsuario(String login, String senha){
        this.login = login;
        this.senha = senha;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }   
}
