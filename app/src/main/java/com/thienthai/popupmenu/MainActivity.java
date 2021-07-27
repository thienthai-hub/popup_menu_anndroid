package com.thienthai.popupmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;

public class MainActivity extends AppCompatActivity {
    Button btnPopup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            btnPopup = (Button) findViewById(R.id.button);
            btnPopup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    PopupMenu();
            }
        });
    }
        private void PopupMenu() {
            PopupMenu popupMenu = new PopupMenu(this, btnPopup);
            popupMenu.getMenuInflater().inflate(R.menu.menu, popupMenu.getMenu());
            popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {
                    switch (item.getItemId()){
                        case R.id.angular: btnPopup.setText("Angrular");
                            break;
                        case R.id.Html: btnPopup.setText("Html");
                            break;
                        case R.id.java: btnPopup.setText("Java");
                            break;
                        case R.id.Php: btnPopup.setText("Php");
                            break;
                    }
                    return false;
                }
            });
            popupMenu.show();
        }
}