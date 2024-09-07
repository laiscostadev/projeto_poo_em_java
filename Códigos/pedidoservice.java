package com.xsauniformes.service;

import com.xsauniformes.model.Pedido;
import com.xsauniformes.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido calcularOrcamento(Pedido pedido) {
        double valorTotal = 0;

        for (Uniforme uniforme : pedido.getUniformes()) {
            // Lógica de cálculo do orçamento com base na quantidade e material
            valorTotal += uniforme.getQuantidade() * calcularValorPorUniforme(uniforme);
        }

        pedido.setValorTotal(valorTotal);
        return pedidoRepository.save(pedido);
    }

    private double calcularValorPorUniforme(Uniforme uniforme) {
        // Cálculo baseado em material, tamanho, etc.
        return 50.0; // Exemplo de valor fixo por uniforme
    }
}
