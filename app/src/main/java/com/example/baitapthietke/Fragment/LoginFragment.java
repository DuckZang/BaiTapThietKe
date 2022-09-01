package com.example.baitapthietke.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.baitapthietke.R;

public class LoginFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.login_fragment,container,false);
        TextView tv2 = view.findViewById(R.id.tv2);
        TextView tvSignUp = view.findViewById(R.id.tvSignUp);
        TextView updatePass = view.findViewById(R.id.updatePass);
        updatePass.setOnClickListener(v ->{
            UpdatePasswordFragment updatePasswordFragment = new UpdatePasswordFragment();
            FragmentManager manager = getActivity().getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.Frame,updatePasswordFragment).commit();
        });

        tv2.setOnClickListener(v ->{
            UserFragment userFragment = new UserFragment();
            FragmentManager manager = getActivity().getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.Frame,userFragment).commit();
        });
        tvSignUp.setOnClickListener(v -> {
            SignUpFragment signUpFragment = new SignUpFragment();
            FragmentManager manager = getActivity().getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.Frame,signUpFragment).commit();
        });

        return view;
    }
}
