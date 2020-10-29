package com.hfad.scheduledlogs.view.activity;

import androidx.fragment.app.Fragment;

import com.hfad.scheduledlogs.view.activity.SingleFragmentActivity;
import com.hfad.scheduledlogs.view.fragment.WorkManagerFragment;

public class WorkManagerActivity extends SingleFragmentActivity {

    @Override
    public Fragment createFragment() {
        return WorkManagerFragment.newInstance();
    }

}