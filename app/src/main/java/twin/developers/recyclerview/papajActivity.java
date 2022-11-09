package twin.developers.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class papajActivity extends AppCompatActivity {
    private RecyclerView courseRV;

    // Arraylist for storing data
    private ArrayList<localpapaj> courseModelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.papaj_activity);
        courseRV = findViewById(R.id.idRVCoursepapaj);
        // here we have created new array list and added data to it.
        courseModelArrayList = new ArrayList<>();
        courseModelArrayList.add(new localpapaj("Todas las carnes", "Queso mozzarella, peperoni, jamón, tocino y salchicha italiana.", "$12.100", R.drawable.pizza1));
        courseModelArrayList.add(new localpapaj("Pollo BBQ", "Queso mozzarella, pollo, tocino, cebolla y salsa bbq.", "$11.050", R.drawable.pizza2));
        courseModelArrayList.add(new localpapaj("Napolitana", "Queso mozzarella, oregano y tomate.", "$8.950", R.drawable.pizza3));
        courseModelArrayList.add(new localpapaj("Canadian Bacon", "Queso mozzarella, lomito canadiense, tocino, queso mozzarella, parmesano y romano.", "$11.050", R.drawable.pizza4));
        courseModelArrayList.add(new localpapaj("Italiana", "Queso mozzarella, orégano, pepperoni, salchicha italiana, aceitunas negras y champiñón.", "$12.180", R.drawable.pizza5));
        courseModelArrayList.add(new localpapaj("Pollo Caprese", "Salsa de tomate natural, pollo, tomate cherry, shot de pesto y queso mozzarella.", "$13.750", R.drawable.pizza6));
        // we are initializing our adapter class and passing our arraylist to it.
        localpapajAdapter courseAdapter = new localpapajAdapter(this, courseModelArrayList);

        // below line is for setting a layout manager for our recycler view.
        // here we are creating vertical list so we will provide orientation as vertical
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        // in below two lines we are setting layoutmanager and adapter to our recycler view.
        courseRV.setLayoutManager(linearLayoutManager);
        courseRV.setAdapter(courseAdapter);
    }

}