package com.example.mod9room

import androidx.room.*

@Dao
interface OiseauDao {
    @Insert
    fun insert(oiseau: Oiseau)

    @Query("SELECT * FROM Oiseau WHERE id = :id")
    fun get(id : Long) : Oiseau

    @Update
    fun update(oiseau : Oiseau)

    // /!\ -> LPO
    @Delete
    fun delete(oiseau: Oiseau)
}