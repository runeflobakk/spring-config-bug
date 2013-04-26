spring-config-bug
=================

There seems to be a bug in Spring (3.2.2.RELEASE and earlier at time of writing) occuring when using a certain combination of both Javaconfig and XML to configure the application context.

Issue registered at Springsource: https://jira.springsource.org/browse/SPR-10496


## Configuration

Application context is configured using 3 constituents:
 - main
 - in-between
 - leaf

_Main_ imports _in-between_, which imports _leaf_. The only bean is defined in _leaf_, a simple String.



## This works:

**main.xml -> in-between.xml -> Leaf.java**

Works fine, and I am able to retrieve the bean defined in **Leaf.java**.


## This fails:

**Main.java -> in-between.xml -> Leaf.java**

Using Javaconfig as the "top node" of the configuration graph seems to disable the ability of imported XML configuration to import Javaconfig using the ```<bean class="..">``` tag. The included JUnit test cases demonstrates this.
