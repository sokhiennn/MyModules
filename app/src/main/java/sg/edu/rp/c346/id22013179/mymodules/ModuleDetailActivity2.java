package sg.edu.rp.c346.id22013179.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivity2 extends AppCompatActivity {

    TextView tvDetails2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail2);

        tvDetails2 = findViewById(R.id.textView2);

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

        tvDetails2.setText(detailsText);
    }
}
