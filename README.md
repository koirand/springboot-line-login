# springboot-line-login

LINE login with Springboot Sample

## Usage
- Replase clientId and clientSecret to yours.

/src/main/resources/application.properties
```
spring.security.oauth2.client.registration.line.clientId={Set your client id}
spring.security.oauth2.client.registration.line.clientSecret={Set your client secret}
```

- Start the application with mvn.
```
./mvnw spring-boot:run
```

