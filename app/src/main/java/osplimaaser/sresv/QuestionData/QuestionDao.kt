package osplimaaser.sresv.QuestionData

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface QuestionDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addQuestion(question: Question)

    @Query("SELECT * FROM questions_table WHERE testName = :selectedTest")
    fun readQuestionsForTest(selectedTest: String): List<Question>

}