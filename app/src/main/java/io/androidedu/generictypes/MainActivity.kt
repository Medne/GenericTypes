package io.androidedu.generictypes

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import io.androidedu.generictypes.generics.GenericFastFood
import io.androidedu.generictypes.generics.GenericFood
import io.androidedu.generictypes.generics.OwnList
import io.androidedu.generictypes.inherit.Burger
import io.androidedu.generictypes.inherit.FastFood
import io.androidedu.generictypes.inherit.Food

/**
 * Generic yapılara parametrelestirilmis veri tipleri denir. (parameterized types)
 * Java icin konusursak Generic'ler sadece object referanslari ile calisir.
 * Yani Java'da Integer arayuzu kullanilirken primitive tip olan int arayuze verilemez.
 * Ayni siniftan turetilmis bile olsalar farkli tiplerde nesneler olabilir.
 * Fonksiyonların geri donus tipi de yine generic olabilir.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val burgerNameList = OwnList<String>()

        burgerNameList.add("BigKing")
        burgerNameList.add("McChicken")
        burgerNameList.add("Kocaman Hamburger")

        val burgerAmountList = OwnList<Double>()

        burgerAmountList.add(4.50)
        burgerAmountList.add(3.75)
        burgerAmountList.add(5.25)

        for (index in burgerNameList.getList().indices) {

            val burgerName = burgerNameList.getList()[index]
            val burgerAmount = burgerAmountList.getList()[index]
            Log.i("Info", "$burgerName 'in fiyatı = $burgerAmount TL")
        }

//        val burgerList = KeyValuePairList<String, Double>()
//
//        burgerList.add("BigKing", 4.50)
//        burgerList.add("McChicken", 3.75)
//        burgerList.add("Kocaman Hamburger", 5.25)
//
//        for(item in burgerList.getList()){
//
//            val burgerName = item.key
//            val burgerAmount = item.value
//            Log.i("Info", "$burgerName 'in fiyatı = $burgerAmount TL")
//        }

        val food = GenericFood<Food>()
//        val food2 = GenericFastFood<Food>()
        val food3 = GenericFood<FastFood>()
        val food4 = GenericFastFood<FastFood>()
        val food5 = GenericFood<Burger>()
        val food6 = GenericFastFood<Burger>()

//        if (food is Food) {
//            if (food2 !is FastFood)
//                if (food6 is Burger) {
//
//                }
//        }
    }

    private fun <T, V> sum(number1: T, number2 : V, type: Class<V>): V {

        return type.cast(number1)
    }
}