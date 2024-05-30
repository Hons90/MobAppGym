package mt.edu.mcast.andrew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

// MainActivity class which extends AppCompatActivity to use Android Activity features
public class MainActivity extends AppCompatActivity {

    // Declare button variables for different body parts
    Button btnChest;
    Button btnBack;
    Button btnShoulder;
    Button btnArm;
    Button btnLeg;

    // Override the onCreate method to set up the activity when it is created
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnChest = findViewById(R.id.btnChest);
        btnBack = findViewById(R.id.btnBack);
        btnShoulder = findViewById(R.id.btnShoulder);
        btnArm = findViewById(R.id.btnArm);
        btnLeg = findViewById(R.id.btnLeg);

        // Set onClickListeners for each button to handle button click events
        btnChest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openExerciseList("chest");
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openExerciseList("back");
            }
        });

        btnShoulder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openExerciseList("shoulder");
            }
        });

        btnArm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openExerciseList("arm");
            }
        });

        btnLeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openExerciseList("leg");
            }
        });

    }

    // Method to start ExerciseActivity with the selected category
    private void openExerciseList(String category){
        Intent intent = new Intent(MainActivity.this, ExerciseActivity.class);
        intent.putExtra("category", category);
        startActivity(intent);
    }




}