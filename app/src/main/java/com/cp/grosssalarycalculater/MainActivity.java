package com.cp.grosssalarycalculater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText bs,hra,ta,pa,ma,name;
    private Button btn;
    private TextView res,rname,rbs,rhra,rta,rpa,rma,rgs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bs = (EditText) findViewById(R.id.editTextNumberDecimal);
        hra = (EditText) findViewById(R.id.editTextNumberDecimal2);
        ta = (EditText) findViewById(R.id.editTextNumberDecimal3);
        pa = (EditText) findViewById(R.id.editTextNumberDecimal4);
        ma = (EditText) findViewById(R.id.editTextNumberDecimal5);
        name = (EditText) findViewById(R.id.editTextText);

        btn = (Button) findViewById(R.id.button);

        rname = (TextView) findViewById(R.id.textViewname);
        rbs = (TextView) findViewById(R.id.textViewbs);
        rhra = (TextView) findViewById(R.id.textViewhra);
        rta = (TextView) findViewById(R.id.textViewta);
        rpa = (TextView) findViewById(R.id.textViewpa);
        rma = (TextView) findViewById(R.id.textViewma);
        res = (TextView) findViewById(R.id.textViewgs);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String NAME = (name.getText().toString());
                float BS = Float.parseFloat(bs.getText().toString());
                float HRA = Float.parseFloat(hra.getText().toString());
                float TA = Float.parseFloat(ta.getText().toString());
                float PA = Float.parseFloat(pa.getText().toString());
                float MA = Float.parseFloat(ma.getText().toString());

                float HRAofBS = ((BS*HRA)/100);
                float TAofBS = ((BS*TA)/100);
                float PAofBS = ((BS*PA)/100);
                float MAofBS = ((BS*MA)/100);

                float RESULT = BS + HRAofBS + TAofBS + PAofBS + MAofBS;

                rname.setText("Employee Name : "+ String.valueOf(NAME));
                  rbs.setText("Basic Salary : "+ String.valueOf(BS));
                 rhra.setText("HRA Amount : "+ String.valueOf(HRAofBS));
                  rta.setText("TA Amount : "+ String.valueOf(TAofBS));
                  rpa.setText("PA Amount : "+ String.valueOf(PAofBS));
                  rma.setText("MA Amount : "+ String.valueOf(MAofBS));
                  res.setText("Net Gross Salary : "+ String.valueOf(RESULT));
            }
        });

    }
}