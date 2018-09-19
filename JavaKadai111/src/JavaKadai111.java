// Not done
import java.util.*;
public class JavaKadai111 { 

   
    public static void main(String[] args) {
    	 StopWatch s = new StopWatch();
    	 Scanner stdin = new Scanner(System.in);
    	 int ans = stdin.nextInt();
    	 	if(ans == 1) {
    	 		 s.start();
    	 	}
    	    
    	    //code you want to time goes here
    	    s.stop();
    	    System.out.println("elapsed time in milliseconds: " + s.getElapsedTime());
    }
    
} 


class StopWatch {

private long startTime = 0;
private long stopTime = 0;
private boolean running = false;


public void start() {
    this.startTime = System.currentTimeMillis();
    this.running = true;
}


public void stop() {
    this.stopTime = System.currentTimeMillis();
    this.running = false;
}


//elaspsed time in milliseconds
public long getElapsedTime() {
    long elapsed;
    if (running) {
         elapsed = (System.currentTimeMillis() - startTime);
    }
    else {
        elapsed = (stopTime - startTime);
    }
    return elapsed;
}


//elaspsed time in seconds
public long getElapsedTimeSecs() {
    long elapsed;
    if (running) {
        elapsed = ((System.currentTimeMillis() - startTime) / 1000);
    }
    else {
        elapsed = ((stopTime - startTime) / 1000);
    }
    return elapsed;
}



