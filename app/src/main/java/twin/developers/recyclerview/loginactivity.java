package twin.developers.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class loginactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");


        Button Buttoniniciar = (Button) findViewById(R.id.botoniniciar);
        Buttoniniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplicationContext(), iniciarsesionactivity.class);
                startActivity(intent1);
                myRef.setValue("Cliqueaste el botón iniciar a la aplicación");
            }
        });
        Button Buttonregistrarse = (Button) findViewById(R.id.botonregistrarse);
        Buttonregistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplicationContext(), registrarseactivity.class);
                startActivity(intent1);
                myRef.setValue("Cliqueaste el botón registrarse de la aplicación");
            }
        });

    }


}
