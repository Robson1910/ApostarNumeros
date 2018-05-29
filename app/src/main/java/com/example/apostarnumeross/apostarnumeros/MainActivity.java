package com.example.apostarnumeross.apostarnumeros;
     import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.view.WindowManager;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;
        import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private EditText numero;
    private Button botao1;
    private TextView texto;
    private String [] numeros = {"0","1","2","3","4","5"};

// Primeiro Projeto do Android
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numero = (EditText) findViewById(R.id.caixadenumero);
        botao1 = (Button) findViewById(R.id.botaoum);
        texto = (TextView) findViewById(R.id.textoum);

        // essa linha do codigo e para nao iniciar o teclado junto com aplicativo
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        botao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean verificador = numero.getText().toString().equals("");
                if(! verificador){
                    Random randomico = new Random();
                    int rand = randomico.nextInt(6);
                    String aux = numero.getText().toString();
                    int numeroum = Integer.parseInt(aux);

                    if(numeroum <= 5){
                        Intent intent = new Intent(MainActivity.this,OutratelaActivity.class);
                        intent.putExtra("numeros",numeros[rand]);
                        intent.putExtra("numeroum",numeroum);

                        startActivity(intent);

                    } else {texto.setText("Digite um número entre 0 a 5!"); }

                } else { texto.setText("Digite um número!");}
            }
        });
    }
}

