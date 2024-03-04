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

        // Creem i configurem la pantalla de inici de la aplicació, osigui el SplashScreen
        val splashScreen = installSplashScreen()
        setContentView(binding.root)
        splashScreen.setKeepOnScreenCondition{false}

        // Iniciem la animació de la pilota
        val ballAnimation = AnimationUtils.loadAnimation(this, R.anim.ball_animation)
        binding.imageView.startAnimation(ballAnimation)

        // Quan femc clic a la imatge de la pilota ens obrira el seguent activity
        binding.imageView.setOnClickListener(){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            // Finalitza aquesta activitat per evitar que l'usuari la vegi al tornar enrere, aixo fa que la aplicacio es minimitzi si tornem enrerra
            finish()
        }

    }
}