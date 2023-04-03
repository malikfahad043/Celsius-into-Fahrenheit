package com.example.celciusintofahrenheit;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity
{
    private EditText editText1;
    private TextView txtresult1;
    private Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.edittext1);
        txtresult1 = findViewById(R.id.txtresult1);
        btn1 = findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String celsiusString = editText1.getText().toString();
                double celsius = Double.parseDouble(celsiusString);
                double fahrenheit = (celsius * 1.8) + 32;
                txtresult1.setText(String.format("%.2f degrees Fahrenheit", fahrenheit));
            }
        });
    }
}
