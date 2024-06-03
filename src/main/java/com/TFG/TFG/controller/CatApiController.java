package com.TFG.TFG.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.TFG.TFG.services.CatApiService;

/**
 * Controlador para gestionar las peticiones relacionadas con imágenes de gatos.
 */
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class CatApiController {

    private final CatApiService catApiService;

    /**
     * Constructor para inyectar el servicio de CatApiService.
     * 
     * @param catApiService el servicio de CatApiService
     */
    @Autowired
    public CatApiController(CatApiService catApiService) {
        this.catApiService = catApiService;
    }

    /**
     * Endpoint para obtener una imagen aleatoria de un gato.
     * 
     * @return una imagen aleatoria de un gato
     */
    @GetMapping("/cat/image")
    public Object getImages() {
        return catApiService.getImages();
    }

    /**
     * Endpoint para obtener un número limitado de imágenes de gatos.
     * 
     * @param limit el número máximo de imágenes a obtener (por defecto es 10)
     * @return una lista de imágenes de gatos
     */
    @GetMapping("/cat/images")
    public Object getImagesLimit(@RequestParam(defaultValue = "10") int limit) {
        return catApiService.getImagesLimit(limit);
    }
}
