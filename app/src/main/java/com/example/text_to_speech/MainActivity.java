package com.example.text_to_speech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements TextToSpeech.OnInitListener{

    EditText edit;
    Button but;
    TextToSpeech tts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit=findViewById(R.id.et);
        but=findViewById(R.id.butt);

        tts=new TextToSpeech(MainActivity.this,this);

         but.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 String stationName=edit.getText().toString();

                 String text="Next station is"+stationName;

                 tts.speak(text,TextToSpeech.QUEUE_FLUSH,null);



             }
         });

         }

    @Override
    public void onInit(int i) {

    }
}
