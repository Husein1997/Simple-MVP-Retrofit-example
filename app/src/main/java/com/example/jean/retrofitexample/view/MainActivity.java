package com.example.jean.retrofitexample.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.util.Log;
import android.widget.Adapter;
import android.widget.LinearLayout;

import com.example.jean.retrofitexample.R;
import com.example.jean.retrofitexample.adapter.FootballAdapter;
import com.example.jean.retrofitexample.model.HistoryData;
import com.example.jean.retrofitexample.model.PlayerData;
import com.example.jean.retrofitexample.presenter.FootballPresenter;

import java.util.List;

public class MainActivity extends AppCompatActivity implements FootballView {

    RecyclerView mRecData;
    LinearLayoutManager mLayoutManager;
    SnapHelper mSnapHelper;
    FootballAdapter footballAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecData = findViewById(R.id.rv_data);
        mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        mSnapHelper = new PagerSnapHelper();
        FootballPresenter footballPresenter = new FootballPresenter(this);

        mRecData.setLayoutManager(mLayoutManager);
        mSnapHelper.attachToRecyclerView(mRecData);

        // Maybe it's best to call it on onResume()
        footballPresenter.getPlayerData();
        footballPresenter.getHistoryData();
    }


    @Override
    public void playerReady(List<PlayerData> data) {
        // See your Logcat :)
        Log.i("xxxx", "\n--------------------------All Player-----------------------------------\n");
        for (PlayerData player : data) {
            Log.i("xxxx id :", player.getId() + "\n"
                    + " - nama      : " + player.getNama() + " \n"
                    + " - nomor     : " + player.getNomor() + " \n"
                    + " - age       : " + player.getAge() + " \n"
                    + " - ikon      : " + player.getIkon() + " \n"
                    + " - team      : " + player.getTeam() + " \n"
                    + " - posisi    : " + player.getPosisi() + " \n"
                    + " - negara    : " + player.getNegara() + " \n"
                    + " - gambar    : " + player.getGambar() + " \n"
                    + " - deskripsi : " + player.getDeskripsi());
        }
    }

    @Override
    public void historyReady(List<HistoryData> data) {
        footballAdapter = new FootballAdapter(MainActivity.this, data);
        mRecData.setAdapter(footballAdapter);
        footballAdapter.notifyDataSetChanged();
        Log.i("xxxx", "\n--------------------------History Player-----------------------------------\n");
        for (HistoryData history : data) {
            Log.i("xxxx id :", history.getId() + "\n"
                    + " - nama      : " + history.getNama() + " \n"
                    + " - history 1 : " + history.getHistory().toString() + " \n"
                    + " - nomor     : " + history.getNomor() + " \n"
                    + " - age       : " + history.getAge() + " \n"
                    + " - ikon      : " + history.getIkon() + " \n"
                    + " - team      : " + history.getTeam() + " \n"
                    + " - posisi    : " + history.getPosisi() + " \n"
                    + " - negara    : " + history.getNegara() + " \n"
                    + " - gambar    : " + history.getGambar() + " \n"
                    + " - deskripsi : " + history.getDeskripsi());
        }
    }


}
