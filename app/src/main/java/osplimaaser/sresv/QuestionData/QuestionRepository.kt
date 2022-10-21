package osplimaaser.sresv.QuestionData

import androidx.lifecycle.LiveData

class QuestionRepository(private val questionDao: QuestionDao, private var selectedTest: String) {

    val readQuestionsForTest: List<Question> = questionDao.readQuestionsForTest(selectedTest)

    suspend fun addQuestion(question: Question) {
        questionDao.addQuestion(question)
    }
}