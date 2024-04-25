# Etapa 1: Compilar o projeto Java
FROM maven:3.8.5-jdk-11 as build

# Defina o diretório de trabalho para o projeto
WORKDIR /usr/src/app

# Copie o arquivo pom.xml primeiro para usar o cache
COPY pom.xml .

# Baixe as dependências necessárias (será cacheado se o arquivo pom.xml não mudar)
RUN mvn dependency:go-offline

# Copie o restante do projeto para a imagem
COPY . .

# Compile o projeto
RUN mvn clean package

# Etapa 2: Crie uma nova imagem a partir do openjdk para executar o arquivo jar
FROM openjdk:11-jre-slim

# Defina o diretório de trabalho
WORKDIR /app

# Copie o arquivo .jar da imagem de compilação para a nova imagem
COPY --from=build /usr/src/app/target/openapi-spring-1.0.0.jar /app/openapi-spring-1.0.0.jar

EXPOSE 8080

# Defina o comando para executar o arquivo .jar
CMD ["java", "-jar", "openapi-spring-1.0.0.jar"]
