package com.mapas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAntigua = (Button) findViewById(R.id.btnAntigua);
        btnAntigua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarUbicacion(0);
            }
        });

        Button btnPana = (Button) findViewById(R.id.btnPana);
        btnPana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarUbicacion(1);
            }
        });

        Button btnTikal = (Button) findViewById(R.id.btnTikal);
        btnTikal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarUbicacion(2);
            }
        });

        Button btnCiudad = (Button) findViewById(R.id.btnCiudad);
        btnCiudad.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarUbicacion(3);
            }
        }));
    }

    private void mostrarUbicacion(int ubicacion){
        Intent intent = new Intent(this, MapsActivity.class);
        switch(ubicacion){
            case 0:
                intent.putExtra("latitud", 14.5573);
                intent.putExtra("longitud",-90.7332);
                intent.putExtra("ciudad", "Antigua Guatemala");
                intent.putExtra("colorMarker", BitmapDescriptorFactory.HUE_AZURE);
                startActivity(intent);
                break;
            case 1:
                intent.putExtra("latitud", 14.7405);
                intent.putExtra("longitud",-91.1521);
                intent.putExtra("ciudad", "Panajachel");
                intent.putExtra("colorMarker", BitmapDescriptorFactory.HUE_BLUE);
                startActivity(intent);
                break;
            case 2:
                intent.putExtra("latitud", 17.2249);
                intent.putExtra("longitud",-89.611);
                intent.putExtra("ciudad", "Tikal");
                intent.putExtra("colorMarker", BitmapDescriptorFactory.HUE_CYAN);
                startActivity(intent);
                break;
            case 3:
                intent.putExtra("latitud", 14.6349);
                intent.putExtra("longitud",-90.5069);
                intent.putExtra("ciudad", "Ciudad");
                intent.putExtra("colorMarker", BitmapDescriptorFactory.HUE_GREEN);
                startActivity(intent);
                break;
        }
    }
}