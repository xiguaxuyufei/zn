package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.CalendarView
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var logAdapter: LogAdapter
    private lateinit var logRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logRecyclerView = findViewById(R.id.log_list)
        logAdapter = LogAdapter()
        logRecyclerView.layoutManager = LinearLayoutManager(this)
        logRecyclerView.adapter = logAdapter

        // 假设这里有一个添加日志的方法
        addLog("这是一条日志内容")

        val addButton = findViewById<Button>(R.id.add_button)
        addButton.setOnClickListener {
            showAddDialog()
        }
    }

    private fun showAddDialog() {
        // 这里将实现自定义对话框的代码
        val dialog = AlertDialog.Builder(this)
        val inflater = getLayoutInflater()
        val dialogView = inflater.inflate(R.layout.dialog_add_log, null)

        val calendarView = dialogView.findViewById<CalendarView>(R.id.calendar_view)
        val editText = dialogView.findViewById<EditText>(R.id.log_text)

        dialog.setView(dialogView)
        dialog.setPositiveButton("保存") { _, _ ->
            // 这里处理保存逻辑，比如获取日历选择的日期和文本编辑框的内容
        }
        dialog.setNegativeButton("取消") { dialog, _ ->
            dialog.cancel()
        }
        dialog.show()
    }

    private fun addLog(content: String) {
        val timestamp = System.currentTimeMillis() // 获取当前时间戳
        val logEntry = LogEntry(timestamp, content)
        logAdapter.addLog(logEntry)
    }
}
