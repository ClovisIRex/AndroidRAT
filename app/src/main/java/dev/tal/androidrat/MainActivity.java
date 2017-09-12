package dev.tal.androidrat;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import dev.tal.androidrat.utils.NetworkUtils;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.buttonSend) Button mButtonSend;

    @OnClick(R.id.buttonSend)
    public void sendRequest(View view) {
        String msg = "Not connected!";

        if(NetworkUtils.checkNetworkConnection(this)) {
            msg = "Connected!";
        }

        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
