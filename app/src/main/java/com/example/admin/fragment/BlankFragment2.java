package com.example.admin.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment2 extends Fragment {

    EditText numone, numtwo;
    TextView differ;
    Button subtract;


    public BlankFragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_blank_fragment2, container, false);
        numone=v.findViewById(R.id.subone);
        numtwo=v.findViewById(R.id.subtwo);
        differ=v.findViewById(R.id.diff);
        subtract=v.findViewById(R.id.sub);

        differ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(numone.getText().toString());
                int b=Integer.parseInt(numtwo.getText().toString());
                int c=a-b;
                differ.setText(""+c);

            }
        });
        return v;
    }

}
