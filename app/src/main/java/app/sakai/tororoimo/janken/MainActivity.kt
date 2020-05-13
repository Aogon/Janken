package app.sakai.tororoimo.janken

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gooButton.setOnClickListener {
            player.text = "あなたの手はグーです"
            val number: Int = Random.nextInt(3)
            when(number) {
                0 -> {
                    cpu.setImageResource(R.drawable.goo)
                    result.text = "引き分けです"
                    result.setTextColor(Color.parseColor("#8a000000"))
                }

                1 -> {
                    cpu.setImageResource(R.drawable.choki)
                    result.text = "あなたの勝ちです"
                    result.setTextColor(Color.parseColor("#8a000000"))
                }

                2 -> {
                    cpu.setImageResource(R.drawable.paa)
                    result.text = "あなたの負けです"
                    result.setTextColor(Color.parseColor("#8a000000"))
                }
            }
        }

        chokiButton.setOnClickListener {
            player.text = "あなたの手はチョキです"
            val number: Int = Random.nextInt(3)
            when(number) {
                0 -> {
                    cpu.setImageResource(R.drawable.goo)
                    result.text = "あなたの負けです"
                    result.setTextColor(Color.parseColor("#8a000000"))
                }

                1 -> {
                    cpu.setImageResource(R.drawable.choki)
                    result.text = "引き分けです"
                    result.setTextColor(Color.parseColor("#8a000000"))
                }

                2 -> {
                    cpu.setImageResource(R.drawable.paa)
                    result.text = "あなたの勝ちです"
                    result.setTextColor(Color.parseColor("#8a000000"))
                }
            }
        }



        paaButton.setOnClickListener {
            player.text = "あなたの手はパーです"
            val number: Int = Random.nextInt(3)
            when(number) {
                0 -> {
                    cpu.setImageResource(R.drawable.goo)
                    result.text = "あなたの勝ちです"
                    result.setTextColor(Color.parseColor("#8a000000"))
                }

                1 -> {
                    cpu.setImageResource(R.drawable.choki)
                    result.text = "あなたの負けです"
                    result.setTextColor(Color.parseColor("#8a000000"))
                }

                2 -> {
                    cpu.setImageResource(R.drawable.paa)
                    result.text = "引き分けです"
                    result.setTextColor(Color.parseColor("#8a000000"))
                }
            }
        }
    }
}
