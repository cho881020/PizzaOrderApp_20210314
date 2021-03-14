package com.tjoeun.pizzaorderapp_20210314

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nickname.*

class EditNicknameActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nickname)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

        okBtn.setOnClickListener {

            val inputNickname = nicknameEdt.text.toString()

            val resultIntent = Intent()
            resultIntent.putExtra("nick", inputNickname)

            setResult(RESULT_OK , resultIntent)

            finish()

        }

    }

    override fun setValues() {

    }

}