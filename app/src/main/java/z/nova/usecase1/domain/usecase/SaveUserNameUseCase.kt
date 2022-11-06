package z.nova.usecase1.domain.usecase

import z.nova.usecase1.domain.models.SaveUserNameParam

class SaveUserNameUseCase {

    fun execute(param: SaveUserNameParam): Boolean {
        if (param.name.isEmpty()) {
            return false
        }else{
            return true
        }
    }

}