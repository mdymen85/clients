# Feign client as dependency

Three projects are here:
- authserver -> project that just return a token.
- apiserver -> server that call authserver to request a token, through feign library.
- feign -> a library that is a dependency in apiserver project.

![image](https://github.com/mdymen85/clients/blob/main/client.png)

apiserver has an endpoint that will use feign dependency to call authserver in order to request a token, with the following curl:

```
curl --location --request POST 'localhost:8084/api/v1/token'
```
