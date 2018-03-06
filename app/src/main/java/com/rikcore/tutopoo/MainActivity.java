package com.rikcore.tutopoo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textviewTitle;
    TextView textViewLife;
    TextView textViewStamina;
    TextView textViewPower;
    TextView textViewSpeed;
    TextView textViewValue;
    SeekBar seekBarLevel;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textviewTitle = (TextView)findViewById(R.id.textViewTitle);
        textViewLife = (TextView)findViewById(R.id.textViewLife);
        textViewPower = (TextView)findViewById(R.id.textViewPower);
        textViewStamina = (TextView)findViewById(R.id.textViewStamina);
        textViewSpeed = (TextView)findViewById(R.id.textViewSpeed);
        textViewValue = (TextView)findViewById(R.id.textViewValue);
        seekBarLevel = (SeekBar)findViewById(R.id.seekBarLevel);
        imageView = (ImageView)findViewById(R.id.imageView);

        seekBarLevel.setMax(100);

        final MonLudo monMonLudo = new MonLudo(1, 100, 50, 50, 50);

        fillTextView(monMonLudo);

        imageView.setImageResource(R.drawable.form_1);


        seekBarLevel.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int level = i;
                if (level == 0){
                    level = 1;
                }
                textViewValue.setText(String.valueOf(level));
                monMonLudo.evolution(level);
                fillTextView(monMonLudo);

                if(level < 30){
                    imageView.setImageResource(R.drawable.form_1);
                } else if (level < 60){
                    if (level == 30){
                        Toast.makeText(MainActivity.this, "EVOLUTION", Toast.LENGTH_SHORT).show();
                    }
                    imageView.setImageResource(R.drawable.form_2);
                } else if (level >= 60){
                    if (level == 60){
                        Toast.makeText(MainActivity.this, "EVOLUTION LUDO SUPREME", Toast.LENGTH_SHORT).show();
                    }
                    imageView.setImageResource(R.drawable.form_3);
                }


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }

    public void fillTextView(MonLudo connard){
        textviewTitle.setText("Mon MonLudo level : " + connard.getmLevel());
        textViewLife.setText("Point de vie : " + connard.getmLife());
        textViewSpeed.setText("Vitesse : " + connard.getmSpeed());
        textViewStamina.setText("Energie : " + connard.getmStamina());
        textViewPower.setText("Puissance : "   + connard.getmPower());
    }
}
