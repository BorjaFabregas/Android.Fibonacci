package com.example.fabregas.ejercicio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView res;
    private TextView texto;


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        if(savedInstanceState!=null){
            texto.setText(savedInstanceState.getCharSequence("fibo"));
        }

        setContentView(R.layout.activity_main);

        texto = (TextView) findViewById(R.id.textView);
        res = (TextView) findViewById(R.id.textView);
        res.setText("1-1");

    }

    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);

        savedInstanceState.putCharSequence("fibo", texto.getText().toString());
    }

    public void calcFibonacci(View v) {

        String[] calc = res.getText().toString().split("-");
        int f1 = Integer.parseInt(calc[calc.length-2]);
        int f2 = Integer.parseInt(calc[calc.length-1]);
        int op = f1 + f2;

        res.setText(res.getText().toString() + "-" + String.valueOf(op));

    }

    //Ejercicio 3
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("SE PARA","Se ejecuta onPause");
    }

    protected void onResume(){
        super.onResume();
        Log.i("SE RESUME","Se ejecuta onResume");
    }
}
