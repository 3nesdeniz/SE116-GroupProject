
    public class Job implements InterfaceForJobs{
        private String job_ID;
        private String job_typeID;
        private int start_time;
        private int duration;
        private int end_time;
        
        
        public Job() {
            
        }
    
        public Job(String job_ID, String job_typeID, int start_time, int duration, int end_time) {
            this.duration = 0;
            this.job_ID = job_ID;
            this.job_typeID = job_typeID;
            this.start_time = start_time;
            this.duration = duration;
            this.end_time = end_time;
        }
    
        public String getJob_ID() {
            return job_ID;
        }
    
        public void setJob_ID(String job_ID) {
            this.job_ID = job_ID;
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
    
    
        public String waiting_to_start() {
            return "s";
        }
    
        public String executing_test() {
            return "a";
        }
    
        public String completed() {
            return "s";
        }
    
        public String delayed() {
             return "s";
        }
    
    }

