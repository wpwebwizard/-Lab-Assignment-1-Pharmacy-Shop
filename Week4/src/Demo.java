public class  Demo{

    public static void main(String[] args){

        Time time = new Time( 03 , 34 ,12);

        Time t2 = new Time(time);

        Date date = new Date(13 , 8 , 2024 , time);

        Date temp = new Date(13 ,  8 , 2024 ,t2);

        date.setDay(20);
        date.getTime().setHours(5);
        date.getTime().setMinutes(45);
        date.getTime().setSec(30);

        temp.getT2().setSec(43);

        date.display();

        System.out.println("--------------------------------");

        temp.display();
    }
}