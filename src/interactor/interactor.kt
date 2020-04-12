package interactor

import repository.RepositoryImpl
import rockPresenter.EmptyPresenter
import rockPresenter.ErrorPresenter
import rockPresenter.NotImplementedPresenter
import rockPresenter.RockPresenter

class Interactor (
    val repository: RepositoryImpl,
    val rockPresenter: RockPresenter,
    val notImplementedPresenter: NotImplementedPresenter,
    val emptyPresenter: EmptyPresenter,
    val errorPresenter: ErrorPresenter) {

    fun checkSingers(inputField: String){
        repository.callRockDataSource(inputField)
        if (inputField != "") {
            repository.callRockDataSource(inputField)
        }else {
            val message = "This field is required"
            emptyPresenter.callEmptyVue(message)
        }
    }

    fun checkData(){

    }
}