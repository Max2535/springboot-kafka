FROM eclipse-temurin:23-jdk-alpine

WORKDIR /app

# คัดลอกโค้ดทั้งหมด
COPY . .

# Build ไฟล์ JAR
RUN apk add --no-cache maven \
    && mvn clean package -DskipTests

# ใช้ไฟล์ JAR ที่ถูกสร้าง
CMD ["java", "-jar", "target/springboot-kafka-tutorial-0.0.1-SNAPSHOT.jar"]
