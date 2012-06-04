# Backbone.js + Java Wine Cellar Application #

The original Wine Cellar application is documented [here](http://coenraets.org).

This application provides an example of 

1. Building a complete RESTful API in Java using JAX-RS and Jersey.
2. Consuming these services using Backbone.js client application

## Notes ##
Forked version of original wine cellar application. Modified to use:

1. [Maven](http://maven.apache.org/) for builds/dependency management
2. [H2](http://www.h2database.com/) as in-memory database
3. [Jetty](http://jetty.codehaus.org/) as runtime servlet container

*Includes some code from [sheenobu's](https://github.com/sheenobu) fork as well.*

## Run from Maven: ##

1. run 'mvn jetty:run'
2. open http://localhost:8080/backbone-jax-cellar

## View in Eclipse ##

1. run 'mvn eclipse:eclipse' to generate the eclipse project files
2. import the project into eclipse (inside Eclipse: File->Import->Existing Project into Workspace)

