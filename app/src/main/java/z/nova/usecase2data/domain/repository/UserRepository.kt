package z.nova.usecase2data.domain.repository

import z.nova.usecase1.domain.models.SaveUserNameParam
import z.nova.usecase1.domain.models.UserName

interface UserRepository {

    fun saveName(saveParam: SaveUserNameParam): Boolean

    fun getName(): UserName
}