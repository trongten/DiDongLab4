package com.example.customlistviewexample;


import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class CustomListViewExampleActivity extends AppCompatActivity {
    private List<Language> listLanguage;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_list_view_activity);

        listView = (ListView) findViewById(R.id.idListView);
        listLanguage = new ArrayList<>();
        listLanguage.add(new Language(1, "Cá nấu lẩu mini","Devang"));
        listLanguage.add(new Language(2, "!KG KHÔ GÀ BƠ TỎI..","LTD Food"));
        listLanguage.add(new Language(3, "Xe cần cẩu đa năng","Thế giói đồ chơi"));
        listLanguage.add(new Language(4, "Đồ chơi dạng mô hình","Thế giói đồ chơi"));
        listLanguage.add(new Language(5, "Lãnh đạo đơn giản","Minh Long Book"));
        listLanguage.add(new Language(6, "Hiểu lòng con trẻ","Minh Long Book"));
        listLanguage.add(new Language(7, "Donal Trump thiên tài lãnh đạo","Minh Long Book"));


        LanguageAdapter adapter = new LanguageAdapter(this, R.layout.item_custom_list_view, listLanguage);
        listView.setAdapter(adapter);

    }
}