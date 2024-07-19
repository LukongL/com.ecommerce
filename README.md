# com.ecommerce

Package Structure
The project is organized into the following packages and classes:

com.ecommerce
Product: Represents an item in the e-commerce system.
Customer: Represents a customer and manages their shopping cart.
com.ecommerce.orders
Order: Represents an order placed by a customer.
Class Descriptions
ecommerceSystem
This is the main class that simulates the workflow of the e-commerce system. It creates and displays products, manages customer interactions, and processes orders.

Product
Represents a product with attributes such as:

productID: Unique identifier for the product.
name: Name of the product.
price: Price of the product.
description: Description of the product.
stockQuantity: Available stock of the product.
Customer
Represents a customer with attributes such as:

customerID: Unique identifier for the customer.
name: Customer's name.
email: Customer's email address.
phone: Customer's phone number.
address: Customer's address.
shoppingCart: Map of products and their quantities in the customer's shopping cart.
Order
Represents an order with attributes such as:

orderID: Unique identifier for the order.
customer: Customer who placed the order.
products: Map of products and their quantities in the order.
orderTotal: Total cost of the order.

How to Use
Clone the Repository: Clone the project repository to your local machine.
Compile the Code: Compile the Java classes using your preferred IDE or the command line.
Run the Program: Execute the ecommerceSystem class to run the simulation.

javac -d . Product.java Customer.java Order.java ecommerceSystem.java
java ecommerceSystem

Author
Liliane Lukong

License
This project is licensed under the MIT License.


