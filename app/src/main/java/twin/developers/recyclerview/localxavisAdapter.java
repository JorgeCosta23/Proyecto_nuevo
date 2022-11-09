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

public class localxavisAdapter extends RecyclerView.Adapter<localxavisAdapter.Viewholder> {

    private Context context;
    private ArrayList<localxavis> localxavisArrayList;

    public localxavisAdapter(Context context, ArrayList<localxavis> localxavisArrayList) {
        this.context = context;
        this.localxavisArrayList = localxavisArrayList;

    }

    @NonNull
    @Override
    public localxavisAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.localxavis_layout,parent,false);
        return new Viewholder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {

        localxavis model = localxavisArrayList.get(position);
        holder.nombreproducto.setText(model.getNombre());
        holder.descripcionproducto.setText("" + model.getDescripcion());
        holder.precioproducto.setText(model.getPrecio());
        holder.courseIV.setImageResource(model.getImagen());
    }

    @Override
    public int getItemCount() {
        return localxavisArrayList.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        private ImageView courseIV;
        private TextView nombreproducto, descripcionproducto, precioproducto;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            courseIV = itemView.findViewById(idIVCourseImage);
            nombreproducto = itemView.findViewById(R.id.idnombrexavis);
            descripcionproducto = itemView.findViewById(R.id.iddescripcionxavis);
            precioproducto = itemView.findViewById(R.id.idprecioxavis);
        }

    }
}