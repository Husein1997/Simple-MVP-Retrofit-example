package com.example.jean.retrofitexample.presenter;

import com.example.jean.retrofitexample.model.History;
import com.example.jean.retrofitexample.model.HistoryData;
import com.example.jean.retrofitexample.model.Player;
import com.example.jean.retrofitexample.model.PlayerData;
import com.example.jean.retrofitexample.service.FootballService;
import com.example.jean.retrofitexample.view.FootballView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * This class represents the country view interface.
 *
 * @author Jean Carlos (Github: @jeancsanchez)
 * @date 29/07/16.
 * Jesus loves you.
 */
public class FootballPresenter {

    private FootballView footballView;
    private FootballService footballService;

    public FootballPresenter(FootballView view) {
        this.footballView = view;

        if (this.footballService == null) {
            this.footballService = new FootballService();
        }
    }

    public void getPlayerData() {
        footballService
                .getAPI()
                .getPlayer()
                .enqueue(new Callback<Player>() {
                    @Override
                    public void onResponse(Call<Player> call, Response<Player> response) {
                        if (response.isSuccessful()) {
                            Player data = response.body();

                            List<PlayerData> dataList = data.getData();
                            footballView.playerReady(dataList);
                        }
                    }

                    @Override
                    public void onFailure(Call<Player> call, Throwable t) {

                    }
                });
    }

    public void getHistoryData() {
        footballService
                .getAPI()
                .getHistory()
                .enqueue(new Callback<History>() {
                    @Override
                    public void onResponse(Call<History> call, Response<History> response) {
                        if (response.isSuccessful()) {
                            History history = response.body();

                            List<HistoryData> historyDataList = history.getData();

                            footballView.historyReady(historyDataList);
                        }
                    }

                    @Override
                    public void onFailure(Call<History> call, Throwable t) {

                    }
                });
    }
}
