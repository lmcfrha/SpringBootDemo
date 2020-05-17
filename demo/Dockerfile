FROM openjdk:8-jre-alpine
RUN addgroup -S msdp && adduser -S msdp -G msdp
USER msdp:msdp

COPY BOOT-INF/lib /app/lib
COPY META-INF /app/META-INF
COPY BOOT-INF/classes /app
ENTRYPOINT ["java","-cp","app:app/lib/*","com.example.demo.DemoApplication"]