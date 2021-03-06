package com.hungps.timxebus.activity.splash

import com.hungps.timxebus.basemvp.BaseMvpContract

/**
 * Created by scit on 11/12/17.
 */

interface SplashContract {

    interface View : BaseMvpContract.View {

    }

    interface Presenter : BaseMvpContract.Presenter<View> {

        fun switchActivityAfter(second : Int)

    }

}