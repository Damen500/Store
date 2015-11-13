package com.example.h0607265.store;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class List extends Activity implements AdapterView.OnItemClickListener{
    private ListView listView1;
    private ArrayAdapter<String> listAdapter1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        listView1 = (ListView) findViewById(R.id.listView1);

        String[] items =  new String[]{"Apple","Banana","Computer","Grapes","Kiwi","Monitor","Mouse","Tomato","WebCam","Agar.io","Angry Birds","Candy Crush","Clash of Clans","Free Runs","Hyper Chase","Lunar Glide","Smashy Road Wanted","Trainer","Venomenon"};
        Arrays.sort(items);
        ArrayList<String> itemArrayList = new ArrayList<String>();
        itemArrayList.addAll(Arrays.asList(items));
        listAdapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, itemArrayList);

        listAdapter1.getPosition("Apple");
        listView1.setAdapter(listAdapter1);
        listView1.setOnItemClickListener(this);

    }



    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String itemValue = (String) listView1.getItemAtPosition(position);


        switch (itemValue) {
            case "Agar.io":
                Intent intent = new Intent(this, agario.class);
                startActivity(intent);
                break;
            case "Angry Birds":
                Intent intent1 = new Intent(this, angrybirds.class);
                startActivity(intent1);
                break;
            case "Apple":
                Intent intent2 = new Intent(this, Apple.class);
                startActivity(intent2);
                break;
            case "Banana":
                Intent intent3 = new Intent(this, Banana.class);
                startActivity(intent3);
                break;
            case "Candy Crush":
                Intent intent4 = new Intent(this, candycrush.class);
                startActivity(intent4);
                break;
            case "Clash of Clans":
                Intent intent5 = new Intent(this, clashofclans.class);
                startActivity(intent5);
                break;
            case "Computer":
                Intent intent6 = new Intent(this, Computer.class);
                startActivity(intent6);
                break;
            case "Free Runs":
                Intent intent7 = new Intent(this, freeruns.class);
                startActivity(intent7);
                break;
            case "Grapes":
                Intent intent8 = new Intent(this, Grapes.class);
                startActivity(intent8);
                break;
            case "Hyper Chase":
                Intent intent9 = new Intent(this, hyperchase.class);
                startActivity(intent9);
                break;
            case "Kiwi":
                Intent intent10 = new Intent(this, Kiwi.class);
                startActivity(intent10);
                break;
            case "Lunar Glide":
                Intent intent12 = new Intent(this, lunarglide.class);
                startActivity(intent12);
                break;
            case "Monitor":
                Intent intent13 = new Intent(this, Monitor.class);
                startActivity(intent13);
                break;
            case "Mouse":
                Intent intent14 = new Intent(this, Mouse.class);
                startActivity(intent14);
                break;
            case "Smashy Road Wanted":
                Intent intent15 = new Intent(this, smashyroadwanted.class);
                startActivity(intent15);
                break;
            case "Tomato":
                Intent intent16 = new Intent(this, Tomato.class);
                startActivity(intent16);
                break;
            case "Trainer":
                Intent intent17 = new Intent(this, trainer.class);
                startActivity(intent17);
                break;
            case "Venomenon":
                Intent intent18 = new Intent(this, venomenon.class);
                startActivity(intent18);
                break;
            case "WebCam":
                Intent intent19 = new Intent(this, WebCam.class);
                startActivity(intent19);
                break;


            default:
                Intent intent20 = new Intent(this, List.class);
                startActivity(intent20);
                break;


        }

    }
}
