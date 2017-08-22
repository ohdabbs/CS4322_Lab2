package com.example.odabbs.cs4322lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class PizzaPricerActivity extends AppCompatActivity {

    TextView sizeText = (TextView)findViewById(R.id.sizeText);
    SeekBar sizeSeekBar = (SeekBar)findViewById(R.id.sizeSeekBar);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_pricer);

        sizeSeekBar.setMax(26);
        sizeSeekBar.setProgress(16);
        sizeSeekBar.incrementProgressBy(2);

        sizeSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                sizeText.setText(String.valueOf(i) + '"');
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //TO DO
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //TO DO
            }
        });
    }
}
