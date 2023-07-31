package sg.edu.rp.c326.id22015010.p10_demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView lvAndroidVersions;
ArrayList<AndroidVersion> alAndroidVersions;
//ArrayAdapter<AndroidVersion> aaAndroidVersions;
    CustomAdapter adapter;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvAndroidVersions = findViewById(R.id.listViewAndroidVersions);
        alAndroidVersions = new ArrayList<>();

        //Old code below:
        //alAndroidVersions.add("Pie - 9.0");
        //alAndroidVersions.add("Oreo - 8.0 - 8.1");
        //alAndroidVersions.add("Nougat - 7.0 - 7.1.2");
        //alAndroidVersions.add("Marshmallow - 6.0 - 6.0.1");
        //alAndroidVersions.add("Lollipop- 5.0 - 5.1.1");
        //alAndroidVersions.add("KitKat - 4.4 - 4.4.4");
        //alAndroidVersions.add("Oreo - 4.1 - 4.3.1");

        AndroidVersion item1 = new AndroidVersion("Pie", "9.0");
        AndroidVersion item2 = new AndroidVersion("Oreo", "8.0 - 8.1");
        AndroidVersion item3 = new AndroidVersion("Nougat", "7.0 - 7.1.2");

        alAndroidVersions.add(item1);
        alAndroidVersions.add(item2);
        alAndroidVersions.add(item3);

        //aaAndroidVersions = new ArrayAdapter<>(this,
        //        android.R.layout.simple_list_item_1, alAndroidVersions);
        adapter= new CustomAdapter(this, R.layout.row, alAndroidVersions);
        //lvAndroidVersions.setAdapter(aaAndroidVersions);
        lvAndroidVersions.setAdapter(adapter);
    }
}