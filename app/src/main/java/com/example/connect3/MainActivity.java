package com.example.connect3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintSet;

import java.text.*;

import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import androidx.gridlayout.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    boolean s=true,ge =false;
    int c=0;
    int[] a={0,0,0,0,0,0,0,0,0};
    public void cf(View v) {
        c++;
        ImageView it = (ImageView) v;
        int j=Integer.parseInt(v.getTag().toString())-1;
        if(a[j]==0 && !ge)
        { if (s ) {
            s = false;
            it.setTranslationY(-2000);
            it.setImageResource(R.drawable.si);
            it.animate().translationYBy(2000).setDuration(400);
            a[j]=1;
        }
        else {
            s = true;
            it.setTranslationY(-2000);
            it.setImageResource(R.drawable.aa);
            it.animate().translationYBy(2000).setDuration(400);
            a[j]=2;
        }}
        String st="";
        if((a[0]==a[1]&&a[1]==a[2]&&a[0]==1)  || (a[3]==a[4]&&a[4]==a[5]&&a[3]==1) || (a[6]==a[7]&&a[8]==a[7]&&a[6]==1) || (a[0]==a[3]&&a[3]==a[6]&&a[0]==1) || (a[4]==a[1]&&a[4]==a[7]&&a[4]==1) ||(a[2]==a[5]&&a[5]==a[8]&&a[2]==1)||(a[0]==a[4]&&a[4]==a[8]&&a[0]==1) || (a[2]==a[4]&&a[4]==a[6]&&a[2]==1)){
            st="Smiley has won";
            ge=true;
        }
        if((a[0]==a[1]&&a[1]==a[2]&&a[0]==2)  || (a[3]==a[4]&&a[4]==a[5]&&a[3]==2) || (a[6]==a[7]&&a[8]==a[7]&&a[6]==2) || (a[0]==a[3]&&a[3]==a[6]&&a[0]==2) || (a[4]==a[1]&&a[4]==a[7]&&a[4]==2) ||(a[2]==a[5]&&a[5]==a[8]&&a[2]==2)||(a[0]==a[4]&&a[4]==a[8]&&a[0]==2) || (a[2]==a[4]&&a[4]==a[6]&&a[2]==2)){
           st="Angry has won";
           ge=true;
        }
        if(ge){
            Button bt=(Button)findViewById(R.id.bView);
            TextView t=(TextView)findViewById(R.id.tView);
            t.setText(st);
            bt.setVisibility(View.VISIBLE);
            t.setVisibility(View.VISIBLE);
           }
        else{if(c==9){st="Its a draw";
            Button bt=(Button)findViewById(R.id.bView);
            TextView t=(TextView)findViewById(R.id.tView);
            t.setText(st);
            bt.setVisibility(View.VISIBLE);
            t.setVisibility(View.VISIBLE);
        }}

    }

    public void b(View v){
        Button bt=(Button)findViewById(R.id.bView);
        TextView t=(TextView)findViewById(R.id.tView);
        bt.setVisibility(View.INVISIBLE);
        t.setVisibility(View.INVISIBLE);
        GridLayout g=(GridLayout)findViewById(R.id.gView);
        for(int i=0;i<g.getChildCount();i++){
          ImageView it=(ImageView)g.getChildAt(i);
          it.setImageDrawable(null);
        }
        s=true;
        ge =false;
        c=0;
        for(int i=0;i<9;i++){
            a[i]=0;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}