package id.co.taptabstudio.undangan3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;

public class MainActivity extends AppCompatActivity {
    Intent i;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tombolWaktuDanTempat(View view) {
        i = new Intent(this, DetailActivity.class);
        i.putExtra("detailAtas", R.layout.content_waktu_tempat);
        i.putExtra("detailTengah", R.layout.content_waktu_tempat_tengah);
        i.putExtra("detailBawah", R.layout.content_waktu_tempat_bawah);
        i.putExtra("titleActionBar", "Waktu & Tempat");
        startActivity(i);

    }

    public void tombolCeritaKami(View view) {
        i = new Intent(this, DetailActivity.class);
        i.putExtra("detailAtas", R.layout.content_cerita_kami_atas);
        i.putExtra("detailTengah", R.layout.content_cerita_kami_tengah);
        i.putExtra("detailBawah", R.layout.content_cerita_kami_bawah);
        i.putExtra("titleActionBar", "Cerita Kami");
        startActivity(i);
    }

    public void tombolUcapan(View view) {
        i = new Intent(this, DetailActivity.class);
        i.putExtra("detailAtas", R.layout.content_ucapan_atas);
        i.putExtra("detailTengah", R.layout.content_ucapan_tangah);
        i.putExtra("detailBawah", R.layout.content_ucapan_bawah);
        i.putExtra("titleActionBar", "Ucapan");
        startActivity(i);
    }

    public void tombolGaleri(View view) {
        i = new Intent(this, DetailActivity.class);
        i.putExtra("detailAtas", R.layout.content_galeri_atas);
        i.putExtra("detailTengah", R.layout.content_galeri_tengah);
        i.putExtra("detailBawah", R.layout.content_galeri_bawah);
        i.putExtra("titleActionBar", "Galeri Foto");
        startActivity(i);
    }

    public void tombolDenah(View view) {
        i = new Intent(this, DetailActivity.class);
        i.putExtra("detailAtas", R.layout.content_denah_atas);
        i.putExtra("detailTengah", R.layout.content_denah_tengah);
        i.putExtra("detailBawah", R.layout.content_denah_bawah);
        i.putExtra("titleActionBar", "Denah Lokasi");
        startActivity(i);
    }

    public void tombolFQ(View view) {
        i = new Intent(this, DetailActivity.class);
        i.putExtra("detailAtas", R.layout.content_lainnya_atas);
        i.putExtra("detailTengah", R.layout.content_lainnya_tengah);
        i.putExtra("detailBawah", R.layout.content_lainnya_bawah);
        i.putExtra("titleActionBar", "Lainnya");
        startActivity(i);
    }
}
