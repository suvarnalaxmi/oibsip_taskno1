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


public class kffrag extends Fragment {

    View view;
    EditText etk;
    String setk;
    TextView tvf;
    Button submit;
    float k = 0, f = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_kffrag, container, false);

        etk = view.findViewById(R.id.etk);
        submit = view.findViewById(R.id.submit);
        tvf = view.findViewById(R.id.tvf);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setk=etk.getText().toString();
                if (TextUtils.isEmpty(setk)) {
                    etk.setError("Enter value in degrees");
                    return;
                }
                else {
                    k = Float.parseFloat(etk.getText().toString());
                    f = (float) (k - 273.15) * 9 / 5 + 32;
                    tvf.setText("Degrees in Fahrenheit: " + f);
                    tvf.setVisibility(view.VISIBLE);
                }
            }
        });
        return view;
    }
}