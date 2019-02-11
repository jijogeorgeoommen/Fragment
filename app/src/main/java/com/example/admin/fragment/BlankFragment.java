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
public class BlankFragment extends Fragment {

    Button equals;
    EditText edtone,edttwo;
    TextView result;


    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_blank, container, false);
        edtone=v.findViewById(R.id.addone);
        edttwo=v.findViewById(R.id.addtwo);
         equals=v.findViewById(R.id.add);
         result=v.findViewById(R.id.sum);

         equals.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 int a = Integer.parseInt(edtone.getText().toString());
                 int b = Integer.parseInt(edttwo.getText().toString());
                 int c = a + b;
                 result.setText(""+c);
             }
         });
         return v;
    }

}
