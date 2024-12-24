package services;

import com.fasterxml.jackson.databind.ObjectMapper;
import entities.Endereco;
import resources.exceptions.APIException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

public class CepApiService {

    private final String API_URL = "https://viacep.com.br/ws/";


    public Map<String, String> buscarCep(String endpoint) {

        try {


            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(API_URL + endpoint + "/json"))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                ObjectMapper objectMapper = new ObjectMapper();
                return objectMapper.readValue(response.body(), Map.class);
            }
            return null;
        }
        catch (IOException | InterruptedException e) {
            throw new APIException(e.getMessage());
        }

    }
}
