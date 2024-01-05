package com.example.ibcool;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

import android.os.Bundle;

public class Login extends AppCompatActivity {

    private EditText pinEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        pinEditText = findViewById(R.id.pinedt);

        pinEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    // When "Done" button is pressed on the keyboard
                    handleLogin();
                    return true;
                }
                return false;
            }
        });
    }

    private void handleLogin() {
        String enteredPin = pinEditText.getText().toString();

        // Check if the entered PIN is valid (you may want to add more validation)
        if (isValidPin(enteredPin)) {
            // If the PIN is valid, navigate to the next activity
            Intent intent = new Intent(Login.this, MainActivity.class);
            startActivity(intent);
            // You may also finish() this activity if you don't want to go back to it
        } else {
            // Show an error message or handle invalid PIN
        }
    }

    // You can add your PIN validation logic here
    private boolean isValidPin(String pin) {
        // Add your validation logic (e.g., check if it's 6 digits)
        return pin.length() == 6;
    }
}