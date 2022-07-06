package com.example.coffeecap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;


public class ConfigurationScreen extends AppCompatActivity {

    private Button submitButton;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.configuration_screen);
        EditText nameEdit = findViewById(R.id.nameInput);
        submitButton = findViewById(R.id.submitButton);
        submitButton.setOnClickListener(l -> {
            String name = String.valueOf(nameEdit.getText());
                Bundle bundle = new Bundle();
                bundle.putString("name", name);
                Intent i = new Intent(this, MainActivity.class);
                i.putExtras(bundle);
                startActivity(i);
                finish();
        });
    };

}
