package com.hfad.scheduledlogs.view.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hfad.scheduledlogs.R;

public class WorkManagerFragment extends Fragment {


    public WorkManagerFragment() {
        // Required empty public constructor
    }


    public static WorkManagerFragment newInstance() {
        WorkManagerFragment fragment = new WorkManagerFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_work_manager, container, false);
    }
}