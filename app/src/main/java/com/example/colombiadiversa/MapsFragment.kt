package com.example.colombiadiversa

import androidx.fragment.app.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil.setContentView

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.GoogleMap.OnMapClickListener

class MapsFragment : Fragment() {

    private val callback = OnMapReadyCallback { googleMap ->
        /*
         * Manipulates the map once available.
         * This callback is triggered when the map is ready to be used.
         * This is where we can add markers or lines, add listeners or move the camera.
         * In this case, we just add a marker near Sydney, Australia.
         * If Google Play services is not installed on the device, the user will be prompted to
         * install it inside the SupportMapFragment. This method will only be triggered once the
         * user has installed Google Play services and returned to the app.
         */
        val sydney = LatLng(4.658480, -74.130581)
        googleMap.addMarker(MarkerOptions().position(sydney).title("POI"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(sydney))

/*        googleMap.setOnMarkerClickListener(this)
        googleMap.uiSettings.isZoomControlsEnabled= true*/

    }

    // private lateinit var mMap: GoogleMap
    // private lateinit var binding: ActivityMapsBinding

/*    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)

    }*/

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_maps, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment?.getMapAsync(callback)
    }

/*    fun onMarkerClick(p0: Marker?) = false

    fun onMapReady(p0: GoogleMap?) {
    }*/

/*    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        val marca = LatLng(4.658480, -74.130581)
        mMap.addMarker(MarkerOptions().position(marca).title("POI"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(marca))

        mMap.setOnMarkerClickListener(this)
        mMap.uiSettings.isZoomControlsEnabled= true
    }

    override fun onMarkerClick(p0: Marker?) = false*/

}