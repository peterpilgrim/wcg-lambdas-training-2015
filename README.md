# Java SE 8 Kata for White Clarke Group  

By Peter Pilgrim

Friday, 25th September 2015


## Download Oracle JDK 8

Download the [Oracle JDK 8](http://java.oracle.com/) for your workstation (JDK 8 u 60 or better )


## IDE

In order to avoid messing around and getting a conflict, use an appropriate IDE like *IDEA*, *Eclipse* or *NetBeans* and point it to the JDK 8.
You can write JDK 8 in the workspace and avoid affecting the WCG source code for daily work

                 
## The Katas
  
There are at least 3 *Katas*, which are organised loosely as unit tests. As a student just start with the Kata 01 and 
complete the unit test one by one and then move to the next one. We learn by doing, and learn by completing the tasks.


So now go on ...

"With the left hand, wax on, and on the right hand, wax off"

"Wax on, Wax off"



# Windows Installation

On WCG, you can set up two or maybe three environmental variables.

Java SE 6:

    JAVA6_HOME = C:\Program Files\Java\jdk1.6.0_44


Java SE 7:

    JAVA7_HOME = C:\Program Files\Java\jdk1.7.0_51


Java SE 8:

    JAVA8_HOME = C:\Program Files\Java\jdk1.6.8_60
    
    
    
Then write a couple of DOS Shell Scripts to switch between environments, when you open a brand new *Terminal*.

Here is the DOS batch command called GOJAVA8.BAT:
    
    @ECHO OFF
    @REM Filename: GOJAVA8.BAT
    @ECHO Switching to Java SE 8 Home    
    set JAVA_HOME=%JAVA8_HOME%
    set PATH=%JAVA_HOME\bin;%JAVA_HOME\bin:%PATH%


Here is the DOS batch command called GOJAVA7.BAT:
    
    @ECHO OFF
    @REM Filename: GOJAVA7.BAT
    @ECHO Switching to Java SE 7 Home    
    set JAVA_HOME=%JAVA7_HOME%
    set PATH=%JAVA_HOME\bin;%JAVA_HOME\bin:%PATH%



The End.
