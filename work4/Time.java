package work4;
import java.util.Calendar;
import java.util.Date;
public class Time {
    long hour,minute,second;
    Date date;
    Calendar calendar=Calendar.getInstance();
    public Time(){
        this.date=new Date();
    }
    public Time(long milliseconds){
        this.date=new Date(milliseconds);
    }
    public Time(int hour,int minute,int second){
        long sum=0;
        sum=sum+hour*60*60*1000+minute*60*1000+second*1000;
        this.date=new Date(sum);
    }

    public long getHour() {
        hour=date.getTime()/3600000;
        return hour;
    }
    public long getMinute(){
        minute = (date.getTime() % 3600000) / 60000;
        return minute;

    }
    public long getSecond() {
        second= (date.getTime() % 3600000) % 60000/1000;
        return second;
    }
    public void setTime(long elapseTime) {
        Date newdate=new Date(elapseTime);
        date=newdate;

    }}
