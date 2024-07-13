package desafio4.api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
import com.google.gson.Gson;

public class Usuarios {

    public static void main(String[] args) {

        Scanner busca = new Scanner(System.in);
        System.out.println("Digite o nome de usuário: ");

        String username = busca.nextLine();

        String endereco = "https://api.github.com/users/" + username;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .header("Accept", "application/vnd.github+json")
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 404) {
                throw new ErroConsultaGitHubException("Usuário não encontrado no GitHub.");
            }

            String json = response.body();
            System.out.println(json);

            Gson gson = new Gson();
            UsuarioGithub usuario = gson.fromJson(response.body(), UsuarioGithub.class);
            System.out.println(usuario);

        } catch (ErroConsultaGitHubException e) {
            System.out.println(e.getMessage());
        }

        catch (IOException | InterruptedException e) {
            System.out.println("Houve um erro durante a consulta: " + e.getMessage());
            e.printStackTrace();

        } finally {
            busca.close();
        }
    }
}

