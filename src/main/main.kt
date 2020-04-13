package main

import inputField.InputField
import inputFieldController.InputFieldController
import interactor.Interactor
import repository.RepositoryImpl
import rockDataSource.RockDataSource
import rockPresenter.EmptyPresenter
import rockPresenter.ErrorPresenter
import rockPresenter.RockPresenter
import vue.EmptyVue
import vue.ErrorVue
import vue.RockVue

fun main(){
    val emptyVue = EmptyVue()
    val errorVue = ErrorVue()
    val rockVue = RockVue()
    val errorPresenter = ErrorPresenter(errorVue)
    val emptyPresenter = EmptyPresenter(emptyVue)
    val rockPresenter = RockPresenter(rockVue)
    val rockDataSource = RockDataSource()
    val repository = RepositoryImpl(rockDataSource)
    val interactor = Interactor(repository, rockPresenter, emptyPresenter, errorPresenter)
    val controller = InputFieldController(interactor)
    val inputField = InputField(controller)
    inputField.callInputFieldController("Beatles")

}