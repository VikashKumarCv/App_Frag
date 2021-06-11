package com.example.frag;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.frag.NewFragment.FirstFragment;
import com.example.frag.NewFragment.SecondFragment;

public class MainActivity extends AppCompatActivity {



    Button btnFirst , btnSecond;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnFirst = findViewById(R.id.button);
        btnSecond = findViewById(R.id.button2);
        linearLayout = findViewById(R.id.linerLayout);

        btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                FirstFragment FirstFragment = new FirstFragment();

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linerLayout , FirstFragment );
                transaction.commit();
            }
        });

        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




                SecondFragment FirstFragment = new SecondFragment();

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linerLayout , FirstFragment );
                transaction.commit();
            }
        });


    }
}