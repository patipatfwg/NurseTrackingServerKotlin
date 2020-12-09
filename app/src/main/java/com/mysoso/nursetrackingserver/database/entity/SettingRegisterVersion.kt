package com.mysoso.nursetrackingserver.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull

@Entity
data class SettingRegisterVersion(

    @PrimaryKey(autoGenerate = false)
//    val setting_register_version_id: Int,
    val setting_register_version_number: String,

    @ColumnInfo(name = "setting_register_version_title")
    @NotNull
    var setting_register_version_title: String,

//    @ColumnInfo(name = "setting_register_version_number")
//    @NotNull
//    var setting_register_version_number: String,

    @ColumnInfo(name = "updated_at")
    var updated_at: Long = System.currentTimeMillis()
)