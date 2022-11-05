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

public class LocalesAdapter  extends RecyclerView.Adapter<LocalesAdapter.Viewholder> {

    private Context context;
    private ArrayList<Locales> localesArrayList;

    public LocalesAdapter(Context context, ArrayList<Locales> localesArrayList) {
        this.context = context;
        this.localesArrayList = localesArrayList;

    }

    @NonNull
    @Override
    public LocalesAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.locales_layout,parent,false);
        return new Viewholder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull LocalesAdapter.Viewholder holder, int position) {

        Locales model = localesArrayList.get(position);
        holder.courseNameTV.setText(model.getNombre());
        holder.courseRatingTV.setText("" + model.getDireccion());
        holder.courseIV.setImageResource(model.getImagen());
    }

    @Override
    public int getItemCount() {
        return localesArrayList.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        private ImageView courseIV;
        private TextView courseNameTV, courseRatingTV;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            courseIV = itemView.findViewById(idIVCourseImage);
            courseNameTV = itemView.findViewById(R.id.idTVCourseName);
            courseRatingTV = itemView.findViewById(R.id.idTVCourseRating);
        }

    }
}
