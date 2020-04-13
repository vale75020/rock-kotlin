package rockPresenter

import vue.ErrorVue


class ErrorPresenter( val errorVue: ErrorVue) {
    fun errorPresenter(response: String) {
        errorVue.displayVue(response)
    }
}