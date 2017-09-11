package jamk.l3326.excercise3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShow(View v) {
        double lat = Double.parseDouble(((EditText)findViewById(R.id.lat)).getText().toString());
        double lon = Double.parseDouble(((EditText)findViewById(R.id.lon)).getText().toString());

        Intent in = new Intent(Intent.ACTION_VIEW);
        in.setData(Uri.parse("geo:" + lat + "," + lon));
        startActivity(in);
    }
}
