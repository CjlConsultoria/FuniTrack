package com.cjl.funitrack.services;

import com.cjl.funitrack.dtos.response.CepResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CepService {

    private final RestTemplate restTemplate = new RestTemplate();

    public CepResponse buscarEnderecoPorCep(String cep) {
        String url = "https://viacep.com.br/ws/" + cep + "/json/";
        return restTemplate.getForObject(url, CepResponse.class);
    }
}
