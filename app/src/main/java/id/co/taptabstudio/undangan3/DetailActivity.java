package id.co.taptabstudio.undangan3;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;

public class DetailActivity extends AppCompatActivity {
    Intent i;
    ViewStub stub1, stub2, stub3;
    int detailAtas, detailTengah, detailBawah;
    String titleActionBar;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        i = getIntent();
        actionBar = getSupportActionBar();

        detailAtas = i.getIntExtra("detailAtas", 0);
        detailTengah = i.getIntExtra("detailTengah", 0);
        detailBawah = i.getIntExtra("detailBawah", 0);
        titleActionBar = i.getStringExtra("titleActionBar");

        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle(titleActionBar);

        stub1 = findViewById(R.id.includeAtas);
        stub2 = findViewById(R.id.includeTengah);
        stub3 = findViewById(R.id.includeBawah);

        stub1.setLayoutResource(detailAtas);
        stub2.setLayoutResource(detailTengah);
        stub3.setLayoutResource(detailBawah);


        View stuba = stub1.inflate();
        View stubb = stub2.inflate();
        View stubc= stub3.inflate();
    }
}
