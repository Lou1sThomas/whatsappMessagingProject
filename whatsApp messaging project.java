import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
public class grp37_assignment2 {
    public static void main(String args[]){
    
    int daysAgo = 10;//Testing was done with a variety of different values
    int width = 40;
    String yesterdayS = "Yesterday";//yesterday as a string than can be modified
    String over7S = "Some time ago..."; 
    /** ### should be calculated manually */
    LocalDate currentDate = LocalDate.now(); 
    LocalDate previousDay = currentDate.minusDays(daysAgo);
    //The following modified strings were made with the help of another student
    /** ### should be calculated manually */
    String dayOfWeek = previousDay.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
    /** ### should use printf */
    String over7Middle = String.format("%-" + width + "s", String.format("%" + (over7S.length() + (width - over7S.length()) / 2) + "s", over7S));
    String yesterdayMiddle = String.format("%-" + width + "s", String.format("%" + (yesterdayS.length() + (width - yesterdayS.length()) / 2) + "s", yesterdayS));
    String dayMiddle = String.format("%-" + width + "s", String.format("%" + (dayOfWeek.length() + (width - dayOfWeek.length()) / 2) + "s", dayOfWeek));
    
        String appuser = "tadhgaustin"; //Username of poster
        String user = System.getProperty("user.name"); //System username
        String message = ("If UL has a million fans, I am one of them."); //Message to be printed
        int length = (message.length()); //Length of message
        boolean compare = appuser.equals(user); //Check is username and system username are the same
        String first = (message.substring(0,(length/2))); 
        String second =(message.substring((length/2),(length)));
        int lengthfirst = (first.length());
        int lengthsecond = (second.length());
        String newfirst = ""; //empty strings to store modifed strings within if and for statements
        String newsecond = "";
        String newmessage = "";
        String formattedmessage = "";
    
    //if statement to decide what to print given to post date
    if(daysAgo==1){
        System.out.println(yesterdayMiddle);
    }else if(daysAgo>1 && daysAgo<=7){
        System.out.println(dayMiddle);
    }else if(daysAgo>7){
        System.out.println(over7Middle);
    }
    
        System.out.println("System Username: "+user);
        System.out.println("Whatsapp Username: "+appuser);  
        System.out.print("\n");
                 
            // much testing ws needed to cause the message to print with case and alignment as both were done in seperate printf statements originally
            if(length>=40){
                if (compare){
                    for(int i=0;i<lengthfirst;i++){
                        newfirst += (first.toLowerCase().charAt(i)); //Testing had to be done to correctly store the new string
            
                    }
                    for(int i=0;i<lengthsecond;i++){
                        newsecond += (second.toUpperCase().charAt(i));
                    }   
                        newmessage=newfirst+newsecond;
                        formattedmessage=String.format("%-"+width+"10s",newmessage);
                        System.out.println(formattedmessage);
                }else{
                    for(int i=0;i<lengthfirst;i++){
                        newfirst += (first.toUpperCase().charAt(i));
                    }
        
                    for(int i=0;i<lengthsecond;i++){
                        newsecond += (second.toLowerCase().charAt(i));
                    }
                        newmessage=newfirst+newsecond;
                        formattedmessage=String.format("%-"+width+"10s",newmessage);
                        System.out.println(formattedmessage);
                }   
            }else if(length<40){
                if (compare){
                    for(int i=0;i<lengthfirst;i++){
                        newfirst += (first.toLowerCase().charAt(i));
            
                    }
        
                    for(int i=0;i<lengthsecond;i++){
                        newsecond += (second.toUpperCase().charAt(i));
                    }
                        newmessage=newfirst+newsecond;
                        formattedmessage=String.format("%"+width+"s",newmessage);
                        System.out.println(formattedmessage);
                }else{
                    for(int i=0;i<lengthfirst;i++){
                        newfirst += (first.toUpperCase().charAt(i));
                    }
        
                    for(int i=0;i<lengthsecond;i++){
                        newsecond += (second.toLowerCase().charAt(i));
                    }
                        newmessage=newfirst+newsecond;
                        /** ### should use printf */
                        formattedmessage=String.format("%"+width+"s",newmessage);
                        System.out.println(formattedmessage);
                }
             }
            //These were also tested with varying message lengths and username combinations
        System.out.print("\n");
    
        //This was copied from the first assignment we submitted
    long startmillis = (long)(System.currentTimeMillis()); // Millis since jan 1st 1970
    long day = (long)(24*60*60*1000); // No. of millis in 1 day
    long midnight = (long)(startmillis % day); // No. of millis since midnight last night
    long seconds = (long) (midnight /1000); // No. of seconds since midnight last night
    long minutes = (long) (seconds /60); // No. of minutes since midnight last night
    int secs = (int) (seconds %60); // Seconds on the clock
    int mins = (int) (minutes %60); // Minutes on the clock
    int hours = (int) (minutes /60); // Hours on the clock
         
        // Converts integers to strings to add leading 0
        String hr = Integer.toString(hours); 
        String min = Integer.toString(mins);
        String sec = Integer.toString(secs);
        
            // Add a 0 in front of values when less than 10 (print as 09 instead of 9)
            /** ### should use printf */
    if (hours<10){
                    hr = "0" + Integer.toString(hours);
    }   
        if (mins<10){
                        min = "0" + Integer.toString(mins);
        }
            if (secs<10){
                            sec = "0" + Integer.toString(secs);
            }       
                System.out.println("Posted at: " + hr + ":" + min + ":" + sec);
    System.out.print("\n");
}
}
