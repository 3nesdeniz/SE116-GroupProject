import java.util.ArrayList;
public class Test {
   private static ArrayList<String> tasklist= new ArrayList<String>();
    public static void main(String [] args){
        tasklist.add("T1");
        tasklist.add("3");
        tasklist.add("T2");
        tasklist.add("4");

Station station1 = new Station("S4",5,true,false,tasklist,0.20);
Task task = new Task("T1",2);
station1.isConstandOrVariable();

/*System.out.println(station1.getStation_id());
System.out.println(station1.getStation_capability());
System.out.println(station1.isFIFOFLAG());
System.out.println(station1.isMULTIFLAG());
System.out.println(station1.isConstandSpeed());*/

station1.calculate_Station_Speed(task,"4");


    }
    

}
