package com.devssuperior.desafio01.services;

import com.devssuperior.desafio01.entities.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {
    @Autowired
    private FreteService freteService;

    public double total(Pedido pedido) {
        return (pedido.getBasic() - pedido.getBasic() * (pedido.getDiscount()/100)) + freteService.frete(pedido.getBasic());
    }


}
