package z.nova.usecase1.domain.usecase

import z.nova.usecase1.domain.models.SaveUserNameParam
import z.nova.usecase2data.domain.repository.UserRepository

class SaveUserNameUseCase(private val userRepository: UserRepository) {

    fun execute(param: SaveUserNameParam): Boolean {

        val oldUserName = userRepository.getName()
        if (oldUserName.firstName == param.name){
            return true
        }

      val result: Boolean = userRepository.saveName(saveParam = param)
        return result
    }

}