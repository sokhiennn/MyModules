package sg.edu.rp.c346.id22013179.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvPassModDetails;
    TextView tvPassModDetails2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvPassModDetails = findViewById(R.id.textView);
        tvPassModDetails2 = findViewById(R.id.textView2);

        tvPassModDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module Code","C346");
                intent.putExtra("Module Name","Android Programming");
                intent.putExtra("Academic Year",2023);
                intent.putExtra("Semester",1);
                intent.putExtra("Module Credit",4);
                intent.putExtra("Venue","E63A");
                startActivity(intent);
            }
        });

        tvPassModDetails2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module Code","C218");
                intent.putExtra("Module Name","UI/UX Design for Apps");
                intent.putExtra("Academic Year",2023);
                intent.putExtra("Semester",1);
                intent.putExtra("Module Credit",4);
                intent.putExtra("Venue","W65D");
                startActivity(intent);

            }
        });
    }
}
