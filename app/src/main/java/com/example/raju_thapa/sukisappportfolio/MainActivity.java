package com.example.raju_thapa.sukisappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    /** Called when the user touches the button */
    public void sendMessage(View view) {
        Context context = getApplicationContext();

        CharSequence text1 = "This button will launch streamer app!";
        CharSequence text2 = "This button will launch scores app!";
        CharSequence text3 = "This button will launch library app!";
        CharSequence text4 = "This button will launch build it bigger!";
        CharSequence text5 = "This button will launch XYZ reader!";
        CharSequence text6 = "This button will launch my app!";
        int duration = Toast.LENGTH_SHORT;

        switch(view.getId()) {
            case R.id.button1:
                Toast.makeText(context, text1, duration).show();
                break;
            case R.id.button2:
                Toast.makeText(context, text2, duration).show();
                break;
            case R.id.button3:
                Toast.makeText(context, text3, duration).show();
                break;
            case R.id.button4:
                Toast.makeText(context, text4, duration).show();
                break;
            case R.id.button5:
                Toast.makeText(context, text5, duration).show();
                break;
            case R.id.button6:
                Toast.makeText(context, text6, duration).show();
                break;
        }
    }
}
