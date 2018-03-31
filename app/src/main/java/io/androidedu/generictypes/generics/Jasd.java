package io.androidedu.generictypes.generics;

import android.app.Activity;

import io.androidedu.generictypes.inherit.Burger;

/******************************
 * Created by Gökhan ÖZTÜRK   |
 * 31.03.2018                 |
 * GokhanOzturk@AndroidEdu.IO |
 *****************************/
public class Jasd extends Activity {

    private <T,V> T deneme(T item, Class<T> type){

        return type.cast(new GenericFastFood<Burger>());
    }
}
