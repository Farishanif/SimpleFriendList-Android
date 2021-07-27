package com.example.myownproject;

import android.os.Bundle;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListFriendsAdapter extends RecyclerView.Adapter<ListFriendsAdapter.ListViewHolder> {
    private ArrayList<Friend> listFriend;
    private OnItemClickCallback onItemClickCallback;


    public ListFriendsAdapter(ArrayList<Friend> list) {
        this.listFriend = list;
    }

    @NonNull
    @Override
    public ListFriendsAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType ) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_of_my_friend, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListFriendsAdapter.ListViewHolder holder, int position) {
        Friend friend = listFriend.get(position);
        Glide.with(holder.itemView.getContext())
                .load(friend.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(friend.getName());
        holder.tvDetail.setText(friend.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listFriend.get(holder.getAdapterPosition()));
            }
        });

        holder.btnMore.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent moveIntent = new Intent( v.getContext(), DetailPage.class);
                moveIntent.putExtra(DetailPage.mdetail, listFriend.get(holder.getAdapterPosition()).getDetail());
                moveIntent.putExtra(DetailPage.mname, listFriend.get(holder.getAdapterPosition()).getName());
                moveIntent.putExtra(String.valueOf(DetailPage.mphoto), listFriend.get(holder.getAdapterPosition()).getPhoto());

                v.getContext().startActivity(moveIntent);

                Toast.makeText(holder.itemView.getContext(), "Favorite " +
                        listFriend.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    public int getItemCount() {
        return listFriend.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        Button btnMore;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
            btnMore = itemView.findViewById(R.id.btn_more);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Friend data);
    }
}
