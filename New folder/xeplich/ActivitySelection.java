import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Activity {
    int start;
    int finish;

    public Activity(int start, int finish){
        this.start = start;
        this.finish = finish;
    }
}

public class ActivitySelection {

    public static List<Activity> greedyActivitySelector(List<Activity> activities){
        activities.sort((a1, a2) -> Integer.compare(a1.finish, a2.finish));
        
        // danh sách các công việc
        List<Activity> selecActivities = new ArrayList<>();

        selecActivities.add(activities.get(0));
        int lastFinishTime = activities.get(0).finish;

        for(int i = 1; i  < activities.size(); i++){
            if(activities.get(i).start >= lastFinishTime){
                selecActivities.add(activities.get(i));
                lastFinishTime = activities.get(i).finish;
            }

        }

        return selecActivities;
    }

    public static void main(String[] args) {
        List<Activity> activities = Arrays.asList(
            new Activity(1, 2),
            new Activity(3, 4),
            new Activity(0, 6),
            new Activity(5, 7),
            new Activity(8, 9),
            new Activity(5, 9)
        );

        List<Activity> selectedActivities = greedyActivitySelector(activities);
        System.out.println("Các công việc được chọn là: ");
        for(Activity activity: selectedActivities){
            System.out.println("Công việc bắt đầu: " + activity.start + ", Kết thúc: " + activity.finish);
        }

    }

    
}
