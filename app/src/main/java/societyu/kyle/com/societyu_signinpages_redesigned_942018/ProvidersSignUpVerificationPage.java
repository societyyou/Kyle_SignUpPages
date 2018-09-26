package societyu.kyle.com.societyu_signinpages_redesigned_942018;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class ProvidersSignUpVerificationPage extends AppCompatActivity {
    String state = null;
    Button mNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_providers_sign_up_verification_page);

        mNext = findViewById(R.id.LicenseNextBtn);


        Spinner spinner = (Spinner) findViewById(R.id.states_spinner);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // An item was selected. You can retrieve the selected item using
                // parent.getItemAtPosition(pos)
                state = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Another interface callback
            }
        });

        mNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (state != null){
                    //Send Intent with added state string later. For now, just for page navigation,
                    //send to zip code page
                   startActivity(new Intent(ProvidersSignUpVerificationPage.this, ProvidersSignUpZipcode.class));
                }

                else{
                    Toast.makeText(ProvidersSignUpVerificationPage.this,
                            "Please select your state", Toast.LENGTH_SHORT).show();
                }
            }
        });

    // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.states_array, android.R.layout.simple_spinner_item);

    // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

    // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
    }

    public void OnNextBtnClicked(View view){

    }


}




