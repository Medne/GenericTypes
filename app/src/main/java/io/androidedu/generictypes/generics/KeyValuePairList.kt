package io.androidedu.generictypes.generics


/******************************
 * Created by Gökhan ÖZTÜRK   |
 * 31.03.2018                 |
 * GokhanOzturk@AndroidEdu.IO |
 *****************************/

class KeyValuePairList<T, V> {

    private val ownList = ArrayList<KeyValuePair<T, V>>()

    fun add(key: T, value: V) {

        val keyValuePair = KeyValuePair<T, V>(key, value)
        ownList.add(keyValuePair)
    }

    fun getList(): ArrayList<KeyValuePair<T, V>> = ownList
}