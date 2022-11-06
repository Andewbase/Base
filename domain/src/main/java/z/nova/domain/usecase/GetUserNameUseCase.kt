package z.nova.usecase1.domain.usecase

import z.nova.usecase1.domain.models.UserName
import z.nova.usecase2data.domain.repository.UserRepository

class GetUserNameUseCase(private val userRepository: UserRepository) {

    fun execute(): UserName {
        return userRepository.getName()
    }

}