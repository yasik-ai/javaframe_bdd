Feature: As a user I wante to perform login and logout operations on Farnell UI application


Background: User is logged In
		Given User launch browser and navigate to Farnell "https://stackoverflow.com/" site
		When User verify and accepts cookies on the page
		Then User landed on Farnell Home Page

	Scenario Outline: As a user I want to register on Farnell Site
		Given User launch browser and navigate to Farnell "https://stackoverflow.com/" site
		
		And User clicks on Register button on home page
		When User enters "<UserName>" and "<Password>" on register page
		And User enters "<FullName>" and "<Email>" on register page
		And User clicks on Register button 
		Then User should register successfully on Farnell application
		
		Examples:
			| UserName | Password | FullName | Email |
			| username | password | fullname | email |
			
			
		





