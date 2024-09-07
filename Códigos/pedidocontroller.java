package com.xsauniformes.controller;

import com.xsauniformes.model.Pedido;
import com.xsauniformes.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping("/orcamento")
    public ResponseEntity<Pedido> fazerOrcamento(@RequestBody Pedido pedido) {
        Pedido orcamentoCalculado = pedidoService.calcularOrcamento(pedido);
        return ResponseEntity.ok(orcamentoCalculado);
    }

    // Outros endpoints para obter informações de pagamento, etc.
}
