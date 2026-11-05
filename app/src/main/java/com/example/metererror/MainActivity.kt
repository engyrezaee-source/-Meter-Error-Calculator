package com.example.metererror

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.setPadding(30, 30, 30, 30)
        layout.setBackgroundColor(Color.WHITE)

        val title = TextView(this)
        title.text = "محاسبه خطای کنتور برق"
        title.textSize = 25f
        title.setTextColor(Color.rgb(20, 60, 110))
        title.gravity = Gravity.CENTER
        layout.addView(title)

        val subtitle = TextView(this)
        subtitle.text = "محاسبات کنتورهای مستقیم و دیماندی"
        subtitle.textSize = 16f
        subtitle.gravity = Gravity.CENTER
        layout.addView(subtitle)

        val welcome = TextView(this)
        welcome.text = "\nخوش آمدید\n\nتهیه کننده: یونس رضائی"
        welcome.textSize = 18f
        welcome.gravity = Gravity.CENTER
        layout.addView(welcome)

        val direct = Button(this)
        direct.text = "محاسبه کنتور مستقیم"
        layout.addView(direct)

        val demand = Button(this)
        demand.text = "محاسبه کنتور دیماندی"
        layout.addView(demand)

        val info = TextView(this)
        info.text = "\nسامانه محاسبه و بررسی خطای کنتورهای برق"
        info.textSize = 14f
        info.gravity = Gravity.CENTER
        layout.addView(info)

        setContentView(layout)
    }
}
