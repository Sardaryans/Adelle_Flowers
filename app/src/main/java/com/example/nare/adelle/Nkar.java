package com.example.nare.adelle;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.liuguangqiang.swipeback.SwipeBackActivity;
import com.liuguangqiang.swipeback.SwipeBackLayout;

public class Nkar extends SwipeBackActivity {

    ImageView imageView;
    TextView gin, model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_nkar);
        setDragEdge(SwipeBackLayout.DragEdge.LEFT);


        gin = (TextView) findViewById(R.id.ginnkar);
        model = (TextView) findViewById(R.id.modelnkar);
        imageView = (ImageView) findViewById(R.id.nkarinfo);

        Intent intent = getIntent();
        model.setText(intent.getStringExtra("key1"));
        gin.setText(intent.getStringExtra("key2"));
        imageView.setImageResource(intent.getIntExtra("key", 2));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.home) {
            startActivity(new Intent(Nkar.this, MainActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }
}
