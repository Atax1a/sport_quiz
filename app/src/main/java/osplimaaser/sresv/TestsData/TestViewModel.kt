package osplimaaser.sresv.TestsData

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class TestViewModel(application: Application): AndroidViewModel(application) {

    val readAllData: LiveData<List<Test>>
    private val repository: TestRepository

    init {
        val testDao = TestDatabase.getDatabase(application).testDao()
        repository = TestRepository(testDao)
        readAllData = repository.readAllData
    }

    fun addTest(test: Test){
        viewModelScope.launch(Dispatchers.IO) {
            repository.addTest(test)
        }
    }

    fun updateTest(test: Test){
        viewModelScope.launch(Dispatchers.IO) {
            repository.updateTest(test)
        }
    }

    fun getTestById(testId: Int): Test {
        return repository.getTestById(testId)
    }

}