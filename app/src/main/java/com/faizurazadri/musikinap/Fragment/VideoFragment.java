package com.faizurazadri.musikinap.Fragment;

import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;

import com.faizurazadri.musikinap.R;
import com.faizurazadri.musikinap.databinding.FragmentVideoBinding;


public class VideoFragment extends Fragment {

    private FragmentVideoBinding fragmentVideoBinding;
    private MediaController mediaController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragmentVideoBinding = FragmentVideoBinding.inflate(inflater, container, false);
        return fragmentVideoBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mediaController = new MediaController(getActivity());

       video_1();
       video_2();
       video_3();
    }

    private void video_1(){
        fragmentVideoBinding.play1.setOnClickListener(view1 -> {
            Uri uri = Uri.parse("android.resource://" + getActivity().getPackageName()+"/" + R.raw.video_noah_wanitaku);

            fragmentVideoBinding.video1.setVideoURI(uri);
            fragmentVideoBinding.video1.setMediaController(mediaController);
            mediaController.setAnchorView(fragmentVideoBinding.video1);

            fragmentVideoBinding.video1.start();
        });
    }

    private void video_2(){
        fragmentVideoBinding.play2.setOnClickListener(view1 -> {
            Uri uri = Uri.parse("android.resource://" + getActivity().getPackageName()+"/" + R.raw.video_noah_badai_pasti_berlalu);

            fragmentVideoBinding.video2.setVideoURI(uri);
            fragmentVideoBinding.video2.setMediaController(mediaController);
            mediaController.setAnchorView(fragmentVideoBinding.video2);

            fragmentVideoBinding.video2.start();
        });
    }

    private void video_3(){
        fragmentVideoBinding.play3.setOnClickListener(view1 -> {
            Uri uri = Uri.parse("android.resource://" + getActivity().getPackageName()+"/" + R.raw.video_noah_kupeluk_hatimu);

            fragmentVideoBinding.video3.setVideoURI(uri);
            fragmentVideoBinding.video3.setMediaController(mediaController);
            mediaController.setAnchorView(fragmentVideoBinding.video3);

            fragmentVideoBinding.video3.start();
        });
    }
}