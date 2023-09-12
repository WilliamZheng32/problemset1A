
/**
 * Write a description of class MySolutions here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MySolutions {
    
    public void CelsiusToFahrenheit(){
        
        double celsius = 30;
        
        double fahrenheit = ((celsius * 9/5) + 32);
        
        System.out.print(celsius + "°C = "+fahrenheit+"°F");
        
    }
    
    public void ElapsedTime() {
        int hours = 12;
        int minutes = 0;
        int seconds = 0;
        double secondsinaday = 86400;
        int conversion = ((hours * 3600) + (minutes * 60) + seconds);
        double percentage = ((conversion/secondsinaday) * 100);
        
        System.out.println("The current time is "+ hours +":"+minutes+":"+seconds+".");
        System.out.println("It has been "+ conversion +" seconds since the day began");
        System.out.println("There are " + (secondsinaday - conversion) + " seconds left in the day.");
        System.out.println("The day is "+ percentage +"% done");
    }
    
    public void SecondsToHMS() {
        int numberofseconds = 5000;
        int hours = 5000/3600;
        int minutes = ((5000%3600)/60);
        int seconds = numberofseconds - ((hours * 3600) + (minutes * 60));
         
        System.out.print(numberofseconds +" seconds " +"="+ hours + " hours," + minutes + " minutes,"+ seconds + " seconds.");
    }

}
