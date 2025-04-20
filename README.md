# Diagrama Unifiliar - Backend

Requisitos:
* Java 17 ou superior

Como rodar:
* Rode mvn clean install na raiz do projeto
* Abre o projeto no Intellij IDEA e rode o comando para executar ou depurar
* Ou rode os seguintes comandos:
  * mvn clean package
  * java -jar target/singlelinebackend-0.0.1-SNAPSHOT.jar

Rotas disponíveis
* `/upload` -> Faz o upload de um arquivo XML e retorna um JSON
* `/download` -> Faz o download de um código json