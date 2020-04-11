package interactor

import repository.RepositoryImpl
import rockPresenter.ErrorPresenter
import rockPresenter.NotImplementedPresenter
import rockPresenter.RockPresenter

class Interactor (
    val repository: RepositoryImpl,
    val rockPresenter: RockPresenter,
    val notImplementedPresenter: NotImplementedPresenter,
    val errorPresenter: ErrorPresenter) {
    fun callRepository(){

    }
}