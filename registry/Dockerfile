FROM java:8-jre

ADD ./target/registry.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/registry.jar"]

#HEALTHCHECK --interval=50s --timeout=50s
#    CMD curl -f http://localhost:8761/actuator/health || exit 1

EXPOSE 8761