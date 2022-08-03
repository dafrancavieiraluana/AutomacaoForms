Feature: Fill form

@Search

Scenario: As someone who wants to fill form
    When: I visit the homepage
    And: Enter Vehicle Data
    And: I fill the form   
    And: I select Make
    And: I select Model
    And: I enter Cylinder Capacity
    And: I enter Engine Perfomance
    And: I enter Date of Manufacture
    And: I select Number of Seats 
    And: I select Right Hand Drive 
    And: I select Number of Seats 
    And: I select Fuel Type
    And: I enter Payload 
    And: I enter Total Weight
    And: I enter List Price
    And: I enter License Plate Number 
    And: I enter Annual Mileage
    And: I click the button Next 
    And: Enter Insurance Data
    And: I enter Name 
    And: I enter Last Name 
    And: I enter Date of Birth 
    And: I select Gender 
    And: I enter Street Address
    And: I select Country
    And: I enter Zip Code
    And: I enter City
    And: I select Occupation
    And: I select Hobbies 
    And: I enter Website 
    And: I select file
    And: I click the button Next 
    And: Enter Product Data 
    And: I enter Start Date
    And: I select Insurance Sum
    And: I select Merit Rating
    And: I select Damage Insurance
    And: I select Optional Products 
    And: I select Couutesy Car
    And: I click the button Next 
    And: Enter Select Price Option
    And: I select Option 
    And: I select View Quote 
    And: I click the button Next 
    And: I enter Email
    And: I enter Phone 
    And: I enter Username
    And: I enter Password
    And: I enter Confirm Password
    And: I enter Comments
    And: I click the button Send
    Then: I should see a message: Sending e-mail success!
    
