FROM openjdk:8u191-jre-alpine
ARG DEPENDENCY=target/dependency
RUN addgroup -S msdp && adduser -S msdp -G msdp
USER msdp:msdp
 
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app
ENTRYPOINT ["java","-cp","app:app/lib/*","com.example.demo.DemoApplication"]