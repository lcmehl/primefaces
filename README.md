# primefaces
Project using spring data, java, hibernate, JSF, primefaces

How to get project, configure and run on local Tomcat 7

To run the project locally, you're going to need eclipsewith tomcat 7, maven installed.

***I'm using eclipse for this tutorial, but you can use any IDE of your preference.***

1. Access the link to the project on GitHub.com by accessing the link:

2. Create a local repository and download the project JavaFullStack

3. On eclipse, create a new dinamic web project and set its root directory folder as the java-full-stack project
from the local repository you just created.

4. Using your operational system's command line, go to your java-full-stack project root folder, and run "mvn eclipse:eclipe"
(this will configure the project and set it as a maven project on your IDE, as long as downloading all the
project's dependencies declared on your .pom file).

4.1***If not configured automatically, on clipse select your project's properties and set its compiler to java 8.
