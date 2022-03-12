package com.example.hakaton2.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.hakaton2.Points;
import com.example.hakaton2.R;

import static com.example.hakaton2.ui.dashboard.DashboardFragment.points;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    public Button bt_event1;
    public Button bt_event2;
    public Button bt_event3;
    public static boolean vis1 = true;
    public static boolean vis2 = true;
    public static boolean vis3 = true;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        bt_event1 = (Button) root.findViewById(R.id.event1_bt);
        bt_event2 = (Button) root.findViewById(R.id.event2_bt);
        bt_event3 = (Button) root.findViewById(R.id.event3_bt);
        bt_event1.setEnabled(vis1);
        bt_event2.setEnabled(vis2);
        bt_event3.setEnabled(vis3);

        bt_event1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                points.eventReg();
                bt_event1.setText(R.string.event_button_clicked);
                vis1 = false;
                bt_event1.setEnabled(vis1);
                Toast.makeText(getContext(), "Вы записались на мероприятие", Toast.LENGTH_LONG).show();
            }
        });

        bt_event2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                points.eventReg();
                bt_event2.setText(R.string.event_button_clicked);
                vis2 = false;
                bt_event2.setEnabled(vis2);

                Toast.makeText(getContext(), "Вы записались на мероприятие", Toast.LENGTH_LONG).show();
            }
        });

        bt_event3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                points.eventReg();
                bt_event3.setText(R.string.event_button_clicked);
                vis3 = false;
                bt_event3.setEnabled(vis3);
                Toast.makeText(getContext(), "Вы записались на мероприятие", Toast.LENGTH_LONG).show();
            }
        });
//        final TextView textView = root.findViewById(R.id.text_home);
//        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });

        return root;
    }
}