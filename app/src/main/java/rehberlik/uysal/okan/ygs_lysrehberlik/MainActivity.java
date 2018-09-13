package rehberlik.uysal.okan.ygs_lysrehberlik;

import android.app.Activity;
import android.graphics.Point;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Display;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    public static EditText editText;
    public static EditText editText2;
    public static EditText editText3;
    public static EditText editText4;
    public static EditText editText5;
    public static EditText editText6;
    public static EditText editText7;
    public static EditText editText8;
    public static EditText editText9;
    public static EditText editText10;
    public static EditText editText11;
    public static EditText editText12;
    public static TextView textView0;
    public static TextView textView;
    public static TextView textView2;
    public static TextView textView3;
    public static TextView textView4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        int height = size.y;
        float metrics = getResources().getDisplayMetrics().density;

        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);
        editText4 = (EditText) findViewById(R.id.editText4);
        editText5 = (EditText) findViewById(R.id.editText5);
        editText6 = (EditText) findViewById(R.id.editText6);
        editText7 = (EditText) findViewById(R.id.editText7);
        editText8 = (EditText) findViewById(R.id.editText8);
        editText9 = (EditText) findViewById(R.id.editText9);
        editText10 = (EditText) findViewById(R.id.editText10);
        editText11 = (EditText) findViewById(R.id.editText11);
        editText12 = (EditText) findViewById(R.id.editText12);
        textView0 = (TextView) findViewById(R.id.textView);
        textView = (TextView) findViewById(R.id.textView2);
        textView2 = (TextView) findViewById(R.id.textView3);
        textView3 = (TextView) findViewById(R.id.textView4);
        textView4 = (TextView) findViewById(R.id.textView5);




        textView.setWidth(width / 5);
        textView2.setWidth(width / 5);
        textView3.setWidth(width / 5);
        textView4.setWidth(width / 5);

        //textView.setText(width + "-" + height);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                int a = 0;
                int b = 0;
                if(!editText.getText().toString().equals(""))
                    a = Integer.valueOf(editText.getText().toString());
                if(!editText5.getText().toString().equals(""))
                    b = Integer.valueOf(editText5.getText().toString());
                if(a + b > 40){
                    editText.setText(String.valueOf(40 - b));
                    a = 40 -b;
                }
                editText9.setText(String.valueOf(a - (b / 4.0)));
            }
        });

        editText2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                int a = 0;
                int b = 0;
                if(!editText2.getText().toString().equals(""))
                    a = Integer.valueOf(editText2.getText().toString());
                if(!editText6.getText().toString().equals(""))
                    b = Integer.valueOf(editText6.getText().toString());
                if(a + b > 40){
                    editText2.setText(String.valueOf(40 - b));
                    a = 40 -b;
                }
                editText10.setText(String.valueOf(a - (b / 4.0)));
                }
        });

        editText3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                int a = 0;
                int b = 0;
                if(!editText3.getText().toString().equals(""))
                    a = Integer.valueOf(editText3.getText().toString());
                if(!editText7.getText().toString().equals(""))
                    b = Integer.valueOf(editText7.getText().toString());
                if(a + b > 40){
                    editText3.setText(String.valueOf(40 - b));
                    a = 40 -b;
                }
                editText11.setText(String.valueOf(a - (b / 4.0)));

                }
        });

        editText4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                int a = 0;
                int b = 0;
                if(!editText4.getText().toString().equals(""))
                    a = Integer.valueOf(editText4.getText().toString());
                if(!editText8.getText().toString().equals(""))
                    b = Integer.valueOf(editText8.getText().toString());
                if(a + b > 40){
                    editText4.setText(String.valueOf(40 - b));
                    a = 40 -b;
                }
                editText12.setText(String.valueOf(a - (b / 4.0)));
            }
        });

        editText5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                int a = 0;
                int b = 0;
                if(!editText5.getText().toString().equals(""))
                    a = Integer.valueOf(editText5.getText().toString());
                if(!editText.getText().toString().equals(""))
                    b = Integer.valueOf(editText.getText().toString());
                if(a + b > 40){
                    editText5.setText(String.valueOf(40 - b));
                    a = 40 -b;
                }
                editText9.setText(String.valueOf(b - (a / 4.0)));

            }
        });

        editText6.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                int a = 0;
                int b = 0;
                if(!editText6.getText().toString().equals(""))
                    a = Integer.valueOf(editText6.getText().toString());
                if(!editText2.getText().toString().equals(""))
                    b = Integer.valueOf(editText2.getText().toString());
                if(a + b > 40){
                    editText6.setText(String.valueOf(40 - b));
                    a = 40 -b;
                }
                editText10.setText(String.valueOf(b - (a / 4.0)));
            }
        });

        editText7.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                int a = 0;
                int b = 0;
                if(!editText7.getText().toString().equals(""))
                    a = Integer.valueOf(editText7.getText().toString());
                if(!editText3.getText().toString().equals(""))
                    b = Integer.valueOf(editText3.getText().toString());
                if(a + b > 40){
                    editText7.setText(String.valueOf(40 - b));
                    a = 40 -b;
                }
                editText11.setText(String.valueOf(b - (a / 4.0)));
            }
        });

        editText8.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                int a = 0;
                int b = 0;
                if(!editText8.getText().toString().equals(""))
                    a = Integer.valueOf(editText8.getText().toString());
                if(!editText4.getText().toString().equals(""))
                    b = Integer.valueOf(editText4.getText().toString());
                if(a + b > 40){
                    editText8.setText(String.valueOf(40 - b));
                    a = 40 -b;
                }
                editText12.setText(String.valueOf(b - (a / 4.0)));
            }
        });


        //scrollView.scrollTo(textView0.getLeft(),textView0.getTop());
        //editText.requestFocus();
    }


}
