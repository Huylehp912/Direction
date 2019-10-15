package com.kemlyy.direction.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.kemlyy.direction.R;

public class Login extends AppCompatActivity {
    private static final String LOG_TAG = "Login_Act";
    private TextView text_usrName;
    private TextView text_passwrd;
    private Button button_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        setUpView();
    }

    private void setUpView() {
        text_usrName = (TextView)findViewById(R.id.text_usrName);
        text_passwrd = (TextView)findViewById(R.id.text_pwrd);

        button_login = (Button) findViewById(R.id.button_login);
        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.button_login:
                        Log.d(LOG_TAG, "onClick: " + button_login.getId());
                        checkUserPassInfor();
                        break;
                }

            }
        });
    }

    private void checkUserPassInfor() {
        if ((text_passwrd.getText().length() == 0 || text_passwrd.getText().equals(""))
            && (text_usrName.getText().length() == 0 || text_usrName.getText().equals(""))) {
            Log.d(LOG_TAG, "checkUserPassInfor: no input texxt ");
        }
    }
}
