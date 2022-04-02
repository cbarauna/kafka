# KAFKA

## Projeto para demonstrar a utilização do Kafka com Spring e Docker

Tem um produtor que faz a produção de mensagens, por padrão utilizando uma string.
Tem um consumidor que consome a fila kafka e joga no log todos os dados da fila.


## Tecnologias

Java
Spring boot
Apache Kafka


## Iniciar o projeto

Usar o docker-compose com o yml que está na raiz do producer. Esse docker-file tem, além do kafka, tem o zokeeper e
o kafdrop que é uma interface para monitorar a fila.

Após fazer o build do docker-compose pode iniciar as demais aplicações normalmente.

