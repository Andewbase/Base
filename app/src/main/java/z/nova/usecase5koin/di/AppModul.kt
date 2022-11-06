package z.nova.usecase5koin.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import z.nova.usecase4mvvm.presentation.MainMVVM

val appModule = module {

    viewModel<MainMVVM>{
        MainMVVM(
            getUserNameUseCase = get(),
            saveUserNameUseCase = get()
        )
    }

}