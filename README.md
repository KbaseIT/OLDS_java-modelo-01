# Informações sobre o teste

O seu objetivo é criar um cadastro para gerenciamento de livros com as seguintes funcionalidades:
 - Pesquisa de livros por código (ISBN)
 - Pesquisa de livros de um autor.
 - Manutenção de livros (incluir, remover e alterar)


Um livro possui as seguintes informações:
 - ISBN (chave primária)
 - Título
 - Autores (um ou mais)
 - Editora
 - Data de publicação
 - Preço (em reais)
 - Críticas de leitores (uma ou mais)

Uma regra de negócio que deve ser implementada por você é que o preço deve ser listado por extenso pela API e tela. Por exemplo, se um livro custa R$ 39,45 ele deve aparecer na tela como Trinta e nove reais e quarenta e cinco centavos. 

O modelo arquitetural a ser usado é o MVC com JSF/Prime Faces, API JAX-RS, EJBb e Hibernate. O banco de dados é de sua livre escolha.

O entregável desta prática é o código fonte disponibilizado no GitHub. Nos envie apenas o endereço do repositório com o codigo fonte.

Os critérios de análise da prática serão:
  - Atendimento das funcionalidades
  - Existência de API com práticas RESTful
  - Boa organização do projeto e das camadas arquiteturais (conforme MVC)
  - Código Limpo (Conforme livro Clean Code, do Robert Martin)
  - Scripts para a montagem do executáveis (Makefile, Nuget, Maven, Gradle, SBT, NPM, Webpack ou outra tecnologia apropriada)
  - Cobertura das regras e APIs através de testes de unidade automatizados
  - Código sob gestão de configuração GIT
  - Uso de práticas RESTful (conforme recomendado em http://www.vinaysahni.com/best-practices-for-a-pragmatic-restful-api#hateoas)

# Informações sobre este repositório

Este modelo serve como base inicial para seu teste, contendo algumas funcionalidades já estabelecidas para auxiliar no início do desenvolvimento.

* hibernate/jpa
* model
* controller
* repository

Projeto construído utilizando a IDE IntelliJ, se você utiliza outra IDE, provavelmente seja necessário passos adicionais para faze-lo rodar. 

# IMPORTANTE

* Este repositório serve apenas como base, não envie nenhum PR.
* Não realize um FORK deste repo para o seu teste, prefira baixar e enviar direto para o seu repositório.
* Tenha certeza que removeu do seu repositório todas as "colinhas" que estão presentes para lhe auxiliar (classes com nome "example").
* Remova esse README e crie o seu próprio baseado na atividade que lhe foi concedida.
