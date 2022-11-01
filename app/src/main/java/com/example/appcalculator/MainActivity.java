package com.example.appcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    TextView tvResultado;
    private float num1;
    private float num2;
    private String operacion = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResultado = findViewById(R.id.tvResultado);
    }

    public void mostrarNumeroPorpantalla(String num) {
        final String res = (String) tvResultado.getText();
        if (Objects.equals(res, "0")){
            tvResultado.setText(num);
            return;
        }
        tvResultado.setText(res + num);
    }

    public void AgregarPunto(View view) {
        mostrarNumeroPorpantalla(".");
    }

    public void AgregarNumero0(View view) {
        mostrarNumeroPorpantalla("0");
    }
    public void AgregarNumero1(View view) {
        mostrarNumeroPorpantalla("1");
    }

    public void AgregarNumero2(View view) {
        mostrarNumeroPorpantalla("2");
    }

    public void AgregarNumero3(View view) {
        mostrarNumeroPorpantalla("3");
    }

    public void AgregarNumero4(View view) {
        mostrarNumeroPorpantalla("4");
    }

    public void AgregarNumero5(View view) {
        mostrarNumeroPorpantalla("5");
    }

    public void AgregarNumero6(View view) {
        mostrarNumeroPorpantalla("6");
    }

    public void AgregarNumero7(View view) {
        mostrarNumeroPorpantalla("7");
    }

    public void AgregarNumero8(View view) {
        mostrarNumeroPorpantalla("8");
    }

    public void AgregarNumero9(View view) {
        mostrarNumeroPorpantalla("9");
    }

    public void limpiar(View view) {
        tvResultado.setText("0");
        num1 = 0.0f;
        num2 = 0.0f;
        operacion = "";
    }

    public void operacionDividir(View view) {
        this.num1 = Float.parseFloat(tvResultado.getText().toString());
        this.operacion = "/";
        this.tvResultado.setText("0");
    }

    public void operacionMultiplicar(View view) {
        this.num1 = Float.parseFloat(tvResultado.getText().toString());
        this.operacion = "x";
        this.tvResultado.setText("0");
    }
    public void operacionSumar(View view) {
        this.num1 = Float.parseFloat(tvResultado.getText().toString());
        this.operacion = "+";
        this.tvResultado.setText("0");
    }

    public void operacionRestar(View view) {
        num1 = Float.parseFloat(tvResultado.getText().toString());
        operacion = "-";
       tvResultado.setText("0");

    }

    public void mostrarResultado(View view) {
        this.num2 = Float.parseFloat(tvResultado.getText().toString());

        if(operacion.equals("+")){
            ejecutarSuma();
        }
        if(operacion.equals("-")){
            ejecutarResta();
        }
        if(operacion.equals("x")){
            ejecutarMultiplicacion();
        }

        if(operacion.equals("/")){
          ejecutarDivision();
        }

    }

    private void ejecutarSuma() {
        float suma = this.num1 + this.num2;
        tvResultado.setText(suma +"");
    }

    private void ejecutarResta() {
        float resta = this.num1 - this.num2;
        tvResultado.setText(resta +"");
    }

    private void ejecutarMultiplicacion() {
        float multiplicacion = this.num1 * this.num2;
        tvResultado.setText(multiplicacion +"");
    }
    private void ejecutarDivision() {

        if (num2 == 0.0f) {
            tvResultado.setText("0");
            Toast.makeText(this, "OPERACIÓN NO VÁLIDA", Toast.LENGTH_SHORT).show();
        } else {
            float division = this.num1 / this.num2;
            tvResultado.setText(division + "");
        }
    }
}