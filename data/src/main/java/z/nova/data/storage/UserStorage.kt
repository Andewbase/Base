package z.nova.data.storage

import z.nova.data.storage.models.User


interface UserStorage {
    fun save(user: User): Boolean

    fun get(): User
}