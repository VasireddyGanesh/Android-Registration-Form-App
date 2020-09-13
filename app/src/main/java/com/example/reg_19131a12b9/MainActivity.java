package com.example.reg_19131a12b9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    EditText name,roll,phone,email,password;
    RadioGroup gender,branch;
    RadioButton button,branchButton;
    String gen,bran;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        roll=findViewById(R.id.Roll);
        phone=findViewById(R.id.phone);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        gender=findViewById(R.id.radiogroup);
        gender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                button=radioGroup.findViewById(i);
                gen=button.getText().toString();
            }
        });
        branch=findViewById(R.id.rdBranch);
        branch.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
               branchButton=radioGroup.findViewById(i);
               bran=branchButton.getText().toString();
            }
        });
    }

    public void display(View view) {
        String extname=name.getText().toString();
        String extRoll=roll.getText().toString();
        String extPhone=phone.getText().toString();
        String extemail=email.getText().toString();
        String extpass=password.getText().toString();
        Bundle bundle=new Bundle();
        bundle.putString("name",extname);
        bundle.putString("roll",extRoll);
        bundle.putString("Phone",extPhone);
        bundle.putString("email",extemail);
        bundle.putString("gender",gen);
        bundle.putString("branch",bran);
        bundle.putString("password",extpass);
        Intent i=new Intent(this,SecondActivity.class);
        i.putExtras(bundle);
        startActivity(i);
    }
}