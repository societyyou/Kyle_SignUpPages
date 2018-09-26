package societyu.kyle.com.societyu_signinpages_redesigned_942018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignInPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_page);
    }

    public void forgotPasswordPressed(View view){
        startActivity(new Intent(SignInPage.this, forgotPassword.class));
    }

    public void signInPressed(View view){

    }

    public void signUpNowPressed(View view){
        startActivity(new Intent(SignInPage.this, userSignUpPage.class));
    }
}
