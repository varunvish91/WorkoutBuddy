package workoutbuddy.fishlabs.org.com.workoutbuddy;


// Workout object with holds informationa bout the specific workout
public class Workout {
    private String mWorkoutName;
    private String mWorkoutType; // Bodypart it belongs to
    private String mWorkoutWeight; // Weight to use
    private String mWorkoutReps; // Reps used
    private boolean isSelected;


    public Workout() {

    }

    public void setWorkoutName(String name) {
        this.mWorkoutName = name;
    }

    public String getWorkoutName() {
        return this.mWorkoutName;
    }

    public void setIsSelected(boolean selected) {
        isSelected = selected;
    }

    public boolean getSelected() {
        return isSelected;
    }
}
