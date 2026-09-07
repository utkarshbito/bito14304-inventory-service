package com.example.inventory.client;

import org.springframework.stereotype.Component;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/** Calls the order service in utkarshbito/bito14304-order-service. */
@Component
public class OrderServiceClient {

    private final HttpClient http = HttpClient.newHttpClient();

    /** GET http://bito14304-order-service/api/orders/{id} */
    public String fetchOrder(Long id) throws Exception {
        HttpRequest req = HttpRequest.newBuilder()
                .uri(URI.create("http://bito14304-order-service/api/orders/" + id))
                .GET()
                .build();
        return http.send(req, HttpResponse.BodyHandlers.ofString()).body();
    }
}
