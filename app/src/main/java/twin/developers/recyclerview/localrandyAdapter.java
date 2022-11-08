package twin.developers.recyclerview;

import static twin.developers.recyclerview.R.id.idIVCourseImage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class localrandyAdapter extends RecyclerView.Adapter<localrandyAdapter.Viewholder> {

    private Context context;
    private ArrayList<localrandy> localrandyArrayList;

    public localrandyAdapter(Context context, ArrayList<localrandy> localrandyArrayList) {
        this.context = context;
        this.localrandyArrayList = localrandyArrayList;

    }

    @NonNull
    @Override
    public localrandyAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.localrandy_layout,parent,false);
        return new Viewholder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {

        localrandy model = localrandyArrayList.get(position);
        holder.nombreproducto.setText(model.getNombre());
        holder.descripcionproducto.setText("" + model.getDescripcion());
        holder.precioproducto.setText(model.getPrecio());
        holder.courseIV.setImageResource(model.getImagen());
    }

    @Override
    public int getItemCount() {
        return localrandyArrayList.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        private ImageView courseIV;
        private TextView nombreproducto, descripcionproducto, precioproducto;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            courseIV = itemView.findViewById(idIVCourseImage);
            nombreproducto = itemView.findViewById(R.id.idnombretentao);
            descripcionproducto = itemView.findViewById(R.id.iddescripciontentao);
            precioproducto = itemView.findViewById(R.id.idpreciotentao);
        }

    }
}
