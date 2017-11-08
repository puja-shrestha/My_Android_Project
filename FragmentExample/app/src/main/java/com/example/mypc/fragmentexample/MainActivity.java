package com.example.mypc.fragmentexample;

import android.app.Activity;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Boolean status = false;
    Button bn; //creating variable for button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bn = (Button) findViewById(R.id.bn); //initializing variable bn
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               /* FragmentOne fragmentOne = new FragmentOne();
                FragmentManager manager = getSupportFragmentManager();
                manager.beginTransaction().replace(R.id.mainLayout, fragmentOne).commit();
                */

//                FragmentManager fragmentManager = getFragmentManager();
//                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

//                if(!status)
//
////                 FragmentOne f1 = new FragmentOne();
////                    fragmentTransaction.add(R.id.fragment_container,f1);
////                        fragmentTransaction.addToBackStack(null);
////                        fragmentTransaction.commit();
////                        bn.setText("LOAD SECOND FRAGMENT");
////                        status = true;
//                }
//                else
//                {
//                    FragmentTwo f2 = new FragmentTwo();
//                    fragmentTransaction.add(R.id.fragment_container,f2);
//                    fragmentTransaction.addToBackStack(null);
//                    fragmentTransaction.commit();
//                    bn.setText("LOAD FIRST FRAGMENT");
//                    status = false;
//                }
            }
        });
    }
}
