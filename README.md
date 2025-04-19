# EbsoniomSquare Supermarket Management System Software
EbsoniomSquare is a Java-based desktop application designed to streamline and manage the daily operations of a supermarket. It provides a secure, user-friendly interface to control product inflow and outflow, manage inventory, handle sales, and maintain customer and employee records. Developed using Object-Oriented Programming principles in Java and integrated with an MS-SQL Server database via JDBC, the system offers a reliable and efficient solution tailored for large retail stores.

#### Features 
- User Management: Custom roles and permissions for different levels of access (admin, employee).
- Secure Role-Based Access Control
- Customer Relationship Management: Manage customer data, interactions, and history.
- Store Management: Group products for easy customer search and categorization.
- Sales, Payment, Invoice, and Checkout Management: Secure processing of payments and generation of invoices.
- Dealer Management: Handling dealer information and their product deliveries.
- Reports and Statements: Generate reports on sales, inventory, and customer transactions.
- Offers and Rewards: Integration of promotional offers and reward systems for customers.
- Sales Return Management: Efficient handling of product returns and inventory adjustments.
- Database Integration: MS-SQL for secure data storage and integration.
- Multithreading Support: Handles multiple user tasks concurrently for better performance.
- User Roles & Security: Custom roles and permissions for employees and administrators.
- Inventory Management: Real-time updates and tracking of stock levels and product flow.
- Modular Codebase with OOP Principles (Encapsulation, Inheritance, Polymorphism)
- Interactive GUI developed using Java Swing

#### Technologies Used
- Java (Swing, JDBC)
- MS-SQL Server 2014
- MS-SQL JDBC Driver (8.2.2 for JRE8)
- Java Development Kit (JDK 8+)
- NetBeans or Eclipse IDE

#### Installation
- Clone the repository:
```
git clone https://github.com/your-username/ebsoniomsquare.git
```
- Import the project into your Java IDE (NetBeans or Eclipse).
- Import the database:
- Open MS-SQL Server Management Studio.
  Restore or run the provided EbsoniomSquare.sql file to create the database schema and tables.
  Configure the database connection in DBConnClass:

```
String dbUsername = "your_db_username";
String dbPassword = "your_db_password";
String dbName = "EbsoniomSquare";
```

- Run the application from the main class (build):
```
public static void main(String[] args)
```

#### Usage
Upon launching, users are prompted with a secure login screen. Based on assigned roles, different dashboards and features are accessible including:
- Registering new customers or employees
- Managing products and inventory
- Processing sales and generating invoices
- Handling product returns
- Viewing and updating records

Development Overview
The project followed a structured development approach across multiple weeks, including:
- Requirement analysis and proposal
- Database and GUI design
- Module development (Customer, Employee, Inventory, Checkout)
- Integration and testing
- Final report preparation and submission
