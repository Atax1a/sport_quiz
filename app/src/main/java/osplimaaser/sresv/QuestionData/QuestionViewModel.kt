package osplimaaser.sresv.QuestionData

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class QuestionViewModel(application: Application, selectedTest: String) :
    AndroidViewModel(application) {

    val readQuestionsForTest: List<Question>
    private val repository: QuestionRepository

    init {
        val questionDao = QuestionDatabase.getDatabase(application).questionDao()
        repository = QuestionRepository(questionDao, selectedTest)
        readQuestionsForTest = repository.readQuestionsForTest
    }

    fun addQuestion(question: Question) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.addQuestion(question)
        }
    }

}