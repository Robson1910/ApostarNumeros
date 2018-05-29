package com.example.apostarnumeross.apostarnumeros;

        import android.content.Intent;
        import android.support.v4.content.ContextCompat;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.ImageView;
        import android.widget.TextView;

public class OutratelaActivity extends AppCompatActivity {
    private TextView resultado;
    private ImageView num;
    private Button voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outratela);
        resultado = (TextView) findViewById(R.id.resultado);
        num = (ImageView) findViewById(R.id.imagenumero);
        voltar = (Button) findViewById(R.id.voltar);

        Bundle extra = getIntent().getExtras();
        if(extra != null){
            String numerorandon = extra.getString("numeros");
            int numerodigitado = extra.getInt("numeroum");

            if(numerorandon.equals("0")){

                num.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.zero));
                if(numerodigitado == 0){
                    resultado.setText("Acertou!");
                } else {resultado.setText("Errou!");}
            }
            if(numerorandon.equals("1")){

                num.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.um));
                if(numerodigitado == 1){
                    resultado.setText("Acertou!");
                } else {resultado.setText("Errou!");}
            }
            if(numerorandon.equals("2")){

                num.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.dois));
                if(numerodigitado == 2){
                    resultado.setText("Acertou!");
                } else {resultado.setText("Errou!");}
            }
            if(numerorandon.equals("3")){

                num.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.tres));
                if(numerodigitado == 3){
                    resultado.setText("Acertou!");
                } else {resultado.setText("Errou!");}
            }
            if(numerorandon.equals("4")){

                num.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.quatro));
                if(numerodigitado == 4){
                    resultado.setText("Acertou!");
                } else {resultado.setText("Errou!");}
            }
            if(numerorandon.equals("5")){

                num.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.cinco));
                if(numerodigitado == 5){
                    resultado.setText("Acertou!");
                } else {resultado.setText("Errou!");}
            }
        }
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
