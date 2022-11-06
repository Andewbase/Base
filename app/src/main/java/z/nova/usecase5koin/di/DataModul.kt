package z.nova.usecase5koin.di

import org.koin.dsl.module
import z.nova.data.repository.UserRepositoryImpl
import z.nova.data.storage.UserStorage
import z.nova.data.storage.sharedprefs.SharedPrefUserStorage
import z.nova.usecase2data.domain.repository.UserRepository



val dataModule = module {

    single<UserStorage> {
        SharedPrefUserStorage(context = get())
    }

    single<UserRepository> {
        UserRepositoryImpl(userStorage = get())
    }


}