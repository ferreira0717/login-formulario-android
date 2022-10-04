package com.ferreiraJhonn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelStoreOwner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class datosRegistro extends AppCompatActivity {

    TextView etiqueta;
    EditText campo1,campo2,campo3,campo4,campo5,campo6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_registro);
        campo1 = (EditText) findViewById(R.id.text1);
        campo2 = (EditText) findViewById(R.id.text2);
        campo3 = (EditText) findViewById(R.id.text3);
        campo4 = (EditText) findViewById(R.id.text4);
        campo5 = (EditText) findViewById(R.id.text5);
        campo6 = (EditText) findViewById(R.id.text6);

    }
    public void onclick(View view){

        switch (view.getId()){
            case R.id.btn1:
                obtenerInformacion();
                break;

            case R.id.btnRegresar:
                Intent miIntent=null;
                miIntent = new Intent(datosRegistro.this,MainActivity.class);
                startActivity(miIntent);
        }
    }

    private void obtenerInformacion(){
        int documento    = Integer.parseInt((campo1.getText().toString()));
        String nombre    = campo2.getText().toString();
        String apellido  = campo3.getText().toString();
        String email     = campo4.getText().toString();
        String password  = campo5.getText().toString();
        String intencion = campo6.getText().toString();

        Toast.makeText(getApplicationContext(), "No documento: "+documento, Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "Nombres: "     +nombre, Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "Apellidos: "   +apellido, Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "Email: "       +email, Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "Password: "    +password, Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "Intención: "   +intencion, Toast.LENGTH_SHORT).show();
    }
}