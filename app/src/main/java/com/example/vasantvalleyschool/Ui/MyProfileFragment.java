package com.example.vasantvalleyschool.Ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vasantvalleyschool.R;


public class MyProfileFragment extends Fragment {
    TextView studentName, studentRollNumber, studentPhoneNumber, studentClass;
    TextView mentorName, mentorPhoneNumber;
    ImageView mentorCall, mentorMessage;


    public MyProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_profile, container, false);

        studentName = view.findViewById(R.id.studentNameMyProfile);
        studentRollNumber = view.findViewById(R.id.rollNumberMyProfile);
        studentPhoneNumber = view.findViewById(R.id.phoneNumberMyProfile);
        studentClass = view.findViewById(R.id.classMyProfile);
        mentorName = view.findViewById(R.id.mentorNameMyProfile);
        mentorPhoneNumber = view.findViewById(R.id.mentorPhoneNumberNameMyProfile);
        mentorCall = view.findViewById(R.id.callImageMyprofile);
        mentorMessage = view.findViewById(R.id.messageImageMyProfile);





        return view;
    }
}