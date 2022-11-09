package twin.developers.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ramonaActivity extends AppCompatActivity {
    private RecyclerView courseRV;

    // Arraylist for storing data
    private ArrayList<localramona> courseModelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ramona_activity);
        courseRV = findViewById(R.id.idRVCourseramona);
        // here we have created new array list and added data to it.
        courseModelArrayList = new ArrayList<>();
        courseModelArrayList.add(new localramona("40 piezas amateur", "10 envueltos en palta, 10 envueltos en queso, 10 envueltos en sesamo y 19 fritos.", "$18.390", R.drawable.sushi1));
        courseModelArrayList.add(new localramona("30 furay tentación", "20 en panko (pollo-palta-queso) y 10 en panko (camarón-palta-queso).", "$13.690", R.drawable.sushi2));
        courseModelArrayList.add(new localramona("Ebi acevichado", "Roll frito en panko, relleno con camarón furai, palta, ciboulette, queso crema.", "$8.990", R.drawable.sushi6));
        courseModelArrayList.add(new localramona("30 verde mix", "10 envueltos en palta, 10 envueltos en queso y 10 fritos en panko.", "$14.290", R.drawable.sushi3));
        courseModelArrayList.add(new localramona("Rolls envueltos en salmón", "Relleno con camarón furai, palta y cebollin.", "$7.290", R.drawable.sushi4));
        courseModelArrayList.add(new localramona("Roll Serrano", "Roll envuelto en jamón serrano relleno con rucula, albahaca, queso mozarella y salsa.", "$8.990", R.drawable.sushi5));
        // we are initializing our adapter class and passing our arraylist to it.
        localramonaAdapter courseAdapter = new localramonaAdapter(this, courseModelArrayList);

        // below line is for setting a layout manager for our recycler view.
        // here we are creating vertical list so we will provide orientation as vertical
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        // in below two lines we are setting layoutmanager and adapter to our recycler view.
        courseRV.setLayoutManager(linearLayoutManager);
        courseRV.setAdapter(courseAdapter);
    }

}