package app.com.compzon.adrianmcmains.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //This method is called when the "continue Learning" button is pressed
            public void onClick(View view)
            {
                //This is an explicit Intent
                Intent in = new Intent(MainActivity.this, Topics.class);

                //Use this to populate the new Activity
                startActivity(in);
            }

        });
    }
}
