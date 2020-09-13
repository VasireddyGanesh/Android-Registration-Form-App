package com.example.reg_19131a12b9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.reg_19131a12b9.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
    ActivitySecondBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_second);
        Bundle bundle=getIntent().getExtras();
        if(bundle!=null)
        {
            String extname=bundle.getString("name");
            String extroll=bundle.getString("roll");
            String extpassword=bundle.getString("password");
            String extPhone=bundle.getString("Phone");
            String extemail=bundle.getString("email");
            String extgender=bundle.getString("gender");
            String extbranch=bundle.getString("branch");
            binding.first.setText("Name : "+extname+"\n\n"+"Gender :"+extgender+"\n\n"+"Roll Number: "+extroll+"\n\n"+"Phone Number :"+extPhone+"\n\n"+"Password :"+extpassword);
            binding.second.setText("Email :"+extemail+"\n\n"+"Branch :"+extbranch);
        }
    }

}