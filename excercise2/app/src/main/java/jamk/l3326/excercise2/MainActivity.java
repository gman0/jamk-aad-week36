package jamk.l3326.excercise2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoCompleteTextView compl = (AutoCompleteTextView)findViewById(R.id.login);
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,
                new String[]{"Pasi","Juha","Kari","Jouni","Esa","Hannu"});
        compl.setAdapter(aa);
    }

    public void onClickLogin(View v) {
        String login = ((EditText)findViewById(R.id.login)).getText().toString();
        String password =((EditText)findViewById(R.id.password)).getText().toString();
        Toast.makeText(getApplicationContext(), login + " " + password, Toast.LENGTH_SHORT).show();
    }
}
