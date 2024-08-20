FROM eclipse-temurin:17
COPY target/vanakam.jar vanakam.jar
CMD  ["java","-jar","vanakam.jar"]