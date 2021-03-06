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

    private Button btnbuttonsair, btneverafterhigh,btnbarbie,btnfrozen,btnhunted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btneverafterhigh=findViewById(R.id.btneverafterhigh);

        btnbarbie=findViewById(R.id.btnbarbie);

        btnfrozen=findViewById(R.id.btnfrozen);

        btnhunted=findViewById(R.id.btnhunted);

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

        btnfrozen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela4 = new Intent(MainActivity.this, tela4.class);
                startActivity(tela4);
            }
        });


        btnhunted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela5 = new Intent(MainActivity.this, tela5.class);
                startActivity(tela5);
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