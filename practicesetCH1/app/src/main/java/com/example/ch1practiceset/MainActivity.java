package com.example.ch1practiceset;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

   EditText n1;
  // EditText n2;
   TextView text;
   Button button;



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

        n1 = findViewById(R.id.n1);
       // n2 = findViewById(R.id.n2);
        text =findViewById(R.id.text);
        button = findViewById(R.id.button);

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                 int sum =  Integer.parseInt(n1.getText().toString()) + Integer.parseInt(n2.getText().toString());
//                 text.setText("The sum is : "+ sum);
//            }
//        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer buffer = new StringBuffer();
                int input = Integer.parseInt(n1.getText().toString());
                int product=0;
                for(int i=1;i<=10;i++){
                    product = input*i;
                    buffer.append(input +" * "+i+" = "+product+"\n\n");
            }
                text.setText(buffer);
        }
        });




    }
}