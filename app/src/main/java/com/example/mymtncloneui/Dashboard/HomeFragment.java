package com.example.mymtncloneui.Dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.mymtncloneui.Covid.activities.CovidBaseActivity;
import com.example.mymtncloneui.R;

public class HomeFragment extends Fragment {
    private CardView covidCardView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.homefragment, container, false);

        covidCardView =  view.findViewById(R.id.card_cord_info);

        covidCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), CovidBaseActivity.class);
                startActivity(i);
            }
        });

        return view;

    }


}

