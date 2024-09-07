Sistema de Orçamentos Automáticos - XSA Uniformes
Este projeto é um sistema web desenvolvido para automatizar o processo de geração de orçamentos para a empresa XSA Uniformes. Ele permite que os usuários preencham um formulário com informações sobre o pedido de uniformes e recebam um orçamento personalizado, com a possibilidade de realizar pagamentos por Pix ou cartão de crédito.
Tecnologias Utilizadas
•	Backend:
o	Java (Spring Boot)
o	JDBC (Java Database Connectivity)
o	JPA (Java Persistence Architecture)
o	Banco de dados: Derby
•	Frontend:
o	HTML, CSS, JavaScript
o	Angular
Funcionalidades
1.	Formulário de Orçamento:
o	Quantidade de peças
o	Tamanho (XP, P, M, G, GG)
o	Cores, material, prazo de entrega
o	Upload de design e inserção do endereço de entrega
o	Modelos e tipos de peça
2.	Cálculo de Orçamento:
o	Algoritmo para calcular o valor com base nos critérios fornecidos.
3.	Pagamento:
o	Opções de pagamento via Pix ou cartão de crédito.
o	Processamento de pagamento e mensagens de sucesso ou erro.
4.	Envio de E-mails:
o	O cliente recebe um e-mail com o comprovante e detalhes do pedido.
o	A empresa XSA Uniformes recebe as informações completas do pedido e dados de contato do cliente.
