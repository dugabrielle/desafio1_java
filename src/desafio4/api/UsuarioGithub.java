package desafio4.api;
public class UsuarioGithub {
    private String login;
    private int id;
    private String html_url;

    public String getLogin() {
        return login;
    }

    public int getId() {
        return id;
    }

    public String getHtmlUrl() {
        return html_url;
    }

    @Override
    public String toString() {
        return "\n***** Informações do Usuário *****" +
                "\nLogin: " + login + "\nId: " + id +
                "\nUrl: " + html_url;
    }
}
