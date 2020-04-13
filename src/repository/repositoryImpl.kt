package repository

import rockDataSource.RockDataSource

class RepositoryImpl(val rockDataSource: RockDataSource): Repository{
    override fun callRockDataSource(inputField: String) {
        rockDataSource.rockDataBase(inputField)
    }

}