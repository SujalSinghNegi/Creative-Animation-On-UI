package com.example.creativeanimationonui

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.creativeanimationonui.databinding.ActivityMainBinding
import render.animations.Attention
import render.animations.Bounce
import render.animations.Fade
import render.animations.Flip
import render.animations.Render
import render.animations.Rotate
import render.animations.Slide
import render.animations.Zoom

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



                // A view to animate; this is assumed to be defined in your XML with the id "targetView"
                val targetView = binding.targetView
//


                // -----------------------
                // Bounce Animations
                // -----------------------
                binding.btnInDown.setOnClickListener {
                    val render = Render(this)
                    render.setAnimation(Bounce().InDown(targetView))
                    render.start()
                }
                binding.btnInUp.setOnClickListener {
                    val render = Render(this)
                    render.setAnimation(Bounce().InUp(targetView))
                    render.start()
                }
                binding.btnInLeft.setOnClickListener {
                    val render = Render(this)
                    render.setAnimation(Bounce().InLeft(targetView))
                    render.start()
                }
                binding.btnInRight.setOnClickListener {
                    val render = Render(this)
                    render.setAnimation(Bounce().InRight(targetView))
                    render.start()
                }
                binding.btnIn.setOnClickListener {
                    val render = Render(this)
                    render.setAnimation(Bounce().In(targetView))
                    render.start()
                }
         // attention
                binding.btnAttention.setOnClickListener {
                    val render = Render(this)
                    render.setAnimation(Attention().Bounce(targetView))
                    render.start()
                }
                binding.btnAttentionWobble.setOnClickListener {
                    val render = Render(this)
                    render.setAnimation(Attention().Wobble(targetView))
                    render.start()
                }
                binding.btnAttentionShake.setOnClickListener {
                    val render = Render(this)
                    render.setAnimation(Attention().Shake(targetView))
                    render.start()
                }
                binding.btnAttentionTada.setOnClickListener {
                    val render = Render(this)
                    render.setAnimation(Attention().Tada(targetView))
                    render.start()
                }

                // -----------------------
                // Fade Animations
                // -----------------------
                binding.btnFadeIn.setOnClickListener {
                    val render = Render(this)
                    render.setAnimation(Fade().InDown(targetView))
                    render.start()
                }
                binding.btnFadeOut.setOnClickListener {
                    val render = Render(this)
                    render.setAnimation(Fade().InLeft(targetView))
                    render.start()
                }

                // -----------------------
                // Flip Animations
                // -----------------------
                binding.btnFlipInHorizontal.setOnClickListener {
                    val render = Render(this)
                    render.setAnimation(Flip().InX(targetView))
                    render.start()
                }
                binding.btnFlipOutHorizontal.setOnClickListener {
                    val render = Render(this)
                    render.setAnimation(Flip().InY(targetView))
                    render.start()
                }
                binding.btnFlipInVertical.setOnClickListener {
                    val render = Render(this)
                    render.setAnimation(Flip().OutX(targetView))
                    render.start()
                }
                binding.btnFlipOutVertical.setOnClickListener {
                    val render = Render(this)
                    render.setAnimation(Flip().OutY(targetView))
                    render.start()
                }

                // -----------------------
                // Rotate Animations
                // -----------------------
                binding.btnRotateIn.setOnClickListener {
                    val render = Render(this)
                    render.setAnimation(Rotate().In(targetView))
                    render.start()
                }
                binding.btnRotateOut.setOnClickListener {
                    val render = Render(this)
                    render.setAnimation(Rotate().Out(targetView))
                    render.start()
                }

                // -----------------------
                // Slide Animations
                // -----------------------
                binding.btnSlideDown.setOnClickListener {
                    val render = Render(this)
                    render.setAnimation(Slide().InDown(targetView))
                    render.start()
                }
                binding.btnSlideUp.setOnClickListener {
                    val render = Render(this)
                    render.setAnimation(Slide().InUp(targetView))
                    render.start()
                }
                binding.btnSlideLeft.setOnClickListener {
                    val render = Render(this)
                    render.setAnimation(Slide().OutLeft(targetView))
                    render.start()
                }
                binding.btnSlideRight.setOnClickListener {
                    val render = Render(this)
                    render.setAnimation(Slide().OutRight(targetView))
                    render.start()
                }

                // -----------------------
                // Zoom Animations
                // -----------------------
                binding.btnZoomIn.setOnClickListener {
                    val render = Render(this)
                    render.setAnimation(Zoom().InLeft(targetView))
                    render.start()
                }
                binding.btnZoomOut.setOnClickListener {
                    val render = Render(this)
                    render.setAnimation(Zoom().OutRight(targetView))
                    render.start()
                }

                // -----------------------
                // Attention Animation Example
                // -----------------------
                // Example: An attention-style animation (like Tada or a similar effect)

            }
 }
