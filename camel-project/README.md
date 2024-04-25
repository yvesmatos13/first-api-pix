# Camel based implementation of the _PIX API_ API

## API Description ##
API de integração da chave de endereçamento do PIX

### Building

    mvn clean package

### Running Locally

    mvn spring-boot:run

Getting the API docs:

    curl http://localhost:8080/openapi.json

## Running on OpenShift

    mvn oc:deploy

You can expose the service externally using the following command:

    oc expose svc pix-api

And then you can access it's OpenAPI docs hosted by the service at:

    curl -s http://$(oc get route pix-api --template={{.spec.host}})/openapi.json

