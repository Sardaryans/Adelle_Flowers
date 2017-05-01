package com.example.nare.adelle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;

import com.liuguangqiang.swipeback.SwipeBackActivity;
import com.liuguangqiang.swipeback.SwipeBackLayout;

import java.util.ArrayList;
import java.util.List;

public class Tesakani_Activity extends SwipeBackActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    List<Itemclass> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tesakani);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setDragEdge(SwipeBackLayout.DragEdge.LEFT);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(Tesakani_Activity.this));

        list = new ArrayList<>();

        list.add(new Itemclass(R.drawable.a, "Adelle #1010", "Այս մոդելը բաղկացած է երեք մասից, որոնցից երկուսում ծաղկային կոմպոզիցիաներ են, իսկ կենտրոնում` շվեցարական շոկոլադ (800-1000 գրամ)։", "52000 դրամ"));
        list.add(new Itemclass(R.drawable.b, "Adelle #1020", "Այս ուղղանկյունաձև փայտյա տուփի վրա նախատեսած է գրատախտակ որտեղ կարող եք գրել ձեր ցանկությունը։ Տուփը պարունակում է ծաղկային կոմպոզիցիա և շվեցարական շոկոլադ:", "48000 դրամ"));
        list.add(new Itemclass(R.drawable.c, "Adelle #1021", "Տուփը նմանեցված է արկղի, որը պարունակում է ծաղկային կոմպոզիցիա և շվեցարական շոկոլադ (800-1000 գրամ)։", "49000 դրամ"));
        list.add(new Itemclass(R.drawable.d, "Adelle #1011", "Տուփը բաղկացած է երկու մասից, որոնցից մեկը փակվում է փականով, որտեղ տեղակայված է շվեցարական շոկոլադ (800-1000 գրամ)։ Մյուս հատվածում` հոլանդական Վարդեր։", "63000 դրամ"));
        list.add(new Itemclass(R.drawable.e, "Adelle #2211", "Գլանաձև տուփ, որտեղ ծաղկային կոմպոզիցիան տեղակայված է փականի վրա, իսկ տուփի ներսում շվեցարական շոկոլադ։ (Առկա են տուփի երկու չափս և երեք գույն` սև, սպիտակ, կապույտ):", "36000 դրամ"));
        list.add(new Itemclass(R.drawable.f, "Adelle #1040", "Տուփը բաղկացած է երկու մասից. Վերին մասում գտնվում է ծաղկային կոմպոզիցիան, իսկ ստորին հատվածում նախատեսված է դարակ` համալրված շվեյցարական շոկոլադով:", "86000 դրամ"));
        list.add(new Itemclass(R.drawable.g, "Adelle #1030", "Կոմպոզիցիան ներառում է հոլանդական վարդեր, համալրված է լամպով, որի մեջ հասցեատերը կարող է գտնել ձեր մաղթանքը։ Տուփը մատուցելու համար նախատեսված է հարմարավետ բռնակ։", "64000 դրամ"));
        list.add(new Itemclass(R.drawable.h, "Adelle #1031", "Փոքրիկ արկղ բռնակով։ Պարունակում է ծաղկային կոմպոզիցիա և շվեցարական շոկոլադ (500-700 գրամ)։", "29000 դրամ"));

        adapter = new MyAdapter(list, Tesakani_Activity.this);
        recyclerView.setAdapter(adapter);
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
            startActivity(new Intent(Tesakani_Activity.this, MainActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }
}
