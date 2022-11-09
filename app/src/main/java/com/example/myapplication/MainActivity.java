package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText LCP1 , Dmax1, LCP_Kirpich , Dmax_Kirpich, LCP_Giandotti, Em_Giandotti,A_Giandotti,LCP_Temez,SCP_Temez,SCP_SCS,LCP_SCS,LCP_Pasini,SCP_Pasini,A_Pasini;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Pizarro */

        LCP1 = (EditText)findViewById(R.id.valor_LCP);
        Dmax1 = (EditText)findViewById(R.id.valor_Dmax);
        Button resultado = (Button) findViewById(R.id.boton_resultado_pizarro);
        final TextView resPiz = (TextView)findViewById(R.id.Text_Resultado);
        resultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float LCPv = new Float(LCP1.getText().toString());
                float Dmaxv = new Float(Dmax1.getText().toString());
                resPiz.setText("TcPiza= "+((13.548*Math.pow(((LCPv*LCPv)/(Dmaxv)),0.77)*60)));


            }
        });

        /* Kirpich */

        LCP_Kirpich = (EditText)findViewById(R.id.valor_LCP_Kirpich);
        Dmax_Kirpich = (EditText)findViewById(R.id.valor_Dmax_Kirpich);
        Button resultado_Kirpich = (Button) findViewById(R.id.boton_resultado_Kirpich);
        final TextView resKir = (TextView)findViewById(R.id.Text_Resultado_Kirpich);
        resultado_Kirpich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float LCPv_Kirpich = new Float(LCP_Kirpich.getText().toString());
                float Dmaxv_Kirpich = new Float(Dmax_Kirpich.getText().toString());
                resKir.setText("TcKirpich= "+(Math.pow((0.870*((Math.pow(LCPv_Kirpich,3))/Dmaxv_Kirpich)),0.385)*60));


            }
        });

        /* Giandotti */


        LCP_Giandotti = (EditText)findViewById(R.id.valor_LCP_Giandotti);
        Em_Giandotti = (EditText)findViewById(R.id.valor_Em_Giandotti);
        A_Giandotti = (EditText)findViewById(R.id.valor_A_Giandotti);
        Button resultado_Giandotti = (Button) findViewById(R.id.boton_resultado_Giandotti);
        final TextView resGiandotti = (TextView)findViewById(R.id.Text_Resultado_Giandotti);
        resultado_Giandotti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float LCPv_Giandotti = new Float(LCP_Giandotti.getText().toString());
                float Emv_Giandotti = new Float(Em_Giandotti.getText().toString());
                float Av_Giandotti = new Float(A_Giandotti.getText().toString());
                resGiandotti.setText("TcGiandotti= "+(((4*Math.pow(Av_Giandotti,0.5)+1.5*LCPv_Giandotti)/(0.8*Math.pow(Emv_Giandotti,0.5)))*60));


            }
        });

        /* Temez*/
        LCP_Temez = (EditText)findViewById(R.id.valor_LCP_Temez);
        SCP_Temez = (EditText)findViewById(R.id.valor_SCP_Temez);
        Button resultado_Temez = (Button) findViewById(R.id.boton_resultado_Temez);
        final TextView resTemez = (TextView)findViewById(R.id.Text_Resultado_Temez);
        resultado_Temez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float LCPv_Temez = new Float(LCP_Temez.getText().toString());
                float SCPv_Temez = new Float(SCP_Temez.getText().toString());
                resTemez.setText("TcTemez= "+((0.126*((LCPv_Temez)/(Math.pow(Math.pow(SCPv_Temez,0.35),0.75))))*60)); /* corregir la formula resultado defierente con el colab*/

            }
        });

        /* SCS*/
        LCP_SCS = (EditText)findViewById(R.id.valor_LCP_SCS);
        SCP_SCS = (EditText)findViewById(R.id.valor_SCP_SCS);
        Button resultado_SCS = (Button) findViewById(R.id.boton_resultado_SCS);
        final TextView resSCS = (TextView)findViewById(R.id.Text_Resultado_SCS);
        resultado_SCS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float LCPv_SCS = new Float(LCP_SCS.getText().toString());
                float SCPv_SCS = new Float(SCP_SCS.getText().toString());
                resSCS.setText("TcSCS= "+(3.9756*(Math.pow(LCPv_SCS,0.77))/(Math.pow(SCPv_SCS,0.385))));

            }
        });
        /* Pasini*/
        LCP_Pasini = (EditText)findViewById(R.id.valor_LCP_Pasini);
        SCP_Pasini = (EditText)findViewById(R.id.valor_SCP_Pasini);
        A_Pasini = (EditText)findViewById(R.id.valor_A_Pasini);
        Button resultado_Pasini = (Button) findViewById(R.id.boton_resultado_Pasini);
        final TextView resPasini = (TextView)findViewById(R.id.Text_Resultado_Pasini);
        resultado_Pasini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float LCPv_Pasini = new Float(LCP_Pasini.getText().toString());
                float SCPv_Pasini = new Float(SCP_Pasini.getText().toString());
                float Av_Pasini= new Float(A_Pasini.getText().toString());
                resPasini.setText("TcPasini= "+((0.023*Math.pow(Av_Pasini*(LCPv_Pasini/SCPv_Pasini),0.75))*60));

            }
        });







    }
}
