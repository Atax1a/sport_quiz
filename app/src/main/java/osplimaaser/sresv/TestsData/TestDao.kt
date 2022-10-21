package osplimaaser.sresv.TestsData

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface TestDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addTest(test: Test)

    @Query("SELECT * FROM tests_table ORDER BY id ASC")
    fun readAllData(): LiveData<List<Test>>

    @Update
    suspend fun updateTest(test: Test)

    @Query("SELECT * FROM tests_table WHERE id = :testId")
    fun getTestById(testId: Int): Test


}