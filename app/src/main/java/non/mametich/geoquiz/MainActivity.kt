package non.mametich.geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import non.mametich.geoquiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.trueButton.setOnClickListener { rightAnswer() }
        binding.falseButton.setOnClickListener { wrongAnswer() }
    }

    private fun wrongAnswer() {
        Toast.makeText(this,R.string.incorrect_toast, Toast.LENGTH_SHORT).show()
    }

    private fun rightAnswer() {
        Toast.makeText(this, R.string.correct_toast, Toast.LENGTH_SHORT).show()
    }
}