package com.example.a04_26;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button btnbuttonsair, btneverafterhigh,btnbarbie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btneverafterhigh=findViewById(R.id.btneverafterhigh);

        btnbarbie=findViewById(R.id.btnbarbie);

        btnbuttonsair=findViewById(R.id.btnbuttonsair);

        btnbuttonsair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        btneverafterhigh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent tela2 = new Intent(MainActivity.this, tela2.class);
               startActivity(tela2);
            }
        });

        btnbarbie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela3 = new Intent(MainActivity.this, tela3.class);
                startActivity(tela3);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mango, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.cadastro:
                cadastro();
                return true;
            case R.id.sair:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void cadastro() {
    }
}