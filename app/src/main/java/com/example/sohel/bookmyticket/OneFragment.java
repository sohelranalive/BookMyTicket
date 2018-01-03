package com.example.sohel.bookmyticket;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


public class OneFragment extends Fragment{


    public OneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_one,container,false);

        ImageButton movie1 = (ImageButton) v.findViewById(R.id.MovieOne);
        movie1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),Movie1Activity.class);
                startActivity(intent);
            }
        });

        ImageButton movie2 = (ImageButton) v.findViewById(R.id.MovieTwo);
        movie2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),Movie2Activity.class);
                startActivity(intent);
            }
        });

        ImageButton movie3= (ImageButton) v.findViewById(R.id.MovieThree);
        movie3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),Movie3Activity.class);
                startActivity(intent);
            }
        });

        ImageButton movie4 = (ImageButton) v.findViewById(R.id.MovieFour);
        movie4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),Movie4Activity.class);
                startActivity(intent);
            }
        });

        ImageButton movie5 = (ImageButton) v.findViewById(R.id.MovieFive);
        movie5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),Movie5Activity.class);
                startActivity(intent);
            }
        });

        ImageButton movie6 = (ImageButton) v.findViewById(R.id.MovieSix);
        movie6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),Movie6Activity.class);
                startActivity(intent);
            }
        });

        return v;
    }

}
