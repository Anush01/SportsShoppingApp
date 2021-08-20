package com.example.anushmp.decathlonapp.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.anushmp.decathlonapp.R;

public class Account_Activity2 extends AppCompatActivity {
    Button btnLogout;
    ImageView Picture;
    ImageView myProfile;
    ImageView address;
    ImageView returns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account2);
        Picture=findViewById(R.id.ivperson);
        myProfile=findViewById(R.id.ivProfile);
        address=findViewById(R.id.ivAddress);
        returns=findViewById(R.id.ivCartReturn);
        toastMessages();
        btnLogout = findViewById(R.id.logout);
        btnLogout.setOnClickListener(v -> {
            Intent intent = new Intent(Account_Activity2.this, AccountActivity.class);
            startActivity(intent);
        });

    }

    private void toastMessages() {
        Picture.setOnClickListener(v -> Toast.makeText(Picture.getContext(), "Change Profile Picture",Toast.LENGTH_SHORT).show());
        myProfile.setOnClickListener(v ->  Toast.makeText(myProfile.getContext(), "Change Profile Details",Toast.LENGTH_SHORT).show());
        address.setOnClickListener(v ->  Toast.makeText(address.getContext(), "Change Address",Toast.LENGTH_SHORT).show());
        returns.setOnClickListener(v ->  Toast.makeText(returns.getContext(), "Go To Orders And Returns Details",Toast.LENGTH_SHORT).show());
    }

}