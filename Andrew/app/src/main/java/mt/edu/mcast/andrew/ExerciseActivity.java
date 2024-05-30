package mt.edu.mcast.andrew;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class ExerciseActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ExerciseAdapter adapter;
    private List<Exercise> exerciseList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leg);

        recyclerView = findViewById(R.id.rvLegs);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        String category = getIntent().getStringExtra("category");
        exerciseList = getExercise(category);

        adapter = new ExerciseAdapter(exerciseList);
        recyclerView.setAdapter(adapter);

        Button btn = findViewById(R.id.btnHome);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private List<Exercise> getExercise(String category){
        List<Exercise> exercises = new ArrayList<>();
        switch (category) {
            case "leg":
                exercises.add(new Exercise("Squats", "Imagine as if you re sitting down", R.drawable.legs1));
                exercises.add(new Exercise("Leg Press", "Feet close together = Quads. Feet far apart = Hamstrings", R.drawable.legs2));
                exercises.add(new Exercise("Lunges", "Knee should not rest on the floor", R.drawable.legs3));
                break;
            case "chest":
                exercises.add(new Exercise("Push Ups", "Do not flare out your elbows, instead keep them near your middle chest for the best activation", R.drawable.chest1));
                exercises.add(new Exercise("Bench Press", "Make sure that you lift the bar off the center of your chest, around the nipples", R.drawable.chest2));
                exercises.add(new Exercise("Dumbell Chest Flies", "Extend your arms at the top of the movement for better pectorial activation", R.drawable.chest3));
                break;
            case "arm":
                exercises.add(new Exercise("Bicep Curl", "Keep your elbows tight on your side to build bicep muscles", R.drawable.bicepcurls));
                exercises.add(new Exercise("Tricep Extension", "Do not move your elbows to strengthen your triceps", R.drawable.tricepdips));
                exercises.add(new Exercise("Hammer Curl", "These target your brachialis", R.drawable.hammercurl));
                break;
            case "shoulder":
                exercises.add(new Exercise("Front Raises", "Bring the dumbells all the way in front of your eyes", R.drawable.shoulder1));
                exercises.add(new Exercise("Shoulder Press", "Rotate your arms at a 45 degree angle to prevent injury", R.drawable.shoulder2));
                exercises.add(new Exercise("Lateral Raises", "Imagine the dumbells as if you are pouring from a kettle", R.drawable.shoulder3));
                break;
            case "back":
                exercises.add(new Exercise("Back bar pull", "Bring the bar all the way up to your torso", R.drawable.backbar));
                exercises.add(new Exercise("Pull up", "Bring your chest to the bar for better Lat activation", R.drawable.backpullup));
                exercises.add(new Exercise("Dead-lift", "Essential to keep your back straight. If necessary wear a tight belt around your lower back", R.drawable.backdeadlift));
                break;
        }

        return exercises;
    }
}