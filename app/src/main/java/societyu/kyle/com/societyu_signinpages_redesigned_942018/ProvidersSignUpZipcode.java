package societyu.kyle.com.societyu_signinpages_redesigned_942018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProvidersSignUpZipcode extends AppCompatActivity {
    Button mNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_providers_sign_up_zipcode);

        mNext = findViewById(R.id.ZipCodeNextBtn);
        mNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProvidersSignUpZipcode.this,
                        ProviderSignUpContact .class));
            }
        });
    }
}
