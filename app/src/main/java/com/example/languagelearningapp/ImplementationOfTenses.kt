package com.example.languagelearningapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SimplePresent() {
    var back by rememberSaveable { mutableStateOf(false) }//This var is for back button

    if (back == true) {
        TypesOfPresentTenses()
    } else {
        LazyColumn()
        {
            item {
                backButton(onClick = { back = true })
                headingOrstructureFormula(head = "Defination:")
                definationandExample(
                    defination = "Simple Present tense is used to talk about things and ongoing works in general." +
                            " We use it to say that something is true in general."
                )
                headingOrstructureFormula(head = "Formula/Structure:")
                fourSentences(
                    forWhat = "Affirmative sentences",
                    formula = "subject + verb1 + object"
                )
                fourSentences(
                    forWhat = "Nagative sentences",
                    formula = "subject + do not + verb1 + object"
                )
                fourSentences(
                    forWhat = "Introgative sentences",
                    formula = "Do + subject + verb1 + object"
                )
                fourSentences(
                    forWhat = "Nagative introgativer sentences",
                    formula = "Do + subject + not + verb1 + object"
                )
                important(importantpoint = "Remember!")
                important(importantpoint = "He,She and it or any single noun use s/es with first form of verb")
                headingOrstructureFormula(head = "Example:")
                definationandExample(defination = "I go to School.")
                definationandExample(defination = "You eat meal.")
                definationandExample(defination = "He plays the cricket.")
                definationandExample(defination = "She cooks the meal.")
                definationandExample(defination = "Arshan reads the book.")
                definationandExample(defination = "Ali and Kamran write their assignment.")
                important(importantpoint = "When s/es use with do then no need to use s/es with verb1.")
                definationandExample(defination = "Does he use their cell phone?")
            }
        }
    }
}

@Composable
fun PresentContinues() {
    var back by remember { mutableStateOf(false) }//This var is for back button
    if (back == true) {
        TypesOfPresentTenses()
    } else {
        LazyColumn()
        {
            item {
                backButton(onClick = { back = true })
                headingOrstructureFormula(head = "Defination:")
                definationandExample(
                    defination = "We use Present continuous tense to tell the actions which are happening at or " +
                            "around the moment of speaking.We also use this tense to talk about any fixed arrangements" +
                            " in the near future."
                )
                headingOrstructureFormula(head = "Formula/Structure:")
                fourSentences(
                    forWhat = "Affirmative sentences",
                    formula = "subject + helping verb(is/am/are)+ verb1 with ing + object"
                )
                fourSentences(
                    forWhat = "Nagative sentences",
                    formula = "subject + helping verb(is/am/are)+ not + verb1 with ing + object"
                )
                fourSentences(
                    forWhat = "Introgative sentences",
                    formula = "helping verb(is/am/are)+ subject + verb1 with ing + object"
                )
                fourSentences(
                    forWhat = "Nagative introgativer sentences",
                    formula = "helping verb(is/am/are) + subject + not + verb1 with ing + object"
                )
                important(importantpoint = "Remember!")
                important(importantpoint = "He,She and it or any single noun used 'is' (helping verb).")
                important(importantpoint = "'Am' use with only I ")
                important(importantpoint = "Rest of all plural use 'are'")
                headingOrstructureFormula(head = "Example:")
                definationandExample(defination = "I am going to School.")
                definationandExample(defination = "You are eating meal.")
                definationandExample(defination = "He is playing cricket.")
                definationandExample(defination = "She is cooking the meal.")
                definationandExample(defination = "Arshan is reading the book.")
                definationandExample(defination = "Ali and Kamran  are writing their assignment.")
                definationandExample(defination = "Are they writing their assignment?")
                definationandExample(defination = "Is she not meating with her brother?")
            }
        }
    }
}

@Composable
fun PresentPerfect() {
    var back by remember { mutableStateOf(false) }//This var is for back button
    if (back == true) {
        TypesOfPresentTenses()
    } else {
        LazyColumn()
        {
            item {
                backButton(onClick = { back = true })
                headingOrstructureFormula(head = "Defination:")
                definationandExample(
                    defination = "We use Present perfect tense to tell the actions which have completed recently in present."
                )
                headingOrstructureFormula(head = "Formula/Structure:")
                fourSentences(
                    forWhat = "Affirmative sentences",
                    formula = "subject + has/have + verb3 + object"
                )
                fourSentences(
                    forWhat = "Nagative sentences",
                    formula = "subject + has/have + not + verb3 + object"
                )
                fourSentences(
                    forWhat = "Introgative sentences",
                    formula = "has/have+ subject + verb3 + object"
                )
                fourSentences(
                    forWhat = "Nagative introgativer sentences",
                    formula = "has/have + subject + not + verb3 + object"
                )
                important(importantpoint = "Remember!")
                important(importantpoint = "He,She and it or any single noun used 'has'.")
                important(importantpoint = "I and You always use 'have' ")
                important(importantpoint = "Rest of all plural use 'have'")
                headingOrstructureFormula(head = "Example:")
                definationandExample(defination = "I have gone to School.")
                definationandExample(defination = "You have eaten meal.")
                definationandExample(defination = "He has played cricket.")
                definationandExample(defination = "She has cooked the meal.")
                definationandExample(defination = "Arshan has read the book.")
                definationandExample(defination = "Ali and Kamran  have written their assignment.")
                definationandExample(defination = "Has he worked very hard?")
                definationandExample(defination = "Have we knocked the door?")
            }
        }
    }
}

@Composable
fun PresentPerfectContinueus() {
    var back by remember { mutableStateOf(false) }//This var is for back button
    if (back==true)
    {
        TypesOfPresentTenses()
    }
    else
    {
        LazyColumn()
        {
            item {
                backButton(onClick = { back = true })
                headingOrstructureFormula(head = "Defination:")
                definationandExample(
                    defination = "We use Present perfect continuous tense to tell about the actions which are" +
                            " presently continuous from a specific time or duration."
                )
                headingOrstructureFormula(head = "Formula/Structure:")
                fourSentences(
                    forWhat = "Affirmative sentences",
                    formula = "subject + has/have + been + verb1 with ing + object + since/for"
                )
                fourSentences(
                    forWhat = "Nagative sentences",
                    formula = "subject + has/have + not + been + verb1 with ing + object + since/for"
                )
                fourSentences(
                    forWhat = "Introgative sentences",
                    formula = " has/have + subject + been + verb1 with ing + object + since/for"
                )
                fourSentences(
                    forWhat = "Nagative introgativer sentences",
                    formula = "has/have + subject + not + been + verb1 with ing + object + since/for"
                )
                important(importantpoint = "Remember!")
                important(importantpoint = "He,She and it or any single noun used 'has been'.")
                important(importantpoint = "I and You always use 'have been' ")
                important(importantpoint = "Rest of all plural use 'have been'")
                important(importantpoint = "Since-> Exact/fix/Definite timing")
                important(importantpoint = "For->Indefinite timing")
                headingOrstructureFormula(head = "Example:")
                definationandExample(defination = "I have been going to School for 30 minutes.")
                definationandExample(defination = "You have been eating meal since morning.")
                definationandExample(defination = "He has  been playing cricket since 1980.")
                definationandExample(defination = "She has been cooking the meal for 2 hours.")
                definationandExample(defination = "Arshan has been reading the book for five days.")
                definationandExample(defination = "Ali and Kamran  have been writing their assignment since 4th january 2022.")
                definationandExample(defination = "Has Danish been finishing their  work since Monday?")
                definationandExample(defination = "Have we been not hearing you for two days?")
            }
        }
    }
}

@Composable
fun SimplePast() {
    var back by remember { mutableStateOf(false) }//This var is for back button
    if (back == true) {
        TypesOfPastTenses()
    } else {
        LazyColumn()
        {
            item {
                backButton(onClick = { back = true })
                headingOrstructureFormula(head = "Defination:")
                definationandExample(
                    defination = "We use Simple past tense to talk about the events in the past that are now finished."
                )
                headingOrstructureFormula(head = "Formula/Structure:")
                fourSentences(
                    forWhat = "Affirmative sentences",
                    formula = "subject + verb2 + object"
                )
                important(importantpoint = "After did always use verb1")
                fourSentences(
                    forWhat = "Nagative sentences",
                    formula = "subject + did not + verb1 + object"
                )
                fourSentences(
                    forWhat = "Introgative sentences",
                    formula = "Did + subject + verb1 + object"
                )
                fourSentences(
                    forWhat = "Nagative introgativer sentences",
                    formula = "Did + subject + not + verb1 + object"
                )
                important(importantpoint = "Remember!")
                important(importantpoint = "Verb2 is used only in simple past or past indefinite")
                headingOrstructureFormula(head = "Example:")
                definationandExample(defination = "I went to School.")
                definationandExample(defination = "You ate meal.")
                definationandExample(defination = "He played the cricket.")
                definationandExample(defination = "She cooked the meal.")
                definationandExample(defination = "Arshan read the book.")
                definationandExample(defination = "Ali and Kamran wrote their assignment.")
                definationandExample(defination = "Did you forget my mistake?")
                definationandExample(defination = "Did we not go to market?")
            }
        }
    }
}

@Composable
fun PastContinous() {
    var back by remember { mutableStateOf(false) }//This var is for back button
    if (back == true) {
        TypesOfPastTenses()
    } else {
        LazyColumn()
        {
            item {
                backButton(onClick = { back = true })
                headingOrstructureFormula(head = "Defination:")
                definationandExample(
                    defination = "We use Past continuous tense to tell the actions which were happening in the past."
                )
                headingOrstructureFormula(head = "Formula/Structure:")
                fourSentences(
                    forWhat = "Affirmative sentences",
                    formula = "subject + was/were + verb1 with ing + object"
                )
                fourSentences(
                    forWhat = "Nagative sentences",
                    formula = "subject + was/were + not + verb1 with ing + object"
                )
                fourSentences(
                    forWhat = "Introgative sentences",
                    formula = "was/were + subject + verb1 with ing + object"
                )
                fourSentences(
                    forWhat = "Nagative introgativer sentences",
                    formula = "was/were + subject + not + verb1 with ing + object"
                )
                important(importantpoint = "Remember!")
                important(importantpoint = "He/She/it and single noun used 'was'")
                important(importantpoint = "You always used 'were'")
                important(importantpoint = "Rest all plural use 'were'")
                headingOrstructureFormula(head = "Example:")
                definationandExample(defination = "I was going to School.")
                definationandExample(defination = "You were eating meal.")
                definationandExample(defination = "He was playing cricket.")
                definationandExample(defination = "She was cooking meal.")
                definationandExample(defination = "Arshan was reading book.")
                definationandExample(defination = "Ali and Kamran  were writing their assignment.")
                definationandExample(defination = "Were you writing a notebook?")
                definationandExample(defination = "Was Akram not geting my point?")
            }
        }
    }
}

@Composable
fun PastPerfect() {
    var back by remember { mutableStateOf(false) }//This var is for back button
    if (back==true)
    {
        TypesOfPastTenses()
    }
    else
    {
        LazyColumn()
        {
            item {
                backButton(onClick = { back = true })
                headingOrstructureFormula(head = "Defination:")
                definationandExample(
                    defination = "We use Present perfect tense to tell the actions which have completed in past."
                )
                headingOrstructureFormula(head = "Formula/Structure:")
                fourSentences(
                    forWhat = "Affirmative sentences",
                    formula = "subject + had + verb3 + object"
                )
                fourSentences(
                    forWhat = "Nagative sentences",
                    formula = "subject + had + not + verb3 + object"
                )
                fourSentences(
                    forWhat = "Introgative sentences",
                    formula = "had + subject +  verb3 + object"
                )
                fourSentences(
                    forWhat = "Nagative introgativer sentences",
                    formula = "had + subject + not +  verb3 + object"
                )
                headingOrstructureFormula(head = "Example:")
                definationandExample(defination = "I had gone to School.")
                definationandExample(defination = "You had eaten meal.")
                definationandExample(defination = "He had played cricket.")
                definationandExample(defination = "She had cooked meal.")
                definationandExample(defination = "Arshan had read book.")
                definationandExample(defination = "Ali and Kamran  had written their assignment.")
                definationandExample(defination = "Had we found her address?")
            }
        }
    }
}

@Composable
fun PastPerfectContinueus() {
    var back by remember { mutableStateOf(false) }//This var is for back button
    if (back==true)
    {
        TypesOfPastTenses()
    }
    else
    {
        LazyColumn()
        {
            item {
                backButton(onClick = { back = true })
                headingOrstructureFormula(head = "Defination:")
                definationandExample(
                    defination = "We use Past perfect continuous tense to tell about the actions " +
                            "which were continuous in the past for a specific period of time ."
                )
                headingOrstructureFormula(head = "Formula/Structure:")
                fourSentences(
                    forWhat = "Affirmative sentences",
                    formula = "subject + had been + verb1 with ing + object + since/for"
                )
                fourSentences(
                    forWhat = "Nagative sentences",
                    formula = "subject + had + not + been + verb1 with ing + object + since/for"
                )
                fourSentences(
                    forWhat = "Introgative sentences",
                    formula = "had + subject + been + verb1 with ing + object + since/for"
                )
                fourSentences(
                    forWhat = "Nagative introgativer sentences",
                    formula = "had + subject + not + been + verb1 with ing + object + since/for"
                )
                important(importantpoint = "Remember!")
                important(importantpoint = "Since-> Exact/fix/Definite timing")
                important(importantpoint = "For->Indefinite timing")
                headingOrstructureFormula(head = "Example:")
                definationandExample(defination = "I had been going to School for two hourse.")
                definationandExample(defination = "You had been eating meal since evening.")
                definationandExample(defination = "He had been playing cricket since 2000.")
                definationandExample(defination = "She had been cooking meal for 30 minutes.")
                definationandExample(defination = "Arshan had been reading book for 5 days.")
                definationandExample(defination = "Ali and Kamran had been writing their assignment since 19 August.")
                definationandExample(defination = "Had she not been sleeping on bed for one week?")
            }
        }
    }
}

@Composable
fun SimpleFuture() {
    var back by remember { mutableStateOf(false) }//This var is for back button
    if (back==true)
    {
        TypesOfFutureTenses()
    }
    else
    {
        LazyColumn()
        {
            item {
                backButton(onClick = { back = true })
                headingOrstructureFormula(head = "Defination:")
                definationandExample(
                    defination = "We use Simple future tense to talk about the things and works which will take place in future."
                )
                headingOrstructureFormula(head = "Formula/Structure:")
                fourSentences(
                    forWhat = "Affirmative sentences",
                    formula = "subject + will/shall + verb1 + object"
                )
                fourSentences(
                    forWhat = "Nagative sentences",
                    formula = "subject + will/shall + not + verb1 + object"
                )
                fourSentences(
                    forWhat = "Introgative sentences",
                    formula = "will/shall + subject + verb1 + object"
                )
                fourSentences(
                    forWhat = "Nagative introgativer sentences",
                    formula = "will/shall + subject + not + verb1 + object"
                )
                important(importantpoint = "Remember!")
                important(importantpoint = "Generally i and we use 'shall' but 'will' also is correct")
                headingOrstructureFormula(head = "Example:")
                definationandExample(defination = "I shall go to School.")
                definationandExample(defination = "You will eat meal.")
                definationandExample(defination = "He will play cricket.")
                definationandExample(defination = "She will cook meal.")
                definationandExample(defination = "Arshan will read book.")
                definationandExample(defination = "Ali and Kamran will write their assignment.")
                definationandExample(defination = "Shall we keep quite?")
            }
        }
    }
}

@Composable
fun FutureContinueus() {
    var back by remember { mutableStateOf(false) }//This var is for back button
    if (back == true) {
        TypesOfFutureTenses()
    } else {
        LazyColumn()
        {
            item {
                backButton(onClick = { back = true })
                headingOrstructureFormula(head = "Defination:")
                definationandExample(
                    defination = "We use Future continuous tense to talk about an ongoing action at a partivular moment in the future." +
                            "The action will start before that moment but will not have finished at that moment."
                )
                headingOrstructureFormula(head = "Formula/Structure:")
                fourSentences(
                    forWhat = "Affirmative sentences",
                    formula = "subject + will/shall + be + verb1 with ing + object"
                )
                fourSentences(
                    forWhat = "Nagative sentences",
                    formula = "subject + will/shall + not + be + verb1 with ing + object"
                )
                fourSentences(
                    forWhat = "Introgative sentences",
                    formula = "will/shall + subject + be + verb1 with ing + object"
                )
                fourSentences(
                    forWhat = "Nagative introgativer sentences",
                    formula = "will/shall + subject + not + be + verb1 with ing + object"
                )
                important(importantpoint = "Remember!")
                important(importantpoint = "Generally i and we use 'shall' but 'will' also is correct")
                important(importantpoint = "be-> should be use with will/shall")
                headingOrstructureFormula(head = "Example:")
                definationandExample(defination = "I shall going to School.")
                definationandExample(defination = "You will eating meal.")
                definationandExample(defination = "He will playing cricket.")
                definationandExample(defination = "She will cooking meal.")
                definationandExample(defination = "Arshan will reading book.")
                definationandExample(defination = "Ali and Kamran  will writing their assignment.")
                definationandExample(defination = "Will they not runing very fast?")
            }
        }
    }
}

@Composable
fun FuturePerfect() {
    var back by remember { mutableStateOf(false) }//This var is for back button
    if (back == true) {
        TypesOfFutureTenses()
    } else {
        LazyColumn()
        {
            item {
                backButton(onClick = { back = true })
                headingOrstructureFormula(head = "Defination:")
                definationandExample(
                    defination = "We use Future perfect tense to tell the actions which will be completed in future."
                )
                headingOrstructureFormula(head = "Formula/Structure:")
                fourSentences(
                    forWhat = "Affirmative sentences",
                    formula = "subject + will/shall + has/have + verb3 + object"
                )
                fourSentences(
                    forWhat = "Nagative sentences",
                    formula = "subject + will/shall + not + has/have + verb3 + object"
                )
                fourSentences(
                    forWhat = "Introgative sentences",
                    formula = " will/shall + subject + has/have + verb3 + object"
                )
                fourSentences(
                    forWhat = "Nagative introgativer sentences",
                    formula = "will/shall + subject + not + has/have + verb3 + object"
                )
                important(importantpoint = "Remember!")
                important(importantpoint = "He,She and it or any single noun used ' will has'.")
                important(importantpoint = "I and We always use ' shall have' ")
                important(importantpoint = "You always use ' will have' ")
                important(importantpoint = "Rest of all plural use ' will have'")
                headingOrstructureFormula(head = "Example:")
                definationandExample(defination = "I shall have gone to School.")
                definationandExample(defination = "You will have eaten meal.")
                definationandExample(defination = "He will has played cricket.")
                definationandExample(defination = "She will has cooked the meal.")
                definationandExample(defination = "Arshan will has read the book.")
                definationandExample(defination = "Ali and Kamran will have written their assignment.")
                definationandExample(defination = "Shall we have drunk all the water?")
                definationandExample(defination = "Will he not has brought all the goods?")
            }
        }
    }
}

@Composable
fun FuturePerfectContinueus() {
    var back by remember { mutableStateOf(false) }//This var is for back button
    if (back==true)
    {
        TypesOfFutureTenses()
    }
    else
    {
        LazyColumn()
        {
            item {
                backButton(onClick = { back = true })
                headingOrstructureFormula(head = "Defination:")
                definationandExample(
                    defination = "We use Future perfect continuous tense to tell about the actions which will be " +
                            "continuous in the future for a specific period of time."
                )
                headingOrstructureFormula(head = "Formula/Structure:")
                fourSentences(
                    forWhat = "Affirmative sentences",
                    formula = "subject + will/shall + has/have + been + verb1 with ing + object + since/for"
                )
                fourSentences(
                    forWhat = "Nagative sentences",
                    formula = "subject + will/shall + not + has/have + been + verb1 with ing + object + since/for"
                )
                fourSentences(
                    forWhat = "Introgative sentences",
                    formula = "will/shall + subject + has/have + been + verb1 with ing + object + since/for"
                )
                fourSentences(
                    forWhat = "Nagative introgativer sentences",
                    formula = "will/shall + subject + not + has/have + been + verb1 with ing + object + since/for"
                )
                important(importantpoint = "Remember!")
                important(importantpoint = "He,She and it or any single noun used 'will has been'.")
                important(importantpoint = "I and We always use 'shall have been'")
                important(importantpoint = "You always use 'will have been'")
                important(importantpoint = "Rest of all plural use 'will have been'")
                important(importantpoint = "Since-> Exact/fix/Definite timing")
                important(importantpoint = "For->Indefinite timing")
                headingOrstructureFormula(head = "Example:")
                definationandExample(defination = "I shall have been going to School for 30 minutes.")
                definationandExample(defination = "You will have been eating meal since morning.")
                definationandExample(defination = "He will has been playing cricket since 1980.")
                definationandExample(defination = "She will has been cooking the meal for 2 hours.")
                definationandExample(defination = "Arshan will has been reading the book for five days.")
                definationandExample(defination = "Ali and Kamran will have been writing their assignment since 4th january 2022.")
                definationandExample(defination = "Will he has been allowing them to set in class since 10th March 2023?")
                definationandExample(defination = "Shall we not have been beating this ging for 15 days?")
            }
        }
    }
}