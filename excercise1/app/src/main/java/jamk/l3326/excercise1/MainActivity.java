package jamk.l3326.excercise1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selectButtonClicked(View v) {
        RadioGroup rg = (RadioGroup)findViewById(R.id.rg);
        int id = rg.getCheckedRadioButtonId();

        RadioButton rb = (RadioButton)findViewById(id);
        String radioText = (String)rb.getText();

        Toast.makeText(getApplicationContext(), radioText, Toast.LENGTH_SHORT).show();
    }
}
