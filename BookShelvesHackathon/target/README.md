# Hackathon Project Requirements

# Display Bookshelves

# Problem Statement : Display Bookshelves

Display the name, price of
1. Bookshelves below Rs. 15000 
2. Including out of stock
3. Storage type should be open.
3. Take first 3 study chair details with highest recommendation
If more than one item with same price displayed, include that details as well.
(Suggested site: urbanladder.com  however you are free to use any other legitimate site)

# Detailed Description: Hackathon Ideas

1. Display the name & price of first 3 Bookshelves below Rs. 15000, with Storage type as open & exclude out of stock
2. From Collections, retrieve all sub-menu items under Being-At-home and store in a List; Display the same
3. Gift cards - choose "Birthday/Anniversay"; fill customize the gift card; fill from to details with  input valid.
(Suggested site: urbanladder.com  however you are free to use any other legitimate site)

# Key Automation Scope

Handling alert, drag & drop, search option
Extract menu items & store in collections
Navigating back to home page
Scrolling down in web page
Filling form (in different objects in web page)


# Selenium Automation Testing Project: Display Bookshelves
 
## Project Overview
This Selenium automation testing project focuses on automating tasks on *urbanladder.com
The primary objectives include capturing user information, navigating through the portal, verifying the presence of specific elements. 
The project uses various dependencies and libraries to facilitate automation.


## Project Structure

 
### 1. Dependencies
 
- *Apache POI*
  - Version: 5.2.2
  - Purpose: Used for reading and writing Excel files, facilitating data-driven testing.
 
- *TestNG*
  - Version: 7.8.0
  - Purpose: Framework for test automation that allows for parallel execution and flexible test configuration.
 
- *Extent Report*
  - Version: 5.1.1
  - Purpose: Generates interactive and detailed HTML reports to enhance test result analysis.
 
- *Selenium*
  - Version: 4.16.1
  - Purpose: Enables interaction with web elements, navigation, and form submission in the browser.
 
 
## Automation Test Flow
 
1. *Open urbanladder.com*
   - Navigate to the urbanladder.com.
 
 
2. *Click on  BookShelves on the Home Page*
   - Click on BookShelves .
 
3. *Capture the BookShelves*
   - Click on exclude out of stock items.
   - Filter Storage type as "open".
   - Caputre price of first 3 Bookshelves below Rs. 15000, and Tittle .
   
 
4. *Hover on Living text*
	   - Hover on Living page.
	   - Display all items of Being-At-Home in the Sub menu.
 
5. *Click on Click Gift Cards button*
   - Click on Gift Card Button and Navigate to Gift Cards Section .
   - Click on *Birthday/Anniversary Section.
 
6. *Set the Price of Gift Card*
   - Put a Amount of Money to add on Gift Card .
   - Select a Date for sending the Gift Card.
 
7. *Fill up the Form with valid Credentials*
   - Fill the form and put Invalid Credentials such as "Email".
   
 
## How to Run the Tests
 
1. *Open Eclipse IDE:*
   - Launch Eclipse IDE on your machine.
 
2. *Import Project:*
   - Select File -> Import from the menu.
   - Choose Existing Maven Projects and click Next.
   - Browse to the directory where you cloned the repository and select the project.
 
3. *Update Maven Project:*
   - Right-click on the project in the Project Explorer.
   - Choose Maven -> Update Project.
   - Click OK to update dependencies.
 
4. *Set Up Configuration:*
   - Open the src/test/resources/config.properties file.
   - Update any configuration parameters like browser type, URLs, etc., as needed.
 
5. *Run Test Suite:*
   - Locate the test suite file (e.g., src/test/java/TestSuite.java).
   - Right-click on the file and choose Run As -> TestNG Suite.
 
6. *View Reports:*
   - After execution, open the test-output folder.
   - Find the Extent Report HTML file (index.html) for detailed test reports.
 
## Author Information
 
- *Vishal Kumar*
 
## Disclaimer
 
This project is intended for educational and testing purposes only. The authors are not responsible for any unauthorized use or modification of the code. Use at your own risk.