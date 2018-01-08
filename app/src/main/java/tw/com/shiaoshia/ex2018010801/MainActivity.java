package tw.com.shiaoshia.ex2018010801;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView act;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String str[] = {"aaa","aab","bbc","bac","ccc"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                MainActivity.this,android.R.layout.simple_list_item_1,str);
        act = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        act.setThreshold(1);    //判斷幾個字
        act.setAdapter(adapter);




    }
}
