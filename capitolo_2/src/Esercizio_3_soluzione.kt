fun main(){
    //stampate quante pagine riuscite a leggere in mezz'ora
    println(
        //dividiamo 50 per il numero di volte che mezz'ora è contenuta in un'ora
        50/(60/30)  //NOTA: qui le parentesi sono necessarie per stabilire la corretta precedenza
                    //stampa 25
    )
    //dividite il numero di pagine di un volume (1000) per il numero di pagine che leggete in mezz'ora.
    //per ottenere il numero di giorni
    println(
        1000/(50/(60/30)) //NOTA: qui le parentesi sono necessarie per stabilire la corretta precedenza
                          //stampa 40
    )
    //avete 13 volumi, moltiplicate il numero di giorni per 13
    println(
        13 * 1000/(50/(60/30)) //stampa 520
    )
    //usate la integer division per sapere quanti mesi totali vi servono per leggere 13 volumi
    // considerate un mese come composto da 30 giorni
    println(
        (13 * 1000/(50/(60/30)))/30 //stampa 17
    )
    //usate l'operazione modulo per sapere quanti giorni avanzano
    println(
        //qui il vostro codice
        (13 * 1000/(50/(60/30))) % 30 //stampa 10
    )

    //In conclusione vi occorreranno 17 mesi e 10 giorni per leggere tutta l'enciclopedia del fumetto
}