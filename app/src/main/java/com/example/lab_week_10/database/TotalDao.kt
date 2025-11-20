package com.example.lab_week_10.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
// Dao is represented as an interface
// Inside the Dao, CRUD can be performed
interface TotalDao {
    // @Insert is used to insert a new row
// OnConflictStrategy.REPLACE is used to replace existing row
// if the id of the inserted row already exists in the database
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(total: Total)

    // @Update is used to update an existing row
    @Update
    fun update(total: Total)

    @Delete
    fun delete(total: Total)

    @Query("SELECT * FROM total WHERE id = :id")
    fun getTotal(id: Long): List<Total>
}