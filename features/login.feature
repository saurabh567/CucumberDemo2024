Feature: clicking on the different links of Automationexcercise website 


Scenario: navigating the automation practice website 
	Given Navigate to the URL 
	When click on the Home item  link 
	Then click on the view product button 
	And click on the Add to cart button 
	
	
Scenario Outline: Login into application with different username and passwords 
	Given Navigate to the URL 
	When click on the login button of the homepage
	When Enter the "<username>" and "<password>" 
	Then click on the login button 
	
	Examples:
	|username               |password  |
	|krsaurabh567@gmail.com |12345678  |
	|krsaurabh5671@gmail.com|123456789 |
	|krsaurabh5672@gmail.com|0123456789|
	
	# This is my subbranch