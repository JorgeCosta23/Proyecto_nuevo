package twin.developers.recyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class registrarseactivity extends AppCompatActivity {

    private FirebaseAuth mAuth;

    private EditText correo;
    private EditText contraseña;
    private EditText contraseñaconfirmacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarseactivity);
        mAuth = FirebaseAuth.getInstance();

        correo = findViewById(R.id.correo);
        contraseña = findViewById(R.id.contraseña);
        contraseñaconfirmacion = findViewById(R.id.contraseñaConfirmacion);
    }
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        //updateUI(currentUser);
    }

    public void registrarusuario (View view){
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");

        if (contraseña.getText().toString().equals(contraseñaconfirmacion.getText().toString())){

            mAuth.createUserWithEmailAndPassword(correo.getText().toString(), contraseña.getText().toString())
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()){
                                Toast.makeText(getApplicationContext(),"Usuario creado",Toast.LENGTH_SHORT).show();
                                myRef.setValue("El usuario ha sido creado");
                                FirebaseUser user = mAuth.getCurrentUser();
                                Intent i = new Intent(getApplicationContext(),loginactivity.class);
                                startActivity(i);

                                //updateUI(user);

                            } else {
                                myRef.setValue("Hay un error, autenticación fallida");
                                Toast.makeText(getApplicationContext(),"Autenticación fallida",Toast.LENGTH_SHORT).show();
                                //updateUI(null);
                            }
                        }
                    });
        }else{
            myRef.setValue("Las contraseñas no coinciden");
            Toast.makeText(this,"Las contraseñas no coinciden",Toast.LENGTH_SHORT).show();
        }

                        }




    }
