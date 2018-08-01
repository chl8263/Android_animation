package com.example.gyun_home.android_animation

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() ,View.OnClickListener{


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_fade_in.setOnClickListener(this)
        button_fade_out.setOnClickListener(this)
        button_blank.setOnClickListener(this)
        button_zoom_in.setOnClickListener(this)
        button_zoom_out.setOnClickListener(this)
        button_rotate.setOnClickListener(this)
        button_move.setOnClickListener(this)
        button_slide_up.setOnClickListener(this)
        button_slide_down.setOnClickListener(this)
        button_bounce.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        when (v!!.id){

            R.id.button_fade_in -> {
                var anim = AnimationUtils.loadAnimation(this,R.anim.fade_in)
                textView_fade_in.visibility = View.VISIBLE
                textView_fade_in.startAnimation(anim)
            }
            R.id.button_fade_out -> {
                var anim = AnimationUtils.loadAnimation(this,R.anim.fade_out)
                textView_fade_out.visibility = View.INVISIBLE
                textView_fade_out.startAnimation(anim)
            }
            R.id.button_blank -> {
                var anim = AnimationUtils.loadAnimation(this,R.anim.blink)
                textView_blank.startAnimation(anim)
            }
            R.id.button_zoom_in -> {
                var anim = AnimationUtils.loadAnimation(this,R.anim.zoom_in)
                textView_zoom_in.startAnimation(anim)
            }
            R.id.button_zoom_out -> {
                var anim = AnimationUtils.loadAnimation(this,R.anim.zoom_out)
                textView_zoom_out.startAnimation(anim)
            }
            R.id.button_rotate -> {
                var anim = AnimationUtils.loadAnimation(this,R.anim.rotate)
                textView_rotate.startAnimation(anim)
            }
            R.id.button_move -> {
                var anim = AnimationUtils.loadAnimation(this,R.anim.move)
                textView_move.startAnimation(anim)
            }
            R.id.button_slide_up -> {
                var anim = AnimationUtils.loadAnimation(this,R.anim.slide_up)
                textView_slide_up.startAnimation(anim)

            }
            R.id.button_slide_down -> {
                var anim = AnimationUtils.loadAnimation(this,R.anim.slide_down)
                textView_slide_down.startAnimation(anim)

            }
            R.id.button_bounce -> {
                var anim = AnimationUtils.loadAnimation(this,R.anim.bounce)
                textView_bounce.startAnimation(anim)
            }
        }
    }
}
