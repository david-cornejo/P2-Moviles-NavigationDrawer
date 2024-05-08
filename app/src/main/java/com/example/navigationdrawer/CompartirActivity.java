package com.example.navigationdrawer;

import static com.example.navigationdrawer.MainActivity.openDrawer;
import static com.example.navigationdrawer.MainActivity.redirectActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.drawerlayout.widget.DrawerLayout;

public class CompartirActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    ImageView menu;
    LinearLayout pagina_principal, configuracion, compartir, sobre_nosotros, cerrar_sesion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compartir);
        drawerLayout = findViewById(R.id.drawerLayout);
        menu = findViewById(R.id.menu);
        pagina_principal = findViewById(R.id.home);
        configuracion = findViewById(R.id.configuracion);
        compartir = findViewById(R.id.compartir);
        sobre_nosotros = findViewById(R.id.sobrenosotros);
        cerrar_sesion = findViewById(R.id.logout);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDrawer(drawerLayout);
            }
        });

        pagina_principal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                redirectActivity(CompartirActivity.this, MainActivity.class);
            }
        });

        configuracion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                redirectActivity(CompartirActivity.this, SettingsActivity.class);
            }
        });

        compartir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recreate();
            }
        });

        sobre_nosotros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                redirectActivity(CompartirActivity.this, SobreNosotrosActivity.class);
            }
        });

        cerrar_sesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CompartirActivity.this, "Cerrando Sesión", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
