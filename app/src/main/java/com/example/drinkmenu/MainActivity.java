package com.example.drinkmenu;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    int number_Americano = 0, number_CaffeMocha = 0, number_IcedTea = 0, number_CaffeLatte = 0, number_YujaTea = 0;
    TextView quantity_Americano, quantity_CaffeMocha, quantity_IcedTea, quantity_CaffeLatte, quantity_YujaTea, payment_TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // xml id와 생성한 변수 연결
        quantity_Americano = findViewById(R.id.quantity_Americano);
        quantity_CaffeMocha = findViewById(R.id.quantity_CaffeMocha);
        quantity_IcedTea = findViewById(R.id.quantity_IcedTea);
        quantity_CaffeLatte = findViewById(R.id.quantity_CaffeLatte);
        quantity_YujaTea = findViewById(R.id.quantity_YujaTea);
        payment_TextView = findViewById(R.id.payment_TextView);
    }
    // 아메리카노 값 증가 --------------------------------------------------------
    public void increment_Americano(View view)
    {
        number_Americano++;
        quantity_Americano.setText(String.valueOf(number_Americano));
    }
    // 아메리카노 값 감소
    public void decrement_Americano(View view)
    {   // 값이 0 초과일때만 감소시킴
        if (number_Americano > 0)
        {
            number_Americano--;
            quantity_Americano.setText(String.valueOf(number_Americano));
        }
    }
    // 카페모카 값 증가 --------------------------------------------------------
    public void increment_CaffeMocha(View view)
    {
        number_CaffeMocha++;
        quantity_CaffeMocha.setText(String.valueOf(number_CaffeMocha));
    }
    // 카페모카 값 감소
    public void decrement_CaffeMocha(View view)
    {   // 값이 0 초과일때만 감소시킴
        if (number_CaffeMocha > 0)
        {
            number_CaffeMocha--;
            quantity_CaffeMocha.setText(String.valueOf(number_CaffeMocha));
        }
    }
    // 아이스티 값 증가 --------------------------------------------------------
    public void increment_IcedTea(View view)
    {
        number_IcedTea++;
        quantity_IcedTea.setText(String.valueOf(number_IcedTea));
    }
    // 아이스티 값 감소
    public void decrement_IcedTea(View view)
    {   // 값이 0 초과일때만 감소시킴
        if (number_IcedTea > 0)
        {
            number_IcedTea--;
            quantity_IcedTea.setText(String.valueOf(number_IcedTea));
        }
    }
    // 카페라떼 값 증가 --------------------------------------------------------
    public void increment_CaffeLatte(View view)
    {
        number_CaffeLatte++;
        quantity_CaffeLatte.setText(String.valueOf(number_CaffeLatte));
    }
    // 카페라떼 값 감소
    public void decrement_CaffeLatte(View view)
    {   // 값이 0 초과일때만 감소시킴
        if (number_CaffeLatte > 0)
        {
            number_CaffeLatte--;
            quantity_CaffeLatte.setText(String.valueOf(number_CaffeLatte));
        }
    }
    // 유자차 값 증가 --------------------------------------------------------
    public void increment_YujaTea(View view)
    {
        number_YujaTea++;
        quantity_YujaTea.setText(String.valueOf(number_YujaTea));
    }
    // 카페라떼 값 감소
    public void decrement_YujaTea(View view)
    {   // 값이 0 초과일때만 감소시킴
        if (number_YujaTea > 0)
        {
            number_YujaTea--;
            quantity_YujaTea.setText(String.valueOf(number_YujaTea));
        }
    }
    // 계산하기 버튼 --------------------------------------------------------
    public void calculate_Results(View view)
    {
        // TextView 초기화
        payment_TextView.setText("");
        // 아무 음료도 선택하지 않았을 경우
        if(number_Americano==0 && number_CaffeMocha==0 && number_IcedTea==0 && number_CaffeLatte==0 && number_YujaTea==0)
        {
            Toast.makeText(getApplicationContext(), "음료가 선택되지 않았습니다.", Toast.LENGTH_SHORT).show();
        }
        // 음료가 선택된 경우
        else
        {
            int result = (number_Americano*1900)+(number_CaffeMocha*3500)+(number_IcedTea*2000)+(number_CaffeLatte*3000)+(number_YujaTea*3800);

            if (number_Americano!=0)
            {
                payment_TextView.setText("아메리카노 "+number_Americano+"잔 ");
            }
            if (number_CaffeMocha!=0)
            {
                payment_TextView.setText(payment_TextView.getText()+"카페모카 "+number_CaffeMocha+"잔 ");
            }
            if (number_IcedTea!=0)
            {
                payment_TextView.setText(payment_TextView.getText()+"아이스티 "+number_IcedTea+"잔 ");
            }
            if (number_CaffeLatte!=0)
            {
                payment_TextView.setText(payment_TextView.getText()+"카페라떼 "+number_CaffeLatte+"잔 ");
            }
            if (number_YujaTea!=0)
            {
                payment_TextView.setText(payment_TextView.getText()+"유자차 "+number_YujaTea+"잔 ");
            }
            payment_TextView.setText(payment_TextView.getText()+"주문하여 총 "+result+"원 나왔습니다.");
        }
    }
}