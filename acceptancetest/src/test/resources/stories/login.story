
Scenario: Login user

When the user opens the default page
And the user fills 'url' field with 'http://lab18:8080/chemistry-opencmis-server-inmemory-0.10.0/atom11'
And press 'Get repo list' button
And press 'Login' button
And clicks on element by './/*[@id='mainTab:treeForm:tree:2']/span/span[1]'
And clicks on element by './/*[@id='topMenuBarForm:settings']/span'
Then element id/name/className 'form:repo' has text 'Apache Chemistry OpenCMIS InMemory Repository'
