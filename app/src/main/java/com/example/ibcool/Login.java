package com.example.ibcool;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
import android.app.AlertDialog;
import android.content.DialogInterface;

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
            showInvalidPinAlert();
        }
    }

    // You can add your PIN validation logic here
    private boolean isValidPin(String pin) {
        return pin.equals("123456");
    }

    private void showInvalidPinAlert() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Invalid PIN");
        builder.setMessage("Please enter the correct PIN.");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // You can perform any action on OK button click, or leave it empty
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}