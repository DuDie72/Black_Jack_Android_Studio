package com.adt.blackjack;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class ErgebnisActivity extends ActionBarActivity {
        TextView text;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_ergebnis);
            Intent intent = getIntent();
            String anzSpiele = intent.getStringExtra("ANZSPIELE");
            String anzSpGewinne = intent.getStringExtra("SPGEWINNE");
            String anzCoGewinne = intent.getStringExtra("COGEWINNE");
            tabelleAktualisieren(anzSpiele, anzSpGewinne, anzCoGewinne);
        }
        public void tabelleAktualisieren(String anz, String anzSp, String anzCo)
        {
            text = (TextView) findViewById(R.id.tvAnzahlSpieleZaehler);
            text.setText(anz);
            text = (TextView) findViewById(R.id.tvSpielerGewinnpunkte);
            text.setText(anzSp);
            text = (TextView) findViewById(R.id.tvCroupierGewinnpunkte);
            text.setText(anzCo);
        }
        public void neueSpielrunde(View button) {
            final Intent intent = new Intent(this,SpielenActivity.class);
            //intent.putExtra();
            startActivity(intent);
        }
    }
