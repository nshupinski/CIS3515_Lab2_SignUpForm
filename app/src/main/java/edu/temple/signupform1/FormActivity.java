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

    private boolean allTrue = false;

    private String name;

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

                boolean nameTrue = true;
                boolean eTrue = true;
                boolean passTrue = true;
                boolean passConfTrue = true;
                boolean passMatch = true;

                if (editTextName.getText().toString().matches("")) {
                    Toast.makeText(getApplicationContext(), "Please enter your name", Toast.LENGTH_SHORT).show();
                    nameTrue = false;
                }
                else if (editTextEmail.getText().toString().matches("")) {
                    Toast.makeText(getApplicationContext(), "Please enter your email", Toast.LENGTH_SHORT).show();
                    eTrue = false;
                }
                else if (editTextPassword.getText().toString().matches("")) {
                    Toast.makeText(getApplicationContext(), "Please enter your password", Toast.LENGTH_SHORT).show();
                    passTrue = false;
                }
                else if (editTextConfirmPassword.getText().toString().matches("")) {
                    Toast.makeText(getApplicationContext(), "Please confirm your password", Toast.LENGTH_SHORT).show();
                    passConfTrue = false;
                }

                if ( (!(editTextPassword.getText().toString().matches(""))) && (!(editTextConfirmPassword.getText().toString().matches(""))) ) {
                    if ( !(editTextPassword.getText().toString().matches(editTextConfirmPassword.getText().toString()) ) ) {

                        Toast.makeText(getApplicationContext(), "Your passwords do not match", Toast.LENGTH_SHORT).show();
                        passMatch = false;
                    }
                }

                if (nameTrue == true && eTrue == true && passTrue == true && passConfTrue == true && passMatch == true)
                allTrue = true;


                if (allTrue == true) {
                    name = editTextName.getText().toString();
                    Toast.makeText(getApplicationContext(), "Welcome to the app, " + name + "!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
