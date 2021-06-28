package hr.ferit.orwma_aplikacija;

import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class opis_svake_drzave extends AppCompatActivity {


    ArrayList<String> opisi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opis_svake_drzave);

        opisi = new ArrayList<>();
        opisi.add("Afghanistan - officially the Islamic Republic of Afghanistan, is a landlocked country at the crossroads of Central and South Asia. Afghanistan is bordered by Pakistan to the east and south; Iran to the west; Turkmenistan, Uzbekistan, and Tajikistan to the north; and China to the northeast. Occupying 652,000 square kilometers (252,000 sq mi), it is a mountainous country with plains in the north and southwest. Kabul is the capital and largest city. The population is around 32 million, composed mostly of ethnic Pashtuns, Tajiks, Hazaras, and Uzbeks.");
        opisi.add("Albania - officially the Republic of Albania (Albanian: Republika e Shqipërisë),[b] is a country in Southeastern Europe. It is located on the Adriatic and Ionian Sea within the Mediterranean Sea, and shares land borders with Montenegro to the northwest, Kosovo[c] to the northeast, North Macedonia to the east, Greece to the south; and maritime borders with Greece, Montenegro and Italy to the west. Tirana is its capital and largest city, followed by Durrës, Vlorë and Shkodër.");
        opisi.add("Algeria - officially the People's Democratic Republic of Algeria, is a country in the Maghreb region of North Africa. The capital and most populous city is Algiers, located in the far north of the country on the Mediterranean coast. With an area of 2,381,741 square kilometres (919,595 sq mi), Algeria is the tenth-largest country in the world, and the largest by area in the African Union and the Arab world.[9] With an estimated population of over 44 million, it is the ninth-most populous country in Africa.");
        opisi.add("Andorra -  officially the Principality of Andorra (Catalan: Principat d'Andorra),[1] is a sovereign landlocked microstate on the Iberian Peninsula, in the eastern Pyrenees, bordered by France to the north and Spain to the south. Believed to have been created by Charlemagne, Andorra was ruled by the count of Urgell until 988, when it was transferred to the Roman Catholic Diocese of Urgell. The present principality was formed by a charter in 1278. It is headed by two co-princes: the Bishop of Urgell in Spain and the President of France.");
        opisi.add("Angola - officially the Republic of Angola (Portuguese: República de Angola), is a country located on the west coast of Southern Africa. It is the second-largest lusophone (Portuguese-speaking) country in both total area and population (behind Brazil), and it is the seventh-largest country in Africa, bordered by Namibia to the south, the Democratic Republic of the Congo to the north, Zambia to the east, and the Atlantic Ocean to the west. Angola has an exclave province, the province of Cabinda that borders the Republic of the Congo and the Democratic Republic of the Congo. The capital and largest city is Luanda.");
        opisi.add("Australia - officially the Commonwealth of Australia, is a sovereign country comprising the mainland of the Australian continent, the island of Tasmania, and numerous smaller islands.[13] It is the largest country in Oceania and the world's sixth-largest country by total area. Its population of nearly 26 million[7] is highly urbanised and heavily concentrated on the eastern seaboard.[14] Australia's capital is Canberra, and its largest city is Sydney. The country's other major metropolitan areas are Melbourne, Brisbane, Perth, and Adelaide.");
        opisi.add("A");

        getIncomingIntent();
    }

    private void getIncomingIntent(){
        if(getIntent().hasExtra("my data") && getIntent().hasExtra("my image")){

            String mydata = getIntent().getStringExtra("my data");
            String myimage = getIntent().getStringExtra("my image");
            int index = getIntent().getIntExtra("index",0);
            setImage(mydata,myimage,index);
        }
    }

    private void setImage(String mydata, String myimage,int index){
        TextView ime = findViewById(R.id.tvdrzava);
        ime.setText(mydata);

        ImageView zastava = findViewById(R.id.ivzastava);
        zastava.setImageResource(getIntent().getIntExtra("my image",0));

        TextView opis = findViewById(R.id.tvopisdrzave);

        opis.setText(opisi.get(index));
        
    }
}