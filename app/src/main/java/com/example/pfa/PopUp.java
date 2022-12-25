package com.example.pfa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PopUp extends AppCompatActivity {
    TextView mText;
    EditText name;
    Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up);

        mText = findViewById(R.id.editName);
        name = findViewById(R.id.NewName);
        btnSave = findViewById(R.id.save);

        btnSave.setOnClickListener(view -> {
            String cname = name.getText().toString();

            Intent intent = new Intent(PopUp.this, MainIndex.class);
            intent.putExtra("keyname", cname);
            startActivity(intent);
        });
    }
}