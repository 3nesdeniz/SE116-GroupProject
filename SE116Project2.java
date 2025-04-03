import java.util.ArrayList;
import java.util.Scanner;
public class JobHandler {
    protected ArrayList <Job> jobs;
    public void add_job(Job job){
        jobs.add(job);
    }

    public ArrayList<Job> getJobs() {
        return jobs;
    }
    
    public void remove_job(Job job){
        jobs.remove(job);
    }
    Scanner scanner = new Scanner(System.in);
    public void regulate_job(Station station){
        int count = 0;
        while(count<0){
            if (jobs.get(count).getState() == Job.Job_state.WAITING_TO_START){
            if(station.isFIFOFLAG() == true){
                for(int i = 0;i<jobs.size();i++){
                    if(jobs.get(i).getStart_time() > jobs.get(i+1) .getStart_time()){
                        ArrayList<Job> temp = jobs;
                        jobs.set(i,jobs.get(i+1));
                        jobs.set(i+1,temp.get(i));
            }
        }
        }
            else if(station.isFIFOFLAG() == false){
                for(int i = 0;i<jobs.size();i++){
                    if(jobs.get(i).getEnd_time() > jobs.get(i+1) .getEnd_time()){
                        ArrayList<Job> temp = jobs;
                        jobs.set(i,jobs.get(i+1));
                        jobs.set(i+1,temp.get(i));
            }
        }    
        }
            }
        count++;
        }
    }
    public void check_job(Job job){
        
        if(job.getState() == (job.getState().WAITING_TO_START)){
            System.out.println(job.waiting_to_start());
        }
        else if(job.getState() == (job.getState().EXECUTING_TEST)){
            System.out.println(job.executing_test());
        }
        else if(job.getState() == (job.getState().COMPLETED)){
            System.out.println(job.completed());
        }
        else if(job.getState() == (job.getState().DELAYED)){
            System.out.println(job.delayed());
        }
        else{
            System.out.println("Invalid check...");
        }
    }
    
}