
1)Create a project from scratch with maven
	mvn archetype:generate -DgroupId=com.honeywell -DartifactId=localUsersApp -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
2)Convert to eclipse project from command line
	get into new maven project directory
	mvn eclipse:eclipse 
3)Import converted project into Eclipse IDE
	File->Import->General-Existing project into workspace->choose new project folder location
4)Create a resources folder	
	src/main/resources 
5)Add hibernate dependencies in pom.mxl 
	....
	<dependency>
    	<groupId>org.hibernate</groupId>
    	<artifactId>hibernate-core</artifactId>
    	<version>4.3.5.Final</version>
    </dependency>
    <dependency>
    	<groupId>mysql</groupId>
    	<artifactId>mysql-connector-java</artifactId>
    	<version>5.1.6</version>
    </dependency>
  </dependencies>
6)From command update maven dependencies for hibernate
	Change to the projects directory
	mvn install
7)Create src/main/resources/hibernate.cfg.xml
8)Add next lines in hibernate.cfg.xml
	<?xml version="1.0" encoding="utf-8"?>
		<!DOCTYPE hibernate-configuration SYSTEM 
		"http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd">

		<hibernate-configuration>
		   <session-factory>
		   <property name="hibernate.dialect">
			  org.hibernate.dialect.MySQLDialect
		   </property>
		   <property name="hibernate.connection.driver_class">
			  com.mysql.jdbc.Driver
		   </property>

		   <!-- Assume test is the database name -->
		   <property name="hibernate.connection.url">
			  jdbc:mysql://localhost/test
		   </property>
		   <property name="hibernate.connection.username">
			  root
		   </property>
		   <property name="hibernate.connection.password">
			  root123
		   </property>

		   <!-- List of XML mapping files -->
		   <!-- Next line no needed if you use annotations -->
		   <!-- mapping resource="localUsers.hbm.xml"/ -->

		</session-factory>
		</hibernate-configuration>
9)Create entities (classes with getters and setters no final)
10)Puedes utilizar en el resources el mapeo con el archivo nomTabla.hbm.cfg o utilizar annotations
       En este ejemplo solo coloco annotations y se colocan solo sobre las propiedades (pero es posible colocarlo en los metodos)
	   *Nota: que IDENTITY es import static, solo se utiliza GeneratedValue en caso de que 
  	    @Entity
		@Table(name= "localUsers")
		public class localUser {

				@Id
				@Column(nullable= false)
				private int idLocalUser;
				@Column(nullable= false)
				private String fname;
				@Column(nullable= false)
				private String lname;
						....
