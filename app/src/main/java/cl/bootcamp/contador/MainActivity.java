package cl.bootcamp.contador;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {

    // Declarando contador como una variable de instancia
    private int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inflar el layout
        setContentView(R.layout.activity_main);

        //Obtener referencias a los elementos de la interfaz de usuario
        TextView tvContador = findViewById(R.id.tv_contador);
        Button btnDecremento = findViewById(R.id.btn_decremento);
        Button btnIncremento = findViewById(R.id.btn_incremento);

        // Inicializar el TextView con el valor inicial del contador
        tvContador.setText(String.valueOf(contador));

        // Configurar el listener para el botón de incremento
        btnIncremento.setOnClickListener(v -> {
            contador = Integer.parseInt(tvContador.getText().toString());
            contador++;
            tvContador.setText(String.valueOf(contador));
            //se mantiene el color al hacer click
            tvContador.setTextColor(ContextCompat.getColor(this, R.color.purple));

        });
        // Configurar el listener para el botón de decremento
        btnDecremento.setOnClickListener(v -> {
            contador = Integer.parseInt(tvContador.getText().toString());
            contador--;
            tvContador.setText(String.valueOf(contador));
            //cambiando color al hacer click
            tvContador.setTextColor(Color.RED); //color que ya esta configurado
        });
    }
}