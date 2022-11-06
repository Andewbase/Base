package z.nova.usecase2data.data

import android.content.Context
import z.nova.usecase1.domain.models.SaveUserNameParam
import z.nova.usecase1.domain.models.UserName
import z.nova.usecase2data.domain.repository.UserRepository

private const val SHARED_PREFS_NAME = "shared_prefs_name"
private const val KEY_FIRST_NAME = "firstname"
private const val KEY_LAST_NAME = "lastname"
private const val DEF_NAME = "def last name"


class UserRepositoryImpl(context: Context): UserRepository {

   private val sharedPreferences = context.getSharedPreferences(SHARED_PREFS_NAME, Context.MODE_PRIVATE)

    override fun saveName(saveParam: SaveUserNameParam): Boolean {
        sharedPreferences.edit().putString(KEY_FIRST_NAME, saveParam.name).apply()
        return true
    }

    override fun getName(): UserName {
        val firstName = sharedPreferences.getString(KEY_FIRST_NAME, "") ?: ""
        val lastName = sharedPreferences.getString(KEY_LAST_NAME, DEF_NAME) ?: DEF_NAME

        return UserName(firstName = firstName, lastName = lastName)
    }

}