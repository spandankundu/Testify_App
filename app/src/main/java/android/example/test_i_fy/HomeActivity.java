package android.example.test_i_fy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.example.test_i_fy.QuestionActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }


    public void init(View view){
        Intent intent = new Intent(this, QuestionActivity.class);
        startActivity(intent);
        finish();
    }

}
