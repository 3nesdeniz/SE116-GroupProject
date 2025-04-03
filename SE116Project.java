       
    public class Job implements InterfaceForJobs{
    private String jobID;
    private String job_typeID;
    private int start_time;
    private int duration;
    private int end_time;
    private Job_state state; 
    
    enum Job_state{
        WAİTİNG_TO_START , 
        EXECUTİNG_TASK , 
        COMPLETED , 
        DELAYED
    }
    
    public Job() {
    }

    public Job(String job_ID, String job_typeID, int start_time, int duration, int end_time,Job_state state) {
        this.jobID = job_ID;
        this.job_typeID = job_typeID;
        this.start_time = start_time;
        this.duration = duration;
        this.end_time = end_time;
        this.state = state;
        
    }

    public String getJob_ID() {
        return jobID;
    }

    public void setJob_ID(String job_ID) {
        this.jobID = job_ID;
    }

    public String getJob_typeID() {
        return job_typeID;
    }

    public void setJob_typeID(String job_typeID) {
        this.job_typeID = job_typeID;
    }

    public int getStart_time() {
        return start_time;
    }

    public void setStart_time(int start_time) {
        this.start_time = start_time;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getEnd_time() {
        return end_time;
    }

    public void setEnd_time(int end_time) {
        this.end_time = end_time;
    }

    public Job_state getState() {
        return state;
    }

    public void setState(Job_state state) {
         this.state = state;
    }
    
    public String waiting_to_start() {
        return "Job " + jobID + " is waiting for a test.";
    }

    public String executing_test() {
        return "Job " + jobID + " is executing a task.";
    }

    public String completed() {
        return "Job " + jobID + " is completed.";
    }

    public String delayed() {
         return "Job " + jobID + " is delayed.";
    }
    
}
