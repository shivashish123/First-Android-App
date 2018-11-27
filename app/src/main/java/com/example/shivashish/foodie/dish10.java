package com.example.shivashish.foodie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class dish10 extends YouTubeBaseActivity {
    YouTubePlayerView youTubePlayerView;
    Button bn10;
    YouTubePlayer.OnInitializedListener onInitializedListener;
    YouTubePlayer youTubePlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dish10);
        youTubePlayerView=(YouTubePlayerView)findViewById(R.id.view10);
        bn10=(Button)findViewById(R.id.buttonplay10);
        onInitializedListener=new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, final YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("wnpVjWFx3oQ");
            }
            @Override
            public void onInitializationFailure (YouTubePlayer.Provider
                                                         provider, YouTubeInitializationResult error){
            }
        };
        bn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                youTubePlayerView.initialize(PlayerConfig.API_KEY,onInitializedListener);
            }
        });

    }
    public void backtoOption(View view){
        Intent i_op10=new Intent(this,Option.class);
        startActivity(i_op10);
    }

}

