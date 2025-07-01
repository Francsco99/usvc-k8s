# Use base image with JVM
FROM eclipse-temurin:17-jdk-jammy

# Working directory
WORKDIR /app

# Define build argument for JAR name
ARG JAR_NAME
ENV JAR_NAME=$JAR_NAME

# Copy the JAR downloaded by the action into the container
COPY ${JAR_NAME} /.

# Expose application port
EXPOSE 8082

# Entrypoint to run the JAR
ENTRYPOINT exec java -jar $JAR_NAME
