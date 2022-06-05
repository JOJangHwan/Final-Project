package com.example.virus_confirmation_management_application;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import static com.example.virus_confirmation_management_application.user_Frag2.a;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class joint_fragment_login_user extends Fragment {

    private View view;
    private Button button_move;

    static ArrayList<String> array = new ArrayList<String>();
    String data;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.joint_fragment_login_user,container, false);

        button_move = view.findViewById(R.id.btn_login_user); // 메인으로 이동
        button_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),user_bottomnavi.class);
                a=0; //슬라이드 오류 해결 코드
                startActivity(intent); // 액티비티 이동 구문

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

                    private void runOnUiThread(Runnable runnable) {
                    }
                }).start();

            }
        });

        button_move = view.findViewById(R.id.btn_signup_user); // 회원가입
        button_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),joint_activity_register_user.class);
                startActivity(intent); // 액티비티 이동 구문
            }
        });

        return view;
    }


    String getData() {

        StringBuffer buffer = new StringBuffer();

        String queryUrl = "http://apis.data.go.kr/B552657/HsptlAsembySearchService/getHsptlMdcncLcinfoInqire?WGS84_LON=" + "126.826968"+"&WGS84_LAT="+"37.5410613"+"&pageNo=1&numOfRows=200&ServiceKey=1YlW0QVRfpVBzSDpza%2FFoWL0WpN817YpMoPtXuT3dYmQSpBVUT6X974ETi2OVyxWp3nDg4R8GB0CttiGBl7n%2Fw%3D%3D";

        //String queryUrl = "http://apis.data.go.kr/B552657/HsptlAsembySearchService/getHsptlMdcncLcinfoInqire?WGS84_LON=" + "127.07584097261743"+"&WGS84_LAT="+"36.798547089307185"+"&pageNo=1&numOfRows=200&ServiceKey=1YlW0QVRfpVBzSDpza%2FFoWL0WpN817YpMoPtXuT3dYmQSpBVUT6X974ETi2OVyxWp3nDg4R8GB0CttiGBl7n%2Fw%3D%3D";
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
