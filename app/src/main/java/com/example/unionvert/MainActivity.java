package com.example.unionvert;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.text.DecimalFormat;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        button  = findViewById(R.id.button);
        textView = findViewById(R.id.textView2);
        editText = findViewById(R.id.editText);

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //Toast.makeText(MainActivity.this, "Hi click listener worked", Toast.LENGTH_SHORT).show();
//                String s = editText.getText().toString();
//                int kg =  Integer.parseInt(s);
//                double pound = 2.205 * kg;
//                textView.setText("The correseponding value in pounds is : "+pound);
//
//            }
//        });

    }

    public void calculate(View view){
        DecimalFormat df = new DecimalFormat("0.00");

        String s = editText.getText().toString();
        int kg =  Integer.parseInt(s);
        double pound = 2.205 * kg;
        //StringBuffer sb = new StringBuffer();
        //sb.append("The correseponding value in pounds is : "+String.format("%.2f", pound));

        textView.setText("The correseponding value in pounds is : "+df.format(pound));
        Toast.makeText(this, "Thanks for using this app", Toast.LENGTH_SHORT).show();
    }
}