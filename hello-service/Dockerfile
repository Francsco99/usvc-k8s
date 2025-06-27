# Usa un'immagine base Java OpenJDK 17 slim
FROM eclipse-temurin:17-jdk-jammy

# Copia il jar generato nella cartella /app/app.jar
COPY target/*.jar /app/app.jar

# Esponi la porta 8080 (default Spring Boot)
EXPOSE 8081

# Comando per avviare l'app
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
