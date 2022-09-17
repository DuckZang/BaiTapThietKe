package com.example.baitapthietke.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.baitapthietke.R;

public class UserFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.user_fragment,container,false);
        EditText updateProfile = view.findViewById(R.id.editText12);
        EditText updateAvatar = view.findViewById(R.id.editText13);
        EditText updatePass = view.findViewById(R.id.editText14);
        TextView logOut = view.findViewById(R.id.textView2);
        TextView coureses = view.findViewById(R.id.tvCourses);

        updateProfile.setOnClickListener(v ->{
            UpdateFragment updateFragment = new UpdateFragment();
            FragmentManager manager = getActivity().getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.Frame,updateFragment).commit();
        });

        updateAvatar.setOnClickListener(v ->{
            UdapteAvatarFragment udapteAvatarFragment = new UdapteAvatarFragment();
            FragmentManager manager = getActivity().getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.Frame,udapteAvatarFragment).commit();
        });
        updatePass.setOnClickListener(v ->{
            UpdatePasswordFragment updatePasswordFragment = new UpdatePasswordFragment();
            FragmentManager manager = getActivity().getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.Frame,updatePasswordFragment).commit();
        });
        logOut.setOnClickListener(v ->{
            LoginFragment loginFragment = new LoginFragment();
            FragmentManager manager = getActivity().getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.Frame,loginFragment).commit();
        });
        coureses.setOnClickListener(v ->{
            CreateCoursesFragment createCoursesFragment = new CreateCoursesFragment();
            FragmentManager manager = getActivity().getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.Frame,createCoursesFragment).commit();
        });
        return view;
    }
}
