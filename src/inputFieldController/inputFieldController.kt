package inputFieldController

import interactor.Interactor

class InputFieldController(val interactor : Interactor){
    fun callInteractor(inputField: String) {
        interactor.checkSingers(inputField,)
    }
}