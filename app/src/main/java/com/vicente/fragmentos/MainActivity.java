package com.vicente.fragmentos;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends AppCompatActivity {

    Button primerFragment, segundoFragment;

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);
        primerFragment = (Button) findViewById(R.id.btnPrimerFragmento);
        segundoFragment = (Button) findViewById(R.id.btnSegundoFragmento);

        primerFragment.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                cargarFragmento(new PrimerFragmento());
            }
        });

        segundoFragment.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                cargarFragmento(new SegundoFragmento());
            }
        });
    }

    private void cargarFragmento(Fragment fragmento ){
        FragmentManager manager = this.getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.frameLayout, fragmento).commit();
    }
}