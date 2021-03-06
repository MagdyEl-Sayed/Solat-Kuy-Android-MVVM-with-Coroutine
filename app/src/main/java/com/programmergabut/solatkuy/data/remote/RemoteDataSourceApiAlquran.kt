package com.programmergabut.solatkuy.data.remote

import com.programmergabut.solatkuy.data.remote.remoteentity.quranallsurahJson.AllSurahResponse
import com.programmergabut.solatkuy.data.remote.remoteentity.readsurahJsonAr.ReadSurahArResponse
import com.programmergabut.solatkuy.data.remote.remoteentity.readsurahJsonEn.ReadSurahEnResponse
import retrofit2.Response

interface RemoteDataSourceApiAlquran {
    suspend fun fetchReadSurahEn(surahID: Int): ReadSurahEnResponse
    suspend fun fetchAllSurah(): AllSurahResponse
    suspend fun fetchReadSurahAr(surahID: Int): ReadSurahArResponse
}