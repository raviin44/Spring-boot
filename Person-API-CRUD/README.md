1.  Download the Code form the GitHub URL :  https://github.com/raviin44/Spring-boot.git

2.  Dowloand as ZIP folder

3.  Unzip the Folder and Import as Maven project as "Person-API-CRUD".

4.  Fisrt of all, we need to use the endpoint url to Authenitacte the APIs by using using POST Method through the Postman software.

    

    POST Method ->  http://localhost:8080/authenticate
   
     {
	 "userName" : "ravi",
	 "password" : "pass"
	 }
	 
	 Further, it will create a JSON response. We need to copy it (JSON response ) and use it for other API by
	 putting the details in Header Tab
	 Header -> Select Key : "Authorization  ; Value : "Bearer" then space and paste the JSON response
	 
	 eg. Authorization : Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJyYXZpIiwiZXhwIjoxNjE0NTc0NjI0LCJpYXQiOjE2MTQ1Mzg2MjR9.a9jOjYOH7JLLiG_HgwnDbkX4pBJ_62YXU0EDRS-F9B4
	 
5. Then use the different endpoint URL for Insert, Retrieve, Upadate and Delete employee based on diferent HTTP Method with endpoint URL :

  a) Add Person using "POST" Method ; ENDPOINT_URL = http://localhost:8080/api/persons
   
   eg. 
		[
		{
		"first_name": "John",
		"last_name": "Keynes",
		"age": "29",
		"favourite_colour": "red"
		},
		{
		"first_name": "Sarah",
		"last_name": "Robinson",
		"age": "54",
		"favourite_colour": "blue"
		}
		]
		
	b) Add one Person using "POST" Method ; ENDPOINT_URL = http://localhost:8080/api/person
   
   eg. 
		{
		"first_name": "Sarah",
		"last_name": "Robinson",
		"age": "54",
		"favourite_colour": "blue"
		}
		

   c) Get Person using "GET" Method ; ENDPOINT_URL = http://localhost:8080/api/persons
   
   d) Get Person by ID using "GET" Method ; ENDPOINT_URL =  http://localhost:8080/api/person/{id}
   
   e) Update Person by ID using "PUT" Method ; ENDPOINT_URL =  http://localhost:8080/api/person/{id}
   
     eg. 
		{
		"first_name": "Sarah",
		"last_name": "Robinson",
		"age": "54",
		"favourite_colour": "blue"
		}
		
   
   
   f) Delete Person by ID using "DELETE" Method ; ENDPOINT_URL =  http://localhost:8080/api/person/{id}
   
