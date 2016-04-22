package ice_pbru.duangsang.junamon.junamon02;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private Button about;
    private ListView traffic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindWidget();
        contro();
        creatlist();
    }

    private void creatlist() {
        final int[] intIcon = {R.drawable.a1, R.drawable.a2, R.drawable.a3, R.drawable.a4, R.drawable.a5,
                               R.drawable.a6, R.drawable.a7,R.drawable.a8, R.drawable.a9, R.drawable.a10,
                               R.drawable.a11, R.drawable.a12, R.drawable.a13, R.drawable.a14, R.drawable.a15,
                               R.drawable.a16, R.drawable.a17, R.drawable.a18, R.drawable.a19, R.drawable.a20};
        final String[] titleStrings = new String[20];
        titleStrings[0] = "เคส";
        titleStrings[1] = "ซ๊พียู";
        titleStrings[2] = "แป้นพิมพ์";
        titleStrings[3] = "เมาส์";
        titleStrings[4] = "แรม";

        titleStrings[5] = "ดิสก์ไดรฟ์";
        titleStrings[6] = " ฮาร์ดดิสก์";
        titleStrings[7] = "เพาเวอร์ซับพาย";
        titleStrings[8] = "ซีเรียลพอร์ต";
        titleStrings[9] = "การ์ดเสียง";

        titleStrings[10] = "ซีดี_รอม";
        titleStrings[11] = "ชิป ไอซี";
        titleStrings[12] = "แบตเตอรี่แบ๊คอัพ";
        titleStrings[13] = "จอภาพ";
        titleStrings[14] = "คอนเน็คเตอร์";

        titleStrings[15] = "การ์ดแสดงผล";
        titleStrings[16] = "เมนบอร์ด";
        titleStrings[17] = "พอร์ตพาราลเลล";
        titleStrings[18] = "พัดลมระบายความร้อน";
        titleStrings[19] = "ขั้วต่อสายไฟ";

        String[] detailStrings = getResources().getStringArray(R.array.detail);
        MyAdapter myAdapter = new MyAdapter(MainActivity.this, intIcon, titleStrings, detailStrings);
        traffic.setAdapter(myAdapter);

       traffic.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
               Intent intent = new Intent(MainActivity.this, DetailActicity.class);

               intent.putExtra("Title", titleStrings[i]);
               intent.putExtra("Img", intIcon[i]);
               intent.putExtra("Index", i);
               startActivity(intent);

           }
       });
    }

    private void contro() {
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://frenefull.wordpress.com"));
                startActivity(intent);
            }
        });

    }

    private void bindWidget() {
        about = (Button) findViewById(R.id.button);
        traffic = (ListView) findViewById(R.id.listView);
    }
}
