package com.example.samsung.p0421_simplelist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] names = {"Иван", "марья", "Пётр", "Антон", "Даша", "Борис",
                    "Костя", "Игорь", "Анна", "Денис", "Андрей"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        //находим список
        ListView lvMain = (ListView) findViewById(R.id.lvMain);

        //создаём адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);

        //присваиваем адаптер списку
        lvMain.setAdapter(adapter);
    }
}
