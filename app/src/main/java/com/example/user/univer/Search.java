package com.example.user.univer;


import android.app.Activity;
import android.app.DialogFragment;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;


/**
 * Created by HYHY on 11.10.2015.
 */
public class Search extends Activity implements View.OnClickListener  {

    private ImageButton  btnBack, btnSort;
    private TextView txtTitle;
    private EditText etName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);


        txtTitle = (TextView) findViewById(R.id.txtTitle);
        txtTitle.setText(getString(R.string.search));

        btnBack = (ImageButton) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(this);

        btnSort = (ImageButton) findViewById(R.id.btnSort);
        btnSort.setOnClickListener(this);



    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnBack:
                NavUtils.navigateUpFromSameTask(this);
                break;
            case R.id.btnSort:
                DialogFragment dialogFragment = new Sort();
                dialogFragment.show(getFragmentManager(), "languagesDialog");
                break;
        }
    }
}