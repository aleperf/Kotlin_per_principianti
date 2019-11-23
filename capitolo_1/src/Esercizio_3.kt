/* TODO : I ritorno a capo possono essere inserit anche direttamente nelle stringhe aggiungendo la sequenza "\n"
nei punti in cui vogliamo un ritorno a capo, in questo modo anche usando print()
sarà possibile mandare a capo le frasi.
Ad esempio vogliamo scrivere la seguente frase usando solo una volta print():

"Le rose sono rosse,
le viole sono blu,
programmare è divertente,
puoi farlo anche tu!"

Come fare? Inserendo nei punti giusti \n, vedere qui sotto dentro main.

Ora che sapete come fare, stampate la seguente frase, con gli stessi ritorni a capo:
Sto programmando
usando il linguaggio
di programmazione
Kotlin.

* */

fun main() {
    print("Le rose sono rosse\nle viole sono blu\nprogrammare è divertente,\npuoi farlo anche tu!")
}