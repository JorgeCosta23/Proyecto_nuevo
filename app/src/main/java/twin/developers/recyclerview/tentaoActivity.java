package twin.developers.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class tentaoActivity extends AppCompatActivity {
    private RecyclerView courseRV;

    // Arraylist for storing data
    private ArrayList<localtentao> courseModelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tentao_activity);
        courseRV = findViewById(R.id.idRVCoursetentao);
        // here we have created new array list and added data to it.
        courseModelArrayList = new ArrayList<>();
        courseModelArrayList.add(new localtentao("Classic", "Burger, tomate, lechuga, mayo.", "$6.190", R.drawable.burger6));
        courseModelArrayList.add(new localtentao("Del huerto", "Burger, tomate, lechuga, cebolla morada, pepinillo, mayo tentao.", "$6.790", R.drawable.burger5));
        courseModelArrayList.add(new localtentao("Italiana", "Burger, tomate, palta, mayo tentao.", "$5.990", R.drawable.burger4));
        courseModelArrayList.add(new localtentao("Brasil", "Burger, palta, choclo, mayo tentao.", "$6.190", R.drawable.burger3));
        courseModelArrayList.add(new localtentao("Irlandesa", "Burger, tomate, lechuga, choclo, mayo tentao.", "$6.790", R.drawable.burger2));
        courseModelArrayList.add(new localtentao("Primavera", "Tomate, lechuga, choclo, pepinillo, champiñones y mayo tentao.", "$6.100", R.drawable.burger1));
        // we are initializing our adapter class and passing our arraylist to it.
        localtentaoAdapter courseAdapter = new localtentaoAdapter(this, courseModelArrayList);

        // below line is for setting a layout manager for our recycler view.
        // here we are creating vertical list so we will provide orientation as vertical
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        // in below two lines we are setting layoutmanager and adapter to our recycler view.
        courseRV.setLayoutManager(linearLayoutManager);
        courseRV.setAdapter(courseAdapter);
    }

}