package vsga.fahmi.project02_aplikasikalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText angka_pertama, angka_kedua;
    Button tambah, kurang, bagi, kali, clear;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angka_pertama = (EditText)findViewById(R.id.angka_pertama);
        angka_kedua = (EditText)findViewById(R.id.angka_kedua);
        tambah = (Button)findViewById(R.id.tambah);
        kurang = (Button)findViewById(R.id.kurang);
        bagi = (Button)findViewById(R.id.bagi);
        kali = (Button)findViewById(R.id.kali);
        clear = (Button)findViewById(R.id.clear);
        result = (TextView)findViewById(R.id.result);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((angka_pertama.getText().length()>0) && (angka_kedua.getText().length()>0)) {
                    float angka1 = Float.parseFloat(angka_pertama.getText().toString());
                    float angka2 = Float.parseFloat(angka_kedua.getText().toString());
                    float hasil = angka1 + angka2;
                    result.setText(Float.toString(hasil));
                }
                else {
                    Toast toast = Toast.makeText(MainActivity.this, "Masukkan Angka :3", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((angka_pertama.getText().length()>0) && (angka_kedua.getText().length()>0)) {
                    float angka1 = Float.parseFloat(angka_pertama.getText().toString());
                    float angka2 = Float.parseFloat(angka_kedua.getText().toString());
                    float hasil = angka1 - angka2;
                    result.setText(Float.toString(hasil));
                }
                else {
                    Toast toast = Toast.makeText(MainActivity.this, "Masukkan Angka :3", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((angka_pertama.getText().length()>0) && (angka_kedua.getText().length()>0)) {
                    float angka1 = Float.parseFloat(angka_pertama.getText().toString());
                    float angka2 = Float.parseFloat(angka_kedua.getText().toString());
                    float hasil = angka1 / angka2;
                    result.setText(Float.toString(hasil));
                }
                else {
                    Toast toast = Toast.makeText(MainActivity.this, "Masukkan Angka :3", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((angka_pertama.getText().length()>0) && (angka_kedua.getText().length()>0)) {
                    float angka1 = Float.parseFloat(angka_pertama.getText().toString());
                    float angka2 = Float.parseFloat(angka_kedua.getText().toString());
                    float hasil = angka1 * angka2;
                    result.setText(Float.toString(hasil));
                }
                else {
                    Toast toast = Toast.makeText(MainActivity.this, "Masukkan Angka :3", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka_pertama.setText("");
                angka_kedua.setText("");
                result.setText("");
                angka_pertama.requestFocus();
            }
        });
    }
}