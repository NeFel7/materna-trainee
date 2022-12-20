package example.ownClassesAndInterfaces;

import java.io.File;
import java.util.TimerTask;

public class FreeDiskSpaceTimerTask extends TimerTask {
    long min = 1_000_000_000_000L;
    @Override
    public void run() {
        long freeDiskSpace = java.io.File.listRoots()[0].getFreeSpace();
        if(freeDiskSpace < min){
            double minFreeDiskSpace = min/Math.pow(1024,3);
            double gbFreeDiskSpace = freeDiskSpace/Math.pow(1024,3);
            System.out.printf("Device %s has less than %.2f GB available, currently %.2f GB%n", File.listRoots()[ 0 ], minFreeDiskSpace, gbFreeDiskSpace );
        }
    }
}
