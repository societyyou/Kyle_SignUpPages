package societyu.kyle.com.societyu_signinpages_redesigned_942018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProviderSignUpName extends AppCompatActivity {
    Button mNextBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provider_sign_up_name);

        mNextBtn = findViewById(R.id.NameNextBtn);
        mNextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProviderSignUpName.this,
                        ProviderSignUpSpecialty.class));
            }
        });
    }
}
