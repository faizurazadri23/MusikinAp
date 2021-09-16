package com.faizurazadri.musikinap.Fragment;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.faizurazadri.musikinap.R;
import com.faizurazadri.musikinap.databinding.FragmentAudioBinding;

import java.io.IOException;


public class AudioFragment extends Fragment implements View.OnClickListener{

    private FragmentAudioBinding audioBinding;
    private MediaPlayer mediaPlayer;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        audioBinding = FragmentAudioBinding.inflate(inflater, container, false);
        return audioBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        audioBinding.playAudio1.setOnClickListener(this);
        audioBinding.playAudio2.setOnClickListener(this);
        audioBinding.playAudio3.setOnClickListener(this);

        state_awal1();
        state_awal2();
        state_awal3();
    }

    private void state_awal1(){
        audioBinding.playAudio1.setEnabled(true);
        audioBinding.pauseAudio1.setEnabled(false);
        audioBinding.stopAudio1.setEnabled(false);
    }

    private void state_awal2(){
        audioBinding.playAudio2.setEnabled(true);
        audioBinding.pauseAudio2.setEnabled(false);
        audioBinding.stopAudio1.setEnabled(false);
    }

    private void state_awal3(){
        audioBinding.playAudio3.setEnabled(true);
        audioBinding.pauseAudio3.setEnabled(false);
        audioBinding.stopAudio3.setEnabled(false);
    }

    private void pause_audio1(){

    }

    private void play_audio1(){
        mediaPlayer = MediaPlayer.create(getActivity(), R.raw.audio_noah_wanitaku);

        audioBinding.playAudio1.setEnabled(false);
        audioBinding.pauseAudio1.setEnabled(true);
        audioBinding.stopAudio1.setEnabled(true);

        try {
            mediaPlayer.prepare();
        }catch (IllegalStateException e){
            e.printStackTrace();
        }catch (IOException ex1){
            ex1.printStackTrace();
        }

        mediaPlayer.start();

        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                state_awal1();
            }
        });
    }

    private void play_audio2(){
        mediaPlayer = MediaPlayer.create(getActivity(), R.raw.audio_noah_badai_pasti_berlalu);

        audioBinding.playAudio2.setEnabled(false);
        audioBinding.pauseAudio2.setEnabled(true);
        audioBinding.stopAudio2.setEnabled(true);

        try {
            mediaPlayer.prepare();
        }catch (IllegalStateException e){
            e.printStackTrace();
        }catch (IOException ex1){
            ex1.printStackTrace();
        }

        mediaPlayer.start();

        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                state_awal2();
            }
        });
    }

    private void play_audio3(){
        mediaPlayer = MediaPlayer.create(getActivity(), R.raw.audio_noah_kupeluk_hatimu);

        audioBinding.playAudio3.setEnabled(false);
        audioBinding.pauseAudio3.setEnabled(true);
        audioBinding.stopAudio3.setEnabled(true);

        try {
            mediaPlayer.prepare();
        }catch (IllegalStateException e){
            e.printStackTrace();
        }catch (IOException ex1){
            ex1.printStackTrace();
        }

        mediaPlayer.start();

        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                state_awal3();
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.play_1:
                play_audio1();
                break;

            case R.id.play_2:
                play_audio2();
                break;

            case R.id.play_3:
                play_audio3();
                break;
        }
    }
}