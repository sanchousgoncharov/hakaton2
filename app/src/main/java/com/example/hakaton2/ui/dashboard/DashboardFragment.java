package com.example.hakaton2.ui.dashboard;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
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
import androidx.recyclerview.widget.DividerItemDecoration;

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
    public TextView points_title;
    public static Points points = new Points();
    public Roulette roulette = new Roulette();
    public static boolean vis_roll = true;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
        roll_bt = (Button) root.findViewById(R.id.roll_bt);
        roll_info_bt = (Button) root.findViewById(R.id.roll_info_bt);
        roll_text = (TextView) root.findViewById(R.id.roll_text);
        points_title = (TextView) root.findViewById(R.id.points_title);

        points_title.setText( points.getPoints() + " ИКТИБаллов");
        if (points.getPoints() < 5){
            vis_roll = false;
        }
        else {
            vis_roll = true;
        }
        roll_bt.setEnabled(vis_roll);


        roll_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (points.getPoints() < 5) {
                    vis_roll = false;
                    roll_bt.setEnabled(vis_roll);
                    Toast.makeText(getContext(), "Недостаточно ИКТИБаллов", Toast.LENGTH_LONG).show();
                } else {
                    points.rouletteRoll();
                    points_title.setText(points.getPoints() + " ИКТИБаллов");
                    roulette.rouletteMechanism();
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            random_value = (int) (Math.random() * 99);
                            roll_text.setTextColor(Color.GRAY);
                            roll_text.setText(gifts[random_value]);
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    random_value = (int) (Math.random() * 99);
                                    roll_text.setText(gifts[random_value]);
                                    handler.postDelayed(new Runnable() {
                                        @Override
                                        public void run() {
                                            random_value = (int) (Math.random() * 99);
                                            roll_text.setText(gifts[random_value]);
                                            handler.postDelayed(new Runnable() {
                                                @Override
                                                public void run() {
                                                    random_value = (int) (Math.random() * 99);
                                                    roll_text.setText(gifts[random_value]);
                                                    handler.postDelayed(new Runnable() {
                                                        @Override
                                                        public void run() {
                                                            random_value = (int) (Math.random() * 99);
                                                            roll_text.setText(gifts[random_value]);
                                                            handler.postDelayed(new Runnable() {
                                                                @Override
                                                                public void run() {
                                                                    random_value = (int) (Math.random() * 99);
                                                                    roll_text.setText(gifts[random_value]);
                                                                    handler.postDelayed(new Runnable() {
                                                                        @Override
                                                                        public void run() {
                                                                            random_value = (int) (Math.random() * 99);
                                                                            roll_text.setText(gifts[random_value]);
                                                                            handler.postDelayed(new Runnable() {
                                                                                @Override
                                                                                public void run() {
                                                                                    random_value = (int) (Math.random() * 99);
                                                                                    roll_text.setText(gifts[random_value]);
                                                                                    handler.postDelayed(new Runnable() {
                                                                                        @Override
                                                                                        public void run() {
                                                                                            random_value = (int) (Math.random() * 99);
                                                                                            roll_text.setText(gifts[random_value]);
                                                                                            handler.postDelayed(new Runnable() {
                                                                                                @Override
                                                                                                public void run() {
                                                                                                    random_value = (int) (Math.random() * 99);
                                                                                                    roll_text.setText(gifts[random_value]);
                                                                                                    handler.postDelayed(new Runnable() {
                                                                                                        @Override
                                                                                                        public void run() {
                                                                                                            random_value = (int) (Math.random() * 99);
                                                                                                            roll_text.setText(gifts[random_value]);
                                                                                                            handler.postDelayed(new Runnable() {
                                                                                                                @Override
                                                                                                                public void run() {
                                                                                                                    random_value = (int) (Math.random() * 99);
                                                                                                                    roll_text.setText(gifts[random_value]);
                                                                                                                    roll_text.setTextColor(Color.RED);
                                                                                                                }
                                                                                                            }, 1000);
                                                                                                        }
                                                                                                    }, 900);
                                                                                                }
                                                                                            }, 800);
                                                                                        }
                                                                                    }, 750);
                                                                                }
                                                                            }, 600);
                                                                        }
                                                                    }, 600);
                                                                }
                                                            }, 600);
                                                        }
                                                    }, 500);
                                                }
                                            }, 400);
                                        }
                                    }, 400);
                                }
                            }, 300);
                        }
                    }, 300);

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