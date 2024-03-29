package com.example.frasesmotivacionais.data

import com.example.frasesmotivacionais.infra.FrasesmotivacionaisConstants
import kotlin.random.Random

data class Phrase(val description: String, val categoryId: Int)

class Mock {

    private val all = FrasesmotivacionaisConstants.FILTER.ALL
    private val happy = FrasesmotivacionaisConstants.FILTER.HAPPY
    private val sunny = FrasesmotivacionaisConstants.FILTER.SUNNY

    private val mListPhrase = listOf<Phrase>(
        Phrase("Não sabendo que era impossível, foi lá e fez.", happy),
        Phrase("Você não é derrotado quando perde, você é derrotado quando desiste!", happy),
        Phrase("Quando está mais escuro, vemos mais estrelas!", happy),
        Phrase("Insanidade é fazer sempre a mesma coisa e esperar um resultado diferente.", happy),
        Phrase("Não pare quando estiver cansado, pare quando tiver terminado.", happy),
        Phrase("O que você pode fazer agora que tem o maior impacto sobre o seu sucesso?", happy),
        Phrase("A melhor maneira de prever o futuro é inventá-lo.", sunny),
        Phrase("Você perde todas as chances que você não aproveita.", sunny),
        Phrase("Fracasso é o condimento que dá sabor ao sucesso.", sunny),
        Phrase("Enquanto não estivermos comprometidos, haverá hesitação!", sunny),
        Phrase("Se você não sabe onde quer ir, qualquer caminho serve.", sunny),
        Phrase("Se você acredita, faz toda a diferença.", sunny),
        Phrase("Riscos devem ser corridos, porque o maior perigo é não arriscar nada!", sunny),
        Phrase("A felicidade não é algo pronto. Ela é feita das suas próprias ações." , sunny),
        Phrase("Nossa maior fraqueza está em desistir. O caminho mais certo de vencer é tentar mais uma vez." , happy),
        Phrase("Cada segundo é tempo para mudar tudo para sempre! " , happy),
        Phrase("A paz vem de dentro de você. Não a procure à sua volta." , sunny)

    )

    fun getPhrase(value: Int): String {

        val filtered = mListPhrase.filter { it.categoryId == value || value == all }
        return filtered[Random.nextInt(filtered.size)].description
    }

}