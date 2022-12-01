package com.example.mod9room

import androidx.room.*

@Dao
interface OiseauDao {
    @Insert
    suspend fun insert(oiseau: Oiseau) : Long

    @Query("SELECT * FROM Oiseau WHERE id = :id")
    suspend fun get(id : Long) : Oiseau

    @Update
    fun update(oiseau : Oiseau)

    // /!\ -> LPO
    @Delete
    fun delete(oiseau: Oiseau)
}