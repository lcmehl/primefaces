# primefaces
Project using spring data, java, hibernate, JSF, primefaces

How to get project, configure and run on local Tomcat 7

To run the project locally, you're going to need eclipsewith tomcat 7, maven installed.

***I'm using eclipse for this tutorial, but you can use any IDE of your preference.***

1. Access the link to the project on GitHub.com by accessing the link:

2. Create a local repository and download the project JavaFullStack

3. On eclipse, create a new dinamic web project and set its root directory folder as the java-full-stack project
from the local repository you just created.

4. From within eclipse, convert the project into a maven project.

5. Using your operational system's command line, go to your java-full-stack project root folder, and run "mvn eclipse:eclipe"
(this will download all the project's dependencies declared on your .pom file).

5.1***If not configured automatically, on clipse select your project's properties and set its compiler to java 8.

6. Create a tomcat 7 server to deploy your application.

7. Test the application.


****Considerations****

  I'm new to primefaces and spring data, as well as configuring the whole project with java anotations only. The project in the way it is, is still missing a lot from the requested in the test, but it is what I could do in about 8 hours of work, through research.

  I had not the time to finish, to put the REST endpoit, finish configurating the tests so they could run using spring data context, and adding JMS. There are a lot of validations that could be done inside the service classes, when deleting, adding and updating records.
we can use the spring data annotations to ensure that when we delete a department, we delete all the users "inside" it. 

  My idea was to create one screen for each model, to add, list, update and delete, all operations in one screen. On the department screen we could create a table containing the users whitin the selected department that would be deleted as well, if the department was to be deleted. As for the structure for the .xhtml files, yeah I know it could be better, but for some reason that was the only way I could access the screens.

  As for Jboss, I think it's basically the same as with Tomcat, the difference is adding the jar dependencies into the server. Using tomcat we acces project assembly from within eclipse and add the libraries there. Using jboss I think we would need to add the jars into a Jboss module.xml file.

  Well, I hope this is satisfying enough for you guys at Volvo, I appreciate the opportunity and would like to show you guys my whole potential on a day to day basis. Regardless of your decision of hiring me or not, this was a good learning experience, and I will continue working on upgrading this application for learning purposes, and of course, for fun heh. Thank You.
