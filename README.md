# SeleniumGriDPractice
as the name suggests


**SetUp:**
Go to AWS and create an EC2 server with docker support

Remove java 1.7
`sudo yum remove java -y`

Install Java 1.8
`sudo yum install java-1.8.0-openjdk -y`

create docker-compose file ---->. `touch docker-compose.yml`
and paste teh grid setup from https://github.com/SeleniumHQ/docker-selenium/tree/selenium-3

then run compose file `docker-compose up -d`

go to ur instance and see GRID Console -> publicIP:4444

**To SCale up**

docker-compose scale chrome=3

docker-compose scale firefox=3
