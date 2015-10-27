package com.example.nicol.calc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivityCalc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_calc);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    ArrayList<String> tableauEquation = new ArrayList<String>();
    String string = "";
    String string1 = "";
    Double calc = 0.0;
    Double pi =Math.PI;


    public void onClick1(View v) {
        TextView textview2 = (TextView) findViewById(R.id.tvAffichage);

        Button bouton = (Button) v;

        string = (String) bouton.getText().toString();

        if(!string.contains("+") && !string.contains("-") && !string.contains("×")
                && !string.contains("÷")&& !string.contains("√")&& !string.contains("×²")
                && !string.contains("×³")&& !string.contains("^") && !string.contains("∏")
                && !string.contains("±")&& !string.contains("(") && !string.contains(")")/*&& !string.contains(".")*/
                && !string.contains("Sin") && !string.contains("Cos")&& !string.contains("Tan")
                && !string.contains("Log"))
        {

            string1 = string1+string;

            if(tableauEquation.size()>0){
                tableauEquation.remove((tableauEquation.size() - 1));
            }
            tableauEquation.add(string1);
        }
        else {


            if(string.contains("∏")){
                string = pi.toString();
            }
            if(string.contains("×²")){
                string = "²";
            }
            if(string.contains("×³")){
                string = "³";
            }

            if(!(string.contains("²") || string.contains(pi.toString()) || string.contains("³")))
            {
                tableauEquation.add(string);
            }
            tableauEquation.add(string);
//                }


            string1="";
        }

        textview2.setText(textview2.getText().toString()+string);
        // textview2.setText(tableauEquation.toString());
    }

    public void moinsDeTrois() {

        if(tableauEquation.get(1).contains("+"))
        {
            calc = Double.parseDouble(tableauEquation.get(0))+Double.parseDouble(tableauEquation.get(2));
        }
        else if(tableauEquation.get(1).contains("-"))
        {
            calc = Double.parseDouble(tableauEquation.get(0))-Double.parseDouble(tableauEquation.get(2));
        }
        else if(tableauEquation.get(1).contains("×"))
        {
            calc = Double.parseDouble(tableauEquation.get(0))*Double.parseDouble(tableauEquation.get(2));
        }
        else if(tableauEquation.get(1).contains("÷"))
        {
            if(!(tableauEquation.get(1).contentEquals("0")))
            {
                calc = Double.parseDouble(tableauEquation.get(0))/Double.parseDouble(tableauEquation.get(2));
            }
            else calc = 0.0;
        }
        else if(tableauEquation.get(0).contains("√"))
        {
            calc = Math.sqrt(Double.parseDouble(tableauEquation.get(1)));
        }
        else if(tableauEquation.get(1).contains("²"))
        {
            calc = Math.pow((Double.parseDouble(tableauEquation.get(0))),2);
        }
        else if(tableauEquation.get(1).contains("³"))
        {
            calc = Math.pow((Double.parseDouble(tableauEquation.get(0))),3);
        }
        else if(tableauEquation.get(1).contains("^"))
        {
            calc = Math.pow((Double.parseDouble(tableauEquation.get(0))),Double.parseDouble(tableauEquation.get(2)));
        }
        else if(tableauEquation.get(1).contains("±"))
        {
            calc = Double.parseDouble(tableauEquation.get(2))*Double.parseDouble(tableauEquation.get(2));
        }
        else if(tableauEquation.get(1).contains("("))
        {
            calc = Double.parseDouble(tableauEquation.get(2))*Double.parseDouble(tableauEquation.get(2));
        }
        else if(tableauEquation.get(1).contains(")"))
        {
            calc = Double.parseDouble(tableauEquation.get(2))*Double.parseDouble(tableauEquation.get(2));
        }
        else if(tableauEquation.get(1).contains("."))
        {
            calc = Double.parseDouble(tableauEquation.get(2))*Double.parseDouble(tableauEquation.get(2));
        }
        else if(tableauEquation.get(0).contains("Sin"))
        {
            calc = Math.sin(Double.parseDouble(tableauEquation.get(1)));
        }
        else if(tableauEquation.get(0).contains("Cos"))
        {
            calc = Math.cos(Double.parseDouble(tableauEquation.get(1)));
        }
        else if(tableauEquation.get(0).contains("Tan"))
        {
            calc = Math.tan(Double.parseDouble(tableauEquation.get(1)));
        }
        else if(tableauEquation.get(0).contains("Log"))
        {
            calc = Math.log10(Double.parseDouble(tableauEquation.get(1)));
        }
        else
        {
            calc = -1.0;
        }

    }

    public void plusDeTrois (){
        if(tableauEquation.get(3).contains("+"))
        {
            calc = Double.parseDouble(tableauEquation.get(0))+Double.parseDouble(tableauEquation.get(2));
        }
        else if(tableauEquation.get(3).contains("-"))
        {
            calc = Double.parseDouble(tableauEquation.get(0))-Double.parseDouble(tableauEquation.get(2));
        }
        else if(tableauEquation.get(3).contains("×"))
        {
            calc = Double.parseDouble(tableauEquation.get(0))*Double.parseDouble(tableauEquation.get(2));
        }
        else if(tableauEquation.get(3).contains("÷"))
        {
            if(!(tableauEquation.get(1).contentEquals("0")))
            {
                calc = Double.parseDouble(tableauEquation.get(0))/Double.parseDouble(tableauEquation.get(2));
            }
            else calc = 0.0;
        }
        else if(tableauEquation.get(3).contains("√"))
        {
            calc = Math.sqrt(Double.parseDouble(tableauEquation.get(1)));
        }
        else if(tableauEquation.get(3).contains("×²"))
        {
            calc = Math.pow((Double.parseDouble(tableauEquation.get(0))),2);
        }
        else if(tableauEquation.get(3).contains("×³"))
        {
            calc = Math.pow((Double.parseDouble(tableauEquation.get(0))),3);
        }
        else if(tableauEquation.get(3).contains("^"))
        {
            calc = Math.pow((Double.parseDouble(tableauEquation.get(0))),Double.parseDouble(tableauEquation.get(2)));
        }
        else if(tableauEquation.get(3).contains("±"))
        {
            calc = Double.parseDouble(tableauEquation.get(2))*Double.parseDouble(tableauEquation.get(2));
        }
        else if(tableauEquation.get(3).contains("("))
        {
            calc = Double.parseDouble(tableauEquation.get(2))*Double.parseDouble(tableauEquation.get(2));
        }
        else if(tableauEquation.get(3).contains(")"))
        {
            calc = Double.parseDouble(tableauEquation.get(2))*Double.parseDouble(tableauEquation.get(2));
        }
        else if(tableauEquation.get(3).contains("."))
        {
            calc = Double.parseDouble(tableauEquation.get(2))*Double.parseDouble(tableauEquation.get(2));
        }
        else if(tableauEquation.get(3).contains("Sin"))
        {
            calc = Math.sin(Double.parseDouble(tableauEquation.get(1)));
        }
        else if(tableauEquation.get(3).contains("Cos"))
        {
            calc = Math.cos(Double.parseDouble(tableauEquation.get(1)));
        }
        else if(tableauEquation.get(3).contains("Tan"))
        {
            calc = Math.tan(Double.parseDouble(tableauEquation.get(1)));
        }
        else if(tableauEquation.get(3).contains("Log"))
        {
            calc = Math.log(Double.parseDouble(tableauEquation.get(1)));
        }
    }

    public void onClick (View v){
        TextView textView1 = (TextView)findViewById(R.id.tvResultat);

        calc= 0.0;
        int c = tableauEquation.size();

        while (c!=1){
            if (c>3){
                if (tableauEquation.get(3).contains("×") || tableauEquation.get(3).contains("÷")
                        || tableauEquation.get(3).contains("√") || tableauEquation.get(3).contains("×²")
                        || tableauEquation.get(3).contains("×³") || tableauEquation.get(3).contains("^")
                        || tableauEquation.get(3).contains("Log") || tableauEquation.get(3).contains("∏")
                        || tableauEquation.get(3).contains("±") || tableauEquation.get(3).contains("(")
                        || tableauEquation.get(3).contains(")") || tableauEquation.get(3).contains(".")
                        || tableauEquation.get(3).contains("Sin") || tableauEquation.get(3).contains("Cos")
                        || tableauEquation.get(3).contains("Tan")){

                    plusDeTrois();
                    tableauEquation.remove(2);
                    tableauEquation.remove(2);
                    tableauEquation.remove(2);
                    tableauEquation.add(2,Double.toString(calc));
                    c = tableauEquation.size();
                }

                else{
                    moinsDeTrois();
                    tableauEquation.remove(0);
                    tableauEquation.remove(0);
                    tableauEquation.remove(0);
                    tableauEquation.add(0,Double.toString(calc));
                    c = tableauEquation.size();
                }

            }
            else {
                moinsDeTrois();
                if(!(tableauEquation.size()==2)){
                    tableauEquation.remove(0);
                }
                tableauEquation.remove(0);
                tableauEquation.remove(0);
                tableauEquation.add(0,Double.toString(calc));
                c = tableauEquation.size();

            }
            textView1.setText(Double.toString(calc));
        }
    }

    public void clear (View v){
        TextView textView1 = (TextView)findViewById(R.id.tvAffichage);
        TextView textView2 = (TextView)findViewById(R.id.tvResultat);

        string1="";
        string="";
        textView1.setText("");
        textView2.setText("0");
        tableauEquation.clear();

    }

    public void clearDernier (View v){
        TextView textView1 = (TextView)findViewById(R.id.tvAffichage);
        TextView textView2 = (TextView)findViewById(R.id.tvResultat);
        String textView1new = "";

        int c = tableauEquation.size();
        if(textView1.getText().toString().length() > 1){
            if (textView1.getText().toString().endsWith("Sin") || textView1.getText().toString().endsWith("Cos") ||
                textView1.getText().toString().endsWith("Tan") || textView1.getText().toString().endsWith("Log"))
                    textView1new = textView1.getText().toString().substring(0, textView1.getText().toString().length()-3);
            else if (textView1.getText().toString().endsWith(pi.toString()))
                textView1new = textView1.getText().toString().substring(0, textView1.getText().toString().length()-pi.toString().length());
            else{
                textView1new = textView1.getText().toString().substring(0, textView1.getText().toString().length()-1);
            }

            textView1.setText(textView1new);
            tableauEquation.set(c-1,textView1new);
        }else{
            clear(textView1);
        }

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity_calc, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
