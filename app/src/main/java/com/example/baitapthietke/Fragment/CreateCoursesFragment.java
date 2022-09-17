package com.example.baitapthietke.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.baitapthietke.R;

public class CreateCoursesFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.create_courses_fragment,container,false);
        ImageView turnBack = view.findViewById(R.id.backCoures);
        turnBack.setOnClickListener(v ->{
            UserFragment userFragment = new UserFragment();
            FragmentManager manager = getActivity().getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.Frame,userFragment).commit();
        });
        return view;
    }
}
