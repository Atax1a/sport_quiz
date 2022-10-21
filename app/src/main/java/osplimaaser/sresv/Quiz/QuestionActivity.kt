package osplimaaser.sresv.Quiz

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModelProvider
import osplimaaser.sresv.QuestionData.Question
import osplimaaser.sresv.QuestionData.QuestionViewModel
import osplimaaser.sresv.R
import osplimaaser.sresv.TestsData.Test
import osplimaaser.sresv.TestsData.TestViewModel
import osplimaaser.sresv.databinding.ActivityQuestionBinding

class QuestionActivity : AppCompatActivity() {

    private var score: Int = 0

    private var currentPosition: Int = 1
    private var questionList: List<Question>? = null
    private var selectedOption: Int = 0
    private lateinit var testName: String
    private var testId: Int = 0

    private lateinit var binding: ActivityQuestionBinding

    private lateinit var mQuestionViewModel: QuestionViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        testInit()

        optionInit()

        setQuestion()

        submitInit()

    }

    private fun submitInit() {
        binding.submit.setOnClickListener {
            if (selectedOption != 0) {
                lockOptions(true)
                val question = questionList!![currentPosition - 1]
                if (selectedOption != question.correctAnswer) {
                    setColor(selectedOption, R.drawable.wrong_question_option)
                } else {
                    score++
                }

                setColor(question.correctAnswer, R.drawable.correct_question_option)

                if (currentPosition == questionList!!.size) binding.submit.setImageResource(R.drawable.test_finish_icon)
                else binding.submit.setImageResource(R.drawable.test_submit_icon)

            } else {
                currentPosition++
                when {
                    currentPosition <= questionList!!.size -> {
                        setQuestion()
                        lockOptions(false)
                        binding.submit.setImageResource(R.drawable.test_next_question_icon)
                    }
                    else -> {
                        setResult()
                    }
                }
            }
            selectedOption = 0
        }
    }

    private fun lockOptions(locked: Boolean) {
        binding.apply {
            tvFirstOption.isClickable = !locked
            tvSecondOption.isClickable = !locked
            tvThirdOption.isClickable = !locked
            tvFourthOption.isClickable = !locked
        }
    }

    private fun testInit() {
        testName = intent.getStringExtra("testName").toString()
        testId = intent.getIntExtra("testId", 0)
    }

    private fun setResult() {
        var resultIntent = Intent(this, Result::class.java)
        resultIntent.putExtra("score", score.toString())
        resultIntent.putExtra("total size", questionList!!.size.toString())
        resultIntent.putExtra("testId", testId)
        startActivity(resultIntent)
        finish()
    }

    private fun optionInit() {
        binding.apply {
            tvFirstOption.setOnClickListener {
                selectedOptionStyle(tvFirstOption, 1)
            }
            tvSecondOption.setOnClickListener {
                selectedOptionStyle(tvSecondOption, 2)
            }
            tvThirdOption.setOnClickListener {
                selectedOptionStyle(tvThirdOption, 3)
            }
            tvFourthOption.setOnClickListener {
                selectedOptionStyle(tvFourthOption, 4)
            }
        }
    }

    private fun addTest() {
        val mTestViewModel = ViewModelProvider(this)[TestViewModel::class.java]
        var newTest: Test =
            Test(0, "FIRST test", R.drawable.plug_image, "test_category", false, 5, 0)
        mTestViewModel.addTest(newTest)
    }

    fun setColor(opt: Int, color: Int) {
        when (opt) {
            1 -> {
                binding.tvFirstOption.background = ContextCompat.getDrawable(this, color)
            }
            2 -> {
                binding.tvSecondOption.background = ContextCompat.getDrawable(this, color)
            }
            3 -> {
                binding.tvThirdOption.background = ContextCompat.getDrawable(this, color)
            }
            4 -> {
                binding.tvFourthOption.background = ContextCompat.getDrawable(this, color)
            }
        }
    }


    fun setQuestion() {
        mQuestionViewModel = QuestionViewModel(application, testName)
        questionList = mQuestionViewModel.readQuestionsForTest

        Log.v("ASDASDAS", questionList.toString())

        val question = questionList!![currentPosition - 1]

        binding.apply {
            pbQuestionProgress.progress = currentPosition.toFloat()
            pbQuestionProgress.max = questionList!!.size.toFloat()
            tvQuestionText.text = question.question

            if(question.imageResource!=0){
                binding.ivQuestionImage.visibility = View.VISIBLE
                binding.ivQuestionImage.setImageResource(question.imageResource)
            }else{
                binding.ivQuestionImage.visibility = View.GONE
            }

            tvFirstOption.text = question.firstOption
            tvSecondOption.text = question.secondOption
            tvThirdOption.text = question.thirdOption
            tvFourthOption.text = question.fourthOption
        }
        setOptionStyle()
    }

    fun setOptionStyle() {
        var optionList: ArrayList<TextView> = arrayListOf()
        binding.apply {
            optionList.add(0, tvFirstOption)
            optionList.add(1, tvSecondOption)
            optionList.add(2, tvThirdOption)
            optionList.add(3, tvFourthOption)
        }
        for (opt in optionList) {
            opt.setTextColor(Color.parseColor("#555151"))
            opt.background = ContextCompat.getDrawable(this, R.drawable.question_option)
            opt.typeface = Typeface.DEFAULT
        }
    }

    fun selectedOptionStyle(view: TextView, opt: Int) {
        setOptionStyle()
        selectedOption = opt
        view.background = ContextCompat.getDrawable(this, R.drawable.selected_question_option)
        view.typeface = Typeface.DEFAULT_BOLD
        view.setTextColor(Color.parseColor("#000000"))
    }
}