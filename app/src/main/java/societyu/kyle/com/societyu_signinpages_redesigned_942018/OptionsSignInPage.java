package societyu.kyle.com.societyu_signinpages_redesigned_942018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OptionsSignInPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options_sign_in_page);
    }

    public void toSignInPage(View view){
        startActivity(new Intent());
    }

    public void providerAcctChosen(View view){
        startActivity(new Intent());
    }

    public void userAcctChosen(View view){
        startActivity(new Intent(OptionsSignInPage.this, SignInPage.class));
    }
}
