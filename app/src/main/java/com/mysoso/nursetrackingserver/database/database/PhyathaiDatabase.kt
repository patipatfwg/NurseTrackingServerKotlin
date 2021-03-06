package com.mysoso.nursetrackingserver.database.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.mysoso.nursetrackingserver.database.dao.SettingRegisterBrandDao
import com.mysoso.nursetrackingserver.database.dao.SettingRegisterVersionDao
import com.mysoso.nursetrackingserver.database.entity.SettingRegisterBrand
import com.mysoso.nursetrackingserver.database.entity.SettingRegisterVersion

@Database(entities = [SettingRegisterVersion::class], version = 1, exportSchema = false)
abstract class PhyathaiDatabase : RoomDatabase() {

//    abstract val SettingRegisterBrandDao : SettingRegisterBrandDao
    abstract fun settingRegisterVersionDao(): SettingRegisterVersionDao

    companion object {

        @Volatile
        private var INSTANCE: PhyathaiDatabase? = null

        fun getInstance(context: Context): PhyathaiDatabase {
            synchronized(this) {
                var instance = INSTANCE

                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        PhyathaiDatabase::class.java,
                        "fwg_nurse_tracking"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}