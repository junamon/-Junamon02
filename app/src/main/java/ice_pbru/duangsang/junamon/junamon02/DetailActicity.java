package ice_pbru.duangsang.junamon.junamon02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActicity extends AppCompatActivity {
    private TextView titleTextView, detailTextView;
    private ImageView trafficImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_acticity);

        bindWindget();
        showview();
    }

    private void showview() {
        String srtTitle = getIntent().getStringExtra("Title");
        int intIcon = getIntent().getIntExtra("Img", R.drawable.a1);
        int intIndex = getIntent().getIntExtra("Index", 0);

        titleTextView.setText(srtTitle);
        trafficImageView.setImageResource(intIcon);

        String[] strDetail = getResources().getStringArray(R.array.computer);
        detailTextView.setText(strDetail[intIndex]);

    }

    private void bindWindget() {
        titleTextView = (TextView) findViewById(R.id.textView4);
        detailTextView = (TextView) findViewById(R.id.textView5);
        trafficImageView = (ImageView) findViewById(R.id.imageView2);
    }
}
