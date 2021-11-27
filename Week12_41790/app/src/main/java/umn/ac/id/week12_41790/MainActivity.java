package umn.ac.id.week12_41790;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import umn.ac.id.week12_41790.R;

public class MainActivity extends AppCompatActivity {
    private TextView tvDaftarSensor;
    private SensorManager mSensorManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDaftarSensor = findViewById(R.id.daftarSensor);
        mSensorManager = (SensorManager)
                getSystemService(Context.SENSOR_SERVICE);
        List<Sensor> daftarSensor  =
                mSensorManager.getSensorList(Sensor.TYPE_ALL);
        StringBuilder sensorText = new StringBuilder();
        for (Sensor currentSensor : daftarSensor ) {
            sensorText.append(currentSensor.getName()).append(
                    System.getProperty("line.separator"));
        }
        tvDaftarSensor.setText(sensorText);
    }
}