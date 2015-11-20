package com.example.jugalgandhi.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button1,button2,button3,button4,button5,button6;
    String commonMessage = "This button will launch my";
    int duration = Toast.LENGTH_SHORT;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getApplicationContext();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        initializeComponents();
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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

    private void initializeComponents()
    {
        button1 = (Button) findViewById(R.id.spotify_button);
        button2 = (Button) findViewById(R.id.scores_button);
        button3 = (Button) findViewById(R.id.library_button);
        button4 = (Button) findViewById(R.id.build_button);
        button5 = (Button) findViewById(R.id.xyz_button);
        button6 = (Button) findViewById(R.id.capstone_button);

    }

    public void spotifyClicked(View view)
    {
        //Toast
        String text = commonMessage + "Spotify Streamer App!";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void scoresClicked(View view)
    {
        //Toast
        String text = commonMessage + "Scores App!";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void libraryClicked(View view)
    {
        //Toast
        String text = commonMessage + "Library App!";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void buildClicked(View view)
    {
        //Toast
        String text = commonMessage + "Build It Bigger App!";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void xyzClicked(View view)
    {
        //Toast
        String text = commonMessage + "XYZ Reader App!";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void capstoneClicked(View view)
    {
        //Toast
        String text = commonMessage + "Capstone App!";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
