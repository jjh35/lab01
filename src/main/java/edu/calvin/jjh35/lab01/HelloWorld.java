package edu.calvin.jjh35.lab01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class HelloWorld extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);
        Toast.makeText( this, "Hello jjh35!", Toast.LENGTH_LONG ).show();

    }
}
