package com.example.javier.verpagina;

import android.content.Intent;
import android.content.ServiceConnection;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText VerD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VerD = (EditText) findViewById(R.id.edtDireccion);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activiy_main, menu);

        return true;
    }

    public void onClick(View view) {
        Intent i = new Intent(this, Activdad3.class);
        i.putExtra("direccion", VerD.getText().toString());
        startActivity(i);
    }
}
