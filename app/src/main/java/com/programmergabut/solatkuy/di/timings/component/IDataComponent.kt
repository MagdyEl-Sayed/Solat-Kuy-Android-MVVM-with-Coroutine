package com.programmergabut.solatkuy.di.timings.component

import com.programmergabut.solatkuy.data.remote.remoteentity.prayerJson.Data
import com.programmergabut.solatkuy.di.timings.module.DataModule
import dagger.Component

/*
 * Created by Katili Jiwo Adi Wiyono on 16/04/20.
 */

@Component(modules = [DataModule::class])
interface IDataComponent {
    fun getData(): Data
}