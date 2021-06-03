package com.example.viedostreamingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import com.google.android.exoplayer2.ExoPlayerFactory;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;

public class ViedoActivity extends AppCompatActivity {



    PlayerView playerView;
    SimpleExoPlayer player;
    String url;
    private boolean playWhereReady = true;
    private int currentWindow = 0;
    private  long playpackPosition = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viedo);
        playerView = findViewById(R.id.viedo_view);
        url = getIntent().getStringExtra("Url");

    }

    public void initVideo(){
       // player
        player = ExoPlayerFactory.newSimpleInstance(this);

        // connect player with playerview
        playerView.setPlayer(player);

        // media source
        Uri uri = Uri.parse(url);
        DataSource.Factory dataSourceFactory = new DefaultDataSourceFactory(this , "exoplayer-codelab");
        MediaSource mediaSource = new ProgressiveMediaSource.Factory(dataSourceFactory).createMediaSource(uri);

        player.setPlayWhenReady(playWhereReady);
        player.seekTo(currentWindow , playpackPosition);
        player.prepare(mediaSource , false , false);

    }


    public void releaseVideo(){
        if(player != null){
            playWhereReady = player.getPlayWhenReady();
            playpackPosition = player.getCurrentPosition();
            currentWindow = player.getCurrentWindowIndex();
            player.release();
            player = null;

        }

    }


    @Override
    protected void onStart() {
        super.onStart();
        initVideo();
    }

//    @Override
//    protected void onResume() {
//        super.onResume();
//        if(player!=null){
//            initVideo();
//        }

 //   }

    @Override
    protected void onPause() {
        super.onPause();
        releaseVideo();
    }


    @Override
    protected void onStop() {
        super.onStop();
        releaseVideo();
    }


}