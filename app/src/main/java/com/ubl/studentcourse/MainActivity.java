package com.ubl.studentcourse;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText nimText, nameText;
    Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //findViews
        nimText = findViewById(R.id.et_nim);
        nameText = findViewById(R.id.et_name);
        btnSave = findViewById(R.id.btn_save);

        handleSaveButton();

    }

    private void handleSaveButton() {
        btnSave.setOnClickListener(view -> {
            String nim = nimText.getText().toString();
            String name = nameText.getText().toString();
            Toast.makeText(MainActivity.this, nim + " created successfully!", Toast.LENGTH_SHORT).show();
        });

    }
}