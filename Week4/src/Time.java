class  Time{

    private int sec;
    private int minutes;
    private int hours;


    Time(int sec , int minutes , int hours){
        this.setSec(sec);
        this.setMinutes(minutes);
        this.setHours(hours);
    }

    Time(Time t2) {

        this.setSec(t2.getSec());;
        this.setHours(t2.getHours());;
        this.setMinutes(t2.getMinutes());
    }

    public int getSec(){
        return sec;
    }

    public void setSec(int sec){
        this.sec = sec;
    }

    public int getMinutes(){
        return minutes;
    }

    public void setMinutes(int minutes){
        this.minutes = minutes;
    }

    public int getHours(){
        return hours;
    }

    public void setHours(int hours){
        this.hours = hours;
    }

    public void display(){
        System.out.println("Time Format is Hours - Minutes - Seconds");
        System.out.println(hours +":"+minutes+":"+sec);
    }

}