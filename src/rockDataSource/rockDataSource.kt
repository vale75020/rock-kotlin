package rockDataSource

class RockDataSource() {
    fun rockDataBase(inputField: String): String {
        var rockData = ""
       // if (inputField == null) {
        //    rockData = "Error Server - this type is not supported"
      //  } else {
            if (inputField == "Pink Floyd") {
                rockData =
                    "Pink Floyd est un groupe rock britannique originaire de Londres, en Angleterre. Le groupe a débuté avec un premier album de musique psychédélique pour ensuite bifurquer vers le rock progressif. Formé en 1965, il est considéré comme un pionnier et un représentant majeur de ces styles musicaux. Il est reconnu pour sa musique planante et expérimentale, ses textes philosophiques et satiriques, ses albums-concept et ses performances en concert originales et élaborées. De ses débuts à aujourd'hui, le groupe a vendu plus de 360 millions d'albums à travers le monde2,3. Aux seuls États-Unis, les ventes des albums de Pink Floyd sont dénombrées par la RIAA à hauteur de 85 millions d'exemplaires"
            } else if (inputField == "Led Zeppelin") {
                rockData =
                    "Led Zeppelin est un groupe de rock britannique, originaire de Londres, en Angleterre. Il est fondé en 1968 par Jimmy Page (guitare), avec Robert Plant (chant), John Paul Jones (basse, claviers) et John Bonham (batterie), et dissous à la suite de la mort de ce dernier, en 1980. À travers un son dominé par la virtuosité et les riffs de son guitariste, la voix puissante de son chanteur pouvant aller jusqu'à des octaves très élevées, par l'excellence de son bassiste/claviériste/arrangeur ainsi que par la technique, le groove et l'inimitable et si souvent samplée « force de frappe » de son batteur, Led Zeppelin est toujours considéré, quarante ans après sa séparation, comme l'un des plus grands groupes de rock tant pour sa réussite artistique, son succès commercial que pour son influence et son prestige."
            } else if (inputField == "Beatles") {
                rockData =
                    "The Beatles est un groupe musical britannique, originaire de Liverpool, en Angleterre. Formé en 1960, et composé de John Lennon, Paul McCartney, George Harrison et Ringo Starr, il est considéré comme le groupe le plus populaire et influent de l'histoire du rock. En dix ans d'existence et seulement sept ans d'enregistrement (de 1962 à 1969)a, les Beatles ont enregistré douze albums originaux et composé près de 200 chansons majoritairement écrites par le tandem Lennon/McCartney, dont le succès dans l'histoire de l'industrie discographique reste inégalé."
            } else {
                rockData = "No singers with this name in this database still"
            }
      //  }
        return rockData
    }
}

