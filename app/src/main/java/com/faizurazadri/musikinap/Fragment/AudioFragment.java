package com.faizurazadri.musikinap.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.faizurazadri.musikinap.R;
import com.faizurazadri.musikinap.databinding.FragmentAudioBinding;


public class AudioFragment extends Fragment {

    private FragmentAudioBinding audioBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        audioBinding = FragmentAudioBinding.inflate(inflater, container, false);
        return audioBinding.getRoot();
    }
}