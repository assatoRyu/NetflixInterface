package com.example.interfacenetflix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String language = "BR";
    private TextView series;
    private TextView filmes;
    private TextView minhaLista;
    private TextView violencia;
    private TextView empolgante;
    private TextView sinistro;
    private TextView lancamentos;
    private Button btnMinhaLista;
    private Button btnAssistir;
    private Button btnDetalhes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getViewsId();
        setLanguage();
    }

    private void getViewsId() {
        series = findViewById(R.id.text_series);
        filmes = findViewById(R.id.text_filmes);
        minhaLista = findViewById(R.id.text_minha_lista);
        violencia = findViewById(R.id.text_violencia);
        empolgante = findViewById(R.id.text_empolgante);
        sinistro = findViewById(R.id.text_sinistro);
        lancamentos = findViewById(R.id.text_lancamentos);

        btnMinhaLista = findViewById(R.id.btn_minha_lista);
        btnAssistir = findViewById(R.id.btn_assistir);
        btnDetalhes = findViewById(R.id.btn_detalhes);
    }

    private void setButtonLabels(String minhaListaLabel, String assistirLabel, String detalhesLabel) {
        btnMinhaLista.setText(minhaListaLabel);
        btnAssistir.setText(assistirLabel);
        btnDetalhes.setText(detalhesLabel);
    }

    public void setLanguageBrazil(View view) {
        language = "BR";
        setLanguage();
    }

    public void setLanguageUSA(View view) {
        language = "EN";
        setLanguage();
    }
    private void setLanguage() {
        if (language.equals("BR")) {
            series.setText("Séries");
            filmes.setText("Filmes");
            minhaLista.setText("Minha lista");
            violencia.setText("Violência");
            empolgante.setText("Empolgante");
            sinistro.setText("Sinistro");
            lancamentos.setText("Lançamentos");

            setButtonLabels("Minha lista", "ASSISTIR", "Detalhes");
        } else if (language.equals("EN")) {
            series.setText("Series");
            filmes.setText("Films");
            minhaLista.setText("My list");
            violencia.setText("Violence");
            empolgante.setText("Exciting");
            sinistro.setText("Sinister");
            lancamentos.setText("Releases");

            setButtonLabels("My list", "PLAY", "Details");
        }
    }
}