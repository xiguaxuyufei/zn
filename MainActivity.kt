package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Button1 = findViewById<Button>(R.id.button1)
        val Button2 = findViewById<Button>(R.id.button2)
        val Button3 = findViewById<Button>(R.id.button3)
        val Button4 = findViewById<Button>(R.id.button4)
        var isSelected = false // 用来跟踪按钮是否被选中

        Button1.setOnClickListener {
            isSelected = !isSelected; // 切换选中状态
            if (isSelected) {
                Button1.setBackgroundResource(R.color.red);
                // 设置其他选中状态的属性（如果需要）
            } else {
                Button1.setBackgroundResource(R.color.grey);
                // 设置其他未选中状态的属性（如果需要）
            }
        }
        Button2.setOnClickListener {
            isSelected = !isSelected; // 切换选中状态
            if (isSelected) {
                Button2.setBackgroundResource(R.color.red);
                // 设置其他选中状态的属性（如果需要）
            } else {
                Button2.setBackgroundResource(R.color.grey);
                // 设置其他未选中状态的属性（如果需要）
            }
        }
        Button3.setOnClickListener {
            isSelected = !isSelected; // 切换选中状态
            if (isSelected) {
                Button3.setBackgroundResource(R.color.red);
                // 设置其他选中状态的属性（如果需要）
            } else {
                Button3.setBackgroundResource(R.color.grey);
                // 设置其他未选中状态的属性（如果需要）
            }
        }
        Button4.setOnClickListener {
            isSelected = !isSelected; // 切换选中状态
            if (isSelected) {
                Button4.setBackgroundResource(R.color.red);
                // 设置其他选中状态的属性（如果需要）
            } else {
                Button4.setBackgroundResource(R.color.grey);
                // 设置其他未选中状态的属性（如果需要）
            }
        }
}
}