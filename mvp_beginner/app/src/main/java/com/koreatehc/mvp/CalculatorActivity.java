package com.koreatehc.mvp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalculatorActivity extends AppCompatActivity implements CalculatorView {
    private Button plusButton;
    private Button divideButton;
    private TextView resultTextview;
    private EditText firstInputEdittext;
    private EditText secondInputEdittext;
    private CalculatorPresenter calculatorPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init() {
        initView();
        calculatorPresenter = new CalculatorPresenter(this);
    }

    public void initView() {
        plusButton = findViewById(R.id.plus_button);
        resultTextview = findViewById(R.id.result_textview);
        firstInputEdittext = findViewById(R.id.first_input_edittext);
        secondInputEdittext = findViewById(R.id.second_input_edittext);
        plusButton = findViewById(R.id.plus_button);
        divideButton = findViewById(R.id.divide_button);

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(firstInputEdittext.getText().toString());
                int b = Integer.parseInt(secondInputEdittext.getText().toString());
                calculatorPresenter.getAddResult(a, b);
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(firstInputEdittext.getText().toString());
                int b = Integer.parseInt(secondInputEdittext.getText().toString());
                calculatorPresenter.getDivideFunction(a, b);
            }
        });
    }

    @Override
    public void showCalculateResult(double result) {
        resultTextview.setText(String.valueOf(result));
    }

    @Override
    public void showFailCalculateResult(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void clearInput() {
        firstInputEdittext.getText().clear();
        secondInputEdittext.getText().clear();
    }
}
