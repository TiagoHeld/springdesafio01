package com.devssuperior.desafio01;

import com.devssuperior.desafio01.entities.Pedido;
import com.devssuperior.desafio01.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Desafio01Application implements CommandLineRunner {

    @Autowired
    PedidoService pedidoService;

    public static void main(String[] args) {
        SpringApplication.run(Desafio01Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Pedido pedido = new Pedido(1309,95.90,0.0);
        System.out.println("Pedido código:" + pedido.getCode());
        System.out.println("Valor total: R$ " + pedidoService.total(pedido));
    }
}
