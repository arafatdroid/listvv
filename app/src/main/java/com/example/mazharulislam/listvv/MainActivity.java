package com.example.mazharulislam.listvv;
import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends Activity{

    ListView list;
    String[] itemname ={
            "",
            "",
            "",
            "",
            "",
            "",
            "",

    };

    Integer[] imgid={
            R.drawable.cat_edu,
            R.drawable.cat_fun,
            R.drawable.cat_govt,
            R.drawable.cat_health,
            R.drawable.cat_job,
            R.drawable.cat_law,
            R.drawable.cat_money,

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomListAdapter adapter=new CustomListAdapter(this, null, imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

//        list.setOnItemClickListener(new OnItemClickListener() {
//
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view,
//                                    int position, long id) {
//                // TODO Auto-generated method stub
//                String Slecteditem= itemname[+position];
//                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();
//
//            }
//        });
    }
}


