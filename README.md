
# COMMERCEHUB: FULL STACK E-COMMERCE SOLUTION

A full-stack eCommerce application built with React, Redux and Spring Boot. The project aims to provide users with a seamless online shopping experience, featuring a responsive and user-friendly interface, a wide range of products, and secure payment options.

## API Reference

#### User Sign In
```http
    POST http://localhost:8082/auth/signin
```
#### Create Products
```http
    POST http://localhost:8082/api/admin/products/creates
```
#### Add to Cart
```http
    POST http://localhost:8082/api/cart/add
```    
#### Order History
```http
    GET http://localhost:8082/api/orders/user
```
#### Update Cart Item
```http
  PUT http://localhost:8082/api/cart_items/7
```
#### Create Payment Link
```http
  POST http://localhost:8082/api/payments/
```

## Features
- User registration and authentication.
- Browse through a variety of products in different categories.
- Add products to the cart and manage cart items.
- Checkout process with various payment options.
- Order history and tracking.
- Admin panel to manage products, categories, and orders.

## Usage
1. Start the frontend application: `npm start`
2. Start the backend server:
3. Access the application at `http://localhost:3000` in your web browser.

## Demo
![image](https://github.com/user-attachments/assets/a191aeaf-df40-4fdb-86c0-20783ba03338)

![image](https://github.com/user-attachments/assets/1975b31e-fbf6-4ed6-8319-41dd1ec81a69)

![image](https://github.com/user-attachments/assets/3cc6a2aa-1e6c-4b49-8844-4788860017cf)

![image](https://github.com/user-attachments/assets/d776e873-38b4-45ec-825c-0310157d8182)

![image](https://github.com/user-attachments/assets/dc7ffb0e-e2b0-4206-9215-ba5cda7a0106)

![image](https://github.com/user-attachments/assets/b394718b-f290-48bd-8f10-1fd56d9bb008)
