package br.com.drw.bill.dadosactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView txtRecebido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txtRecebido = findViewById(R.id.textView_recebido);

        Bundle extra = getIntent().getExtras();
        if(extra != null){
            txtRecebido.setText(extra.getString("msg"));
        } else {
            txtRecebido.setText("Nada Carregado !!!!!!");
        }
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
