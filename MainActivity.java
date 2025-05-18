
package com.example.qazanamaz;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private int fajrCount = 0;
    private int dhuhrCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView fajrView = findViewById(R.id.fajrCount);
        TextView dhuhrView = findViewById(R.id.dhuhrCount);

        Button fajrButton = findViewById(R.id.fajrButton);
        Button dhuhrButton = findViewById(R.id.dhuhrButton);

        fajrButton.setOnClickListener(v -> {
            fajrCount++;
            fajrView.setText("Fajr: " + fajrCount);
        });

        dhuhrButton.setOnClickListener(v -> {
            dhuhrCount++;
            dhuhrView.setText("Dhuhr: " + dhuhrCount);
        });
    }
}
