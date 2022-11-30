package com.example.mod9room

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class AppDbOiseauTest {
    lateinit var db : AppDatabase;
    @Before
    fun createDb() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        db = Room.inMemoryDatabaseBuilder(
            context, AppDatabase::class.java).build()
    }

    @Test
    fun insertOiseaux(){
        db.oiseauDao().insert(Oiseau(0,"Kakapo",false,"vert",5))
        db.oiseauDao().insert(Oiseau(0,"l'ara de Spix",true,"bleu",50))
        assertTrue(db.oiseauDao().get(1).couleur == "vert")
    }
}