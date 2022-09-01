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

public class SignUpFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.sign_up_fragment,container,false);
        TextView tvLogin = view.findViewById(R.id.tv_Login);
        TextView tv = view.findViewById(R.id.tv);

        tv.setOnClickListener(v ->{
            UpdateFragment updateFragment = new UpdateFragment();
            FragmentManager manager = getActivity().getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.Frame,updateFragment).commit();
        });

        tvLogin.setOnClickListener(v ->{
            LoginFragment loginFragment = new LoginFragment();
            FragmentManager manager = getActivity().getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.Frame,loginFragment).commit();
        });
        return view;

    }
}
