package com.example.jean.retrofitexample.adapter;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.jean.retrofitexample.R;
import com.example.jean.retrofitexample.model.HistoryData;

import java.util.List;

public class FootballAdapter extends RecyclerView.Adapter<FootballAdapter.ViewHolder> {

    Context mContext;
    List<HistoryData> historyDataList;

    public FootballAdapter(Context mContext, List<HistoryData> historyDataList) {
        this.mContext = mContext;
        this.historyDataList = historyDataList;
    }

    @NonNull
    @Override

    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.list_item_player, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        HistoryData data = historyDataList.get(position);

        Glide.with(mContext)
                .load(data.getGambar())
                .into(holder.mImageGambar);

        holder.mTextName.setText(data.getNama());
        holder.mTextAge.setText(data.getAge());

    }

    @Override
    public int getItemCount() {
        return historyDataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView mImageGambar;
        TextView mTextName;
        TextView mTextAge;
        RelativeLayout mLayoutHistory;

        public ViewHolder(View itemView) {
            super(itemView);

            mImageGambar = itemView.findViewById(R.id.iv_gambar);
            mTextName = itemView.findViewById(R.id.tv_name);
            mTextAge = itemView.findViewById(R.id.tv_age);
            mLayoutHistory = itemView.findViewById(R.id.layout_history);

            mLayoutHistory.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    final Dialog dialog = new Dialog(mContext);
                    dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                    dialog.setCancelable(false);
                    dialog.setContentView(R.layout.custom_dialog);

                    TextView mTextHistory = dialog.findViewById(R.id.tv_history);
                    Button mBtnClose = dialog.findViewById(R.id.bt_close);

                    mTextHistory.setText(historyDataList.get(getAdapterPosition()).getHistory().toString());

                    mBtnClose.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            dialog.dismiss();
                        }
                    });

                    dialog.show();
                }
            });
        }
    }
}
