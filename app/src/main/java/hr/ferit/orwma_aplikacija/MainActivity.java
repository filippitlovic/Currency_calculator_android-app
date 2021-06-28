package hr.ferit.orwma_aplikacija;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button btnTravelHelper;
    public Button btnCalculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTravelHelper = findViewById(R.id.btnTravelHelper);
        btnCalculator = findViewById(R.id.btnCalculator);

        btnTravelHelper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                prebacinaTravelhelper();
            }


        });

        btnCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prebacinaCurrencyCalculator();
            }
        });

    }

        private void prebacinaTravelhelper(){
            Intent intent = new Intent(MainActivity.this,TravelHelper.class);
            startActivity(intent);
        }

        private void prebacinaCurrencyCalculator(){
            Intent intent = new Intent(MainActivity.this,CurrencyCalculator.class);
            startActivity(intent);
        }
}