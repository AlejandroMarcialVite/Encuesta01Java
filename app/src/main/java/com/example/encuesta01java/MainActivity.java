package com.example.encuesta01java;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText editTextNombre, editTextComentarios;
    private SeekBar seekBarSatisfaccion;
    private TextView textViewSatisfaccion;
    private Button buttonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNombre = findViewById(R.id.edit_nombre);
        seekBarSatisfaccion = findViewById(R.id.seekbar_satisfaccion);
        textViewSatisfaccion = findViewById(R.id.text_satisfaccion);
        editTextComentarios = findViewById(R.id.edit_comentarios);
        buttonEnviar = findViewById(R.id.button_enviar);

        seekBarSatisfaccion.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textViewSatisfaccion.setText("Nivel de Satisfacción: " + progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        buttonEnviar.setOnClickListener(v -> {
            String nombre = editTextNombre.getText().toString();
            int satisfaccion = seekBarSatisfaccion.getProgress();
            String comentarios = editTextComentarios.getText().toString();

            Toast.makeText(MainActivity.this, "Encuesta enviada", Toast.LENGTH_SHORT).show();
        });
    }
}
