package osplimaaser.sresv.TestsData

import androidx.lifecycle.LiveData

class TestRepository(private val testDao: TestDao) {

    val readAllData: LiveData<List<Test>> = testDao.readAllData()

    suspend fun addTest(test: Test){
        testDao.addTest(test)
    }

    suspend fun updateTest(test: Test){
        testDao.updateTest(test)
    }

    fun getTestById(testId: Int): Test {
        return testDao.getTestById(testId)
    }
}