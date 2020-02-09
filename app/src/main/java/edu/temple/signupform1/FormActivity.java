package edu.temple.signupform1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    EditText editTextName;
    EditText editTextEmail;
    EditText editTextPassword;
    EditText editTextConfirmPassword;
    Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        editTextConfirmPassword = (EditText) findViewById(R.id.editTextConfirmPassword);
        btnSave = (Button) findViewById(R.id.btnSave);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editTextName.getText().toString() == "") {
                    Toast.makeText(getApplicationContext(),"Please enter your name", Toast.LENGTH_LONG).show();
                }
                if (editTextEmail.getText().toString() == "") {
                    Toast.makeText(getApplicationContext(),"Please enter your email", Toast.LENGTH_LONG).show();
                }
                if (editTextPassword.getText().toString() == "") {
                    Toast.makeText(getApplicationContext(),"Please enter your password", Toast.LENGTH_LONG).show();
                }
                if (editTextConfirmPassword.getText().toString() == "") {
                    Toast.makeText(getApplicationContext(),"Please confirm your password", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
