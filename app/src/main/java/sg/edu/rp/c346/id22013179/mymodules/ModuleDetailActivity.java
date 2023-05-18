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




/*
        Intent intent2 = getIntent();
        String moduleCode2 = intent.getStringExtra("Module Code");
        String moduleName2 = intent.getStringExtra("Module Name");
        int academicYear2 = intent.getIntExtra("Academic Year", 0);
        int semester2 = intent.getIntExtra("Semester", 0);
        int moduleCredit2 = intent.getIntExtra("Module Credit", 0);
        String venue2 = intent.getStringExtra("Venue");

        String detailsText2 = "Module Code: " + moduleCode2 + "\n" + "Module Name: " + moduleName2 + "\n"
                + "Academic Year: " + academicYear2 + "\n" + "Semester: " + semester2 + "\n"
                + "Module Credit: " + moduleCredit2 + "\n" + "Venue: " + venue2;

        tvDetails2.setText(detailsText2);
        */
    }
}

