package twin.developers.recyclerview;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

import twin.developers.recyclerview.databinding.ActivityMapaactivityBinding;

public class mapaactivity extends FragmentActivity implements OnMapReadyCallback {
    private GoogleMap mMap;
    LatLng AVBRAZIL = new LatLng(-36.612672, -72.114803);
    LatLng AVECUADOR = new LatLng(-36.597839, -72.109203);
    LatLng AVARGENTINA = new LatLng(-36.602338, -72.090729);
    LatLng AVCOLLIN = new LatLng(-36.616987, -72.096417);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapaactivity);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.getUiSettings().setCompassEnabled(true);
        mMap.getUiSettings().setIndoorLevelPickerEnabled(true);

        // Add a marker in Sydney and move the camera
        LatLng Rburger = new LatLng(-36.6083147, -72.1115355);
        mMap.addMarker(new MarkerOptions().position(Rburger).title("Randy's Burger"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Rburger, 15.0f));
        //mMap.moveCamera((CameraUpdateFactory.zoomIn()));

        LatLng Pjohns = new LatLng(-36.6070714, -72.0923757);
        mMap.addMarker(new MarkerOptions().position(Pjohns).title("Papa John's"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Pjohns, 15.0f));
        //mMap.moveCamera((CameraUpdateFactory.zoomIn()));

        LatLng Tentao = new LatLng(-36.6119383, -72.0940866);
        mMap.addMarker(new MarkerOptions().position(Tentao).title("Tentao"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Tentao, 15.0f));
        //mMap.moveCamera((CameraUpdateFactory.zoomIn()));

        mMap.addPolyline((new PolylineOptions()).add(AVBRAZIL, AVECUADOR, AVARGENTINA, AVCOLLIN, AVBRAZIL).
                width(5).color(Color.RED).geodesic(true));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(AVBRAZIL, 14));


    }
}