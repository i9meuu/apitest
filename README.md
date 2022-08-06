# apitest
git repository for pccth apitest

Prerequisite
1. Java 11 or above
2. Postgres 14.4.1

Installation Manual
1. Download and install OpenJDK11 or above
2. Download and install postgreSQL (https://www.postgresqltutorial.com/postgresql-getting-started/install-postgresql/)
3. Open SQL Shell tool and log in to database with infomation on step 2
4. Enter these commands and execute
    4.1. create database if not exists ssotest;
    4.2. create user ssodev with encrypted password 'sso2022ok';
    4.3. grant all privileges on database ssotest to ssodev;
5. Clone master branch
6. Open/Import this project to your IDE and resolve all dependencies
7. Now you are ready to run this project

Running and Testing
1. Run this project then SQL script will create required table if table not exists
2. Open http://localhost:8080/swagger-ui/index.html in browser
3. Browser will show this page
![image](https://user-images.githubusercontent.com/47107710/183253227-b90a014c-a2d9-41c1-a216-cfb010e073e8.png)

4. Expand sso-user-test-resource tab
![image](https://user-images.githubusercontent.com/47107710/183253330-a2ac0d79-d7c4-4d42-b0d8-03168df0340f.png)

5. Click Try it out button
![image](https://user-images.githubusercontent.com/47107710/183253401-c042299b-e104-4a45-927e-2214788a3fac.png)

6. insert below JSON request in Request body text area and click Execute button
    
{
      "ssoType": "SSOData",
      "systemId": "VATDEDEV",
      "systemName": "ระบบบันทึกข้อมูลภาษีมูลค่าเพิ่มทดสอบ)",
      "systemTransactions": "PRIV-010,PRIV-020,PRIV-040,PRIV-050",
      "systemPrivileges": "0|0|0|0",
      "systemUserGroup": "GRP-010,GRP-020,GRP-040",
      "systemLocationGroup": "CliC001",
      "userId": "WS233999",
      "userFullName": "ประสาท จันทร์อังคาร ",
      "userRdOfficeCode": "01000999",
      "userOfficeCode": "01001139",
      "clientLocation": "01001139",
      "locationMachineNumber": "CLI00000718-9999",
      "tokenId": "eyJzdWIiOiIxMjM0IiwiYXVkIjpbImFkbWluIl0sImlzcyI6Im1hc29uLm1ldGFtdWcubmV0IiwiZXhwIjoxNTc0NTEyNzY1LCJpYXQiOjE1NjY3MzY3NjUsImp0aSI6ImY3YmZlMzNmLTdiZjctNGViNC04ZTU5LTk5MTc5OWI1ZWI4YSJ9"
}

7. Response message will be shown below
![image](https://user-images.githubusercontent.com/47107710/183253803-00b5ee12-e3ca-489c-a3c0-eab299dd651e.png)

8. Enjoy Testing ;)

