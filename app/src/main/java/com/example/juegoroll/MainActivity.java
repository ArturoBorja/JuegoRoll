package com.example.juegoroll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn_bot;
    Button btn_top;
    Button btn_left;
    Button btn_right;
    Button btn_enter;
    EditText ext_respuesta;
    TextView txt_consulta;
    ImageView img_main;
    ImageView img_top;
    ImageView img_left;
    ImageView img_bot;
    ImageView img_right;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IniciarPantalla();

        btn_bot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for (int a=0; a<30;a++){
                    txt_consulta.append(a+".- Hola Marcia, te AMO \n");

                }
            }
        });
    }
    void IniciarPantalla(){
        btn_bot=findViewById(R.id.btn_bot);
        btn_top=findViewById(R.id.btn_top);
        btn_left=findViewById(R.id.btn_left);
        btn_right=findViewById(R.id.btn_right);
        btn_enter=findViewById(R.id.btn_enter);
        txt_consulta=findViewById(R.id.txt_consulta);
        ext_respuesta=findViewById(R.id.ext);
        img_main=findViewById(R.id.img_main);
        img_top=findViewById(R.id.img_top);
        img_bot=findViewById(R.id.img_bot);
        img_left=findViewById(R.id.img_left);
        img_right=findViewById(R.id.img_right);
        txt_consulta.setMovementMethod(new ScrollingMovementMethod());
    }
}
