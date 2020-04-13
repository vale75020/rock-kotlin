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
        repository.callRockDataSource(inputField)
        if (inputField != "") {
            repository.callRockDataSource(inputField)
        }else {
            val message = "This field is required"
            emptyPresenter.callEmptyVue(message)
        }
    }

    fun checkData(response: String?): String?{
        if(response == null){
            errorPresenter.errorPresenter(response)
        }else {
            rockPresenter.presentRock(response)
        }
    }
}