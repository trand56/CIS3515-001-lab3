package temple.edu.coloradapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ColorAdapter colAdapter = new ColorAdapter(this);
        Spinner spin = findViewById(R.id.colorSpinner);
        spin.setAdapter(colAdapter);



    }
}
