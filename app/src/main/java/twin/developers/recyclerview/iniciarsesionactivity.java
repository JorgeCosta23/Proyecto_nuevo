package twin.developers.recyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class iniciarsesionactivity extends AppCompatActivity {

    private EditText correo;
    private EditText contraseña;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciarsesionactivity);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");

        correo = findViewById(R.id.correo);
        contraseña = findViewById(R.id.contraseña);

        mAuth = FirebaseAuth.getInstance();
    }
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        //updateUI(currentUser);
    }

    public void iniciarsesion(View view){
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");

        mAuth.signInWithEmailAndPassword(correo.getText().toString().trim(),contraseña.getText().toString())
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            FirebaseUser user = mAuth.getCurrentUser();
                            Toast.makeText(getApplicationContext()," Inicio de sesión exitoso",
                                    Toast.LENGTH_SHORT).show();
                            Intent i = new Intent(getApplicationContext(),btlistalocales.class);
                            startActivity(i);
                            myRef.setValue("Cliqueaste el botón iniciar sesión para ingresar a la aplicación");
                            //updateUI(user);
                        }else{
                            myRef.setValue("Hay un error en el inicio de sesión");
                            Toast.makeText(getApplicationContext(),"Error en inicio de sesión",
                                    Toast.LENGTH_SHORT).show();
                            //updateUI(null);
                        }
                    }
                });

    }

}



