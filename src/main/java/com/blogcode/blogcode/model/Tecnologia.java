package com.blogcode.blogcode.model;

public enum Tecnologia {

	JAVA("Java"),
	PYTHON("Python"),
	JAVASCRIPT("Javascript"),
	NODEJS("NodeJs"),
	HTML5("Html5"),
	CSS3("Css3"),
	BOOTSTRAP("Bootstrap"),
	REACT("React"),
	BACKLOG("Backlog"),
	API("Api"),
	DESIGN("Design"),
	MYSQL("Mysql"),
	POSTGRESQL("Postgresql"),
	MONGODB("MongoDb"),
	AWS("Aws"),
	HEROKU("Heroku"),
	SCRUM("Scrum"),
	KANBAN("Kanban"),
	JIRA("Jira"),
	POWERBI("PowerBi"),
	HADOOP("Hadoop");
	
	private String tecnologia;

	private Tecnologia (String tecnologia) {
		this.tecnologia = tecnologia;
	}	
}