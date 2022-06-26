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


public class fkfrag extends Fragment {
    View view;
    EditText etf;
    String setf;
    TextView tvk;
    Button submit;
    float f=0,k=0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_fkfrag, container, false);

        etf=view.findViewById(R.id.etf);
        submit=view.findViewById(R.id.submit);
        tvk=view.findViewById(R.id.tvk);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setf=etf.getText().toString();
                if (TextUtils.isEmpty(setf)) {
                    etf.setError("Enter value in degrees");
                    return;
                }
                else {
                    f = Float.parseFloat(etf.getText().toString());
                    k = (float) ((f - 32) * 5 / 9 + 273.15);
                    tvk.setText("Degrees in Kelvin: " + k);
                    tvk.setVisibility(view.VISIBLE);
                }
            }
        });
        return view;
    }
}