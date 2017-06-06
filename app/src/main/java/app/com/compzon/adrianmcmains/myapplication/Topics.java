package app.com.compzon.adrianmcmains.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import static android.view.View.OnClickListener;

/**
 * Created by adrianmcmains on 01/06/2017.
 */

public class Topics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topics);

        View mongodb = this.findViewById(R.id.mongodb);
        mongodb.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Topics.this.startActivity(new Intent(Topics.this, Mongodb.class));
            }
        });

        View expressjs = this.findViewById(R.id.expressjs);
        expressjs.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Topics.this.startActivity(new Intent(Topics.this, Expressjs.class));
            }
        });

        View angularjs = this.findViewById(R.id.angularjs);
        angularjs.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Topics.this.startActivity(new Intent(Topics.this, Angularjs.class));
            }
        });

        View nodejs = this.findViewById(R.id.nodejs);
        nodejs.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Topics.this.startActivity(new Intent(Topics.this, Nodejs.class));
            }
        });



    }


}


