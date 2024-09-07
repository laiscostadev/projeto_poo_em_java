# Sistema de Orçamentos Automáticos - XSA Uniformes

Este projeto é um sistema web desenvolvido para automatizar o processo de geração de orçamentos para a empresa XSA Uniformes. Ele permite que os usuários preencham um formulário com informações sobre o pedido de uniformes e recebam um orçamento personalizado, com a possibilidade de realizar pagamentos por Pix ou cartão de crédito.

# Tecnologias Utilizadas
•	Backend:
- Java (Spring Boot)
- JDBC (Java Database Connectivity)
- JPA (Java Persistence Architecture)
- Banco de dados: Derby

• Frontend:
- HTML, CSS, JavaScript
- Angular
  
# Funcionalidades
1.	Formulário de Orçamento:
- Quantidade de peças
- Tamanho (XP, P, M, G, GG)
- Cores, material, prazo de entrega
- Upload de design e inserção do endereço de entrega
- Modelos e tipos de peça
  
2.	Cálculo de Orçamento:
- Algoritmo para calcular o valor com base nos critérios fornecidos.
  
3.	Pagamento:
- Opções de pagamento via Pix ou cartão de crédito.
- Processamento de pagamento e mensagens de sucesso ou erro.

4.	Envio de E-mails:
- O cliente recebe um e-mail com o comprovante e detalhes do pedido.
- A empresa XSA Uniformes recebe as informações completas do pedido e dados de contato do cliente.
