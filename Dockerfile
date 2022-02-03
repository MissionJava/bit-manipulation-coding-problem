FROM openjdk:11-alpine
COPY src/main/java/com/bit/manipulation/problems /usr/src/myapp
WORKDIR /usr/src/myapp
RUN javac NumberIsPowerOfTwo.java
CMD ["java", "NumberIsPowerOfTwo"]