package workoutbuddy.fishlabs.org.com.workoutbuddy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by viswan on 4/6/16.
 */
public class WorkoutSelectionAdapter extends ArrayAdapter<Workout> {
    private class ViewHolder {
        TextView workoutName;
        CheckBox workoutIsSelected;
    }
    WorkoutSelectionAdapter(Context context, int resourceId, ArrayList<Workout> list) {
        super(context, resourceId, list);
    }

    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            LayoutInflater vi = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = vi.inflate(R.layout.custom_workout_select, null);

            holder = new ViewHolder();
            holder.workoutName = (TextView) convertView.findViewById(R.id.workout_name);
            holder.workoutIsSelected = (CheckBox) convertView.findViewById(R.id.workout_selected);
            holder.workoutIsSelected.setTag(convertView);
            holder.workoutIsSelected.setTag(getItem(position));
            convertView.setTag(holder);
            holder.workoutIsSelected.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    CheckBox cb = (CheckBox) v;
                    Workout workout = (Workout) cb.getTag();
                    if (cb.isChecked()) {
                        workout.setIsSelected(false);
                    } else {
                        workout.setIsSelected(true);
                    }
                }
            });
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Workout workout = getItem(position);
        holder.workoutName.setText(workout.getWorkoutName());
        holder.workoutIsSelected.setChecked(workout.getSelected());
        holder.workoutName.setTag(workout);

        return convertView;
    }
}
