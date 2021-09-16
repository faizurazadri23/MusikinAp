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


public class AudioFragment extends Fragment {

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


    }

    private void state_awal(){

    }

    private void pause_audio1(){

    }
}