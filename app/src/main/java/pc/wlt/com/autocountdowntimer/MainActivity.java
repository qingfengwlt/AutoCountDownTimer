package pc.wlt.com.autocountdowntimer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import pc.wlt.com.autocountdowntimerlibrary.autoWidget.AutoCountDownTimer;

public class MainActivity extends AppCompatActivity {

    TextView mTvOne;
    TextView mTvTwo;
    TextView mTvThree;
    private AutoCountDownTimer mAutoCountDownTimer,mAutoCountDownTimer2,mAutoCountDownTimer3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();

        initData();
    }

    private void initData() {
        mAutoCountDownTimer=new AutoCountDownTimer(System.currentTimeMillis(),1000) {
            @Override
            public void onFinish() {
                super.onFinish();
            }
        };
        mAutoCountDownTimer.setFormat_hh_mm_ss("HH:mm:ss");
        mAutoCountDownTimer.setmTextView(mTvOne);
        mAutoCountDownTimer.start();

        mAutoCountDownTimer2=new AutoCountDownTimer(System.currentTimeMillis(),1000) {
            @Override
            public void onFinish() {
                super.onFinish();
            }
        };
        mAutoCountDownTimer2.setFormat_hh_mm_ss("HH小时mm分钟ss秒");
        mAutoCountDownTimer2.setmTextView(mTvTwo);
        mAutoCountDownTimer2.start();

        mAutoCountDownTimer3=new AutoCountDownTimer(60*1000,1000) {
            @Override
            public void onFinish() {
                super.onFinish();
            }
        };
        mAutoCountDownTimer3.setFormat_hh_mm_ss("ss秒");
        mAutoCountDownTimer3.setmTextView(mTvThree);
        mAutoCountDownTimer3.start();
    }

    private void initUI() {
        mTvOne= (TextView) findViewById(R.id.tv_base_count_down_timer_one);
        mTvTwo= (TextView) findViewById(R.id.tv_base_count_down_timer_two);
        mTvThree= (TextView) findViewById(R.id.tv_base_count_down_timer_three);
    }
}
