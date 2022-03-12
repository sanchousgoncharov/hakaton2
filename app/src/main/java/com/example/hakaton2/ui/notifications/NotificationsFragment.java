package com.example.hakaton2.ui.notifications;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.hakaton2.R;

public class NotificationsFragment extends Fragment {

    private NotificationsViewModel notificationsViewModel;
    public Button bl;
    public Button br;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
        new ViewModelProvider(this).get(NotificationsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_notifications, container, false);

        bl = (Button) root.findViewById(R.id.btnSignIn);
        br = (Button) root.findViewById(R.id.btnRegister);

        bl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NotificationsFragment.this.getActivity(), Login.class);
                startActivity(intent);
            }
        });
        br.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NotificationsFragment.this.getActivity(), Register.class);
                startActivity(intent);
            }
        });



        return root;
    }


}