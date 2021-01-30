FROM java:8-jre

ADD ./target/storage.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/storage.jar"]

#HEALTHCHECK --interval=50s --timeout=50s
#    CMD curl -f http://localhost:6000/actuator/health || exit 1

EXPOSE 6000