package com.example.virus_confirmation_management_application;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;


public class hos extends AppCompatActivity {

    ArrayList<String> array = new ArrayList<String>();

    String a = "check";
    EditText editText;
    TextView textView;
    String data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_hos);

        editText = (EditText) findViewById(R.id.editText);
        textView = (TextView) findViewById(R.id.textView);

        new Thread(new Runnable() {
            @Override
            public void run() {
                data = getData(); // 하단의 getData 메소드를 통해 데이터를 파싱
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        textView.setText(data);
                    }
                });
            }
        }).start();

    }



    String getData() {

        StringBuffer buffer = new StringBuffer();


         String queryUrl = "http://apis.data.go.kr/B552657/HsptlAsembySearchService/getHsptlMdcncLcinfoInqire?WGS84_LON=127.0851&WGS84_LAT=37.4881&pageNo=1&numOfRows=500&ServiceKey=1YlW0QVRfpVBzSDpza%2FFoWL0WpN817YpMoPtXuT3dYmQSpBVUT6X974ETi2OVyxWp3nDg4R8GB0CttiGBl7n%2Fw%3D%3D";
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
                buffer.append("이름 : ");
                xpp.next();
                array.add(xpp.getText());
                // addr 요소의 TEXT 읽어와서 문자열버퍼에 추가
                buffer.append(xpp.getText());
                buffer.append("\n"); // 줄바꿈 문자 추가
            }
            else if(tag.equals("dutyDivName")){
            buffer.append("종류 : ");
             xpp.next();
             array.add(xpp.getText());
             // addr 요소의 TEXT 읽어와서 문자열버퍼에 추가
              buffer.append(xpp.getText());
              buffer.append("\n"); // 줄바꿈 문자 추가
            }
            else if(tag.equals("dutyName")){
                buffer.append("이름 : ");
                xpp.next();
                array.add(xpp.getText());
                // addr 요소의 TEXT 읽어와서 문자열버퍼에 추가
                buffer.append(xpp.getText());
                buffer.append("\n"); // 줄바꿈 문자 추가
            }
            else if(tag.equals("dutyTel1")){
                buffer.append("번호 : ");
                xpp.next();
                array.add(xpp.getText());
                // addr 요소의 TEXT 읽어와서 문자열버퍼에 추가
                buffer.append(xpp.getText());
                buffer.append("\n"); // 줄바꿈 문자 추가
            }
            else if(tag.equals("latitude")){
             buffer.append("위도 : ");
             xpp.next();
             array.add(xpp.getText());
             // addr 요소의 TEXT 읽어와서 문자열버퍼에 추가
             buffer.append(xpp.getText());
             buffer.append("\n"); // 줄바꿈 문자 추가
            }
            else if(tag.equals("longitude")){
             buffer.append("경도 : ");
             xpp.next();
             array.add(xpp.getText());
             // addr 요소의 TEXT 읽어와서 문자열버퍼에 추가
             buffer.append(xpp.getText());
             buffer.append("\n"); // 줄바꿈 문자 추가
            }
            break;


           case XmlPullParser.TEXT:
            break;

           case XmlPullParser.END_TAG:
            tag= xpp.getName(); // 태그 이름 얻어오기
            if(tag.equals("item")) buffer.append("\n"); // 첫번째 검색결과종료 후 줄바꿈
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
