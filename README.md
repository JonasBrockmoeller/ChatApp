# ChatApp

## TODO:
- [ ] GUI
- [ ] Message Encryption
- [ ] Database / Log

## How to get started
### Start the Server
```
go to the ChatServer directory
1) javac ChatServer.java
2) java ChatServer 8989
```

### Start the Clients
```
go to the ChatClient directory
1) javac ChatClient.java
2) java ChatClient localhost 8989
3) repeat step 1 & 2 for the 2nd client
```
### Fix java.net.BindException: Address already in use
```
WINDOWS:
netstat -ano | findstr :yourPortNumber
taskkill /pid yourid /f

MAC:
Find pid: Terminal: lsof -i:<port>
Kill process Terminal: kill <pid>
```
