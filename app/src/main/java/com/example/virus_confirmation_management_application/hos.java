package com.example.virus_confirmation_management_application;

import static com.example.virus_confirmation_management_application.user_Frag2.a;
import static com.example.virus_confirmation_management_application.user_bottomnavi.pagedata;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;


public class hos extends AppCompatActivity {

    private View view;
    static ArrayList<String> array = new ArrayList<String>();
    String data;

    String b = "check";
    EditText editText;
    TextView textView;

    private ImageView LoadGif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_hos);


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.action_map:
                        pagedata=0;
                        Intent intent = new Intent(getApplicationContext(), user_bottomnavi.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent); // 액티비티 이동 구문
                        break;
                    case R.id.action_main:
                        pagedata=1;
                        a=0;
                        intent = new Intent(getApplicationContext(), user_bottomnavi.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent); // 액티비티 이동 구문
                        break;
                    case R.id.action_person:
                        pagedata=2;
                        intent = new Intent(getApplicationContext(), user_bottomnavi.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent); // 액티비티 이동 구문
                        break;
                }
                return true;
            }
        });



        textView = (TextView) findViewById(R.id.editText);
        textView = (TextView) findViewById(R.id.textView);

        }


            public void buttonClicked(View view){
                switch (view.getId()) {
                    case R.id.button:
                        new Thread(new Runnable() {
                            @Override
                            public void run() {
                                // TODO Auto-generated method stub
                                data = getData();//아래 메소드를 호출하여 XML data를 파싱해서 String 객체로 얻어오기

                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        // TODO Auto-generated method stub

                                    }
                                });
                            }
                        }).start();
                        break;

                }

                LoadGif = (ImageView)findViewById(R.id.load);
                Glide.with(this).load(R.raw.load).into(LoadGif);

                TextView text = findViewById(R.id.textView5);
                text.setText("지도를 불러오고 있습니다.\n 잠시만 기다려 주세요.");

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        LoadGif.setImageResource(0);
                        text.setText("");
                        Button mapClicked = (Button) findViewById(R.id.mapbutton);
                        mapClicked.setEnabled(true);
                        mapClicked.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Log.d("test1", String.valueOf(array.size()));

                                Intent intent = new Intent(getApplicationContext(), user_nearhosfind.class);
                                startActivity(intent);
                            }
                        });

                    }
                },10000);	//700밀리 초 동안 딜레이




    }//mOnClick method..



    String getData() {

        StringBuffer buffer = new StringBuffer();


         String queryUrl = "http://apis.data.go.kr/B552657/HsptlAsembySearchService/getHsptlMdcncLcinfoInqire?WGS84_LON=" + "127.07584097261743"+"&WGS84_LAT="+"36.798547089307185"+"&pageNo=1&numOfRows=200&ServiceKey=1YlW0QVRfpVBzSDpza%2FFoWL0WpN817YpMoPtXuT3dYmQSpBVUT6X974ETi2OVyxWp3nDg4R8GB0CttiGBl7n%2Fw%3D%3D";
        try {

            URL url = new URL(queryUrl); // 문자열로 된 요청 url을 URL 객체로 생성.
            InputStream is = url.openStream(); // url 위치로 인풋스트림 연결

            XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
            XmlPullParser xpp = factory.newPullParser();
            xpp.setInput(new InputStreamReader(is, "UTF-8"));
            String tag;
            xpp.next();
            int eventType = xpp.getEventType();

         while (eventType != XmlPullParser.END_DOCUMENT) {
          switch (eventType) {
           case XmlPullParser.START_DOCUMENT:
            buffer.append("파싱 시작 단계 \n\n");
            break;

           case XmlPullParser.START_TAG:
            tag=xpp.getName();

            if(tag.equals("item"));
            else if(tag.equals("dutyAddr")){
                xpp.next();
                array.add(xpp.getText());
            }
            else if(tag.equals("dutyDivName")){

             xpp.next();
             array.add(xpp.getText());
            }
            else if(tag.equals("dutyName")){
                xpp.next();
                array.add(xpp.getText());
            }
            else if(tag.equals("dutyTel1")){
                xpp.next();
                array.add(xpp.getText());
            }
            else if(tag.equals("latitude")){
             xpp.next();
             array.add(xpp.getText());
            }
            else if(tag.equals("longitude")){
             xpp.next();
             array.add(xpp.getText());
            }
            break;

           case XmlPullParser.TEXT:
            break;

           case XmlPullParser.END_TAG:
            tag= xpp.getName(); // 태그 이름 얻어오기
            if(tag.equals("item")){
            }; // 첫번째 검색결과종료 후 줄바꿈
            break;
          }
          eventType= xpp.next();
         }
        } catch (Exception e) {
         e.printStackTrace();
        }

            buffer.append(array);

        return buffer.toString(); // 파싱 다 종료 후 StringBuffer 문자열 객체 반환
    }
}
