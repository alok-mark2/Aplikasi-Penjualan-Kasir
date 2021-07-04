package com.example.aplikasikasir;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class BuatBarang extends AppCompatActivity {
    //nah disini untuk membuat nya sama seperti sebelumya apa aja yang sudah didatabase itu,objeknya apa aja ada nomor , nama ,jumlah ,dan jenis

    protected Cursor cursor;
    DataHelper dbHelper;
    Button ton1, ton2;
    EditText text1, text2, text3, text4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buat_barang);

        dbHelper = new DataHelper(this);
        text1 = (EditText) findViewById(R.id.editText1);
        text2 = (EditText) findViewById(R.id.editText2);
        text3 = (EditText) findViewById(R.id.editText3);
        text4 = (EditText) findViewById(R.id.editText4);
        ton1 = (Button) findViewById(R.id.button1);
        ton2 = (Button) findViewById(R.id.button2);

        ton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                //TODO Auto-generated method stub
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                db.execSQL("insert into barang(no, nama, jenis, jumlah) values('"+
                        //nomor
                        text1.getText().toString() + "','" +
                        //nama
                        text2.getText().toString() + "','" +
                        //jenis
                        text3.getText().toString() + "','" +
                        //jumlah
                        text4.getText().toString() + "')");
                //kemudian teks 1,2,3,4 ini untuk nomor,nama,jenis dan jumlahnya
                Toast.makeText(getApplicationContext(),"Berhasil", Toast.LENGTH_LONG).show();
               //dan ini jika berhasil maka akan langsung tersimpan ke main activitynya
                MainActivity.ma.RefreshList();
                finish();

            }
        });
        ton2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0){
                // TODO Auto-generated method stub
                finish();
            }
        });
    }
}
