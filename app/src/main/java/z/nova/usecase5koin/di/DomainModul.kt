package z.nova.usecase5koin.di

import org.koin.dsl.module
import z.nova.usecase1.domain.usecase.GetUserNameUseCase
import z.nova.usecase1.domain.usecase.SaveUserNameUseCase



val domainModule = module {

    factory<GetUserNameUseCase> {
        GetUserNameUseCase(userRepository = get())
    }

    factory<SaveUserNameUseCase> {
        SaveUserNameUseCase(userRepository = get())
    }
}