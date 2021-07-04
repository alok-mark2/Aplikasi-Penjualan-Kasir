package com.example.aplikasikasir;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    EditText editText1 ,editText2; //Deklarasi object dari class EdiText
    String text1 ,text2; //Deklarasi object string


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().setTitle("Masuk Pegguna");
        getSupportActionBar().setSubtitle("Aplikasi Penjualan");

    }

    public void loginMasuk(View view) {
        //Method onClick pada Button

        editText1 = (EditText)findViewById(R.id.edittext_username);
        editText2 = (EditText) findViewById(R.id.edittext_password);
        text1 = editText1.getText().toString();
        text2 = editText2.getText().toString();


        if ((text1.contains("admin"))&&((text2.contains("12345")))) {
            //ini adalah database lokal yang dimana jika membuat keputusan jika textbox 1 dan 2 harus diisi dengan tulisan sama persis dengan yang
            //ada didalam program,if text contains artinyaa jika text 1 diisi dengan kalimat admin dan text 2 diisi dengan string atau kalimat 12345 maka
            Toast.makeText(this, "Login Sukses", Toast.LENGTH_SHORT).show();
            //akan menampilkan pemberitahuan toast yang bertuliskan login sukses
            Intent intent = new Intent(Login.this, MainActivity.class);
            //intent adalah class untuk berpindah layout jadi setelah toast menampilkan login sukses maka program akan meng eksekusi baris program selanjutnya
            //yaitu memindahkan tampilan dari login activity ke main activity
            startActivity(intent);
            //memulai memindahkan user ke main activity
        }

        else if ((text1.matches("")||text2.matches("")))
            //fungsi ini akan mencocokkan apakah yang user input sudah benar atau belum jika salah maka langsung menampilkan toast password atau username salah
        //apabila kedua teks 1 dan teks 2 kosong maka akan menampilkan

        {
            Toast.makeText(this, "Harap lengkapi semua textbox", Toast.LENGTH_SHORT).show();
    //toast yang bertuliskan harap lengkapi semua textbox
        }

        else {

            Toast.makeText(this, "Login Gagal /Username Password Salah", Toast.LENGTH_SHORT).show();
            //
        }

    }


}