package com.example.myapplication;

import android.app.Activity;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends Activity {
    public class LoginActivity extends AppCompatActivity {

        // Méthode pour vérifier si l'email est valide
        private boolean isValidEmail(CharSequence target) {
            return Patterns.EMAIL_ADDRESS.matcher(target).matches();
        }


        public void onLoginButtonClick(View view) {
            EditText editTextEmail = findViewById(R.id.editTextEmail);
            EditText editTextPassword = findViewById(R.id.editTextPassword);

            String email = editTextEmail.getText().toString();
            String password = editTextPassword.getText().toString();

            // Vérification de l'email
            if (isValidEmail(email)) {

            } else {
                Toast.makeText(this, "L'email saisi est incorrect", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
