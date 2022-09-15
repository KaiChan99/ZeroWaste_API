# **Zero Waste API**

This API is designed to help users make the most of their leftover ingredients! 

## **Table of Contents**
<ul>
    <li>Project Overview </li>
    <li>Setup and Instruction for using the Project:</li>
    <li>Project Structure</li>
    <li>UML - Unified Modelling Language Diagram</li>
    <li>ERD's - Entity Relationship Diagram</li>
    <li>POJO's</li>
    <li>Full CRUD function</li>
</ul>


## **Project Overview**

This ZeroWaste API will allow you to discover different recipes based on the ingredients you already have at home. The API was created using Java, Springboot and Postman for testing. This was a collaborative project completed as part of the Bright Network Technology Academy Program. 


Other features also include:

**1. Create a user**. This is useful for storing recipes and switching to a different user. 

**2. Save your favourite recipes** to your user account to keep a recipe log for future use.

**3. Create your own recipes** and share your own contributions for other users to view.

**5. Update existing recipes** if you would like to make changes to a recipe you have created.

**4. Delete recipes** you have created previously if you no longer would like to keep them in the record.

**5. Filter recipes by number of calories** if you are more health consicous and would like recipes with less calories. The API allows users to set a precise calorie count for recipes that have lower calories per serving.

This API also has Full CRUD functionality, many to many relationships and derived queries for multiple endpoints.




## **Setup and Instructions for using the Project:**

1. Make sure that you have installed Java.

2. Clone this repository : git clone git@github.com:tio982/ZeroWaste_API.git

3. You can use Postman to access the API, if you don't have it you can download it. This will allow you to interact with the API using HTTP Queries on https://localhost:8080/{command insert here}



## **Project Structure**

### MVP

For the MVP, we wanted to create an API with full CRUD functionality involving 3 classes.







### UML - Unified Modelling Language Diagrams

MVP: 






## ERD's - Entity Relationship Diagram 



MVP:



## POJO's
POJO's (Plain Old Java Objects) has been utilised within this project. The table below contains the POJO's referenced along with their listed properties.

| POJO          |        TYPE        |
| --------------| -------------------|
| Ingredient    | Long id            |
|               | String name        |
|               |                    |
| Recipe        | Long id            |
|               | String name        |
|               | String description |
|               | double cookingTime |
|               | int servings       |
|               | String method      |
|               |                    |
| User          | Long id            |
|               | String name        |
|               |                    |


## **FULL CRUD function (Commands)**

Notes:

<ul>
    <li>Each class has full CRUD functionality and a number of filters.</li>
    <li>Derived queries are from "ZeroWasteAPI".</li>
</ul>

localhost:8080/...

| HTTP  Request Path           | Request Type | Description                            |
| ---------------------------- | ------------ | -------------------------------------- |
| .../ingredients              | GET          | Get All Ingredients Entries            |                      
| .../recipes                  | GET          | Get All Recioes Entries                |             
| .../users                    | GET          | Get All Users Entries                  |
| .../ingredients/{id}         | GET          | Get Ingredients by id                  |
| .../recipes/{id}             | GET          | Get Recipes by id                      |
| .../users/{id}               | GET          | Get Users by id                        |
| .../ingredients              | POST         | Post/Create Ingredients                |
| .../recipes                  | POST         | Post/Create Recipes                    |
| .../users                    | POST         | Post/Create Users                      |
| .../ingredients/{id}         | DELETE       | Delete Ingredients by id               |
| .../recipes/{id}             | DELETE       | Delete Recipes by id                   |
| .../users/{id}               | DELETE       | Delete Users by id                     |
| .../ingredients/{id}         | PATCH        | Update Ingredients by id               |
| .../recipes/{id}             | PATCH        | Update Recipes by id                   |
| .../users/{id}               | PATCH        | Update Users by id                     |
| .../ingredients/{id}/recipes | PATCH        | Update Recipes using Ingredients by id |
| .../recipes/{id}/ingredients | PATCH        | Update Ingredients using Recipes by id |
| .../recipes/{id}/users       | PATCH        | Update Users using Recipes by id       |
| .../users/{id}/recipes       | PATCH        | Update Recipes using Users by id       |
| .../ingredients?recipeName=  | GET          | Get Ingredients using Recipe name      |
| .../recipes?ingredientName=  | GET          | Get Recipes using Ingredient name      |
| .../recipes?userName=        | GET          | Get Recipes using User name            |    
| .../users?recipeName=        | GET          | Get Users using Recipe name            |


## **Tests**
The project involved two different forms of testing. These included a JUnit test and testing via Postman.
Unit testing: The JUnit test was used to test the behaviour of methods inside the classes that have been created by logically isolating the methods and derived queries. Examples can be found below. 



A couple of notes: 



## **Further Implementations and Extensions**

For our extensions we had many plans in mind, we completed many of them but we wanted to expand on these further, these are the extra extensions we had:


- We wanted to have vegetarian, gluten free, pescatarian and vegan options available for filtering

- We wanted to be able to filter the recipe by two ingredients and not just one ingredient

## **Acknowledgements**

A huge thanks to the trainers in the BNTA team, quite literally couldn't do it without you all.
