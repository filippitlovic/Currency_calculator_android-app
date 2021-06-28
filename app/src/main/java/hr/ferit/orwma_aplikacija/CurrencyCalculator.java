package hr.ferit.orwma_aplikacija;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.gson.JsonObject;

import retro.RetroBuilder;
import retro.RetroInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CurrencyCalculator extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_calculator);

        ///inicijalizacija
        /// padajući izbornik
        Spinner mySpinner1 = (Spinner) findViewById(R.id.spinner1);
        Spinner mySpinner2 = (Spinner) findViewById(R.id.spinner2);
        Button btnConvert = (Button) findViewById(R.id.btnconvert);
        EditText etFROM = (EditText) findViewById(R.id.etFROM);
        TextView tvTO = (TextView) findViewById(R.id.tvTO);

        //funkcije
        String[] dropDownList = {"EUR","GBP","HRK","USD","INR"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,dropDownList);
        mySpinner1.setAdapter(adapter);
        mySpinner2.setAdapter(adapter);
       /* ArrayAdapter<String> myAdapter1 = new ArrayAdapter<String>(CurrencyCalculator.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.valute));
        myAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner1.setAdapter(myAdapter1);

        ArrayAdapter<String> myAdapter2 = new ArrayAdapter<String>(CurrencyCalculator.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.valute));
        myAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner2.setAdapter(myAdapter2);*/





        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RetroInterface retroInterface = RetroBuilder.getRetrofitInstance().create(RetroInterface.class);
                Call<JsonObject> call = retroInterface.getExchangeCurrency(mySpinner1.getSelectedItem().toString());
                call.enqueue(new Callback<JsonObject>() {
                    @Override
                    public void onResponse(Call<JsonObject>  call, Response<JsonObject> response) {
                        JsonObject res = response.body();
                        JsonObject rates = res.getAsJsonObject("rates");
                        double currency = Double.valueOf(etFROM.getText().toString());
                        double multiplier =Double.valueOf(rates.get(mySpinner2.getSelectedItem().toString()).toString());
                        double result = currency * multiplier;
                        tvTO.setText(String.valueOf(result));
                    }

                    @Override
                    public void onFailure(Call<JsonObject> call, Throwable t) {

                    }
                });
            }
        });
    }
}