package practiseTasks.day_1to_8;

public class BrowserWithSwitchCase {
    public static void main(String[] args) {

        /* write a program  the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser

        	Do Not use if statement or ternary*/

String browserName="chrome";
switch (browserName){
    case "chrome":

    case "firefox":

    case "opera":

    case "safari":

    case "edge":

    default:
        System.out.println("Invalid Browser");
}
    }
}
