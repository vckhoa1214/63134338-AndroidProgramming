package com.example.bottomnavigationview;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Cau1Fragment extends Fragment {

    private EditText inputHeight, inputWeight;
    private TextView labelResult;
    private Button buttonCalculate;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cau1, container, false);

        inputHeight = view.findViewById(R.id.input_height);
        inputWeight = view.findViewById(R.id.input_weight);
        labelResult = view.findViewById(R.id.label_result);
        buttonCalculate = view.findViewById(R.id.button_calculate);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateBMI();
            }
        });

        return view;
    }

    private void calculateBMI() {
        String heightStr = inputHeight.getText().toString();
        String weightStr = inputWeight.getText().toString();

        if (TextUtils.isEmpty(heightStr) || TextUtils.isEmpty(weightStr)) {
            Toast.makeText(getActivity(), "Please enter both height and weight", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            float height = Float.parseFloat(heightStr);
            float weight = Float.parseFloat(weightStr);
            float bmi = weight / (height * height);
            labelResult.setText(String.format("Your BMI: %.2f", bmi));
        } catch (NumberFormatException e) {
            Toast.makeText(getActivity(), "Invalid input", Toast.LENGTH_SHORT).show();
        }
    }
}
