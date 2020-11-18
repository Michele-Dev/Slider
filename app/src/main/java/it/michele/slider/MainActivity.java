package it.michele.slider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView acceso_t = findViewById(R.id.acceso_textview);
        TextView spento_t = findViewById(R.id.spento_textview);
        Button acceso_b = findViewById(R.id.acceso_bottone);
        Button spento_b = findViewById(R.id.spento_bottone);

        Switch switcher = findViewById(R.id.switcher);

        switcher.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked){
                acceso_t.setVisibility(View.VISIBLE);
                acceso_b.setVisibility(View.VISIBLE);
                spento_t.setVisibility(View.INVISIBLE);
                spento_b.setVisibility(View.INVISIBLE);
            } else {
                spento_t.setVisibility(View.VISIBLE);
                spento_b.setVisibility(View.VISIBLE);
                acceso_t.setVisibility(View.INVISIBLE);
                acceso_b.setVisibility(View.INVISIBLE);
            }
        });
    }
}