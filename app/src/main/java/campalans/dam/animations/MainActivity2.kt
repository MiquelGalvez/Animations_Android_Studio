package campalans.dam.animations

import android.animation.Animator
import android.animation.Animator.AnimatorListener
import android.animation.AnimatorInflater
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import campalans.dam.animations.databinding.ActivityMain2Binding
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMain2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        val splashScreen = installSplashScreen()
        setContentView(binding.root)
        splashScreen.setKeepOnScreenCondition{false}

        val ballAnimation = AnimationUtils.loadAnimation(this, R.anim.ball_animation)
        binding.imageView.startAnimation(ballAnimation)

        binding.imageView.setOnClickListener(){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            // Finalitza aquesta activitat per evitar que l'usuari la vegi al tornar enrere
            finish()
        }

    }
}