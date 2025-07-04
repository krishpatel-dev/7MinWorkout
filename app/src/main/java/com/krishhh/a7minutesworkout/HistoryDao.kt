package com.krishhh.a7minutesworkout

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow


@Dao
interface HistoryDao {
    @Insert
    suspend fun insert(historyEntity: HistoryEntity)

    @Query("Select * from `history-table`")
    fun fetchAllDates():Flow<List<HistoryEntity>>
}