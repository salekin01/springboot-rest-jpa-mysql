<h2>springboot rest jpa mysql</h2>
A java SringBoot REST API application with Data JPA & MySql DB.

<h3>DB creation</h3>
  <pre>
    <code>
      CREATE DATABASE springboot_rest_jpa;
      USE springboot_rest_jpa;
      CREATE TABLE blog (
        id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
        title VARCHAR(500) NOT NULL,
        content VARCHAR(5000) NOT NULL
      );
    </code>
  </pre>
  
<h3>Technolgy Used</h3>
	<ul>
		<li>JDK 1.8</li>
		<li>Spring Boot Starter Parent-1.5.9.RELEASE</li>
		<li>MySql 8.0.17</li>
	</ul>
  

