package twin.developers.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class randyActivity extends AppCompatActivity {
    private RecyclerView courseRV;

    // Arraylist for storing data
    private ArrayList<localrandy> courseModelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.randy_activity);
        courseRV = findViewById(R.id.idRVCourserandy);
        // here we have created new array list and added data to it.
        courseModelArrayList = new ArrayList<>();
        courseModelArrayList.add(new localrandy("Comboy burger con papas fritas", "Hamburguesa de vacuno, queso cheddar,lechuga,tocino y aros de cebolla.", "$5.990", R.drawable.burger1));
        courseModelArrayList.add(new localrandy("Happy belly burger con papas fritas", "Hamburguesa de vacuno, queso cheddar, lechuga, guacamole y choclo con mayonesa.", "$6.000", R.drawable.burger2));
        courseModelArrayList.add(new localrandy("Super bacon burger con papas fritas", "Hamb de vacuno con dos laminas de queso cheddar, tocino, con extra tocino en base de lechuga con pepinillos.", "$6.200", R.drawable.burger3));
        courseModelArrayList.add(new localrandy("Crunchy burger con papas fritas", "Base con mayonesa, pollo crispy, champiñones y palta con papas fritas.", "$5.900", R.drawable.burger4));
        courseModelArrayList.add(new localrandy("Tex-mex burger con papas fritas", "Hamburguesa de vacuno con base de palta mexicana con queso cheddar, cebolla morada, tocino y jalapeños.", "$6.500", R.drawable.burger5));
        courseModelArrayList.add(new localrandy("Tasty burger con papas fritas", "Hamburguesa de vacuno, en cama de lechuga picada fresca y salsa alioli, con queso cheddar derretido, cebolla bbq y tocino", "$6.100", R.drawable.burger6));
        // we are initializing our adapter class and passing our arraylist to it.
        localrandyAdapter courseAdapter = new localrandyAdapter(this, courseModelArrayList);

        // below line is for setting a layout manager for our recycler view.
        // here we are creating vertical list so we will provide orientation as vertical
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        // in below two lines we are setting layoutmanager and adapter to our recycler view.
        courseRV.setLayoutManager(linearLayoutManager);
        courseRV.setAdapter(courseAdapter);
    }

}