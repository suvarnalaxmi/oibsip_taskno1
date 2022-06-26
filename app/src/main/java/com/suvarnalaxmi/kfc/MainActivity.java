package com.suvarnalaxmi.kfc;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {
CircleImageView cf,ck,fc,fk,kc,kf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cf=findViewById(R.id.cf);
        ck=findViewById(R.id.ck);
        fc=findViewById(R.id.fc);
        fk=findViewById(R.id.fk);
        kc=findViewById(R.id.kc);
        kf=findViewById(R.id.kf);
    }

    public void ctof(View view) {
        loadFragment(new cffrag());
    }

    public void ctok(View view) {
        loadFragment(new ckfrag());
    }

    public void ftoc(View view) {
        loadFragment(new fcfrag());
    }

    public void ftok(View view) {
        loadFragment(new fkfrag());
    }

    public void ktoc(View view) {
        loadFragment(new kcfrag());
    }

    public void ktof(View view) {
        loadFragment(new kffrag());
    }

    private void loadFragment(Fragment fragment) {

        FragmentManager fm = getFragmentManager();

        FragmentTransaction fragmentTransaction = fm.beginTransaction();

        fragmentTransaction.replace(R.id.lay, fragment);
        fragmentTransaction.commit();
    }
}