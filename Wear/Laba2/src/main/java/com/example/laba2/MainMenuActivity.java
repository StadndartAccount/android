package com.example.laba2;

import android.app.Activity;
import android.os.Bundle;

import androidx.wear.widget.WearableLinearLayoutManager;
import androidx.wear.widget.WearableRecyclerView;

import java.util.ArrayList;
public class MainMenuActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);
        WearableRecyclerView recyclerView = findViewById(R.id.main_menu_view);

        recyclerView.setCircularScrollingGestureEnabled(true);
        //recyclerView.setEdgeItemsCenteringEnabled(true);

        recyclerView.setHasFixedSize(true);
        recyclerView.setEdgeItemsCenteringEnabled(true);
        recyclerView.setLayoutManager(new WearableLinearLayoutManager(this));

        ArrayList<WearableItem> menuItems = new ArrayList<>();
        menuItems.add(new WearableItem(R.drawable.ic_baseline_baby_changing_station_24, "Item 1"));
        menuItems.add(new WearableItem(R.drawable.ic_baseline_baby_changing_station_24, "Item 2"));
        menuItems.add(new WearableItem(R.drawable.ic_baseline_baby_changing_station_24, "Item 3"));
        menuItems.add(new WearableItem(R.drawable.ic_baseline_baby_changing_station_24, "Item 4"));

        recyclerView.setAdapter(new MainMenuAdapter(this, menuItems, new MainMenuAdapter.AdapterCallback() {
            @Override
            public void onItemClicked(final Integer menuPosition) {
                switch (menuPosition) {
//                    case 0:  action_1(); break;
//                    case 1:  action_2(); break;
//                    case 2:  action_3(); break;
//                    case 3:  action_4(); break;
//                    default : cancelMenu();
                }
            }
        }));
    }
}