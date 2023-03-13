# Library

<p align="center">
  <img src=https://user-images.githubusercontent.com/95872501/224155098-59ee106a-10cd-4189-a830-e957db28003c.png>
</p>

Library groups common objects that will be shared by the repository manager, Nexus.

Please go to [Mediscreen](https://github.com/HashTucE/Mediscreen.git) to learn more about this project.

# Prerequisites
- Java 19
- Maven 4.0.0
- Spring Boot 3.0.2

# Configuration of Nexus

1. Install [Nexus](https://help.sonatype.com/repomanager3/installation-and-upgrades/installation-methods).
I recommend you to install it with [his](https://hub.docker.com/r/sonatype/nexus3/) Docker image.
2. Keep in mind that on your local machine the port 8081 will be used with Patient so when installing Nexus, bind the port like this 8084:8081. Once installed and ran, click on the port as you can see below or go to http://localhost:8084 to be redirected to the Nexus interface user :
<p align="center">
  <img src=https://user-images.githubusercontent.com/95872501/224268285-bc76f6de-5481-49a2-b50c-66041ea6a6f6.png>
</p>

3. The first time you will sign in, you will be invit to change your admin password. Your credentials should be username : "admin" and password : "admin123" but it depends of your version of nexus so if it won't work, this command should show you the intitial password replacing ??? by the id of the nexus container as you can see above :
    ```
    docker exec -it ??? cat /nexus-data/admin.password 
    ```
    
4. If it not exists, you will have to create a file named settings.xml on you maven configuration hidden folder ".m2". As you can see for this project I am using the already existing "maven-snapshots" (hosted) repository, so you will just have to set your appropriate Nexus's username and password :

        <settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0
                            https://maven.apache.org/xsd/settings-1.0.0.xsd">
        <servers>
          <server>
            <id>maven-snapshots</id>
            <username>admin</username>
            <password>pass</password>
          </server>
        </servers>

        </settings>

    
# Deployment of Library to Nexus

- Go to the root of "Library" with a prompt and run the command :
    ```
    mvn deploy
    ```
    And you should now see your .jar inside the repository "maven-snapshots" on your Nexus interface.
