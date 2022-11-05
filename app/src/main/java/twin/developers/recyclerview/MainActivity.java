package twin.developers.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView courseRV;

    // Arraylist for storing data
    private ArrayList<Locales> courseModelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        courseRV = findViewById(R.id.idRVCourse);
        // here we have created new array list and added data to it.
        courseModelArrayList = new ArrayList<>();
        courseModelArrayList.add(new Locales("Randy's Burger", "Rosas #820, Chillán", R.drawable.burger3));
        courseModelArrayList.add(new Locales("Papa John's", "Av. Argentina #387, Chillán", R.drawable.burger2));
        courseModelArrayList.add(new Locales("Tentao", "Av. Argentina #772, Chillán", R.drawable.burger1));
        // we are initializing our adapter class and passing our arraylist to it.
        LocalesAdapter courseAdapter = new LocalesAdapter(this, courseModelArrayList);

        // below line is for setting a layout manager for our recycler view.
        // here we are creating vertical list so we will provide orientation as vertical
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        // in below two lines we are setting layoutmanager and adapter to our recycler view.
        courseRV.setLayoutManager(linearLayoutManager);
        courseRV.setAdapter(courseAdapter);
    }

}