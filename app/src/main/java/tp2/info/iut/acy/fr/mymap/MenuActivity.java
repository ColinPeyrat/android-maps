package tp2.info.iut.acy.fr.mymap;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.Toast;


public class MenuActivity extends Activity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button btnIut = (Button)findViewById(R.id.btnIut);
        btnIut.setOnClickListener(this);

        Button btnTrace = (Button)findViewById(R.id.btnTrace);
        btnTrace.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btnIut:
                // lance l activite qui geocalise l iut
                Toast.makeText(getApplicationContext(), "Affichage de l'IUT", Toast.LENGTH_LONG).show();
                startActivity(new Intent(MenuActivity.this, MapsActivity.class));
                break;
            case R.id.btnTrace:
                // lance l activite qui nous trace
                Toast.makeText(getApplicationContext(), "Traçage en cours", Toast.LENGTH_LONG).show();
                startActivity(new Intent(MenuActivity.this, TraceActivity.class));
                break;
        }
    }

}
