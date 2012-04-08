################################################################################
Scala-GWT Maven Hello World
################################################################################

This project is a quick example of how to get scalagwt working with maven.

Until official versions are released into the wild you'll have to be building them yourself. This tutorial assumes you have sufficient experience to configure  and build the projects already.

scalagwt-scala:
===============

1. Remove all <scaladoc> tags in build.xml (might be optional for you, but was not for me)
2. ant distpack maven
3. cd dists/maven/latest
4. ant deploy.local

scalagwt-gwt:
=============

1. ant dist-dev
2. maven/push_gwt.sh
3. Even though it's misleading, I recommend that if you're installing to a local repository that you use a version that does not include "SNAPSHOT". If you do it installs the files as they should be for a remote repository (which differs from a local one). If you do include "SNAPSHOT" be prepared to rename or symbolically link files to where maven will look for them.

scalagwt-library:
=================

1. ant
2. Install it locally: mvn install:install-file -DgeneratePom -Dfile=build/lib/scala-library-gwt.jar -DgroupId=org.scala-lang -DartifactId=scala-library-gwt -Dversion=2.10.0-scalagwt-SNAPSHOT -Dpackaging=jar


Unknowns and Caveats:
=====================

1. The gwt compiler complains about us depending on gwt-dev. However, the plugin was picking up the wrong version if we don't explicitly state it.
2. IntelliJ's hosted mode partially works. You need to generate the jribble (i.e. run mvn compile) before kicking off hosted mode. But from what I could tell breakpoints and the expression evaluation tool both work.
