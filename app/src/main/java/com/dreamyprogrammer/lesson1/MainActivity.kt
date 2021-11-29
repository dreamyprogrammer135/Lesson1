package com.dreamyprogrammer.lesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import com.dreamyprogrammer.lesson1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MainView {

    private var vb: ActivityMainBinding? = null
    val presenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(vb?.root)

        vb?.btnCounter1?.setOnClickListener{
            presenter.counterClick1()
        }
        vb?.btnCounter2?.setOnClickListener {
            presenter.counterClick2()
        }
            vb?.btnCounter3?.setOnClickListener{
                presenter.counterClick3()
        }
    }

    override fun setButtonText1(text: String) {
        vb?.btnCounter1?.text = text
    }

    override fun setButtonText2(text: String) {
        vb?.btnCounter2?.text = text
    }

    override fun setButtonText3(text: String) {
        vb?.btnCounter3?.text = text
    }

}

