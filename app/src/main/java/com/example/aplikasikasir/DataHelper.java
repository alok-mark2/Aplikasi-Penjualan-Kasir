package com.example.aplikasikasir;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "barang.db";
    //private static final string database ini adalah nama database kita
    //jadi jika ingin mengganti nama database yaitu pada bagian barang.db sesuai kebutuhan dengan akhiran .db

    private static final int DATABASE_VERSION = 1;
    public DataHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        //TODO Auto-generated constructor stub
    }
    
    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        String sql = "create table barang(no integer primary key, nama text null, jenis text null, jumlah text null);";
        //dan disini pembuatan tabelnya,jadi tabel tabelnya ditambahkan disini disini saya ada nomor dengan tipe data integer dan sebagai primary keynya
        //kemudian ada nama denagn tipe data text ,jenisnya dan jumlah nya
        Log.d("Data", "onCreate: " + sql);
        db.execSQL(sql);
        sql = "INSERT INTO barang (no, nama, jenis, jumlah) VALUES ('1', 'UAS PAM KELAS B', 'buku', '200');";
        //ini adalah query untuk memasukkan barang pertama kedalam database dengan nomornya nomor 1 , namanya itu nama barangnya kemudian jenis barangnya
        //kemudian jumlahnya
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
        //TODO Auto-generated method stub

    }

}