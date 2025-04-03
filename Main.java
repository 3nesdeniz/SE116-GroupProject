import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
    public static void printingjob(){
        Job job1 = new Job();
        job1.setJob_ID("J1");
        ArrayList<Job> joblist = new ArrayList<>();
        Tasks task1 = new Tasks("T1",3);
        Tasks task2 = new Tasks("T2",4);
        Tasks task3 = new Tasks("T3",8);
        Tasks task4 = new Tasks("T4",1);
        Tasks task5 = new Tasks("T5",9);
        ArrayList<Tasks> tasklist = new ArrayList<>();
        tasklist.add(task1);
        joblist.add(job1);
        
    String text = "T1 T2 3 T3 T4 4 T5 -3 T1 2 T2 3 T3 T4 5";
    String patternStr = "([T][1](?:\\s(?:-?\\d{1,3}))?)\\s?([T][2](?:\\s(?:-?\\d{1,3}))?)?\\s?([T][3](?:\\s(?:-?\\d{1,3}))?)?\\s?"
                    + "([T][4](?:\\s(?:-?\\d{1,3}))?)?\\s?([T][5](?:\\s(?:-?\\d{1,3}))?)?\\s?([T][1](?:\\s(?:-?\\d{1,3}))?)?"
            + "\\s?([T][2](?:\\s(?:-?\\d{1,3}))?)?\\s?\\s?([T][3](?:\\s(?:-?\\d{1,3}))?)?\\s?\\s?([T][4](?:\\s(?:-?\\d{1,3}))?)?\\s?"
            + "\\s?([T][5](?:\\s(?:-?\\d{1,3}))?)?\\s?";
        String firstPart = "";
        String secondPart ="";
        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            System.out.println("Match found: " + matcher.group());
            int firstIndex = text.indexOf("T1");//until it founds T1 it returns -1
            if (firstIndex != -1) {
                int secondIndex = text.indexOf("T1", firstIndex + 1);
                if (secondIndex != -1) {
                    firstPart = text.substring(0, secondIndex);
                    secondPart = text.substring(secondIndex);
                    System.out.println("First part: " + firstPart);
                    System.out.println("Second part: " + secondPart);
            }   else {
                    firstIndex = text.indexOf("T2");//until it founds T1 it returns -1
                    if (firstIndex != -1) {
                         secondIndex = text.indexOf("T2", firstIndex + 1);
                        if (secondIndex != -1) {
                            firstPart = text.substring(0, secondIndex);
                            secondPart = text.substring(secondIndex);
                            System.out.println("First part: " + firstPart);
                            System.out.println("Second part: " + secondPart);
                    }   else {
                            firstIndex = text.indexOf("T3");//until it founds T1 it returns -1
                            if (firstIndex != -1) {
                                secondIndex = text.indexOf("T3", firstIndex + 1);
                                if (secondIndex != -1) {
                                    firstPart = text.substring(0, secondIndex);
                                    secondPart = text.substring(secondIndex);
                                    System.out.println("First part: " + firstPart);
                                    System.out.println("Second part: " + secondPart);
                            }   else {
                                    firstIndex = text.indexOf("T4");//until it founds T1 it returns -1
                                    if (firstIndex != -1) {
                                        secondIndex = text.indexOf("T4", firstIndex + 1);
                                        if (secondIndex != -1) {
                                            firstPart = text.substring(0, secondIndex);
                                            secondPart = text.substring(secondIndex);
                                            System.out.println("First part: " + firstPart);
                                            System.out.println("Second part: " + secondPart);
                                    }   else {
                                            firstIndex = text.indexOf("T5");//until it founds T1 it returns -1
                                            if (firstIndex != -1) {
                                                secondIndex = text.indexOf("T5", firstIndex + 1);
                                                if (secondIndex != -1) {
                                                    firstPart = text.substring(0, secondIndex);
                                                    secondPart = text.substring(secondIndex);
                                                    System.out.println("First part: " + firstPart);
                                                    System.out.println("Second part: " + secondPart);
                                            }   
                                            } 
                                    
                                        }
                                }   else {
                                         firstIndex = text.indexOf("T5");//until it founds T1 it returns -1
                                            if (firstIndex != -1) {
                                                secondIndex = text.indexOf("T5", firstIndex + 1);
                                                if (secondIndex != -1) {
                                                    firstPart = text.substring(0, secondIndex);
                                                    secondPart = text.substring(secondIndex);
                                                    System.out.println("First part: " + firstPart);
                                                    System.out.println("Second part: " + secondPart);
                                            }   
                                            }
                                    }
                                    }
                        }   else {
                                firstIndex = text.indexOf("T4");//until it founds T1 it returns -1
                                    if (firstIndex != -1) {
                                        secondIndex = text.indexOf("T4", firstIndex + 1);
                                        if (secondIndex != -1) {
                                            firstPart = text.substring(0, secondIndex);
                                            secondPart = text.substring(secondIndex);
                                            System.out.println("First part: " + firstPart);
                                            System.out.println("Second part: " + secondPart);
                                    }   else {
                                            firstIndex = text.indexOf("T5");//until it founds T1 it returns -1
                                            if (firstIndex != -1) {
                                                secondIndex = text.indexOf("T5", firstIndex + 1);
                                                if (secondIndex != -1) {
                                                    firstPart = text.substring(0, secondIndex);
                                                    secondPart = text.substring(secondIndex);
                                                    System.out.println("First part: " + firstPart);
                                                    System.out.println("Second part: " + secondPart);
                                            }   
                                            } 
                                        }
                                }   
                                       
                            }
                        }
                }   else {
                        firstIndex = text.indexOf("T3");//until it founds T1 it returns -1
                            if (firstIndex != -1) {
                                 secondIndex = text.indexOf("T3", firstIndex + 1);
                                if (secondIndex != -1) {
                                    firstPart = text.substring(0, secondIndex);
                                    secondPart = text.substring(secondIndex);
                                    System.out.println("First part: " + firstPart);
                                    System.out.println("Second part: " + secondPart);
                            }   else {
                                    firstIndex = text.indexOf("T4");//until it founds T1 it returns -1
                                    if (firstIndex != -1) {
                                        secondIndex = text.indexOf("T4", firstIndex + 1);
                                        if (secondIndex != -1) {
                                            firstPart = text.substring(0, secondIndex);
                                            secondPart = text.substring(secondIndex);
                                            System.out.println("First part: " + firstPart);
                                            System.out.println("Second part: " + secondPart);
                                    }   else {
                                            firstIndex = text.indexOf("T5");//until it founds T1 it returns -1
                                            if (firstIndex != -1) {
                                                secondIndex = text.indexOf("T5", firstIndex + 1);
                                                if (secondIndex != -1) {
                                                    firstPart = text.substring(0, secondIndex);
                                                    secondPart = text.substring(secondIndex);
                                                    System.out.println("First part: " + firstPart);
                                                    System.out.println("Second part: " + secondPart);
                                            }   
                                            } 
                                    
                                        }
                                }   
                                    
                                    }
                        }   
                    }
                }
        }   else {
                firstIndex = text.indexOf("T2");//until it founds T1 it returns -1
                    if (firstIndex != -1) {
                        int secondIndex = text.indexOf("T2", firstIndex + 1);
                        if (secondIndex != -1) {
                            firstPart = text.substring(0, secondIndex);
                            secondPart = text.substring(secondIndex);
                            System.out.println("First part: " + firstPart);
                            System.out.println("Second part: " + secondPart);
                    }   else {
                            firstIndex = text.indexOf("T3");//until it founds T1 it returns -1
                            if (firstIndex != -1) {
                                secondIndex = text.indexOf("T3", firstIndex + 1);
                                if (secondIndex != -1) {
                                    firstPart = text.substring(0, secondIndex);
                                    secondPart = text.substring(secondIndex);
                                    System.out.println("First part: " + firstPart);
                                    System.out.println("Second part: " + secondPart);
                            }   else {
                                    firstIndex = text.indexOf("T4");//until it founds T1 it returns -1
                                    if (firstIndex != -1) {
                                        secondIndex = text.indexOf("T4", firstIndex + 1);
                                        if (secondIndex != -1) {
                                            firstPart = text.substring(0, secondIndex);
                                            secondPart = text.substring(secondIndex);
                                            System.out.println("First part: " + firstPart);
                                            System.out.println("Second part: " + secondPart);
                                    }   else {
                                            firstIndex = text.indexOf("T5");//until it founds T1 it returns -1
                                            if (firstIndex != -1) {
                                                secondIndex = text.indexOf("T5", firstIndex + 1);
                                                if (secondIndex != -1) {
                                                    firstPart = text.substring(0, secondIndex);
                                                    secondPart = text.substring(secondIndex);
                                                    System.out.println("First part: " + firstPart);
                                                    System.out.println("Second part: " + secondPart);
                                            }   
                                            }   
                                    
                                        }
                                }   
                                    
                                    }
                        }   
                        }
                }   
            }
        }
        else{
            System.out.println("No found.");
        }
           
            
            String [] dividingarray = secondPart.split(" ");
            
            int joblistcounter = 0;
            while(joblistcounter != joblist.size()){
               
            System.out.print(joblist.get(joblistcounter).getJob_ID() + " ");
            
           
            for(int i = 0;i<dividingarray.length-1;i++){
                if(dividingarray[i] .equals("T1")){
                    try{
                        int int1 = Integer.parseInt(dividingarray[i+1]);
                        task1.update_size(int1);
                        System.out.print("T1 " + int1);
                    }
                    catch(NumberFormatException e){
                        System.out.print(" T1");
                    }
                }
            }
            for(int i = 0;i<dividingarray.length-1;i++){
                if(dividingarray[i] .equals("T2")){
                    try{
                        int int1 = Integer.parseInt(dividingarray[i+1]);
                        task2.update_size(int1);
                        System.out.print(" T2 " + int1);
                    }
                    catch(NumberFormatException e){
                        System.out.print(" T2");
                    }
                }
            }
            for(int i = 0;i<dividingarray.length-1;i++){
                if(dividingarray[i] .equals("T3")){
                    try{
                        int int1 = Integer.parseInt(dividingarray[i+1]);
                        task3.update_size(int1);
                        
                        System.out.print(" T3 " + int1);
                    }
                    catch(NumberFormatException e){
                        System.out.print(" T3");
                    }
                }
            }
            for(int i = 0;i<dividingarray.length-1;i++){
                if(dividingarray[i] .equals("T4")){
                    try{
                        int int1 = Integer.parseInt(dividingarray[i+1]);
                        task4.update_size(int1);
                        System.out.print(" T4 " + int1);
                    }
                    catch(NumberFormatException e){
                        System.out.print(" T4");
                    }
                }
            }
            for(int i = 0;i<dividingarray.length-1;i++){
                if(dividingarray[i] .equals("T5")){
                    try{
                        int int1 = Integer.parseInt(dividingarray[i+1]);
                        task5.update_size(int1);
                        System.out.print(" T5 " + int1);
                    }
                    catch(NumberFormatException e){
                        System.out.print(" T5");
                    }
                }
            }
            joblistcounter ++;
           }
       
    }
        
        public static void main(String [] args){
        
        printingjob();
 }
}