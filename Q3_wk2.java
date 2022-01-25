package lab02;

public class Q3_wk2 {
    public static void main(String[] args){
    long totalMilliseconds  = System.currentTimeMillis();
    long totalSeconds = totalMilliseconds /1000;
    long currentSeconds = totalSeconds % 60;
    long totalMinutes = totalSeconds/60;
    long currentMinutes = totalMinutes % 60;
    long totalHours = totalMinutes/60;
    long currentHours = totalHours % 24;
    
    System.out.printf("Current time is %02d:%02d:%d GMT \n",currentHours,currentMinutes, currentSeconds );
    }
}
