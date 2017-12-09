package activity.designpattern;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import tools.UmengDialog;

public class builderPattern extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder_pattern);

        AlertDialog dialog1 = new AlertDialog.Builder(builderPattern.this).setTitle("提示").setMessage("确定退出?").create();
        dialog1.show();

        UmengDialog dialog2 = new UmengDialog.Builder().setTitle("提示").setMessage("确定退出?").create();
        dialog2.show();

    }
}
