package com.example.hakaton2.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.hakaton2.Points;
import com.example.hakaton2.R;
import com.example.hakaton2.Roulette;

import static com.example.hakaton2.Roulette.gifts;
import static com.example.hakaton2.Roulette.random_value;

public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;
    public Button roll_bt;
    public Button roll_info_bt;
    public TextView roll_text;
    public Points points = new Points();
    public Roulette roulette = new Roulette();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
        roll_bt = (Button) root.findViewById(R.id.roll_bt);
        roll_info_bt = (Button) root.findViewById(R.id.roll_info_bt);
        roll_text = (TextView) root.findViewById(R.id.roll_text);

        roll_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                points.rouletteRoll();
                roulette.rouletteMechanism();
                for (int x = 0; x < 100; x++){
                    random_value = (int) (Math.random()*99);
                    roll_text.setText(gifts[x]);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }

            }
        });

//        final TextView textView = root.findViewById(R.id.text_dashboard);
//        dashboardViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        return root;
    }
}