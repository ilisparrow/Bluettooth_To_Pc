package com.example.ilias.bluettoothtopc;

        import android.app.Activity;
        import android.bluetooth.BluetoothAdapter;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.support.v7.widget.Toolbar;
        import android.view.View.OnClickListener;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.bluetooth.*;
        import android.widget.Toast;
        import android.widget.*;
        import android.view.*;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;

        import java.util.Set;


public class MainActivity extends Activity implements OnClickListener {
    private Set<BluetoothDevice> devices;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button)findViewById(R.id.button);


        BluetoothAdapter btAdapter = BluetoothAdapter.getDefaultAdapter();

        if(btAdapter==null){//Verifie si existe
            Toast.makeText(MainActivity.this,"Pas de bluetooth", Toast.LENGTH_LONG);
        }
        else{
            Toast.makeText(MainActivity.this,"Bluetooth",Toast.LENGTH_LONG);
        }
        if(!btAdapter.isEnabled()){//Activation du Bt
            btAdapter.enable();
        }
        //Clic Boutton connecte
        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });




    }



    @Override
    public void onClick(View v) {

    }
}
