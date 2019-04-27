package com.mg.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
    Button btnc, btnadd, btnsub, btnmul, btndiv, btneqn;
    Button btnpoint, btnperc, btndel;
    TextView txtIslem;
    String output="", output2, numbers="0123456789", midNumber="";
    LinkedList<Double> listNumber = new LinkedList<Double>();
    LinkedList<Integer> listOperation = new LinkedList<Integer>();
    Boolean firstEntrance=true, lastIsNumber=false;
    Double result=0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtIslem = (TextView) findViewById(R.id.txtIslem);
        txtIslem.setEnabled(false);

        btn0 = (Button) findViewById(R.id.btnzero);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                output = output+"0";
                midNumber = midNumber+"0";
                txtIslem.setText(output);
                lastIsNumber = true;
            }
        });

        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                output = output+"1";
                midNumber = midNumber+"1";
                txtIslem.setText(output);
                lastIsNumber = true;
                firstEntrance = false;
            }
        });

        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                output = output+"2";
                midNumber = midNumber+"2";
                txtIslem.setText(output);
                lastIsNumber = true;
                firstEntrance = false;
            }
        });

        btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                output = output+"3";
                midNumber = midNumber+"3";
                txtIslem.setText(output);
                lastIsNumber = true;
                firstEntrance = false;
            }
        });

        btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                output = output+"4";
                midNumber = midNumber+"4";
                txtIslem.setText(output);
                lastIsNumber = true;
                firstEntrance = false;
            }
        });

        btn5 = (Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                output = output+"5";
                midNumber = midNumber+"5";
                txtIslem.setText(output);
                lastIsNumber = true;
                firstEntrance = false;
            }
        });

        btn6 = (Button) findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                output = output+"6";
                midNumber = midNumber+"6";
                txtIslem.setText(output);
                lastIsNumber = true;
                firstEntrance = false;
            }
        });

        btn7 = (Button) findViewById(R.id.btn7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                output = output+"7";
                midNumber = midNumber+"7";
                txtIslem.setText(output);
                lastIsNumber = true;
                firstEntrance = false;
            }
        });

        btn8 = (Button) findViewById(R.id.btn8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                output = output+"8";
                midNumber = midNumber+"8";
                txtIslem.setText(output);
                lastIsNumber = true;
                firstEntrance = false;
            }
        });

        btn9 = (Button) findViewById(R.id.btn9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                output = output+"9";
                midNumber = midNumber+"9";
                txtIslem.setText(output);
                lastIsNumber = true;
                firstEntrance = false;
            }
        });

        btnc = (Button) findViewById(R.id.btnc);
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                output = "";
                midNumber = "";
                txtIslem.setText(output);
                listNumber.clear();
                listOperation.clear();
                lastIsNumber = false;
                firstEntrance = true;
            }
        });

        btnadd = (Button) findViewById(R.id.btnadd);
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if(firstEntrance)
                {
                    midNumber = "0";
                }
                if(midNumber.length()>0) {
                    listNumber.add(Double.parseDouble(midNumber));
                }
                if(!lastIsNumber)
                {
                    listOperation.remove(listOperation.size()-1);
                }
                listOperation.add(1);
                midNumber = "";
                if(!lastIsNumber && !firstEntrance)
                {
                    output2 = output.substring(0,output.length()-1);
                    output2 += "+";
                    output = output2;
                }
                else
                {
                    output = output + "+";
                }
                txtIslem.setText(output);
                lastIsNumber = false;
             }
        });

        btnsub = (Button) findViewById(R.id.btnsub);
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if(firstEntrance)
                {
                    midNumber = "0";
                }
                if(midNumber.length()>0) {
                    listNumber.add(Double.parseDouble(midNumber));
                }
                if(!lastIsNumber)
                {
                    listOperation.remove(listOperation.size()-1);
                }
                listOperation.add(2);
                midNumber = "";
                if(!lastIsNumber && !firstEntrance)
                {
                    output2 = output.substring(0,output.length()-1);
                    output2 += "-";
                    output = output2;
                }
                else
                {
                    output = output + "-";
                }
                txtIslem.setText(output);
                lastIsNumber = false;            }
        });

        btnmul = (Button) findViewById(R.id.btnmul);
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if(firstEntrance)
                {
                    midNumber = "0";
                }
                if(midNumber.length()>0) {
                    listNumber.add(Double.parseDouble(midNumber));
                }
                if(!lastIsNumber)
                {
                    listOperation.remove(listOperation.size()-1);
                }
                listOperation.add(3);
                midNumber = "";
                if(!lastIsNumber && !firstEntrance)
                {
                    output2 = output.substring(0,output.length()-1);
                    output2 += "x";
                    output = output2;
                }
                else
                {
                    output = output + "x";
                }
                txtIslem.setText(output);
                lastIsNumber = false;            }
        });

        btndiv = (Button) findViewById(R.id.btndiv);
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if(firstEntrance)
                {
                    midNumber = "0";
                }
                if(midNumber.length()>0) {
                    listNumber.add(Double.parseDouble(midNumber));
                }
                if(!lastIsNumber)
                {
                    listOperation.remove(listOperation.size()-1);
                }
                listOperation.add(4);
                midNumber = "";
                if(!lastIsNumber && !firstEntrance)
                {
                    output2 = output.substring(0,output.length()-1);
                    output2 += "/";
                    output = output2;
                }
                else
                {
                    output = output + "/";
                }
                txtIslem.setText(output);
                lastIsNumber = false;            }
        });

        btneqn = (Button) findViewById(R.id.btneqn);
        btneqn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if(midNumber.length()>0) {
                    listNumber.add(Double.parseDouble(midNumber));
                }

                if((listNumber.size()>0) && (listOperation.size()>0)) {
                    calculation();
                    txtIslem.setText(Double.toString(result));
                    listNumber.clear();
                    listOperation.clear();
                    midNumber = Double.toString(result);
                    output = midNumber;
                    firstEntrance = false;
                    lastIsNumber = true;
                }
            }
        });

        btndel = (Button) findViewById(R.id.btndel);
        btndel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

            }
        });

        btnperc = (Button) findViewById(R.id.btnperc);
        btnperc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

            }
        });

        btnpoint = (Button) findViewById(R.id.btnpoint);
        btnpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if(firstEntrance)
                {
                    midNumber = "0.";
                }
                else
                {
                    midNumber = midNumber+".";
                }

                output = output+".";
                txtIslem.setText(output);
                firstEntrance = false;
                lastIsNumber = true;
            }
        });
    }

    void calculation()
    {
        int index=0, operation;
        double out=0.0, number1=0.0, number2=0.0;
        boolean contCalculate=true;

        if(listNumber.size()==1)
        {
            result = listNumber.get(0);
            contCalculate = false;
            return;
        }

        System.out.println("numbers1 : "+listNumber);
        System.out.println("ops1 : "+listOperation);

        //first multiply and division operations
        while(contCalculate)
        {
            System.out.println("index : "+index+", numbersize : "+listNumber.size()+
                    ", opsize : "+listOperation.size());
            number1 = listNumber.get(index);
            operation = listOperation.get(index);
            if((operation==3 || operation==4) && (index!=listNumber.size()-1))
            {
                if(operation==3)
                {
                    number2 = number1*listNumber.get(index+1);
                }
                else
                {
                    number2 = number1/listNumber.get(index+1);
                }
                listNumber.set(index,number2);
                listNumber.remove((index+1));
                listOperation.remove(index);
            }
            else {
                index++;
            }
            if(index==(listNumber.size()-1))
            {
                contCalculate = false;
            }
        }

        System.out.println("numbers : "+listNumber);
        System.out.println("ops : "+listOperation);

        contCalculate = true;
        if(listNumber.size()==1)
        {
            result = number2;
            contCalculate = false;
            return;
        }

        //add and substract operations
        number1 = 0;
        while (contCalculate)
        {
            if(listNumber.size()>1)
            {
                operation = listOperation.get(0);
                if(operation==1)
                {
                    number1 = listNumber.get(0) + listNumber.get(1);
                }
                else
                {
                    number1 = listNumber.get(0) - listNumber.get(1);
                }
                System.out.println("num1 : "+listNumber.get(0)+
                        " num2 : "+listNumber.get(1)+" islem : "+
                        listOperation.get(0));
                listNumber.set(0, number1);
                listNumber.remove(1);
                listOperation.remove(0);
            }
            else {
                result = number1;
                contCalculate = false;
            }
        }

    }
}
