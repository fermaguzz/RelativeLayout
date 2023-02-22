package edu.iest.relativelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bnCanal = findViewById(R.id.bnCanal);
        EditText etCanal = findViewById(R.id.etCanal);
        TextView tvCanal = findViewById(R.id.tvCanal);

        Spinner spProgranas = findViewById(R.id.spProgramas);
        ivContinuara = findViewById(R.id.ivContinuara);

        spProgranas.setOnItemSelectedListener(this);

        bnCanal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              String texto = etCanal.getText().toString();
                Toast.makeText(MainActivity.this, "El valor era" +texto, Toast.LENGTH_LONG).show();
            tvCanal.setText(texto);
            }
        });
    }

    private ImageView ivContinuara;

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long idFila) {
        String programa = adapterView.getItemAtPosition(position).toString();
        Snackbar.make(adapterView, "Programa selecccionado" + programa, Snackbar.LENGTH_LONG).show();

        if(position == 0){
            ivContinuara.setImageResource(R.drawable.bb);
        }else if(position == 1){
            ivContinuara.setImageResource(R.drawable.bb2);
        }else if(position == 2){
            ivContinuara.setImageResource(R.drawable.bb3);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
