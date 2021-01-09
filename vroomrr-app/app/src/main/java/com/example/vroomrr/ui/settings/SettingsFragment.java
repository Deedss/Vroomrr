package com.example.vroomrr.ui.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.vroomrr.R;
import com.example.vroomrr.ServerCallback;

public class SettingsFragment extends Fragment implements ServerCallback {
    private View root;
    private TextView textView;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_settings, container, false);
        textView = root.findViewById(R.id.text_settings);

        return root;
    }

    @Override
    public void completionHandler(Boolean success, String object) {

    }
}