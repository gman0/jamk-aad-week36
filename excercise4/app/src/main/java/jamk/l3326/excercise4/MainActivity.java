package jamk.l3326.excercise4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lv = (ListView) findViewById(R.id.list);

        String[] phones = new String[]{
                "Android", "iPhone", "WindowsMobile", "Blackberry", "WebOS", "Ubuntu",
                "Android", "iPhone", "WindowsMobile", "Blackberry", "WebOS", "Ubuntu"
        };

        final ArrayList<String> data = new ArrayList<>();
        for (String phone : phones) {
            data.add(phone);
        }

        PhoneArrayAdapter adapter = new PhoneArrayAdapter(this, data);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // get list row data (now String as a phone name)
                String phone = data.get(position);
                // create an explicit intent
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                // add data to intent
                intent.putExtra("phone", phone);
                // start a new activity
                startActivity(intent);
            }
        });
    }
}
