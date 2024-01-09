# E-Commerce-Web-Site
This project is the backend part of an e-commerce website that allows users to add products to their cart and make payments, written in Spring Boot.

## Getting Started
Firstly, make sure you have the following requirements on your computer to run this project smoothly:

## Requirements
1. Java 20

## Dependencies
* Spring Data JDBC
* spring Data JPA
* Spring Web
* Spring Boot Devtools
* Lombok
* Swagger
* Model Mapper

## Project Installation
  1. ```sh
        git clone https://github.com/cdemir7/VKI_FinalProject.git
       ```
   
       Open the downloaded folder in IntelliJ IDEA.
       


        ```sh
          spring.datasource.url=jdbc:mysql://localhost:3306/VERITABANI_ADI
      
          spring.datasource.username=KULLANICI_ADI
      
          spring.datasource.password=PAROLA
        ```
       

           VERITABANI_ADI, KULLANICI_ADI ve PAROLA değerlerini projedeki
      ```sh
      src/main/resources/application.properties
      ```
      file located in the path mentioned above.

      6. In the database, create a database with the same name as specified in the application.properties file.

      7. Run the project from IntelliJ IDEA.
  
3. ## Usage
    1. ```sh
       http://localhost:8080/swagger-ui/index.html#/
       ```
      Open the above URL in a web browser. Here, you can perform CRUD operations.

# POSTMAN API PersitURL

## Product
 GET    : `localhost:8080/api/v1/products`
 
 POST   : `localhost:8080/api/v1/products`
 
 PUT    : `localhost:8080/api/v1/products/{id}`
 
 DELETE : `localhost:8080/api/v1/products/{id}`

## Cart
 GET    : `localhost:8080/api/v1/carts`
 
 POST   : `localhost:8080/api/v1/carts`
 
 PUT    : `localhost:8080/api/v1/carts/{id}`
 
 DELETE : `localhost:8080/api/v1/carts/{id}`

## Payment
 GET    : `localhost:8080/api/v1/payments`
 
 POST   : `localhost:8080/api/v1/payments`
 
 PUT    : `localhost:8080/api/v1/payments/{id}`
 
 DELETE : `localhost:8080/api/v1/payments/{id}`
 
## Category
 GET    : `localhost:8080/api/v1/categories`
 
 POST   : `localhost:8080/api/v1/categories`
 
 PUT    : `localhost:8080/api/v1/categories/{id}`
 
 DELETE : `localhost:8080/api/v1/categories/{id}`

---
---

# E-Commerce-Web-Site
Bu projede ürünleri sepete ekleyerek ödeme yapmayı sağlayan bir e-ticaret web sitesinin backend kısmı Spring Boot ile yazılmıştır.

## Başlarken
İlk olarak, bu projeyi bilgisayarınızda sorunsuz bir şekilde çalıştırmak için aşağıdaki gereksinimleri sahip olduğunuzdan emin olun:

## Gereksinimler
1. Java 20

## Bağımlılıklar
* Spring Data JDBC
* spring Data JPA
* Spring Web
* Spring Boot Devtools
* Lombok
* Swagger
* Model Mapper

## Proje Kurulumu
  1. ```sh
        git clone https://github.com/cdemir7/VKI_FinalProject.git
       ```
   
       İndirdiğiniz klasörü Intelij Idea'da açın.
       


        ```sh
          spring.datasource.url=jdbc:mysql://localhost:3306/VERITABANI_ADI
      
          spring.datasource.username=KULLANICI_ADI
      
          spring.datasource.password=PAROLA
        ```
       

           VERITABANI_ADI, KULLANICI_ADI ve PAROLA değerlerini projedeki
      ```sh
      src/main/resources/application.properties
      ```
      yolundaki application.properties dosyasında değiştirin.

      6. Veritabanında, application.properties dosyasındaki isimle aynı olacak şekilde veritabanı oluşturun.

      7. Intelij Idea'dan projeyi çalıştırın.
  
3. ## Kullanım
    1. ```sh
       http://localhost:8080/swagger-ui/index.html#/
       ```
       web tarayıcısında yukarıdaki URL'i açın. Burada CRUD işlemlerini gerçekleştirebilirsiniz.
