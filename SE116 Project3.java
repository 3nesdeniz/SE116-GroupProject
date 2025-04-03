import java.util.ArrayList;
import java.util.Random;// değişken hızlı istasyonların hızını hesaplamak için
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Station {
    protected String station_id;
    protected double station_capability;
    protected ArrayList<Tasks> taskTypesandDurations;// String array i yerine task arrayi olabilir
    protected double station_speed;
    protected boolean isMULTIFLAG;
    protected boolean isFİFOFLAG;
    protected double percentage;
    protected boolean isConstandSpeed = false;
    protected boolean isVariableSpeed = false;
    private int randomnumber;
    private int randomnumber2;

    Random r = new Random();
    public Station(String station_id,double station_capability,boolean isMULTIFLAG,boolean isFİFOFLAG,ArrayList<Tasks> taskTypesandDurations,double percentage){
    this.station_id = station_id;
    this.station_capability = station_capability;
    this.isMULTIFLAG = isMULTIFLAG;
    this.isFİFOFLAG = isFİFOFLAG;
    this.taskTypesandDurations = taskTypesandDurations;
    this.percentage =percentage;
// station oluştururken percentage 1 girilirse sabit hızlı istasyon farklı bir double değer girilirse değişken hızlı istasyon
    }
    public enum StationState{
        IDLE,
        BUSY
        
    }
    public boolean isConstandOrVariable(){
       if(percentage == 1){
       return  isConstandSpeed = true;
       }else{ return isVariableSpeed = true ;}
    }
    public double setStationSpeed(double stationspeed){
    return station_speed = stationspeed;
    }
    public void calculate_Station_Speed(Tasks task,String data){
        int spaceCount = 0;
        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        int data1 = 0;
        int data2 = 0;
        int data3 = 0;
        int data4 = 0;
        int data5 = 0;

        String patternStr =  "([T][1]\\s\\d{1,3})?\\s?([T][2]\\s\\d{1,3})?\\s?([T][3]\\s\\d{1,3})?"
                + "\\s?([T][4]\\s\\d{1,3})?\\s?([T][5]\\s\\d{1,3})?";
        
        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(data);
        if (matcher.find()) {
        String [] split_data = data.split(" ");
        if(spaceCount > 8){
             data1 =Integer.parseInt(split_data[1]);
             data2 =Integer.parseInt(split_data[3]);
             data3 =Integer.parseInt(split_data[5]);
             data4 =Integer.parseInt(split_data[7]);
             data5 =Integer.parseInt(split_data[9]);
        }
        else if(spaceCount > 6){
             data1 =Integer.parseInt(split_data[1]);
             data2 =Integer.parseInt(split_data[3]);
             data3 =Integer.parseInt(split_data[5]);
             data4 =Integer.parseInt(split_data[7]);   
        }
        else if(spaceCount > 4){
             data1 =Integer.parseInt(split_data[1]);
             data2 =Integer.parseInt(split_data[3]);
             data3 =Integer.parseInt(split_data[5]);
        }
        else if(spaceCount > 2){
            data1 =Integer.parseInt(split_data[1]);
            data2 =Integer.parseInt(split_data[3]);
        }
        else if(spaceCount > 0){
             data1 =Integer.parseInt(split_data[1]);    
        }
 
        randomnumber = r.nextInt((int)percentage*10 + 1);
        randomnumber2 =r.nextInt(2);//1 for variable station speed - percentage 2 for variable station speed + percentage
        
        if(isConstandSpeed == true){
            if(data5 != 0){
                System.out.println(setStationSpeed(task.getTaskSize() / data1));//1.taskin istasyon tarafından yapılma hızı
                System.out.println(setStationSpeed(task.getTaskSize() / data2));//2.taskin istasyon tarafından yapılma hızı
                System.out.println(setStationSpeed(task.getTaskSize() / data3));//3.taskin istasyon tarafından yapılma hızı
                System.out.println(setStationSpeed(task.getTaskSize() / data4));//4.taskin istasyon tarafından yapılma hızı
                System.out.println(setStationSpeed(task.getTaskSize() / data5));//5.taskin istasyon tarafından yapılma hızı
            
        }
            else if(data4 != 0){
                System.out.println(setStationSpeed(task.getTaskSize() / data1));//1.taskin istasyon tarafından yapılma hızı
                System.out.println(setStationSpeed(task.getTaskSize() / data2));//2.taskin istasyon tarafından yapılma hızı
                System.out.println(setStationSpeed(task.getTaskSize() / data3));//3.taskin istasyon tarafından yapılma hızı
                System.out.println(setStationSpeed(task.getTaskSize() / data4));//4.taskin istasyon tarafından yapılma hızı
            
        }
            else if(data3 != 0){
                System.out.println(setStationSpeed(task.getTaskSize() / data1));//1.taskin istasyon tarafından yapılma hızı
                System.out.println(setStationSpeed(task.getTaskSize() / data2));//2.taskin istasyon tarafından yapılma hızı
                System.out.println(setStationSpeed(task.getTaskSize() / data3));//3.taskin istasyon tarafından yapılma hızı
            
        }
            else if(data2 != 0){
                System.out.println(setStationSpeed(task.getTaskSize() / data1));//1.taskin istasyon tarafından yapılma hızı
                System.out.println(setStationSpeed(task.getTaskSize() / data2));//2.taskin istasyon tarafından yapılma hızı
            
        }
            else if(data1 != 0){
                System.out.println(setStationSpeed(task.getTaskSize() / data1));//1.taskin istasyon tarafından yapılma hızı
            
        }
       
    }
    else if(isVariableSpeed == true){
        if(randomnumber2 == 1){
            System.out.println(setStationSpeed(task.getTaskSize() / data1 - randomnumber)); 
        }
        else { System.out.println(setStationSpeed(task.getTaskSize() / data1 + randomnumber));
        
        }
        
        
    }
        }
        else{
            System.out.println("Wrong data...");
        }
        
}


public String getStation_id() {
    return station_id;
}

public double getStation_capability() {
    return station_capability;
}

public boolean isMULTIFLAG() {
    return isMULTIFLAG;
}

public boolean isFIFOFLAG() {
    return isFİFOFLAG;
}

    public ArrayList<Tasks> getTaskTypesandDurations() {
        return taskTypesandDurations;
    }


}