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
  
<h3>Get responses both in XML & Json format</h3>
  <ol>
    <li>Add <b>Jackson Dataformat XML</b> into pom.xml</li>
	<pre>
    	<code>
	&lt;dependency&gt;
            &lt;groupId&gt;com.fasterxml.jackson.dataformat&lt;/groupId&gt;
            &lt;artifactId&gt;jackson-dataformat-xml&lt;/artifactId&gt;
            &lt;version&gt;2.10.0&lt;/version&gt;
        &lt;/dependency&gt;
	</code>
  	</pre>
	
   <li>Add <b>produces</b> property which specifies json & xml format</li>
	<pre>
    	<code>
	@GetMapping(path="/blog", produces = { "application/json", "application/xml" })
	</code>
  	</pre>
    
   <li>Request can be made like this:</li>
	<pre>
    	<code>
	a) http://localhost:8085/blog.xml
	b) http://localhost:8085/blog.json
	c) http://localhost:8085/blog
	   providing a key-value pair into the request header like this:
	   Key = Accept, value = application/xml	
	</code>
  </ol>
<p></p>


<h3>Technolgy Used</h3>
	<ul>
		<li>JDK 1.8</li>
		<li>Spring Boot Starter Parent-1.5.9.RELEASE</li>
		<li>MySql 8.0.17</li>
	</ul>
  

