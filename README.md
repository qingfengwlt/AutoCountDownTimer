# AutoCountDownTimer
简介：一个倒计时自定义控件，继承CountDownTimer。对显示的“时，分，秒” 定义格式：
如：HH:mm:ss
    HH小时mm分钟ss秒
    ss秒
    
 mAutoCountDownTimer=new AutoCountDownTimer(System.currentTimeMillis(),1000) {
            @Override
            public void onFinish() {
                super.onFinish();
            }
        };
        //// TODO: 2017/5/10 设置显示格式 
        mAutoCountDownTimer.setFormat_hh_mm_ss("HH:mm:ss");
        //// TODO: 2017/5/10 设置显示的View :textView 
        mAutoCountDownTimer.setmTextView(mTvOne);
        // 开发
        mAutoCountDownTimer.start();
        
        结束的时候 不要忘记cancle
