package osplimaaser.sresv.QuestionData

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "questions_table")
data class Question(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val testName: String,
    val question: String,
    val imageResource: Int,
    val firstOption: String,
    val secondOption: String,
    val thirdOption: String,
    val fourthOption: String,
    val correctAnswer: Int,
) {

}