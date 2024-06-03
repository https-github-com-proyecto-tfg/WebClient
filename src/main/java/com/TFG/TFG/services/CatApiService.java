package com.TFG.TFG.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * Servicio para interactuar con la API de The Cat API.
 */
@Service
public class CatApiService {

    @Value("${cat-api-key}")
    private String apiKey;

    private final WebClient webClient;

    /**
     * Constructor para inicializar el cliente WebClient con la URL base de The Cat API.
     */
    public CatApiService() {
        this.webClient = WebClient.create("https://api.thecatapi.com/v1/images/");
    }

    /**
     * Obtiene una imagen aleatoria de un gato.
     * 
     * @return una imagen aleatoria de un gato
     */
    public Object getImages() {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder.path("/search")
                        .queryParam("api_key", apiKey)
                        .build())
                .retrieve()
                .bodyToMono(Object.class)
                .block();
    }

    /**
     * Obtiene un número limitado de imágenes de gatos.
     * 
     * @param limit el número máximo de imágenes a obtener
     * @return una lista de imágenes de gatos
     */
    public Object getImagesLimit(int limit) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder.path("/search")
                        .queryParam("limit", limit)
                        .queryParam("api_key", apiKey)
                        .build())
                .retrieve()
                .bodyToMono(Object.class)
                .block();
    }
}
