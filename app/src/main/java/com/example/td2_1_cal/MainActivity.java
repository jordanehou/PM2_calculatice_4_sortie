package com.example.td2_1_cal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    MaterialButton calcul;
    EditText champ1pl, champ2pl, ch1div, ch2div, ch1m, ch2m, ch1mul, ch2mul;
    TextView plus, resultPlus, resm, resmul, resdiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        champ1pl = findViewById(R.id.champ1Pl);
        champ2pl = findViewById(R.id.champ2Pl);
        resultPlus = findViewById(R.id.som);
        plus = findViewById(R.id.plus);
        ch1m = findViewById(R.id.champ1m);
        ch2m = findViewById(R.id.champ2m);
        resm = findViewById(R.id.som_moin);
        ch1div = findViewById(R.id.champ1div);
        ch2div = findViewById(R.id.champ2div);
        resdiv = findViewById(R.id.som_div);
        ch1mul = findViewById(R.id.champ1mul);
        ch2mul = findViewById(R.id.champ2mu);
        resmul = findViewById(R.id.som_mul);


        assignId(calcul, R.id.btn_cal);
    }

    void assignId(MaterialButton btn,int id){
        btn = findViewById(id);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        String ch1P = champ1pl.getText().toString();
        String ch2P = champ2pl.getText().toString();
        String m1 = ch1m.getText().toString();
        String m2 = ch2m.getText().toString();
        String d1 = ch1div.getText().toString();
        String d2 = ch2div.getText().toString();
        String mul1 = ch1mul.getText().toString();
        String mul2 = ch2mul.getText().toString();
        try{
            int n1s = Integer.parseInt(ch1P);
            int n2s = Integer.parseInt(ch2P);

            int n1M = Integer.parseInt(m1);
            int n2M = Integer.parseInt(m2);

            int n1Mul = Integer.parseInt(mul1);
            int n2Mul = Integer.parseInt(mul2);

            int n1div = Integer.parseInt(d1);
            int n2div = Integer.parseInt(d2);

            int som = 0;
            int sdiv = 0;
            int smoin = 0;
            int smul = 0;
            som = n1s + n2s;
            smoin = n1M - n2M;

            smul = n1Mul * n2Mul;
            sdiv = n1div / n2div;



            String som_str = String.valueOf(som);
            String sMoins = String.valueOf(smoin);
            String sMulti = String.valueOf(smul);
            String sDivis = String.valueOf(sdiv);

            resultPlus.setText(som_str);
            resm.setText(sMoins);
            resmul.setText(sMulti);
            resdiv.setText(sDivis);



        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
    }
}