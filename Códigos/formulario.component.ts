import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-formulario',
  templateUrl: './formulario.component.html',
  styleUrls: ['./formulario.component.css']
})
export class FormularioComponent {
  pedido: any = {
    quantidade: null,
    tamanho: '',
    cores: '',
    material: '',
    prazo: '',
    design: null,
    endereco: '',
    modelo: '',
    informacoesAdicionais: ''
  };

  orcamentoRecebido: any = null;
  mostrarAvisoSair: boolean = false;

  constructor(private http: HttpClient) {}

  // Função para tratar o arquivo de design
  onFileSelected(event: any) {
    const file: File = event.target.files[0];
    if (file) {
      const reader = new FileReader();
      reader.onload = (e: any) => {
        this.pedido.design = e.target.result.split(',')[1];  // Converte o arquivo para Base64
      };
      reader.readAsDataURL(file);
    }
  }

  // Função para fazer o orçamento
  fazerOrcamento() {
    this.http.post('http://localhost:8080/api/pedidos/orcamento', this.pedido)
      .subscribe(response => {
        this.orcamentoRecebido = response;
        console.log('Orçamento gerado:', this.orcamentoRecebido);
      }, error => {
        console.error('Erro ao gerar orçamento', error);
      });
  }

  // Função para prosseguir para pagamento
  prosseguirPagamento() {
    // Implementar lógica de pagamento
    alert('Ir para a página de pagamento');
  }

  // Função para refazer o orçamento
  refazerOrcamento() {
    this.orcamentoRecebido = null;
    this.pedido = {
      quantidade: null,
      tamanho: '',
      cores: '',
      material: '',
      prazo: '',
      design: null,
      endereco: '',
      modelo: '',
      informacoesAdicionais: ''
    };
  }

  // Função para sair e perder informações
  sair() {
    this.mostrarAvisoSair = true;
  }

  // Confirmação da saída
  confirmarSaida() {
    this.mostrarAvisoSair = false;
    this.orcamentoRecebido = null;
    alert('Você saiu do processo de orçamento.');
  }

  // Cancelar saída e continuar na página atual
  cancelarSaida() {
    this.mostrarAvisoSair = false;
  }
}
