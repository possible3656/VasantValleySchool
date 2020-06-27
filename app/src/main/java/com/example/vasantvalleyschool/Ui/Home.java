package com.example.vasantvalleyschool.Ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.vasantvalleyschool.R;
import com.google.android.material.snackbar.Snackbar;

import static com.google.android.material.snackbar.BaseTransientBottomBar.LENGTH_SHORT;

public class Home extends AppCompatActivity {

    ImageView sideBar, notification , home , website, aboutUs , contactUs,logOut;
   @SuppressLint("StaticFieldLeak")
   static TextView titleHome;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        sideBar=findViewById(R.id.sideBarHome);
        notification=findViewById(R.id.notificationHome);
        home=findViewById(R.id.homeHome);
        website=findViewById(R.id.WebsiteHome);
        aboutUs=findViewById(R.id.aboutUsHome);
        contactUs=findViewById(R.id.contactUsHome);
        logOut=findViewById(R.id.logOutHome);
        titleHome=findViewById(R.id.titleHome);

        titleHome.setText("HOME");

        sideBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onSideBarPressed();
            }
        });
        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onNotificationPressed();
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onHomePressed();
            }
        });
        website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onWebsitePressed();
            }
        });
        aboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onAboutPressed();
            }
        });
        contactUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onContactUsPressed();
            }
        });
        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onLogOutPressed();
            }
        });

        AddingFragmentToView();

    }

    private void onLogOutPressed() {
        Toast.makeText(this, "Log Out Pressed", Toast.LENGTH_SHORT).show();
    }

    private void onContactUsPressed() {

        Toast.makeText(this, "Contact Us Pressed", Toast.LENGTH_SHORT).show();
    }

    private void onAboutPressed() {
        Toast.makeText(this, "About Us Pressed", Toast.LENGTH_SHORT).show();
    }

    private void onWebsitePressed() {
        Toast.makeText(this, "Website  Pressed", Toast.LENGTH_SHORT).show();
    }

    private void onHomePressed() {
        Toast.makeText(this, "Home Pressed", Toast.LENGTH_SHORT).show();
    }

    private void onNotificationPressed() {
       // Toast.makeText(this, "Notification Pressed", Toast.LENGTH_SHORT).show();
        NotificationFragment notificationFragment= new NotificationFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                .beginTransaction().replace(R.id.homeFrame,notificationFragment,"NotificationFragment");
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    private void onSideBarPressed() {
        Toast.makeText(this, "SideBar Pressed", Toast.LENGTH_SHORT).show();
    }

    private void AddingFragmentToView() {
        HomeFragment homeFragment= new HomeFragment();
        FragmentTransaction fragmentTransaction= getSupportFragmentManager()
                .beginTransaction().replace(R.id.homeFrame,homeFragment,"HomeFragment");
        fragmentTransaction.commit();}

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Home.titleHome.setText("HOME");
    }
}