package com.example.guia3discusion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button btnsumar;
TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsumar = (Button) findViewById(R.id.btnsuma);
        resultado = (TextView) findViewById(R.id.txtV1);

        btnsumar.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
    int ValorOriginal = Integer.parseInt(resultado.getText().toString());
    int ValorResultante = ValorOriginal + 1;
        resultado.setText(String.valueOf(ValorResultante));
    }
}
