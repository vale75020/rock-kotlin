package rockPresenter

import vue.EmptyVue

class EmptyPresenter(val emptyVue : EmptyVue){
    fun callEmptyVue(message: String){
        emptyVue.emptyVue(message)
    }
}