package com.example.ruslan.myappporfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onToast(View view) {
        switch (view.getId()) {
            case R.id.button_capstone:
            {
                Toast.makeText(this,"This button will launch capstone app",Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.button_bigger:
            {
                Toast.makeText(this,"This button will launch Bigger app",Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.button_hawk:
            {
                Toast.makeText(this,"This button will launch hawk app",Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.button_material:
            {
                Toast.makeText(this,"This button will launch material app",Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.button_movies:
            {
                Toast.makeText(this,"This button will launch movies app",Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.button_go:
            {
                Toast.makeText(this,"This button will launch Go app",Toast.LENGTH_LONG).show();
                break;
            }
        }
    }
}
