# Geometric figures Java app 

## Author

Alberto Israel Cruz Galvan

## About

The objective of this project is to practice all POO topics and Java features studied from the beginning of this internship to one topic before be introduced to Maven technology (this project does not include Maven and Unitary Testing). 

## Topics implemented on this project
- POO principles
- Enumerates
- StringBuilder class
- String class
- File and FileWriter for managing files logic
- Implement exceptions
- Use some packages of java language such as (services, constants, domain, utils, abstracts, etc)


## Useful Links
These links were added because contains web pages related to some important theorical concepts that I applied in this project.
<div>
    <ul>
        <li>
            <a href="https://codejavu.blogspot.com/2014/05/ejemplo-look-and-feel-en-java.html">Look and feel theory (for GUI interface)</a>
        </li>
        <li>
            <a href="https://www.geeksforgeeks.org/enum-in-java/">ENUM in java</a>
        </li>
        <li>
            <a href="https://devs4j.com/2018/10/30/java-8-manejo-de-fechas-y-tiempo-localdate-localtime-y-localdatetime/">LocaDate Java 8 info</a>
        </li>
        <li>
            <a href="https://stackoverflow.com/questions/8693083/how-to-create-a-folder-in-the-root-directory-of-my-java-application">Creating a directory in the app's root path</a>
        </li>
        <li>
            <a href="https://www.tutorialspoint.com/determine-if-file-or-directory-exists-in-java#">Determine if a file/directory exists</a>
        </li>
        <li>
            <a href="https://www.w3schools.com/java/java_files_create.asp">FileWritter tutorial</a>
        </li> 
    </ul>
</div>

## Feedback
It was a good work. You kept things simple, what is very nice for maintainance. In addition, I can se that you got very well documented about user interfaces. I believe that the greatest downside in your work is validation, but in general, you did it very well!

### Good Things
- Using IMeasures to abstract shape measure implementations.
- Separation of concerns between components.
- Constants organization.
- File override alert.
- Use of enums for menu options and figure types

### Things to Improve
- Inputs for shape values were not validated.
- Same case for file selection inputs.
- It was clever to use recursive calls to guiInterface() instead of handling a main loop, but there were negative consequences due to this implementation. A clear example of this is the NullPointerException that appears at the end of the application, if you selected an incorrect shape option.
- Use of enums for path constants does not make sense
- Nice work with abstractions, but they can still be better. See TODO comments in GeometricFigure and Triangle.
- See all the TODO comments to find more areas to improve.

