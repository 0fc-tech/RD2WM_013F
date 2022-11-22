package com.example.mod3tp4notes

fun main() {
    //moyenneNbValeurs()
    moyenneJusquaMoinsUn()
}

fun moyenneNbValeurs(){
    val arrayListNotes = arrayListOf<Float>()
    println("Entrez le nombre de valeurs :")
    //Récupérer le nombre de notes
    val nbValeursInput = readln()

    val nbValeursInt = nbValeursInput.toIntOrNull()
    if(nbValeursInt == null){
        println("Merci de rentrer une valeur entière")
        moyenneNbValeurs()
        return
    }
    for (i in 1..nbValeursInt){
        //Demander x valeurs et les stocker dans une liste de Notes
        println("Valeur :")
        val noteFloat = readln().toFloatOrNull()
        if(noteFloat == null){
            println("Merci de rentrer une note sous le format 12.52")
            moyenneNbValeurs()
            return
        }
        arrayListNotes.add(noteFloat)
    }

    println("La moyenne est de ${arrayListNotes.sum() / arrayListNotes.size}")
    //Puis calculer la moyenne et l'afficher

}

fun moyenneJusquaMoinsUn(){
    val arrayListNotes = arrayListOf<Float>()
    var noteFloat = 0f
    while (noteFloat != -1f){
        println("Note (-1 pour terminer)")
        noteFloat = readln().toFloatOrNull() ?: -1f
        if(noteFloat == -1f) {
            continue
        }
        arrayListNotes.add(noteFloat)
    }

    println("La moyenne est de ${arrayListNotes.sum() / arrayListNotes.size}")

}