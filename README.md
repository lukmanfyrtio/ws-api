# ws-api

#Table


## Getting Ready
Clone the repo and follow the instructions. You can view each step by running these commands from the terminal.
1. This app required to install JAVA 11  and maven 
2. cd to directory and 
```shell 
    mvn spring-boot:run
```

## API
- Register

`POST localhost:8081/v1/ws/integration/register`
```shell
curl -X POST \
  http://localhost:8081/v1/ws/integration/register \
  -H 'Content-Type: application/json' \
  -d '{
    "name":"Lukman Lukman",
    "email":"lukman1234@gmail.com",
    "password":"ciamis2023"
  }'

   ```

Response
```shell
HTTP/1.1 200 OK
connection: keep-alive
content-length: 145
content-type: application/json; charset=utf-8
date: Wed, 30 Nov 2022 17:05:10 GMT
etag: W/"91-4pzFBHS9G0og0NJyyNVvwCfjaWI"
keep-alive: timeout=5
x-powered-by: Express

{
    "message": "Success",
    "status": "ok",
    "data": {
        "data": {
            "name": "Lukman Lukman",
            "email": "lukman1234@gmail.com",
            "id": 1217,
            "updated_at": "2023-02-21T20:30:29.000000Z",
            "created_at": "2023-02-21T20:30:29.000000Z"
        },
        "access_token": "86|40aCpSQPstqv2VekBOfLjzK5hsprpUVoieUq7NeH",
        "token_type": "Bearer"
    }
}
   ```
- Login
`localhost:8081/v1/ws/integration/login`
```shell
curl -X POST \
  http://localhost:8081/v1/ws/integration/login \
  -H 'Content-Type: application/json' \
  -d '{
    "email":"lukman@gmail.com",
    "password":"ciamis20231"
  }'

   ```

Response
```shell
HTTP/1.1 200 OK
connection: keep-alive
content-length: 102
content-type: application/json; charset=utf-8
date: Wed, 30 Nov 2022 17:08:39 GMT
etag: W/"66-vrHc2k4WkpFdJ/Mt+ul2P14ZaFc"
keep-alive: timeout=5
x-powered-by: Express

{
    "message": "Success",
    "status": "ok",
    "data": {
        "access_token": "96|qkWsmuDGBuQ7UuATWherY1lA7AaDx9TIdA3xJC2E",
        "message": "Welcome to WSAPI"
    }
}
   ```

- Validate License
`POST localhost:8081/v1/ws/integration/validate-license`
```shell
curl -X POST \
  http://localhost:8081/v1/ws/integration/validate-license \
  -H 'Content-Type: application/json' \
  -d '{
     "email": "user@test.com",
     "license":"EyQTf9NI"
   }'
}'
   ```

Response
```shell
HTTP/1.1 200 OK
connection: keep-alive
content-length: 115
content-type: application/json; charset=utf-8
date: Wed, 30 Nov 2022 17:11:28 GMT
etag: W/"73-UDM+LCdQmIj25fUBjO8AA76qWik"
keep-alive: timeout=5
x-powered-by: Express

{
    "plan": "subscription",
    "message": "please renew your plan ,your plan will be ended in 2 days",
    "status": "expiring",
    "expiredDate": "25 February 2023 1:6:32"
}
   ```

Some example test result 
- Register 
![image](https://user-images.githubusercontent.com/48387814/220464037-edf20c53-58dc-4fc2-b747-0a9ce88bed48.png)
![image](https://user-images.githubusercontent.com/48387814/220464148-8e3d3bc1-9f41-4614-afb5-8573a38a6507.png)

- Login 
![image](https://user-images.githubusercontent.com/48387814/220464209-d147e9a4-db05-43e8-b34a-936d43f1bcae.png)

- Validate License
![image](https://user-images.githubusercontent.com/48387814/220464276-6737ac0e-1bf3-407c-a167-ef38ce741a94.png)
![image](https://user-images.githubusercontent.com/48387814/220464325-ad59cc48-b2ea-4ade-b5e9-03a6584ce505.png)



