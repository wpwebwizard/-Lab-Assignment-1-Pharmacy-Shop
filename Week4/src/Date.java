public class Date{
    private int day;
    private int month;
    private int year;
    private Time time , temp;


    Date(int day , int month , int year , Time time){
        this.setDay(day);
        this.setMonth(month);
        this.setYear(year);
        this.setTime(time);
        this.setT2(time);
    }

    Date(Date temp) {
        this.setDay(temp.getDay());;
        this.setMonth(temp.getMonth());
        this.setYear(temp.getYear());
        this.setTime(new Time(temp.getTime()));
    }

    public Time getTime(){
        return time;
    }

    public void setTime(Time time){
        this.time = time;
    }

    public Time getT2(){
        return temp;
    }

    public void setT2(Time t2){
        this.temp= t2;
    }

    public int getDay(){
        return day;
    }

    public void setDay(int day){
        this.day = day;
    }

    public int getMonth(){
        return month;
    }

    public void setMonth(int month){
        this.month = month;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public Date shallowCopy(){
        return new Date(this.day, this.month, this.year, this.time);
    }

    public Date deepCopy(){
        return new Date(this.day, this.month, this.year, new Time(this.time.getSec() , this.time.getMinutes() , this.time.getHours()));
    }

    public void display(){
        System.out.println("Date Format is Day - Month - Year");
        System.out.println(day+"-"+month+"-"+year);
        time.display();
    }
}