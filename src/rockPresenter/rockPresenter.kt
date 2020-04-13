package rockPresenter

import interactor.Interactor
import vue.RockVue

class RockPresenter(val rockVue: RockVue) {
    fun presentRock(response: String) {
        rockVue.displayRockVue(response)
    }
}