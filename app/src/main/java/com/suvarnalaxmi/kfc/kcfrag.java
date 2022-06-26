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


public class kcfrag extends Fragment {
    View view;
    EditText etk;
    String setk;
    TextView tvc;
    Button submit;
    float k = 0, c = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_kcfrag, container, false);

        etk = view.findViewById(R.id.etk);
        submit = view.findViewById(R.id.submit);
        tvc = view.findViewById(R.id.tvc);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setk = etk.getText().toString();
                if (TextUtils.isEmpty(setk)) {
                    etk.setError("Enter value in degrees");
                    return;
                } else {
                    k = Float.parseFloat(etk.getText().toString());
                    c = (float) (k - 273.15);
                    tvc.setText("Degrees in Celsius: " + c);
                    tvc.setVisibility(view.VISIBLE);
                }
            }
        });
        return view;
    }
}