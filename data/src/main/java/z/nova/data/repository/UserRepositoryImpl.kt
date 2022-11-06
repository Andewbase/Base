package z.nova.data.repository

import z.nova.usecase1.domain.models.SaveUserNameParam
import z.nova.usecase1.domain.models.UserName
import z.nova.usecase2data.domain.repository.UserRepository
import z.nova.data.storage.models.User
import z.nova.data.storage.UserStorage


class UserRepositoryImpl(private val userStorage: UserStorage): UserRepository {



    override fun saveName(saveParam: SaveUserNameParam): Boolean {

       // val user = User(firstName = saveParam.name, lastName = "")
        val user = mapToStorage(saveParam)

        val result = userStorage.save(user)
        return result
    }

    override fun getName(): UserName {
        val user = userStorage.get()

        //val userName = UserName(firstName = user.firstName, lastName = user.lastName)

        //return userName
        return mapToDomain(user)
    }

    private fun mapToStorage(saveParam: SaveUserNameParam): User {
        return User(firstName = saveParam.name, lastName = "")
    }

    private fun mapToDomain(user: User): UserName {
        return UserName(firstName = user.firstName, lastName = user.lastName)
    }

}