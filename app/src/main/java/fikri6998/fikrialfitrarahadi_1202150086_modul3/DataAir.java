package fikri6998.fikrialfitrarahadi_1202150086_modul3;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.DrawableRes;

/**
 * Created by fikri6998 on 2/25/2018.
 */

public class DataAir {

    //inisiasi String dan int
    private String nama, info, deskripsi;
    private int gambar;

    public DataAir(String nama, String info, String deskripsi, int gambar) {
        this.nama = nama;
        this.info = info;
        this.deskripsi = deskripsi;
        this.gambar = gambar;
    }

    public static Intent toClick(Context context, String title, String desc, @DrawableRes int img){
        Intent in = new Intent(context, DetailActivity.class);
        in.putExtra("EXTRA_TITLE",title);
        in.putExtra("EXTRA_DESC",desc);
        in.putExtra("EXTRA_IMG",img);
        return in;
    }

    public String getNama() {
        return nama;
    }
    //method untuk men
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }
}
