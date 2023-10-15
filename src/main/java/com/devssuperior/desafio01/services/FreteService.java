package com.devssuperior.desafio01.services;

import com.devssuperior.desafio01.entities.Pedido;
import org.springframework.stereotype.Service;

@Service
public class FreteService {

    public double frete(double valor) {
        if(valor>=200.00) {
            return 0.00;
        } else if (valor>=100.00 && valor<200.00) {
            return 12.00;
        } else {
            return 20.00;
        }
    }
}
