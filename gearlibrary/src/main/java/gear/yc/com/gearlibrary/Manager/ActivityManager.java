package gear.yc.com.gearlibrary.Manager;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * GearApplication
 * Created by YichenZ on 2016/3/23 11:51.
 */
public class ActivityManager {
    private static Object obj =new Object();
    private static ActivityManager instance;

    public static ActivityManager getInstance(){
        if(instance==null){
            synchronized (obj){
                if(instance==null){
                    instance=new ActivityManager();
                }
            }
        }
        return instance;
    }

    private static List<Activity> activities;

    public ActivityManager(){
        if(activities==null){
            activities=new ArrayList<Activity>();
        }
    }

    public static List<Activity> getActivities() {
        return activities;
    }

    public void clearAllActivity(){
        for (Activity activity : activities){
            if(activity!=null){
                activity.finish();
            }
        }
    }
}
