package sg.edu.rp.c346.id22013179.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvDetails1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvDetails1 = findViewById(R.id.textView);

        Intent intent = getIntent();
        String moduleCode = intent.getStringExtra("Module Code");
        String moduleName = intent.getStringExtra("Module Name");
        int academicYear = intent.getIntExtra("Academic Year", 0);
        int semester = intent.getIntExtra("Semester", 0);
        int moduleCredit = intent.getIntExtra("Module Credit", 0);
        String venue = intent.getStringExtra("Venue");

        String detailsText = "Module Code: " + moduleCode + "\n" + "Module Name: " + moduleName + "\n"
                + "Academic Year: " + academicYear + "\n" + "Semester: " + semester + "\n"
                + "Module Credit: " + moduleCredit + "\n" + "Venue: " + venue;

        tvDetails1.setText(detailsText);
    }
}

