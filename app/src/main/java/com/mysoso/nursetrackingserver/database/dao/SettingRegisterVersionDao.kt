package com.mysoso.nursetrackingserver.database.dao

import androidx.room.*
import com.mysoso.nursetrackingserver.database.entity.SettingRegisterVersion

@Dao
interface SettingRegisterVersionDao {

//    @Insert(onConflict = OnConflictStrategy.IGNORE)
    @Insert
    fun createVersion(settingVersionModel: SettingRegisterVersion)

    @Query("DELETE FROM SettingRegisterVersion")
    fun deleteAll()


//
//    @Query("SELECT * FROM setting_register_version WHERE setting_register_version_number = :number")
//    fun getVersion(number: String): List<setting_register_version>

//    @Query("SELECT * FROM setting_register_brand ORDER BY setting_register_brand_id ASC")
//    fun readBrandAll(): LiveData<List<setting_register_brand>>

//    @Update()
//    fun updateBrand( update_brands: setting_register_brand  )
}