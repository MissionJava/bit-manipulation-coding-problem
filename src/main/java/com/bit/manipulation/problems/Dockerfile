FROM openjdk:11-alpine
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
RUN javac NumberIsPowerOfTwo.java
CMD ["java", "NumberIsPowerOfTwo"]