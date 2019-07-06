package com.phakamanipega.creatingatable;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    public EditText editprice;
    public TextView counter, price, date, total;

    public int Mcounter=0;

    public Button save, view;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );


        final String date_n = new SimpleDateFormat( "MM, dd", Locale.getDefault()).format(new Date());
        date.setText( date_n );

        editprice = (EditText) findViewById( R.id.counter );

        counter = (TextView) findViewById( R.id.counter );
        price = (TextView)findViewById( R.id.price );
        date = (TextView) findViewById( R.id.counter );
        total = (TextView) findViewById( R.id.counter );

        save = (Button) findViewById( R.id.Save );
        view = (Button) findViewById( R.id.View );


        save.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            price.setText(editprice.getText() );


            Mcounter ++;
            //counter.setText( Integer.toString( Mcounter ) );




            }
        } );

        view.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter.setText( Integer.toString( Mcounter ) );

                price.getText();

                date.setText( date_n );


            }



        } );



    }




}
