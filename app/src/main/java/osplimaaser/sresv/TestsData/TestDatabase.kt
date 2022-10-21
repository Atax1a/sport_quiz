package osplimaaser.sresv.TestsData

import android.content.Context
import android.service.autofill.UserData
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [Test::class], version = 1, exportSchema = false)
abstract class TestDatabase : RoomDatabase() {

    abstract fun testDao(): TestDao

    companion object {
        @Volatile
        private var INSTANCE: TestDatabase? = null
        fun getDatabase(context: Context): TestDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    TestDatabase::class.java,
                    "tests_table"
                ).allowMainThreadQueries().build()
                INSTANCE = instance
                return instance
            }
        }
    }
}