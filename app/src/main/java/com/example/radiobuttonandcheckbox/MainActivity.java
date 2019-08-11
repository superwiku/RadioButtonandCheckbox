package com.example.radiobuttonandcheckbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup rGroup;
    RadioButton rButton;
    Button btnPilih,btnMakan;
    CheckBox ckNasgor,ckMigor,ckCapcay,ckTiau;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rGroup=(RadioGroup)findViewById(R.id.r_group);
        btnPilih=(Button)findViewById(R.id.btn_pilih);
        btnPilih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int pilihRadio=rGroup.getCheckedRadioButtonId();
                rButton=(RadioButton)findViewById(pilihRadio);
                Toast.makeText(getApplicationContext(),"kamu memilih "+rButton.getText(),Toast.LENGTH_LONG).show();
            }
        });

        ckNasgor=(CheckBox)findViewById(R.id.ck_nasgor);
        ckMigor=(CheckBox)findViewById(R.id.ck_migor);
        ckCapcay=(CheckBox)findViewById(R.id.ck_capcay);
        ckTiau=(CheckBox)findViewById(R.id.ck_tiau);
        btnMakan=(Button)findViewById(R.id.btn_makan);
        btnMakan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pesanan="";
                if (ckNasgor.isChecked()){
                    pesanan+="Nasi Goreng \n";
                }if (ckMigor.isChecked()){
                    pesanan+="Mi Goreng \n";
                }if (ckCapcay.isChecked()){
                    pesanan+="Capcay \n";
                }if (ckTiau.isChecked()){
                    pesanan+="Kweetiau";
                }
                Toast.makeText(getApplicationContext(),"Makanan anda "+pesanan,Toast.LENGTH_LONG).show();
            }
        });
    }
}
