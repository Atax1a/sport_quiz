package osplimaaser.sresv.TestsData

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tests_table")
data class Test(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val testName: String,
    val imageResource: Int,
    val testCategory: String,
    var passed: Boolean,
    var questionsCount: Int,
    var questionsPassed: Int,
) {

}