package br.com.converter.main;

import br.com.converter.models.Coin;
import br.com.converter.models.Menu;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner reading = new Scanner(System.in);
        String choice = " ";

        while(!choice.equalsIgnoreCase("0")) {

            Menu message = new Menu();
            System.out.println(message.getMessage());

            choice = reading.nextLine();

            if (choice.equalsIgnoreCase("0")){
                System.out.println("Finishing");
                break;
            }

            String address = "https://v6.exchangerate-api.com/v6/3dbee3ed742c74b47f4e9cde/latest/USD";
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(address))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);

            Gson gson = new Gson();
            Coin myCoin = gson.fromJson(json, Coin.class);
            System.out.println("Moeda: " + myCoin.getName());

        }
    }
}