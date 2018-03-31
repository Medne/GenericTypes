package io.androidedu.generictypes.generics


/******************************
 * Created by Gökhan ÖZTÜRK   |
 * 31.03.2018                 |
 * GokhanOzturk@AndroidEdu.IO |
 *****************************/
class OwnList<T>{

    private val ownList = ArrayList<T>()

    fun add(value : T){

        ownList.add(value)
    }

    fun getList() : ArrayList<T> = ownList
}