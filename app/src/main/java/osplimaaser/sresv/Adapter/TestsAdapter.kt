package osplimaaser.sresv.Adapter

import android.content.Context
import android.content.Intent
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import osplimaaser.sresv.Quiz.QuestionActivity
import osplimaaser.sresv.R
import osplimaaser.sresv.TestsData.Test
import osplimaaser.sresv.databinding.LayoutTestItemBinding
import kotlin.random.Random

class TestsAdapter : RecyclerView.Adapter<TestsAdapter.TestsViewHolder>() {

    private var testsList = emptyList<Test>()
    private lateinit var mContext: Context


    class TestsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var binding: LayoutTestItemBinding = LayoutTestItemBinding.bind(itemView)

        fun bind(test: Test, context: Context) = with(binding) {

            pbQuestionProgress.max = test.questionsCount.toFloat()
            pbQuestionProgress.progress = test.questionsPassed.toFloat()
            tvTestName.text = test.testName
            tvTestCategory.text = test.testCategory
            tvQuestionsCount.text = "${test.questionsPassed}/${test.questionsCount}"
            ivTestImage.setImageResource(test.imageResource)

            setPanelColor(context)

            if (test.passed) {
                ivPassedIcon.setImageResource(R.drawable.test_passed_icon)
                tvQuestionsCount.text = "Done!"
            } else {
                ivPassedIcon.setImageResource(R.drawable.test_not_passed_icon)
            }


            binding.testContainer.setOnClickListener {
                var intent = Intent(context, QuestionActivity::class.java)
                intent.putExtra("testName", test.testName)
                intent.putExtra("testId", test.id)
                context.startActivity(intent)
            }
        }

        private fun setPanelColor(context: Context) {
            var panelBackgroundsList: ArrayList<Drawable> = arrayListOf()

            panelBackgroundsList.add(context.getDrawable(R.drawable.panel_test_gradient_1)!!)
            panelBackgroundsList.add(context.getDrawable(R.drawable.panel_test_gradient_2)!!)
            panelBackgroundsList.add(context.getDrawable(R.drawable.panel_test_gradient_3)!!)
            panelBackgroundsList.add(context.getDrawable(R.drawable.panel_test_gradient_4)!!)
            panelBackgroundsList.add(context.getDrawable(R.drawable.panel_test_gradient_5)!!)
            panelBackgroundsList.add(context.getDrawable(R.drawable.panel_test_gradient_6)!!)
            panelBackgroundsList.add(context.getDrawable(R.drawable.panel_test_gradient_7)!!)

            val randomIndex = Random.nextInt(panelBackgroundsList.size)

            binding.testPanelContainer.background = panelBackgroundsList[randomIndex]

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TestsViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.layout_test_item, parent, false)
        return TestsViewHolder(view)
    }

    override fun onBindViewHolder(holder: TestsViewHolder, position: Int) {
        holder.bind(testsList[position], mContext)
    }

    override fun getItemCount(): Int {
        return testsList.size
    }

    fun setData(test: List<Test>, context: Context) {
        this.testsList = test
        mContext = context
        notifyDataSetChanged()
    }
}