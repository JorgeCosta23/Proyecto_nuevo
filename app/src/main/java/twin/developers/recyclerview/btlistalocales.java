package twin.developers.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class btlistalocales extends AppCompatActivity {

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("message");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btlistalocales);


        Button localrandy = (Button) findViewById(R.id.idbotonrandy);
        localrandy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplicationContext(), randyActivity.class);
                startActivity(intent1);
                myRef.setValue("Cliqueaste el local Randy´s Burger");
            }
        });

        Button localtentao = (Button) findViewById(R.id.idbotontentao);
        localtentao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplicationContext(), tentaoActivity.class);
                startActivity(intent1);
                myRef.setValue("Cliqueaste el local Tentao");
                }
        });

        Button localpapaj = (Button) findViewById(R.id.idbotonpapaj);
        localpapaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplicationContext(), papajActivity.class);
                startActivity(intent1);
                myRef.setValue("Cliqueaste el local Papa John's");
            }
        });

        Button localxavis = (Button) findViewById(R.id.idbotonxavis);
        localxavis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplicationContext(), xavisActivity.class);
                startActivity(intent1);
                myRef.setValue("Cliqueaste el local Xavi's Fries");
            }
        });

        Button localramona = (Button) findViewById(R.id.idbotonramona);
        localramona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplicationContext(), ramonaActivity.class);
                startActivity(intent1);
                myRef.setValue("Cliqueaste el local Xavi's Fries");
            }
        });

        Button localquincho = (Button) findViewById(R.id.idbotonquincho);
        localquincho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplicationContext(), quinchoActivity.class);
                startActivity(intent1);
                myRef.setValue("Cliqueaste el local Quincho Sándwich");
            }
        });
    }
}