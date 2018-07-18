$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Pavan/git/ToolsQaDemo/src/main/java/com/toolsqa/features/toolsqaContactUs.feature");
formatter.feature({
  "line": 1,
  "name": "ToolsQA Contact Us Feature",
  "description": "",
  "id": "toolsqa-contact-us-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#Scenario: Enter the data in Contact Us Form"
    },
    {
      "line": 4,
      "value": "#"
    },
    {
      "line": 5,
      "value": "#\tGiven user opens browser"
    },
    {
      "line": 6,
      "value": "#\tThen validate Toolsqa home page title"
    },
    {
      "line": 7,
      "value": "#\tThen user clicks on About link"
    },
    {
      "line": 8,
      "value": "#\tThen validate Contact Us page title"
    },
    {
      "line": 9,
      "value": "#\tThen user enters the details in Contact Us Page"
    },
    {
      "line": 10,
      "value": "#\tThen Close the browser"
    }
  ],
  "line": 13,
  "name": "Passing empty values into contact us and click on send message",
  "description": "",
  "id": "toolsqa-contact-us-feature;passing-empty-values-into-contact-us-and-click-on-send-message",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "validate Toolsqa home page title",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user clicks on About link",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "validate Contact Us page title",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user directly clicks on send message button in Contact Us Page",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "ToolsQaContactUsPageSteps.user_opens_browser()"
});
formatter.result({
  "duration": 24783495457,
  "status": "passed"
});
formatter.match({
  "location": "ToolsQaContactUsPageSteps.validate_Toolsqa_home_page_title()"
});
formatter.result({
  "duration": 282628944,
  "status": "passed"
});
formatter.match({
  "location": "ToolsQaContactUsPageSteps.user_clicks_on_About_link()"
});
formatter.result({
  "duration": 2313364620,
  "status": "passed"
});
formatter.match({
  "location": "ToolsQaContactUsPageSteps.validate_Contact_Us_page_title()"
});
formatter.result({
  "duration": 5017577099,
  "status": "passed"
});
formatter.match({
  "location": "ToolsQaContactUsPageSteps.user_directly_clicks_on_send_message_button_Contact_Us_Page()"
});
formatter.result({
  "duration": 20916986681,
  "status": "passed"
});
formatter.match({
  "location": "ToolsQaContactUsPageSteps.close_the_browser()"
});
formatter.result({
  "duration": 2094819142,
  "status": "passed"
});
});