package Careservice.pa

import android.Manifest
import android.annotation.SuppressLint
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.core.app.ActivityCompat
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    companion object {
        private const val REQUEST_LOCATION_PERMISSION = 1
    }

    @SuppressLint("MissingPermission")
    private fun enableMyLocation() {
        if (ActivityCompat.checkSelfPermission(this.applicationContext,
                Manifest.permission.ACCESS_FINE_LOCATION
            ) == PackageManager.PERMISSION_GRANTED) {
            map.isMyLocationEnabled = true
        }
        else {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
                REQUEST_LOCATION_PERMISSION
            )
        }
    }
    private lateinit var map: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)

        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }
    override fun onMapReady(gMap: GoogleMap) {
        map = gMap
        enableMyLocation()
        gMap.isMyLocationEnabled
        val lokasi = LatLng(-6.920432082789247, 107.60370834146391)
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(lokasi, 7f))
    }
        override fun onCreateOptionsMenu(menu: Menu?): Boolean {
            menuInflater.inflate(R.menu.map_options, menu)
            return true
        }
    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.daihatsu -> {
            val lokasi = LatLng(-6.916660193827724, 107.62760011409567)
            map.addMarker(MarkerOptions().position(LatLng(-6.916660193827724, 107.62760011409567)).title("Tunas Daihatsu Bandung Ahmad Yani (Resmi) ((022)7202625)"))
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(lokasi, 15f))

            val lokasi2 = LatLng(-6.921953741753508, 107.61545148221488)
            map.addMarker(MarkerOptions().position(LatLng(-6.921953741753508, 107.61545148221488)).title("Astra Daihatsu Asia Afrika Bandung ((022)4239009)"))
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(lokasi2, 15f))

            val lokasi3 = LatLng(-6.904113797924487, 107.59770869989072)
            map.addMarker(MarkerOptions().position(LatLng(-6.904113797924487, 107.59770869989072)).title("Astra Daihatsu Bandung Pasirkaliki ((022)20522511)"))
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(lokasi3, 15f))

            val lokasid = LatLng(-6.917759, 107.615345)
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(lokasid, 12f))

            true
        }
        R.id.mitsubisi -> {
            val lokasi = LatLng(-6.947935417028264, 107.59665669956274)
            map.addMarker(MarkerOptions().position(LatLng(-6.947935417028264, 107.59665669956274)).title("Mitsubishi Fuso (00112233)"))
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(lokasi, 13f))
            map.maxZoomLevel

            val lokasi2 = LatLng(-6.917453882047423, 107.59840421595685)
            map.addMarker(MarkerOptions().position(LatLng(-6.917453882047423, 107.59840421595685)).title("Mitsubishi Mahligai Gardujati ((022)82002727)"))
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(lokasi2, 13f))

            val lokasi3 = LatLng(-6.9166186193347965, 107.62741257848232)
            map.addMarker(MarkerOptions().position(LatLng(-6.9166186193347965, 107.62741257848232)).title("DEALER MITSUBISHI (081320378087)"))
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(lokasi3, 13f))

            val lokasid = LatLng(-6.917759, 107.615345)
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(lokasid, 12f))

            true
            }
        R.id.toyota -> {
            val lokasi = LatLng(-6.931825106322614, 107.62639797353113)
            map.addMarker(MarkerOptions().position(LatLng(-6.931825106322614, 107.62639797353113)).title("Plaza Toyota Bandung ((022)7315555)"))
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(lokasi, 13f))
            map.maxZoomLevel

            val lokasi2 = LatLng(-6.9220188, 107.61523292872647)
            map.addMarker(MarkerOptions().position(LatLng(-6.9220188, 107.61523292872647)).title("Auto2000 Asia Afrika ((022)4242000)"))
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(lokasi2, 13f))

            val lokasi3 = LatLng(-6.892127056540839, 107.58448885756226)
            map.addMarker(MarkerOptions().position(LatLng(-6.892127056540839, 107.58448885756226)).title("Auto2000 Pasteur ((022)2000100)"))
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(lokasi3, 13f))

            val lokasid = LatLng(-6.917759, 107.615345)
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(lokasid, 12f))

            true
        }
        R.id.suzuki -> {
            val lokasi = LatLng(-6.888481238083846, 107.62498767968415)
            map.addMarker(MarkerOptions().position(LatLng(-6.888481238083846, 107.62498767968415)).title("Suzuki Drive Train 4x4 2 (085861314563)"))
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(lokasi, 13f))


            val lokasi2 = LatLng(-6.948943607018829, 107.62961347678134)
            map.addMarker(MarkerOptions().position(LatLng(-6.948943607018829, 107.62961347678134)).title("Suzukinyabdg (081313551718)"))
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(lokasi2, 13f))

            val lokasi3 = LatLng(-6.9443854687338895, 107.58640921778421)
            map.addMarker(MarkerOptions().position(LatLng(-6.9443854687338895, 107.58640921778421)).title("suzuki ignis bandung (081223408005)"))
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(lokasi3, 13f))

            val lokasid = LatLng(-6.917759, 107.615345)
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(lokasid, 12f))

            true
        }
            else -> super.onOptionsItemSelected(item)
        }
    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>,
        grantResult: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResult)
        if (requestCode == REQUEST_LOCATION_PERMISSION) {
            if (grantResult.isNotEmpty() &&
                grantResult[0] == PackageManager.PERMISSION_GRANTED) {
                enableMyLocation()
            }
        }
    }
}


