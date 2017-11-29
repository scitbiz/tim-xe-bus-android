package com.hungps.timxebus.activity.search

import com.hungps.timxebus.basemvp.BaseMvpContract

/**
 * Created by scit on 11/12/17.
 */

interface SearchContract {

    interface View : BaseMvpContract.View {

        fun showProgressDialog(show: Boolean)

    }

    interface Presenter : BaseMvpContract.Presenter<View> {

        fun searchRoutes(from: String, to: String)

        fun stopSearchTask()
    }

}