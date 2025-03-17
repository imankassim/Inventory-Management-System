# Inventory Management System

This is an inventory management system which is accessed through the terminal. This can be used to create, update, read and delete customer information, order information and item information.


## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

Software needed:

Java Runtime Environment 17 (https://docs.oracle.com/goldengate/1212/gg-winux/GDRAD/java.htm#BGBFHBEA)

MySQL (https://dev.mysql.com/downloads/)

An IDE (I used Eclipse)



### Installing

- Install the JRE (Java Runtime Enviroment) onto your computer
- Install MySQL onto your computer - set username and password to root (if you have mySQL already with different login details you need to change these in src/main/resources/db.properties AND src/main/resources/db.properties
- Edit your system enviroment variables to add MySQL to your system - https://dev.mysql.com/doc/mysql-windows-excerpt/5.7/en/mysql-installation-windows-path.html
- Open your command line and run mySQL - "mysql -u root -p" (replace root with username if you have different details)
- In these files, navigate to src/main/resources and select sql-schema.sql
- Create the database from this file in your local enviroment
- Navigate to the target folder in your command line and open the ims-0.0.1.jar file

### Examples of what you can do

```
Welcome to the Inventory Management System!
Which entity would you like to use?
CUSTOMER: Information about customers
ITEM: Individual Items
ORDER: Purchases of items
STOP: To close the application
```

If you select any of CUSTOMER, ITEM or ORDER, you will then see (Customer example)

```
What would you like to do with customer:
CREATE: To save a new entity into the database
READ: To read an entity from the database
UPDATE: To change an entity already in the database
DELETE: To remove an entity from the database
RETURN: To return to domain selection
```

You will be given another chance if you enter something wrong

```
What would you like to do with customer:
CREATE: To save a new entity into the database
READ: To read an entity from the database
UPDATE: To change an entity already in the database
DELETE: To remove an entity from the database
RETURN: To return to domain selection
creagw
Invalid selection please try again
create
Please enter a first name
Harrt
Please enter a surname
Byejr
Customer created

```

End with an example of getting some data out of the system or using it for a little demo

## Running the tests

- Open the file in your IDE
- Right-click the src/test/java file and click Run As...
- Choose the JUnit option 

### Unit Tests 

The unit tests are used to test the CustomerDAO (Data Access Object), ItemDAO and OrderDAO classes, as well as the domain classes Customer, Item and Order to ensure they are runnning correctly.


### Integration Tests 

These tests are done using Mockito to avoid calling other methods to see whether the classes are functioning.
These tests are for the Controller methods

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Versioning

We use [SemVer](http://semver.org/) for versioning.

## Authors

* **Iman Kassim** 

## License

This project is licensed under the MIT license - see the [LICENSE.md](LICENSE.md) file for details 

*For help in [Choosing a license](https://choosealicense.com/)*

