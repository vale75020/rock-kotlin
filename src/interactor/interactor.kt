package interactor

import repository.RepositoryImpl
import rockPresenter.EmptyPresenter
import rockPresenter.ErrorPresenter
import rockPresenter.RockPresenter

class Interactor (
    val repository: RepositoryImpl,
    val rockPresenter: RockPresenter,
    val emptyPresenter: EmptyPresenter,
    val errorPresenter: ErrorPresenter) {

    fun checkSingers(inputField: String){
        val res: String = repository.callRockDataSource(inputField).toString()
        if(inputField == "") {
            val message = "This field is required"
            emptyPresenter.callEmptyVue(message)
        }
        else if (inputField != "") {
            rockPresenter.presentRock(res)
        }else {
            errorPresenter.errorPresenter(res)
        }
    }
}