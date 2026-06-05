Diagrama de classes
<img width="1536" height="1024" alt="diagrama" src="https://github.com/user-attachments/assets/29ae2db1-c77d-4249-b2db-700b08d136e4" />

# Rede Solidária de Doação e Reaproveitamento

 Sobre o Projeto

A Rede Solidária de Doação e Reaproveitamento é uma aplicação desenvolvida em Java com o objetivo de conectar doadores, beneficiários e instituições que necessitam de recursos básicos.

O sistema permite o cadastro e gerenciamento de doações, solicitações e beneficiários, promovendo o reaproveitamento de itens em bom estado e contribuindo para a redução do desperdício e das desigualdades sociais.

Este projeto foi desenvolvido como atividade acadêmica utilizando os princípios de Programação Orientada a Objetos (POO), herança, encapsulamento, organização em camadas e persistência de dados em arquivos.


 Objetivos

- Facilitar a conexão entre doadores e beneficiários.
- Promover o reaproveitamento de recursos.
- Reduzir desperdícios.
- Aplicar conceitos de Programação Orientada a Objetos.
- Desenvolver uma aplicação estruturada utilizando boas práticas de desenvolvimento.
- Demonstrar a utilização do Git e GitHub em um ambiente colaborativo.


 Objetivos de Desenvolvimento Sustentável (ODS)

O projeto está alinhado com os seguintes ODS da ONU:

- ODS 1 – Erradicação da Pobreza
- ODS 2 – Fome Zero e Agricultura Sustentável
- ODS 10 – Redução das Desigualdades
- ODS 12 – Consumo e Produção Responsáveis


 Funcionalidades

 Cadastro de Usuários
- Cadastro de doadores
- Cadastro de beneficiários
- Listagem de usuários cadastrados

 Gerenciamento de Doações
- Cadastro de itens para doação
- Controle de quantidade disponível
- Atualização de status dos itens:
  - Disponível
  - Reservado
  - Entregue
  - Cancelado

 Solicitações
- Registro de solicitações de itens
- Validação de disponibilidade
- Aprovação ou rejeição de solicitações
- Controle de quantidade solicitada

 Relatórios
- Relatório de doações realizadas
- Priorização de beneficiários por nível de urgência

 Persistência de Dados
- Salvamento dos dados em arquivos
- Recuperação dos registros ao iniciar o sistema


 Estrutura do Projeto

```text
src/
│
├── model/
│   ├── Usuario.java
│   ├── Doador.java
│   ├── Beneficiario.java
│   ├── ItemDoacao.java
│   ├── Solicitacao.java
│   └── DoacaoEfetivada.java
│
├── repository/
│   ├── ArquivoRepository.java
│   ├── BeneficiarioRepository.java
│   ├── DoadorRepository.java
│   ├── ItemRepository.java
│   └── SolicitacaoRepository.java
│
├── service/
│   ├── SolicitacaoService.java
│   └── RelatorioService.java
│
├── util/
│   ├── MenuUtil.java
│   └── MenuController.java
│
└── main/
    └── Main.java
    └── (Em desenvolvimento)

