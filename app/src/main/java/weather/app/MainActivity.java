package weather.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        HourForecast hf = new HourForecast();
        hf.setTemperature(32.4);


        setContentView(R.layout.activity_main);
    }
}
