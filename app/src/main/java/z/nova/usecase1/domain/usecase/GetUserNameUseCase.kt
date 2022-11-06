package z.nova.usecase1.domain.usecase

import z.nova.usecase1.domain.models.UserName

class GetUserNameUseCase {

    fun execute(): UserName {
        return UserName(firstName = "Bibo", lastName = "Boba")
    }

}