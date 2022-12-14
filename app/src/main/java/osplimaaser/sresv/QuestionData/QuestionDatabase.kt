package osplimaaser.sresv.QuestionData

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Question::class], version = 1, exportSchema = false)
abstract class QuestionDatabase: RoomDatabase() {

    abstract fun questionDao(): QuestionDao

    companion object{
        @Volatile
        private var INSTANCE: QuestionDatabase? = null
        fun getDatabase(context: Context): QuestionDatabase{
            val tempInstance = INSTANCE
            if(tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    QuestionDatabase::class.java,
                    "questions_table"
                ).allowMainThreadQueries().build()
                INSTANCE = instance
                return instance
            }
        }
    }
}