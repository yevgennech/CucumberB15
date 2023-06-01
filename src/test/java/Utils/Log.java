package Utils;

import org.apache.log4j.*;

public class Log {

    public static Logger log = Logger.getLogger(Log.class.getName());

    // When the test starts, I should print the logs
    // When the test stops, I should print the logs
    // If I want to print any message in between,  I should print the logs

    public static void startTestCase(String testCaseName) {

        log.info("*******************************************************");
        log.info("********************************************************");
        log.info("******************"+ testCaseName + "*******************");
    }

    public static void endTestCase(String testCaseName) {
        log.info("########################################################");
        log.info("########################################################");
        log.info("###################"+ testCaseName + "###################");

    }

    public  static void  info(String message)
    {
        log.info(message);
    }

    public  static void warning(String warning)
    {
        log.info(warning);
    }

    //+++++++++++++++++MAVEN LIFECYCLE++++++++++++++++++++++++++++++++

    // This consists several phases
    // clean: removes all the files by the previous build (clean target folder)
    // validate: checks if project is correct and all the necessary information is available
    // compile: compile the source code of the project
    // test: runs the tests for the project (clean, validate and compile is included)
    // package: packages the compiled code into a distributable format (such as JAR or WAR files)
    // verify: runs and checks on results of integration tests to ensure the quality criteria is met
    // install: installs the packages into local repository
    // site: generates documentation for the project
    // deploy: copies the final package to remote repository for sharing with other developers

}