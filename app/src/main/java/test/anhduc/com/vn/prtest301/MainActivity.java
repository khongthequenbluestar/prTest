package test.anhduc.com.vn.prtest301;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getFragmentManager().beginTransaction().add(R.id.llCommon, new FirstFragment(), "").commit();
        Log.d("anhduc", "onCreate");
        Log.e("anhduc", "onCreate");
        findViewById(R.id.edtInput).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d("anhduc", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("anhduc", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("anhduc", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("anhduc", "onDestroy");
    }
}
