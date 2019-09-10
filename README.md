# envoy-projeto-estacionamento

1- Cloning the project
```git clone git@github.com:jRaphaDev/envoy-projeto-estacionamento.git```

2- In project direcotry, install the dependencies
```cd envoy-projeto-estacionamento/ && mvn install```

3- Run the app at port: 8080
```mvn spring-boot:run -Dspring-boot.run.arguments=--server.port=8080```

4- Run the app at port: 8081
```mvn spring-boot:run -Dspring-boot.run.arguments=--server.port=8081```

5- Enter in proxy folder
```cd proxy/```

6- Run the Envoy setting the configuration file
```envoy --config-path envoy.yaml```

7- Test 
``` http://localhost:10000/v1/veiculos ```

=D 
