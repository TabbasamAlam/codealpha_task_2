package com.example.languagelearningapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Noun() {
    var back by remember { mutableStateOf(false) }//This var is for back button
    if (back == true) {
        PartofSpeech()
    } else {
        LazyColumn()
        {
            item {
                backButton(onClick = { back = true })
                headingOrstructureFormula(head = "Defination:")
                definationandExample(
                    defination = "A noun is a word used to name a person, animal, place, thing, profession or an idea." +
                            "Name of most of the things around us are noun."
                )
                headingOrstructureFormula(head = "Example:")
                definationandExample(defination = "Ahmed , table, apple , india,rocket,oxygen, doctor etc.")
                headingOrstructureFormula(head = "Types of Noun:")
                definationandExample(
                    defination = "There are many types of noun like Countable & Uncountable noun," +
                            "Gender noun,Common noun, Proper noun and Collective Noun."
                )
                headingOrstructureFormula(head = "Proper Noun:")
                definationandExample(
                    defination = "Name of any particular person, place or a thing is called a Proper Noun." +
                            "First letter of a proper noun is always written in capital letters."
                )
                headingOrstructureFormula(head = "Example:")
                definationandExample(defination = "Muzaffarabad is capital of Azad jammu & Kashmir.")
                definationandExample(defination = "Saad is doctor.")
                definationandExample(defination = "In above example Muzaffarabad , Azad jammu & Kashmir, Saad is example of Proper noun.")

                headingOrstructureFormula(head = "Common Noun:")
                definationandExample(defination = "Name of any common person, place or a thing is called a Common Noun.")
                headingOrstructureFormula(head = "Example:")
                definationandExample(defination = "Muzaffarabad is capital of Azad jammu & Kashmir.")
                definationandExample(defination = "Saad is doctor.")
                definationandExample(defination = "In above example capital, doctor is example of Common noun.")

                headingOrstructureFormula(head = "Countable & Uncountable Noun:")
                definationandExample(
                    defination = "The nouns which can be counted is called Countable noun." +
                            "The nouns which can not be counted is called Uncountable noun."
                )
                headingOrstructureFormula(head = "Example:")
                definationandExample(defination = "5kg suger is enough for tea.")
                definationandExample(defination = "Their are many stars in our universe.")
                definationandExample(defination = "In above example 5kg sugar is countable , stars are uncountable noun.")

                headingOrstructureFormula(head = "Collective Noun:")
                definationandExample(
                    defination = "When single name represent group of people or group of things then this " +
                            " is called a Collective Noun."
                )
                headingOrstructureFormula(head = "Example:")
                definationandExample(defination = "Our team won the match.")
                definationandExample(defination = "Army is more powerful then police.")
                definationandExample(defination = "In above example team, army and police are example of Collective noun.")
            }
        }
    }
}

@Composable
fun Pronoun() {
    var back by remember { mutableStateOf(false) }//This var is for back button
    if (back == true) {
        PartofSpeech()
    } else {
        LazyColumn()
        {
            item {
                backButton(onClick = { back = true })
                headingOrstructureFormula(head = "Defination:")
                definationandExample(
                    defination = "The words which can be used instead of nouns or" +
                            "The words which can replace noun is called Pronoun."
                )
                headingOrstructureFormula(head = "Example:")
                definationandExample(defination = "He/She/it/i/you/we/they, this that, myself,us me etc are example of pronoun")
                important(importantpoint = "This is most important Table related to pronoun!")
                Image(painter = painterResource(id = R.drawable.pronoun),
                    contentDescription ="pronoun table",
                    modifier= Modifier
                        .size(500.dp)
                        .fillMaxWidth()
                        )
                moreDetails(string = "www.pronoun.com")
            }
        }
    }
}

@Composable
fun Verb() {
    var back by remember { mutableStateOf(false) }//This var is for back button
    if (back==true)
    {
        PartofSpeech()
    }
    else
    {
        LazyColumn()
        {
            item {
                backButton(onClick = { back = true })
                headingOrstructureFormula(head = "Defination:")
                definationandExample(
                    defination = "Any word which shows some action or doing of some work is called a verb."
                )
                headingOrstructureFormula(head = "Example:")
                definationandExample(defination = "go, sleep, act, use, sink , cook , get, aim , accept, born etc are example of verb.")
                important(importantpoint = "Also visit verbs of verb in this app!")
                headingOrstructureFormula(head = "Helping verb:")
                definationandExample(defination = "There are also some words, which are used to help a verb, that why it is called " +
                        "helping verbs.")
                definationandExample(defination = "is, am, are, was, were, will etc are helping verbs.")
                definationandExample(defination = "I am not lying.")
                definationandExample(defination = "You are greet.")
                definationandExample(defination = "We was playing football.")
                definationandExample(defination = "He will going to market.")
                headingOrstructureFormula(head = "Some important helping verbs:")
                important(importantpoint = "do, does are used in simple present.")
                important(importantpoint = "did, are used in simple past.")
                important(importantpoint = "'will/shall' are used in simple future.")
                important(importantpoint = "(is/am/are) are used in  present continuous.")
                important(importantpoint = "(was/were/) are used in  past continuous.")
                important(importantpoint = "(will be/shall be)  are used in future continuous.")
                important(importantpoint = "(has/have) are used in present perfect.")
                important(importantpoint = "(had) are used in past perfect.")
                important(importantpoint = "(will/shall has/will/shall have) are used in future perfect.")
                important(importantpoint = "(has been/ have been) are used in present perfect continuous.")
                important(importantpoint = "(had been) are used in past perfect continuous.")
                important(importantpoint = "(will/shal has been/will/shall have been) are used in future perfect continuous.")
                headingOrstructureFormula(head = "For more details:")
                moreDetails(string = "www.verbs in details.com")
            }
        }
    }
}
@Composable
fun Adjective() {var back by remember { mutableStateOf(false) }//This var is for back button
    if (back==true)
    {
        PartofSpeech()
    }
    else
    {
        LazyColumn()
        {
            item {
                backButton(onClick = { back = true })
                headingOrstructureFormula(head = "Defination:")
                definationandExample(
                    defination = "Adjective are words that describe any quality, colro, shape, quantity or size of a noun or pronoun."
                )
                headingOrstructureFormula(head = "Example:")
                definationandExample(defination = "strange, greedy, pure, beatiful, tall, small , white etc. are example of Adjective.")
                definationandExample(defination = "He is a tall man.")
                definationandExample(defination = "She is very beatiful.")
                definationandExample(defination = "Today i met with strange man.")
                headingOrstructureFormula(head = "Degree of Adjective:")
                definationandExample(defination = "There are three kind of degree of adjective e.g. simple, Comparative and superlative.")
                headingOrstructureFormula(head = "Comparative form:")
                definationandExample(defination = "Comparative form is used to compare two noun or pronoun:")
                headingOrstructureFormula(head = "Example:")
                definationandExample(defination = "My father is more educated then my mother.")
                headingOrstructureFormula(head = "Superlative form:")
                definationandExample(defination = "Superlative form is uded to compare three or more nouns or pronouns.")
                headingOrstructureFormula(head = "Example:")
                definationandExample(defination = "He is the most efficient employee of this organization.")
                definationandExample(defination = "Muzaffarabad is most beatiful among all the cities of AJK.")
                headingOrstructureFormula(head = "For more deatils visit:")
                moreDetails(string = "www.adjective.com")
            }
        }
    }
}

@Composable
fun Adverb() {
    var back by remember { mutableStateOf(false) }//This var is for back button
    if (back==true)
    {
        PartofSpeech()
    }
    else
    {
        LazyColumn()
        {
            item {
                backButton(onClick = { back = true })
                headingOrstructureFormula(head = "Defination:")
                definationandExample(
                    defination = "An Adverb adds something to the meaning of any part of speech except a noun or a" +
                            "pronoun."
                )
                headingOrstructureFormula(head = "Example:")
                definationandExample(defination = "too cold, already, carefully etc are the Adverb.")
                important(importantpoint = "Often these adverbs are formed by adding 'ly' to the end of an adjective.")
                headingOrstructureFormula(head = "Types of Adverb:")
                headingOrstructureFormula(head = "Adverbs of Manner:")
                definationandExample(defination = "Some Adverbs tell us how an action is or should be performed." +
                        "Such adverbs are called the 'Adverbs of Manner'.")
                headingOrstructureFormula(head = "Example:")
                definationandExample(defination = "He is shouting angrily.")
                definationandExample(defination = "Mother is cooking carefully.")
                definationandExample(defination = "Aslam is definitely in severe pain.")
                definationandExample(defination = "Frankly, this dress makes you look fat.")
                definationandExample(defination = "He hesitantly told me the whole story.")
                headingOrstructureFormula(head = "Adverbs of Time:")
                definationandExample(defination = "Some adverbs tell us when something happened or tell us about time." +
                        "Such adverbs are calledk 'Adverbs of Time'")
                headingOrstructureFormula(head = "Example:")
                definationandExample(defination = "Finally i won the game.")
                definationandExample(defination = "He has already sold the car.")
                definationandExample(defination = "I'm trying to get back before dark.")
                definationandExample(defination = "He performs his duty all night.")
                definationandExample(defination = "She's presently engaged in study.")
            }
        }
    }
}
@Composable
fun Preposition() {
    var back by remember { mutableStateOf(false) }//This var is for back button
    if (back == true) {
        PartofSpeech()
    } else {
        LazyColumn()
        {
            item {
                backButton(onClick = { back = true })
                headingOrstructureFormula(head = "Defination:")
                definationandExample(
                    defination = "The words or group of words, which are used to show position, time or place of a noun or " +
                            "pronoun are called Preposition. A preposition is also used to indicate the relation of a word " +
                            "to other words i a sentence."
                )
                headingOrstructureFormula(head = "Example:")
                definationandExample(defination = "upon, under, near, to,from,in,on, by, until, before, without,via ," +
                        " between,of, at,for, over, tham , but, down etc. are prepositon words.")
                headingOrstructureFormula(head = "Example:")
                definationandExample(defination = "He walked in with his new friend.")
                definationandExample(defination = "The decision is up to the both of them.")
                definationandExample(defination = "They will go via Mirpur.")
                definationandExample(defination = "I live in Muzaffarabad.")
                definationandExample(defination = "It started raining towards the evening.")
                definationandExample(defination = "This road is under repair.")
                definationandExample(defination = "The ball is on the table.")
                definationandExample(defination = "The airplane above the city.")
                definationandExample(defination = "Outside the house lies a beautiful garden.")
                definationandExample(defination = "Throughout winter, she has been sick.")
                headingOrstructureFormula(head = "For more details visit.")
                moreDetails(string = "www.prepositon.com")
            }
        }
    }
}

@Composable
fun Conjection() {
    var back by remember { mutableStateOf(false) }//This var is for back button
    if (back==true)
    {
        PartofSpeech()
    }
    else
    {
        LazyColumn()
        {
            item {
                backButton(onClick = { back = true })
                headingOrstructureFormula(head = "Defination:")
                definationandExample(
                    defination = "Conjuction is a word used for joining together two words,phrass or sentences."
                )
                headingOrstructureFormula(head = "Example:")
                definationandExample(defination = "You have a car and a big house.")
                definationandExample(defination = "Zeshan and Arshan both are brother.")
                definationandExample(defination = "She is tired but she cannot sleep.")
                definationandExample(defination = "In above example and , but both are the example of conjection.")
                headingOrstructureFormula(head = "Neither, Nor:")
               definationandExample(defination = "Neithe she nor her mother is present in the house.")
                headingOrstructureFormula(head = "As soon as:")
                definationandExample(defination = "As soon as the thief saw the policeman, he ran away.")
                headingOrstructureFormula(head = "Although:")
                definationandExample(defination = "Although the children were sleepy, they kept watching TV.")
                definationandExample(defination = "Similarly some other also a conjection like nevertheless, No sooner, though etc.")

            }
        }
    }
}
@Composable
fun Interjection() {
    var back by remember { mutableStateOf(false) }//This var is for back button
    if (back == true) {
        PartofSpeech()
    } else {
        LazyColumn()
        {
            item {
                backButton(onClick = { back = true })
                headingOrstructureFormula(head = "Defination:")
                definationandExample(
                    defination = "Interjection is just an exclamatory sound(or word)," +
                            "put iin a sentence to add strong feeling or emotions into it."
                )
                headingOrstructureFormula(head = "Example:")
                definationandExample(defination = "Ew! What a bore movie!")
                definationandExample(defination = "Argh! i messed this work up again!")
                definationandExample(defination = "Hurrah! We won the match.")
                important(importantpoint = "At the end of conjection-> !")
                definationandExample(defination = "Darn! Another fish got away!")
                definationandExample(defination = "Reallly! Are you sure he has left?")
                headingOrstructureFormula(head = "Certain phrases also act as conjection:")
                definationandExample(defination = "That's amazing!")
                definationandExample(defination = "Stop that!")
                definationandExample(defination = "Oh dear!")
            }
        }
    }
}