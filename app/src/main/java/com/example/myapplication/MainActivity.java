package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private final static String tag="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag,"onCreate");
    }
    protected void onStart(){
        super.onStart();
        Log.d(tag,"onStart");
    }
    protected void onResume(){
        super.onResume();
        Log.d(tag,"onResume");
    }
    protected void onRestart(){
        super.onRestart();
        Log.d(tag,"onRestart");
    }
    protected void onDestroy(){
        super.onDestroy();
        Log.d(tag,"onDestroy");
    }
    public void onFinishClick(View view){
        finish();
    }
    public void scroll(View view){
        Intent intent=new Intent(this,scroll.class);
        startActivity(intent);
    }
    public void web(View view){
        Intent intent=new Intent(this,web.class);
        startActivity(intent);
    }
    public void rating(View view){
        Intent intent=new Intent(this,rating.class);
        startActivity(intent);
    }
    public void seek(View view){
        Intent intent=new Intent(this,seek.class);
        startActivity(intent);
    }
    public void compound(View view){
        Intent intent=new Intent(this,compound.class);
        startActivity(intent);
    }
    public void menus(View view){
        Intent intent=new Intent(this,menus.class);
        startActivity(intent);
    }
    public void spinner(View view){
        Intent intent=new Intent(this,spinner.class);
        startActivity(intent);
    }
}
