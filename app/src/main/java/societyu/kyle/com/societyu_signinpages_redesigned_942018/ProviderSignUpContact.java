package societyu.kyle.com.societyu_signinpages_redesigned_942018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProviderSignUpContact extends AppCompatActivity {
    Button mNextBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provider_sign_up_contact);

        mNextBtn = findViewById(R.id.ContactNextBtn);
        mNextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProviderSignUpContact.this, ProviderSignUpName.class));
            }
        });
    }
}
