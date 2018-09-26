package societyu.kyle.com.societyu_signinpages_redesigned_942018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class forgotPassword extends AppCompatActivity {
    Button mResetButton, mSignInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        mResetButton = findViewById(R.id.forgot_ResetBtn);
        mResetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mSignInButton = findViewById(R.id.forgot_SignUpBtn);
        mSignInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(forgotPassword.this, SignInPage.class));
            }
        });
    }





}
