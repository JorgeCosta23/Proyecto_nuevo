package twin.developers.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class botonesactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botonesactivity);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");

        Button botonlocales = (Button) findViewById(R.id.idlistalocales);
        botonlocales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplicationContext(), btlistalocales.class);
                startActivity(intent1);
                myRef.setValue("Cliqueaste el botón Lista Locales");
            }

        });
        View boton1 = findViewById(R.id.idmapageneral);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), mapaactivity.class);
                startActivity(intent);
                myRef.setValue("Cliqueaste el botón mapa general");

            }
        });
        Button cerrarsesion = (Button) findViewById(R.id.idcerrarsesion);
        cerrarsesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplicationContext(), loginactivity.class);
                startActivity(intent1);
                myRef.setValue("Cliqueaste el botón Cerrar sesión");
            }
        });
    }
}