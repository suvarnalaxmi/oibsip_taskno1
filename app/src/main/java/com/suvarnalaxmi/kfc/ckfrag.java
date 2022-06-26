package com.suvarnalaxmi.kfc;

import android.os.Bundle;
import android.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class ckfrag extends Fragment {
    View view;
    EditText etc;
    String setc;
    TextView tvk;
    Button submit;
    float c=0,k=0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_ckfrag, container, false);

        etc=view.findViewById(R.id.etc);
        submit=view.findViewById(R.id.submit);
        tvk=view.findViewById(R.id.tvk);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setc=etc.getText().toString();
                if (TextUtils.isEmpty(setc)) {
                    etc.setError("Enter value in degrees");
                    return;
                }
                else {
                    c = Float.parseFloat(etc.getText().toString());
                    k = (float) (c + 273.15);
                    tvk.setText("Degrees in Kelvin: " + k);
                    tvk.setVisibility(view.VISIBLE);
                }
            }
        });
        return view;
    }

}