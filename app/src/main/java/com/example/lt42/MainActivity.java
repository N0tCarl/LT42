package com.example.lt42;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = findViewById(R.id.editText);
        Button button = findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String num;

                if(editText.getText() != null) {
                    num = editText.getText().toString();

                    switch (num){
                        case "1":
                            showToast("Meals");
                            break;
                        case "2":
                            showToast("Drinks");
                            break;
                        case "3":
                            showToast("Desserts");
                            break;
                        default:
                            showToast("INVALID Menu");
                            break;
                    }
                }
                editText.setText("");
            }
        });

    }

    void showToast(String msg){
        Toast.makeText(MainActivity.this,"You chosen " + msg,Toast.LENGTH_LONG).show();

    }




}