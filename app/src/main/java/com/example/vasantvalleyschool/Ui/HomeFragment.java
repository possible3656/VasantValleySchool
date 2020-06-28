package com.example.vasantvalleyschool.Ui;

import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.example.vasantvalleyschool.Adapter.HomeItemAdapter;
import com.example.vasantvalleyschool.Model.homeItemModel;
import com.example.vasantvalleyschool.R;

import java.util.ArrayList;


public class HomeFragment extends Fragment implements HomeItemAdapter.OnHomeItemPressed {

    ImageView profileImageHome;
    TextView nameHome;
    RecyclerView recycler_view_home;


    homeItemModel[] homeItemModels;
    HomeItemAdapter homeItemAdapter;

    View view;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_home, container, false);
        profileImageHome = view.findViewById(R.id.profile_image_home);
        nameHome = view.findViewById(R.id.profile_name_home);
        recycler_view_home = view.findViewById(R.id.recycler_view_home);


        addingDatatoArray();


        return view;
    }

    private void addingDatatoArray() {

        homeItemModels = new homeItemModel[]{
                new homeItemModel(R.drawable.person, "My Profile"),
                new homeItemModel(R.drawable.teacher, "My Class"),
                new homeItemModel(R.drawable.study, "Homework"),
                new homeItemModel(R.drawable.attendance, "Attendance"),
                new homeItemModel(R.drawable.exam, "Test"),
                new homeItemModel(R.drawable.fee, "Fee"),
                new homeItemModel(R.drawable.message, "Message"),
                new homeItemModel(R.drawable.gallery, "Gallery")
        };
        addingDatatoRecyclerView(homeItemModels);
    }

    private void addingDatatoRecyclerView(homeItemModel[] homeItemModel) {
        Log.d("TAG", "addingDatatoRecyclerView: " + homeItemModel);
        recycler_view_home.setHasFixedSize(true);
        recycler_view_home.setLayoutManager(new GridLayoutManager(getContext(), 3));
        homeItemAdapter = new HomeItemAdapter(getContext(), homeItemModel, this);
        recycler_view_home.setAdapter(homeItemAdapter);
    }

    @Override
    public void onItemPressed(int position) {

        switch (homeItemModels[position].getTitle()) {

            case "My Profile":
            //    Toast.makeText(getContext(), "My Profile pressed", Toast.LENGTH_SHORT).show();
                MyProfileFragment myProfileFragment = new MyProfileFragment();
                FragmentTransaction fragmentTransaction= null;
                if (getFragmentManager() != null) {
                    fragmentTransaction = getFragmentManager().beginTransaction()
                            .replace(R.id.homeFrame,myProfileFragment,"MyProfileFragment");
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }
                Home.titleHome.setText("My Profile");

                break;

            case "My Class":
           //     Toast.makeText(getContext(), "My Class pressed", Toast.LENGTH_SHORT).show();
                MyClassFragment myClassFragment = new MyClassFragment();
                if (getFragmentManager() != null) {
                    fragmentTransaction = getFragmentManager().beginTransaction()
                            .replace(R.id.homeFrame,myClassFragment,"MyProfileFragment");
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }
                Home.titleHome.setText("My Class");

                break;

            case "Homework":
             //   Toast.makeText(getContext(), "Homework pressed", Toast.LENGTH_SHORT).show();
                HomeworkFragment homeworkFragment = new HomeworkFragment();
                if (getFragmentManager() != null) {
                    fragmentTransaction = getFragmentManager().beginTransaction()
                            .replace(R.id.homeFrame,homeworkFragment,"MyProfileFragment");
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }
                Home.titleHome.setText("Homework");
                break;

            case "My Attendance":
            //    Toast.makeText(getContext(), "My Attendance pressed", Toast.LENGTH_SHORT).show();
                MyAttendanceFragment myAttendanceFragment = new MyAttendanceFragment();
                if (getFragmentManager() != null) {
                    fragmentTransaction = getFragmentManager().beginTransaction()
                            .replace(R.id.homeFrame,myAttendanceFragment,"MyProfileFragment");
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }
                Home.titleHome.setText("My Attendance");
                break;

            case "Test":
              //  Toast.makeText(getContext(), "Test pressed", Toast.LENGTH_SHORT).show();
                TestFragment testFragment = new TestFragment();
                if (getFragmentManager() != null) {
                    fragmentTransaction = getFragmentManager().beginTransaction()
                            .replace(R.id.homeFrame,testFragment,"MyProfileFragment");
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }
                Home.titleHome.setText("Test");
                break;

            case "Fee":
           //     Toast.makeText(getContext(), "Fee pressed", Toast.LENGTH_SHORT).show();
                FeeFragment feeFragment = new FeeFragment();
                if (getFragmentManager() != null) {
                    fragmentTransaction = getFragmentManager().beginTransaction()
                            .replace(R.id.homeFrame,feeFragment,"MyProfileFragment");
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }
                Home.titleHome.setText("Fee");
                break;

            case "Message":
         //       Toast.makeText(getContext(), "Message pressed", Toast.LENGTH_SHORT).show();
                MessageFragment messageFragment = new MessageFragment();
                if (getFragmentManager() != null) {
                    fragmentTransaction = getFragmentManager().beginTransaction()
                            .replace(R.id.homeFrame,messageFragment,"MyProfileFragment");
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }
                Home.titleHome.setText("Message");
                break;

            case "Gallery":
            //    Toast.makeText(getContext(), "Gallery pressed", Toast.LENGTH_SHORT).show();
                GalleryFragement galleryFragement = new GalleryFragement();
                if (getFragmentManager() != null) {
                    fragmentTransaction = getFragmentManager().beginTransaction()
                            .replace(R.id.homeFrame,galleryFragement,"MyProfileFragment");
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }
                Home.titleHome.setText("Gallery");
                break;


        }


    }

}