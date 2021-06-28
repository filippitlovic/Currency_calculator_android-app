package hr.ferit.orwma_aplikacija;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class TravelHelper extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel_helper);


        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_travel,new fragment_s_recyclerom_drzava()).commit();
    }


    }