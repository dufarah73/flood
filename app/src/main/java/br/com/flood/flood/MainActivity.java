package br.com.flood.flood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textStatus;
    private ImageView imageStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        textStatus = (TextView) this.findViewById(R.id.textView);
        imageStatus = (ImageView) this.findViewById(R.id.imageView);

        textStatus.setText("Normal");
        imageStatus.setImageResource(R.drawable.ic_action_normal);
    }

    public void alterar(View view) {
        if (textStatus.getText().toString() == "Normal") {
            textStatus.setText("Atenção");
            imageStatus.setImageResource(R.drawable.ic_action_atencao);
        } else {
            if (textStatus.getText().toString() == "Atenção") {
                textStatus.setText("Emergência");
                imageStatus.setImageResource(R.drawable.ic_action_emergencia);
            } else {
                textStatus.setText("Normal");
                imageStatus.setImageResource(R.drawable.ic_action_normal);
            }
        }

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.layout.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.main_menu_new_group: {
                Intent intent = new Intent(this, LoginActivity.class);
                startActivity(intent);
                break;
            }
        }
        return super.onOptionsItemSelected(item);
    }
}
