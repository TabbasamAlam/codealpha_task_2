package com.example.languagelearningapp

import androidx.compose.runtime.Composable

@Composable
fun quiz2() {
    QuizFunction(
        question = listOf(
            Question(
                text = "Islamabad is capital of Pakistan.'Islamabad' is__ ",
                options = listOf("pronoun", "common noun", "proper noun", "verb"),
                correctAnswer = "proper noun"
           ),
            Question(
                text = "The second form of 'do' is?",
                options = listOf("done", "did", "went", "gone"),
                correctAnswer = "did"
            ),
            Question(
                text = "'our' is __ Pronoun?",
                options = listOf("subjective", "objective", "possssive", "relative"),
                correctAnswer = "possssive"
            ),
            Question(
                text = "I don't like greedy men. The word 'greedy' is?",
                options = listOf("adjective", "adverb", "verb", "object"),
                correctAnswer = "adjective"
            ),
            Question(
                text = "He has already sold the car. The word 'already' is ?",
                options = listOf("adjective", "adverb", "pronoun", "preposition"),
                correctAnswer = "adverb"
            ),
            Question(
                text = "Conjunction is a word used for joining?",
                options = listOf("two words", "two phrases", "two sentences", "all of them"),
                correctAnswer = "all of them"
            ),
            Question(
                text = "Umer is reading __ the book?",
                options = listOf("from", "in", "at", "on"),
                correctAnswer = "from"
            ),
            // here add more question related to tences
            //7
            Question(
                text = "Which is demonstrative pronoun?",
                options = listOf("myself", "he", "this", "who"),
                correctAnswer = "this"
            ),
            Question(
                text = "The third form of 'go' is ?",
                options = listOf("better", "best", "went", "gone"),
                correctAnswer = "gone"
            ),
            Question(
                text = "The word which modify the pronoun  is called?",
                options = listOf("adverb", "adjective", "Conjection", "preposition"),
                correctAnswer = "adverb"
            ),
            Question(
                text = "Identify the conjunction from the following.",
                options = listOf("and", "but", "both", "all of them"),
                correctAnswer = "all of them"
            ),
            Question(
                text = "She looks like her father. Identify the preposition?",
                options = listOf("she", "looks", "like", "har"),
                correctAnswer = "like"
            ),
            Question(
                text = "She is walking __ the stairs, to see the zoo.",
                options = listOf("to", "from", "up", "near"),
                correctAnswer = "up"
            ),
            Question(
                text = "Hurrah i won the match. What is missing?",
                options = listOf("!", ".", ",", "''"),
                correctAnswer = "!"
            ),
            Question(
                text = "The part of speech which does not have any grammatical connection to any other word or sentence?",
                options = listOf("conjection", "adverb", "interjection", "preposition"),
                correctAnswer = "interjection"
            ),
            Question(
                text = "Sometimes helping verb act like a main verb?",
                options = listOf("true", "false", "never", "none of them"),
                correctAnswer = "true"
            )
        )
    )

}

@Composable
fun quiz1() {
    QuizFunction(
        question = listOf(
            Question(
                text = "She ___ Ludo ?",
                options = listOf("play", "plays", "playing", " is played"),
                correctAnswer = "plays"
            ),
            Question(
                text = "Verb2 used only in___?",
                options = listOf("simple present", "simple past", "past indifinate", "both simple past/past indifinate"),
                correctAnswer = "both simple past/past indifinate"
            ),
            Question(
                text = "They ___ writing a latter?",
                options = listOf("is", "are", "am", "be"),
                correctAnswer = "are"
            ),
            Question(
                text = "__ She cook?",
                options = listOf("do", "did", "done", "will"),
                correctAnswer = "did"
            ),
            Question(
                text = "Was Asid ___ the football?",
                options = listOf("kick", "kicked", "kicking", "not kicked"),
                correctAnswer = "kicking"
            ),
            Question(
                text = "Will you__ going to market?",
                options = listOf("is", "are", "am", "be"),
                correctAnswer = "be"
            ),
            Question(
                text = "You ___ eating meal since morning.",
                options = listOf("has been", "had been", "will have been", "all of them"),
                correctAnswer = "all of them"
            ),
            Question(
                text = "She has been cooking__ two hours",
                options = listOf("since", "for", "from", "all of them"),
                correctAnswer = "for"
            ),
            Question(
                text = "I had resigned from the job. This sentence is?",
                options = listOf("simple past", "past continuous", "past perfect", "None of them"),
                correctAnswer = "past perfect"
            ),
            Question(
                text = "Had they __  going to Muzaffarabad for ten hours",
                options = listOf("since", "for", "been", "be"),
                correctAnswer = "been"
            ),
            Question(
                text = "The helping verb for future continuous tense is?",
                options = listOf("will", "for", "shall", "will be"),
                correctAnswer = "will be"
            ),
            Question(
                text = "We will have __ to Lahore",
                options = listOf("go", "went", "gone", "going"),
                correctAnswer = "gone"
            ),
            Question(
                text = "Did i ate meal? This sentence is gramatically correct?",
                options = listOf("yes", "no", "may be", "no idea"),
                correctAnswer = "no"
            ),
            Question(
                text = "You __ reading a book",
                options = listOf("were", "was", "will", "have"),
                correctAnswer = "were"
            ),
            Question(
                text = "Did She __ the meal?",
                options = listOf("ate", "eat", "eating", "eaten"),
                correctAnswer = "eat"
            ),
            Question(
                text = "Akram and Aslam __ the cricket",
                options = listOf("plays", "playing", " did pleyed", "play"),
                correctAnswer = "play"
            )
            // here add more question related to tences
        )
    )
}
