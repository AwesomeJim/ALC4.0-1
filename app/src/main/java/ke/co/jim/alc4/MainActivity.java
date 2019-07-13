package ke.co.jim.alc4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_about_alc:
                startActivity(new Intent(MainActivity.this, AboutALCActivity.class));
                break;
            case R.id.btn_profile:
                startActivity(new Intent(MainActivity.this, ProfileActivity.class));
                break;
            default:
                break;
        }
    }
}
