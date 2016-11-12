package com.example.falc0n.gatepass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button slimsButton = (Button)findViewById(R.id.slimsButton);

        slimsButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView mysteryTatiana = (TextView)findViewById(R.id.mysteryTatiana);
                        mysteryTatiana.setText("Good Job Gyal!");
                    }
                }
        );
        slimsButton.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        TextView mysteryTatiana = (TextView)findViewById(R.id.mysteryTatiana);
                        mysteryTatiana.setText("Holy Crap, I stayed Long?...ok I think you stayed longer!");
                        return true;

                    }
                }
        );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
