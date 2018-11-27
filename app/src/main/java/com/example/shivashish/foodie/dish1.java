package com.example.shivashish.foodie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;
import android.widget.VideoView;
import android.widget.MediaController;
import android.view.View;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import java.util.List;

public class dish1 extends YouTubeBaseActivity {
    YouTubePlayerView youTubePlayerView;
    Button bn1;
    YouTubePlayer.OnInitializedListener onInitializedListener;
    YouTubePlayer youTubePlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dish1);
        youTubePlayerView=(YouTubePlayerView)findViewById(R.id.view1);
        bn1=(Button)findViewById(R.id.buttonplay1);
        onInitializedListener=new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, final YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("abIuyROpyuE");
            }
            @Override
            public void onInitializationFailure (YouTubePlayer.Provider
                                                         provider, YouTubeInitializationResult error){
            }
        };
        bn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                youTubePlayerView.initialize(PlayerConfig.API_KEY,onInitializedListener);
            }
        });

    }
    public void backtoOption(View view){
        Intent i_op1=new Intent(this,Option.class);
        startActivity(i_op1);
    }

}
