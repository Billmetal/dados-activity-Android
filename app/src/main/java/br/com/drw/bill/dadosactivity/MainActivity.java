package br.com.drw.bill.dadosactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btnPassar;
    private EditText txtInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPassar = findViewById(R.id.button_passar);
        txtInfo = findViewById(R.id.editText_informacao);

        btnPassar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);

                if(txtInfo.getText().toString().isEmpty()){
                    intent.putExtra("msg","Nenhuma Info Digitada !!");
                } else {
                    intent.putExtra("msg",txtInfo.getText().toString());
                }

                startActivity(intent);
            }
        });
    }
}
