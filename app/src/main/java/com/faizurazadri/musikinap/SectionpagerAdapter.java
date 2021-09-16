package com.faizurazadri.musikinap;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.faizurazadri.musikinap.Fragment.AudioFragment;
import com.faizurazadri.musikinap.Fragment.VideoFragment;

import java.nio.channels.Channels;

public class SectionpagerAdapter extends FragmentPagerAdapter {

    private Context mContext;
    private String[] title;

    public SectionpagerAdapter(Context context, FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mContext =context;
        title = new String[]{context.getResources().getString(R.string.music), context.getString(R.string.video)};
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment;

        switch (position){
            case 0:
                fragment = new AudioFragment();
                break;

            case 1:
                fragment = new VideoFragment();
                break;

            default:

                fragment = null;

                break;
        }
        return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }

    @Override
    public int getCount() {
        return title.length;
    }
}
