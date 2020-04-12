package inputField

import inputFieldController.InputFieldController

class InputField (val controller : InputFieldController){
    fun callInputFieldController(inputField : String) {
        controller.callInteractor(inputField)
    }
}