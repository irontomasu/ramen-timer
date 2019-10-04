package jp.co.casareal.myapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton = findViewById(R.id.start) as Button
        val startButton2 = findViewById(R.id.start2) as Button

        startButton.setOnClickListener {
            object : CountDownTimer(180000,1000){
                override fun onFinish() {
                    //終了する時
                    imageView.setImageResource(R.drawable.shifuku)
                    tv.text = "至福のひと時をご堪能あれぃ"
                }

                override fun onTick(p0: Long) {
                    //指定した毎秒ごとに何をさせるか
                    tv.text = "のこり　${p0/1000} 秒 "
                }

            }.start()
        }

        startButton2.setOnClickListener {
            object : CountDownTimer(300000,1000){
                override fun onFinish() {
                    //終了する時
                    imageView.setImageResource(R.drawable.ramen1)
                    tv.text = "とりあえず召し上がれ。"
                }

                override fun onTick(p0: Long) {
                    //指定した毎秒ごとに何をさせるか
                    tv.text = "のこり　${p0/1000} 秒 "
                }

            }.start()
        }
    }
}
