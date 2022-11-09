package twin.developers.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class quinchoActivity extends AppCompatActivity {
    private RecyclerView courseRV;

    // Arraylist for storing data
    private ArrayList<localquincho> courseModelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quincho_activity);
        courseRV = findViewById(R.id.idRVCoursequincho);
        // here we have created new array list and added data to it.
        courseModelArrayList = new ArrayList<>();
        courseModelArrayList.add(new localquincho("Sandwich italiano XL", "Tomate, palta y mayonesa casera.", "$9.490", R.drawable.san1));
        courseModelArrayList.add(new localquincho("Sandwich a lo pobre XL", "Huevo, cebolla caramelizada y mayonesa casera.", "$9.890", R.drawable.san2));
        courseModelArrayList.add(new localquincho("Sandwich dinámico", "Palta, tomate, salsa americana, salsa verde y mayonesa.", "$7.290", R.drawable.san3));
        courseModelArrayList.add(new localquincho("Sandwich gringo", "Tocino crocante, queso cheddar, tomate, lechuga y pepinillos.", "$6.890", R.drawable.san4));
        courseModelArrayList.add(new localquincho("Sandwich grosero", "Tomate, lechuga, porotos verdes, tocino y cebolla morada.", "$5.990", R.drawable.san5));
        courseModelArrayList.add(new localquincho("Sandwich ñublensino XL", "Tomate, palta, verduras salteadas, salsa verde, queso y mayonesa cacera", "$8.990", R.drawable.san6));
        // we are initializing our adapter class and passing our arraylist to it.
        localquinchoAdapter courseAdapter = new localquinchoAdapter(this, courseModelArrayList);

        // below line is for setting a layout manager for our recycler view.
        // here we are creating vertical list so we will provide orientation as vertical
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        // in below two lines we are setting layoutmanager and adapter to our recycler view.
        courseRV.setLayoutManager(linearLayoutManager);
        courseRV.setAdapter(courseAdapter);
    }

}