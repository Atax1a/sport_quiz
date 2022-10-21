package osplimaaser.sresv.Quiz

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import osplimaaser.sresv.TestsData.Test
import osplimaaser.sresv.TestsData.TestViewModel
import osplimaaser.sresv.databinding.ResultLayoutBinding

class Result : AppCompatActivity() {

    private lateinit var binding: ResultLayoutBinding
    private lateinit var mTestViewModel: TestViewModel
    private lateinit var test: Test

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ResultLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val score = intent.getStringExtra("score")
        val totalQuestion = intent.getStringExtra("total size")
        val testId = intent.getIntExtra("testId", 0)

        binding.apply {
            tvScore.text = "score: $score / $totalQuestion"
            btnResultFinish.setOnClickListener {
                finish()
            }
        }

        mTestViewModel = ViewModelProvider(this)[TestViewModel::class.java]
        test = mTestViewModel.getTestById(testId)

        updateTest(score!!, totalQuestion!!, test)

    }

    private fun updateTest(score: String, totalQuestion: String, test1: Test) {
        if (score == totalQuestion) {
            test.passed = true
            mTestViewModel.updateTest(test)
        } else {
            test.passed = false
            mTestViewModel.updateTest(test)
        }
        test1.questionsCount = Integer.parseInt(totalQuestion)
        test1.questionsPassed = Integer.parseInt(score)
        mTestViewModel.updateTest(test1)
    }
}