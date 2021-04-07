package com.example.appdev;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txthello;
    Button myBtn;
    EditText myTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txthello=findViewById(R.id.txtHello);
        myTxt=findViewById(R.id.myTxt);
        myBtn=findViewById(R.id.myBtn);


    }
    public void onBtnClick(View view)
    {
        System.out.println("Button pressed");
        txthello.setText(myTxt.getText().toString());

    }


}