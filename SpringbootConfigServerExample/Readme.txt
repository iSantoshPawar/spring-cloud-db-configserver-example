This given example is solution for spring cloud config server and client application

where the properties are sitting in DB instead of git/svn url or file location

1. Please run the db(oracle) script from parent directory configProperty.sql
2. Run the insert script loadProperty.sql
3. Run the Server and try following URL
http://localhost:8888/santosh/development/latest/
4. Run the Client try the following URL
http://localhost:8080/key 1


Above client url will provide the value for the key - key 1 which is configured in db.