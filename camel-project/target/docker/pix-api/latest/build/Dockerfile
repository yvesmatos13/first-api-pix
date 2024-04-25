FROM quay.io/jkube/jkube-java-binary-s2i:0.0.9
ENV JAVA_APP_DIR=/deployments
LABEL org.label-schema.description="Camel implementation for the PIX API API" org.label-schema.version=1.0-SNAPSHOT org.label-schema.schema-version=1.0 org.label-schema.build-date=2024-04-24T20:13:36.006290 org.label-schema.name="PIX API" org.label-schema.vcs-ref=f6101e90bd6e78143db59068dc4c90028a43c035 org.label-schema.vcs-url=git@github.com:yvesmatos13/first-api-pix.git
EXPOSE 8080 8778 9779
COPY /deployments /deployments/
