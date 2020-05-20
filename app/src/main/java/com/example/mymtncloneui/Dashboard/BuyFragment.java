package com.example.mymtncloneui.Dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.mymtncloneui.R;

public class BuyFragment extends Fragment {
    private GridLayout gridLayout;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.buyfragment, container, false);

        gridLayout = view.findViewById(R.id.mainGrid);
        setSingleEvent(gridLayout);

        return view;

    }

    private void setSingleEvent(GridLayout gridLayout) {
        for(int i = 0; i<gridLayout.getChildCount();i++){
            CardView cardView=(CardView)gridLayout.getChildAt(i);
            final int finalI= i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getActivity(),"Clicked at index "+ finalI,
                            Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
