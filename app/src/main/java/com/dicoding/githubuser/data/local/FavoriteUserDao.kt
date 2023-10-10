package com.dicoding.githubuser.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface FavoriteUserDao {

    @Insert
    fun addToFavorite(favoriteUser: FavoriteUser)

    @Query("SELECT * FROM favorite_user")
    fun getFavoriteUser(): LiveData<List<FavoriteUser>>

    @Query("SELECT count(*) FROM favorite_user WHERE id = :id")
    fun checkedUser(id: Int): Int

    @Query("DELETE FROM favorite_user WHERE id = :id")
    fun removeFromFavorite(id: Int): Int
}
