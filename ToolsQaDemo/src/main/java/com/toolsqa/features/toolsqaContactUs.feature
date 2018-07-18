Feature: ToolsQA Contact Us Feature 

Scenario: Enter the data in Contact Us Form 

	Given user opens browser 
	Then validate Toolsqa home page title 
	Then user clicks on About link 
	Then validate Contact Us page title 
	Then user enters the details in Contact Us Page 
	Then Close the browser 
	
	
Scenario: Passing empty values into contact us and click on send message 

	Given user opens browser 
	Then validate Toolsqa home page title 
	Then user clicks on About link 
	Then validate Contact Us page title 
	Then user directly clicks on send message button in Contact Us Page 
	Then Close the browser 
	
Scenario Outline: Enter multiple sets of data in Contact Us Form 

	Given user opens browser 
	Then validate Toolsqa home page title 
	Then user clicks on About link 
	Then validate Contact Us page title 
	Then user enters "<name>","<email>" and "<message>" in Contact Us Page 
	Then Close the browser 
	
	Examples: 
		| name | email | message |
		| pavan | test1pavan@gmail.com | i want to know more about tools qa |
		| kiran | test1kiran@gmail.com | i want to know more about toolsqa  |
		| tarun | test1tarun@gmail.com | i want to know more about toolsqa  |
