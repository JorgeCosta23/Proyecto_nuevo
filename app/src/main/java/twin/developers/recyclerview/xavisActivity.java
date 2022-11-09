package twin.developers.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class xavisActivity extends AppCompatActivity {
    private RecyclerView courseRV;

    // Arraylist for storing data
    private ArrayList<localxavis> courseModelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xavis_activity);
        courseRV = findViewById(R.id.idRVCoursexavis);
        // here we have created new array list and added data to it.
        courseModelArrayList = new ArrayList<>();
        courseModelArrayList.add(new localxavis("Fries Black", "Pollo mongoliano (salteado de pollo con cebollin, salsa de soya y toques de sésamo).", "$4.490", R.drawable.xavis1));
        courseModelArrayList.add(new localxavis("Fries Style", "Soofvlees (carne mechada de res cocicnada al mas puro estilo belga).", "$5.190", R.drawable.xavis2));
        courseModelArrayList.add(new localxavis("Fries Chiken", "Chiken club (estofado de pollo con verduras).", "$3.690", R.drawable.xavis3));
        courseModelArrayList.add(new localxavis("Fries Veggie", "Veggie style (carne de soya cocinada con salga de tomate, verduras y perfumado con albahaca).", "$2.580", R.drawable.xavis4));
        courseModelArrayList.add(new localxavis("Fries xavillana", "Xavillana L (carne mechada de res, pollo, longaniza, cebolla caramelizada y huevo frito).", "$11.590", R.drawable.xavis5));
        courseModelArrayList.add(new localxavis("Fries kids", "Kids Fries (papas fries, nuggets de pollo, smile de papa y salchicha).", "$4.390", R.drawable.xavis6));
        // we are initializing our adapter class and passing our arraylist to it.
        localxavisAdapter courseAdapter = new localxavisAdapter(this, courseModelArrayList);

        // below line is for setting a layout manager for our recycler view.
        // here we are creating vertical list so we will provide orientation as vertical
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        // in below two lines we are setting layoutmanager and adapter to our recycler view.
        courseRV.setLayoutManager(linearLayoutManager);
        courseRV.setAdapter(courseAdapter);
    }

}