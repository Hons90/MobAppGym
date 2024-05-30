package mt.edu.mcast.andrew;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

// Adapter class for a RecyclerView to display a list of exercises
public class ExerciseAdapter extends RecyclerView.Adapter<ExerciseAdapter.ExerciseViewHolder> {

    // List to hold the exercises
    private List<Exercise> exerciseList;

    // Constructor to initialize the adapter with a list of exercises
    public ExerciseAdapter(List<Exercise> exerciseList) {
        this.exerciseList = exerciseList;
    }

    // Method to create new ViewHolder instances
    @NonNull
    @Override
    public ExerciseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_exercise, parent, false);
        return new ExerciseViewHolder(view);
    }

    // Method to bind data to the ViewHolder's views
    @Override
    public void onBindViewHolder(@NonNull ExerciseViewHolder holder, int position) {
        Exercise exercise = exerciseList.get(position);
        holder.title.setText(exercise.getTitle());
        holder.description.setText(exercise.getDescription());
        holder.image.setImageResource(exercise.getImageResId());
    }

    @Override
    public int getItemCount() {
        return exerciseList.size();
    }

    // ViewHolder class to hold references to the views for each exercise item

    public static class ExerciseViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView description;
        ImageView image;


        public ExerciseViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.txtTitle);
            description = itemView.findViewById(R.id.txtDesc);
            image = itemView.findViewById(R.id.imgEx);
        }
    }
}
