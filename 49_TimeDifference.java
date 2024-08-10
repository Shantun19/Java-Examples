class Time {
    int hour;
    int min;
    int sec;
    
    public Time(int hour , int min , int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }
    
    public static void main(String[] args) {
        Time start = new Time(8, 12, 15);
        Time stop = new Time(12, 34, 55);
        Time diff;
    
        diff = calculateDiff(start , stop);
        System.out.printf("TIME DIFFERENCE: %d:%d:%d - ", start.hour, start.min, start.sec);
        System.out.printf("%d:%d:%d ", stop.hour, stop.min, stop.sec);
        System.out.printf("= %d:%d:%d\n", diff.hour, diff.min, diff.sec);
    }
    
    public static Time calculateDiff(Time start , Time stop) {
        Time diff = new Time(0 , 0 , 0);
        if(start.sec > stop.sec) {
            --stop.min;
            stop.sec += 60;
        }
        diff.sec = stop.sec - start.sec;
        if(start.min > stop.min) {
            --stop.hour;
            stop.min += 60;
        }
        diff.min = stop.min - start.min;
        diff.hour = stop.hour - start.hour;
        
        return (diff);
    }
}
