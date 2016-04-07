package workoutbuddy.fishlabs.org.com.workoutbuddy;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.support.v7.app.AppCompatActivity;
import android.widget.AdapterView.OnItemClickListener;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class CreateWorkoutProgram extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_workout_program);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ListView bodypartsListView = (ListView) findViewById(R.id.body_parts_listview);
        String[] workoutListAsString = getResources().getStringArray(R.array.workouts);
        ArrayList<Workout> workouts = new ArrayList<Workout>();
        for (String item : workoutListAsString) {
            Workout w = new Workout();
            w.setWorkoutName(item);
            workouts.add(w);
        }
        WorkoutSelectionAdapter adapter = new WorkoutSelectionAdapter(this, R.layout.custom_workout_select, workouts);
        bodypartsListView.setAdapter(adapter);
        bodypartsListView.setOnItemClickListener(this);


    }

    @Override
    public void onItemClick(AdapterView<?> adapter, View view, int position, long id) {

    }


}
