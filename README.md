# ubl-server
UBL Document server for storing and modifying UBL xml documents.

## UBL server
The main idea with UBL server is to implement necessary UBL objects (e.g. Seller, Buyer, Order, Invoice etc.) as UBL JSON objects to database. Actual objects are java xml objects that can be accessed via SOAP web service methods - this projects is for this.
  
The project is build on Apache CXF so you should be able to create different kind of client side libraries for accessing the implemented web services. This incluedes also javascript client api for web applications.
  
The UBL object data (XML document) is stored to database both as XML and JSON. XML is for building documents and JSON is for query documents (e.g. in [Curvy rest api sql files](https://github.com/vnetcon/curvy)). 
  
In short UBL Server is a web application. The build process produces a war file that can be deployed to any java web app container (e.g. Tomcat). Our purpose is to use this beside [Curvy web apps](https://github.com/vnetcon/curvy).
