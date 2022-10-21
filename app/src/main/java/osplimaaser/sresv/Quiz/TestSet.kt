package osplimaaser.sresv.Quiz

import osplimaaser.sresv.QuestionData.Question
import osplimaaser.sresv.QuestionData.QuestionViewModel
import osplimaaser.sresv.R
import osplimaaser.sresv.TestsData.Test
import osplimaaser.sresv.TestsData.TestViewModel


class TestSet(application: android.app.Application) {

    private val application = application

    fun addGeneralTest() {
        val mTestViewModel = TestViewModel(application)
        var generalTest: Test = Test(
            0,
            "General Sports Quiz",
            R.drawable.icontest_general_test,
            "General Sport",
            false,
            10,
            0
        )
        mTestViewModel.addTest(generalTest)
    }

    fun addGeneralTestQuestions() {
        val mQuestionViewModel = QuestionViewModel(application, selectedTest = "asd")
        var generalTest1: Question = Question(
            0,
            "General Sports Quiz",
            "How long is a marathon?",
            0,
            "42.195 kilometres",
            "10.4 kilometres",
            "30.425 kilometres",
            "50 kilometres",
            1
        )
        mQuestionViewModel.addQuestion(generalTest1)

        var generalTest2: Question = Question(
            0,
            "General Sports Quiz",
            "How many players are there on a baseball team?",
            0,
            "9 players",
            "4 players",
            "6 players",
            "12 players",
            1
        )
        mQuestionViewModel.addQuestion(generalTest2)

        var generalTest3: Question = Question(
            0,
            "General Sports Quiz",
            "Which country won the World Cup 2018?",
            0,
            "Germany",
            "Italy",
            "Spain",
            "France",
            4
        )
        mQuestionViewModel.addQuestion(generalTest3)

        var generalTest4: Question = Question(
            0,
            "General Sports Quiz",
            "What sport is considered the “king of sports”?",
            0,
            "Baseball",
            "Ice hockey",
            "Soccer",
            "Basketball",
            3
        )
        mQuestionViewModel.addQuestion(generalTest4)

        var generalTest5: Question = Question(
            0,
            "General Sports Quiz",
            "What are the two national sports of Canada?",
            0,
            "Lacrosse and ice hockey",
            "Soccer and ice hockey",
            "Soccer and basketball",
            "Baseball and Lacrosse",
            1
        )
        mQuestionViewModel.addQuestion(generalTest5)

        var generalTest6: Question = Question(
            0,
            "General Sports Quiz",
            "What team won the first NBA game in 1946?",
            0,
            "The New York Knicks",
            "Chicago Bulls",
            "Boston Celtics ",
            "Dallas Mavericks",
            1
        )
        mQuestionViewModel.addQuestion(generalTest6)

        var generalTest7: Question = Question(
            0,
            "General Sports Quiz",
            "In which sport would you have a touchdown?",
            0,
            "Soccer",
            "Baseball",
            "Basketball",
            "American football",
            1
        )
        mQuestionViewModel.addQuestion(generalTest7)

        var generalTest8: Question = Question(
            0,
            "General Sports Quiz",
            "In which year did Amir Khan win his Olympic boxing medal?",
            0,
            "2007",
            "2004",
            "2006",
            "2014",
            2
        )
        mQuestionViewModel.addQuestion(generalTest8)

        var generalTest9: Question = Question(
            0,
            "General Sports Quiz",
            "What is Muhammad Ali’s real name?",
            0,
            "Cassius Clay",
            "Muhammad Ali",
            "John Snow",
            "Muhhammad Alisovien",
            1
        )
        mQuestionViewModel.addQuestion(generalTest9)

        var generalTest10: Question = Question(
            0,
            "General Sports Quiz",
            "For which team did Michael Jordan spend most of his career playing?",
            0,
            "Boston Celtics",
            "Orlando Magic",
            "Chicago Bulls",
            "Washington Wizards",
            3
        )
        mQuestionViewModel.addQuestion(generalTest10)

//            var generalTest7: Question = Question(0,"General Sports Quiz","", R.drawable.plug_image,
//                "", "",
//                "","", 1)
//            mQuestionViewModel.addQuestion(generalTest7)


    }

    fun addBallTest() {
        val mTestViewModel = TestViewModel(application)
        var generalTest: Test = Test(
            0,
            "Ball Sports Quiz",
            R.drawable.icontest_ball_test,
            "Ball Sport",
            false,
            10,
            0
        )
        mTestViewModel.addTest(generalTest)
    }

    fun addBallTestQuestions() {
        val mQuestionViewModel = QuestionViewModel(application, selectedTest = "asd")
        var generalTest1: Question = Question(
            0,
            "Ball Sports Quiz",
            "What sport is played with this ball? ",
            R.drawable.balltest_q1_image,
            "Lacrosse",
            "Dodgeball",
            "Cricket",
            "Volleyball",
            2
        )
        mQuestionViewModel.addQuestion(generalTest1)

        var generalTest2: Question = Question(
            0,
            "Ball Sports Quiz",
            "What sport is played with this ball?",
            R.drawable.balltest_q2_image,
            "Racquetball",
            "TagPro",
            "Stickball",
            "Tennis",
            4
        )
        mQuestionViewModel.addQuestion(generalTest2)

        var generalTest3: Question = Question(
            0,
            "Ball Sports Quiz",
            " What sport is played with this ball?",
            R.drawable.balltest_q3_image,
            "Pool",
            "Snooker",
            "Water polo",
            "Lacrosse",
            1
        )
        mQuestionViewModel.addQuestion(generalTest3)

        var generalTest4: Question = Question(
            0,
            "Ball Sports Quiz",
            "What sport is played with this ball?",
            R.drawable.balltest_q4_image,
            "Cricket",
            "Golf",
            "Baseball",
            "Tennis",
            3
        )
        mQuestionViewModel.addQuestion(generalTest4)

        var generalTest5: Question = Question(
            0,
            "Ball Sports Quiz",
            "What sport is played with this ball?",
            R.drawable.balltest_q5_image,
            "Irish road bowling",
            "Hockey",
            "Carpet bowls",
            "Cycle polo",
            4
        )
        mQuestionViewModel.addQuestion(generalTest5)

        var generalTest6: Question = Question(
            0,
            "Ball Sports Quiz",
            "What sport is played with this ball?",
            R.drawable.balltest_q6_image,
            "Croquet",
            "Bowling",
            "Table tennis",
            "Kickball",
            1
        )
        mQuestionViewModel.addQuestion(generalTest6)

        var generalTest7: Question = Question(
            0,
            "Ball Sports Quiz",
            "What sport is played with this ball?",
            R.drawable.balltest_q7_image,
            "Volleyball",
            "Polo",
            "Water polo",
            "Netball",
            3
        )
        mQuestionViewModel.addQuestion(generalTest7)

        var generalTest8: Question = Question(
            0,
            "Ball Sports Quiz",
            "What sport is played with this ball?",
            R.drawable.balltest_q8_image,
            "Polo",
            "Rugby",
            "Lacrosse",
            "Dodgeball",
            3
        )
        mQuestionViewModel.addQuestion(generalTest8)

        var generalTest9: Question = Question(
            0,
            "Ball Sports Quiz",
            "What sport is played with this ball?",
            R.drawable.balltest_q9_image,
            "Volleyball",
            "Soccer",
            "Basketball",
            "Handball",
            4
        )
        mQuestionViewModel.addQuestion(generalTest9)

        var generalTest10: Question = Question(
            0,
            "Ball Sports Quiz",
            "What sport is played with this ball?",
            R.drawable.balltest_q10_image,
            "Cricket",
            "Baseball",
            "Racquetball",
            "Padel",
            1
        )
        mQuestionViewModel.addQuestion(generalTest10)

//            var generalTest7: Question = Question(0,"General Sports Quiz","", R.drawable.plug_image,
//                "", "",
//                "","", 1)
//            mQuestionViewModel.addQuestion(generalTest7)


    }

    fun addWaterTest() {
        val mTestViewModel = TestViewModel(application)
        var generalTest: Test = Test(
            0,
            "Water Sports Quiz",
            R.drawable.icontest_water_test,
            "Water Sport",
            false,
            10,
            0
        )
        mTestViewModel.addTest(generalTest)
    }

    fun addWaterTestQuestions() {
        val mQuestionViewModel = QuestionViewModel(application, selectedTest = "asd")
        var generalTest1: Question = Question(
            0,
            "Water Sports Quiz",
            "What sport is famously known as water ballet?",
            0,
            "Synchronised swimming",
            "Water polo",
            "Sport diving",
            "Underwater football",
            1
        )
        mQuestionViewModel.addQuestion(generalTest1)

        var generalTest2: Question = Question(
            0,
            "Water Sports Quiz",
            "What water sport can be played by up to 20 people in a team?",
            R.drawable.watertest_q2_image,
            "Octopush",
            "Dragon boat racing",
            "Diving",
            "Tennis",
            2
        )
        mQuestionViewModel.addQuestion(generalTest2)

        var generalTest3: Question = Question(
            0,
            "Water Sports Quiz",
            "What is water hockey’s alternative name?",
            0,
            "Octopush",
            "Water hockey",
            "Water polo",
            "Lacrosse",
            1
        )
        mQuestionViewModel.addQuestion(generalTest3)

        var generalTest4: Question = Question(
            0,
            "Water Sports Quiz",
            "How many paddles are used in a kayak?",
            0,
            "Five",
            "Two",
            "One",
            "Ten",
            3
        )
        mQuestionViewModel.addQuestion(generalTest4)

        var generalTest5: Question = Question(
            0,
            "Water Sports Quiz",
            " What is the oldest water sport ever recorded?",
            0,
            "Rowing",
            "Hockey",
            "Polo",
            "Diving",
            4
        )
        mQuestionViewModel.addQuestion(generalTest5)

        var generalTest6: Question = Question(
            0,
            "Water Sports Quiz",
            "Which swimming style is not allowed in the Olympics?",
            0,
            "Butterfly",
            "Backstroke",
            "Freestyle",
            "Dog paddle",
            4
        )
        mQuestionViewModel.addQuestion(generalTest6)

        var generalTest7: Question = Question(
            0,
            "Water Sports Quiz",
            "Which of the following is not a water sport?",
            0,
            "Paragliding",
            "Cliff diving",
            "Windsurfing",
            "Rowing",
            1
        )
        mQuestionViewModel.addQuestion(generalTest7)

        var generalTest8: Question = Question(
            0,
            "Water Sports Quiz",
            "Who has most gold medals?",
            0,
            "Ian Thorpe",
            "Mark Spitz",
            "Michael Phelps",
            "Caeleb Dressel",
            3
        )
        mQuestionViewModel.addQuestion(generalTest8)

        var generalTest9: Question = Question(
            0,
            "Water Sports Quiz",
            "Which country has the most Olympic gold medals in swimming?",
            0,
            "China",
            "The USA",
            "The UK",
            "Australia",
            2
        )
        mQuestionViewModel.addQuestion(generalTest9)

        var generalTest10: Question = Question(
            0,
            "Water Sports Quiz",
            "When was water polo created?",
            0,
            "20th century",
            "19th century",
            "18th century",
            "17th century",
            2
        )
        mQuestionViewModel.addQuestion(generalTest10)

//            var generalTest7: Question = Question(0,"General Sports Quiz","", R.drawable.plug_image,
//                "", "",
//                "","", 1)
//            mQuestionViewModel.addQuestion(generalTest7)


    }

    fun addIndoorTest() {
        val mTestViewModel = TestViewModel(application)
        var generalTest: Test = Test(
            0,
            "Indoor Sports Quiz",
            R.drawable.testicon_indoor_test,
            "Indoor Sport",
            false,
            7,
            0
        )
        mTestViewModel.addTest(generalTest)
    }

    fun addIndoorTestQuestions() {
        val mQuestionViewModel = QuestionViewModel(application, selectedTest = "asd")
        var generalTest1: Question = Question(
            0,
            "Indoor Sports Quiz",
            "How many times did Efren Reyes win the World Pool League championship?",
            0,
            "One",
            "Two",
            "Three",
            "Four",
            2
        )
        mQuestionViewModel.addQuestion(generalTest1)

        var generalTest2: Question = Question(
            0,
            "Indoor Sports Quiz",
            "What is 3 strikes in a row called in bowling?",
            0,
            "Turkey",
            "Dragon",
            "Chicken",
            "Triple",
            1
        )
        mQuestionViewModel.addQuestion(generalTest2)

        var generalTest3: Question = Question(
            0,
            "Indoor Sports Quiz",
            "What year did boxing become a legal sport? ",
            0,
            "1921",
            "1901",
            "1931",
            "1911",
            2
        )
        mQuestionViewModel.addQuestion(generalTest3)

        var generalTest4: Question = Question(
            0,
            "Indoor Sports Quiz",
            "Where is the largest bowling centre located?",
            0,
            "US",
            "Japan",
            "Singapore",
            "Finland",
            2
        )
        mQuestionViewModel.addQuestion(generalTest4)

        var generalTest5: Question = Question(
            0,
            "Indoor Sports Quiz",
            "Which sport uses a racket, a net, and a shuttlecock?",
            0,
            "Badminton",
            "Tennis",
            "Polo",
            "Diving",
            1
        )
        mQuestionViewModel.addQuestion(generalTest5)

        var generalTest6: Question = Question(
            0,
            "Indoor Sports Quiz",
            "Of all the fighting sports below, which sport wasn’t practised by Bruce Lee?",
            0,
            "Wushu",
            "Boxing",
            "Jeet Kune Do",
            "Fencing",
            1
        )
        mQuestionViewModel.addQuestion(generalTest6)

        var generalTest7: Question = Question(
            0,
            "Indoor Sports Quiz",
            "Where did the term “billiard” originated from?",
            0,
            "Italy",
            "Hungary",
            "Belgium",
            "France",
            4
        )
        mQuestionViewModel.addQuestion(generalTest7)


//            var generalTest7: Question = Question(0,"General Sports Quiz","", R.drawable.plug_image,
//                "", "",
//                "","", 1)
//            mQuestionViewModel.addQuestion(generalTest7)


    }

    fun addFootballInternationalsTest() {
        val mTestViewModel = TestViewModel(application)
        var generalTest: Test = Test(
            0,
            "Football: Internationals",
            R.drawable.testicon_football_test,
            "Football",
            false,
            5,
            0
        )
        mTestViewModel.addTest(generalTest)
    }

    fun addFootballInternationalsTestQuestions() {
        val mQuestionViewModel = QuestionViewModel(application, selectedTest = "asd")
        var generalTest1: Question = Question(
            0,
            "Football: Internationals",
            "What was the score in the Euro 2012 final?",
            0,
            "2-0",
            "3-0",
            "4-0",
            "5-0",
            3
        )
        mQuestionViewModel.addQuestion(generalTest1)

        var generalTest2: Question = Question(
            0,
            "Football: Internationals",
            "Who won the Man of the Match award in the 2014 World Cup final?",
            0,
            "Mario Goetze",
            "Sergio Aguero",
            "Lionel Messi",
            "Bastian Schweinsteiger",
            1
        )
        mQuestionViewModel.addQuestion(generalTest2)

        var generalTest3: Question = Question(
            0,
            "Football: Internationals",
            " Against which country did Wayne Rooney break the England goalscoring record?",
            0,
            "Switzerland",
            "San Marino",
            "Lithuania",
            "Slovenia",
            1
        )
        mQuestionViewModel.addQuestion(generalTest3)

        var generalTest4: Question = Question(
            0,
            "Football: Internationals",
            "This iconic kit was the 2018 World Cup kit for which country?",
            R.drawable.football_q4_image,
            "Mexico",
            "Brazil",
            "Nigeria",
            "Costa Rica",
            3
        )
        mQuestionViewModel.addQuestion(generalTest4)

        var generalTest5: Question = Question(
            0,
            "Football: Internationals",
            "After losing a key player in the first game, which team went onto the semi-finals of Euro 2020?",
            0,
            "Denmark",
            "Spain",
            "Wales",
            "England",
            1
        )
        mQuestionViewModel.addQuestion(generalTest5)

//            var generalTest7: Question = Question(0,"General Sports Quiz","", R.drawable.plug_image,
//                "", "",
//                "","", 1)
//            mQuestionViewModel.addQuestion(generalTest7)


    }

    fun addFootballEnglishTest() {
        val mTestViewModel = TestViewModel(application)
        var generalTest: Test = Test(
            0,
            "Football: English Premier League",
            R.drawable.icontest_footbal_english_test,
            "Football",
            false,
            5,
            0
        )
        mTestViewModel.addTest(generalTest)
    }

    fun addFootballEnglishTestQuestions() {
        val mQuestionViewModel = QuestionViewModel(application, selectedTest = "asd")
        var generalTest1: Question = Question(
            0,
            "Football: English Premier League",
            "Which footballer holds the record for the highest number of assists in the Premier League?",
            0,
            "Cesc Fabregas",
            "Ryan Giggs",
            "Frank Lampard",
            "Paul Scholes",
            2
        )
        mQuestionViewModel.addQuestion(generalTest1)

        var generalTest2: Question = Question(
            0,
            "Football: English Premier League",
            "Which former Belarus international played for Arsenal between 2005 and 2008?",
            0,
            "Alexander Hleb",
            "Maksim Romaschenko",
            "Valyantsin Byalkevich",
            "Yuri Zhenov",
            1
        )
        mQuestionViewModel.addQuestion(generalTest2)

        var generalTest3: Question = Question(
            0,
            "Football: English Premier League",
            "What commentator is produced?",
            R.drawable.footballenglish_q3_image,
            "Guy Mowbray",
            "Robbie Savage",
            "Peter Drury",
            "Martin Tyler",
            4
        )
        mQuestionViewModel.addQuestion(generalTest3)

        var generalTest4: Question = Question(
            0,
            "Football: English Premier League",
            "Jamie Vardy was signed by Leicester from which non-league side?",
            R.drawable.football_q4_image,
            "Ketting Town",
            "Alfreton Town",
            "Grimsby Town",
            "Fleetwood Town",
            4
        )
        mQuestionViewModel.addQuestion(generalTest4)

        var generalTest5: Question = Question(
            0,
            "Football: English Premier League",
            "Chelsea beat which team 8-0 to secure the 2009-10 Premier League title on the final day of the season?",
            0,
            "Blackburn",
            "Hull",
            "Wigan",
            "Norwich",
            3
        )
        mQuestionViewModel.addQuestion(generalTest5)

//            var generalTest7: Question = Question(0,"General Sports Quiz","", R.drawable.plug_image,
//                "", "",
//                "","", 1)
//            mQuestionViewModel.addQuestion(generalTest7)


    }

    fun addFootballEuropeanTest() {
        val mTestViewModel = TestViewModel(application)
        var generalTest: Test = Test(
            0,
            "Football: European Competitions",
            R.drawable.icontest_football_european_test,
            "Football",
            false,
            5,
            0
        )
        mTestViewModel.addTest(generalTest)
    }

    fun addFootballEuropeanTestQuestions() {
        val mQuestionViewModel = QuestionViewModel(application, selectedTest = "asd")
        var generalTest1: Question = Question(
            0,
            "Football: European Competitions",
            "Who is the current top scorer in the UEFA Champions League?",
            0,
            "Alan Shearer",
            "Thierry Henry",
            "Cristiano Ronaldo",
            "Robert Lewandowski",
            3
        )
        mQuestionViewModel.addQuestion(generalTest1)

        var generalTest2: Question = Question(
            0,
            "Football: European Competitions",
            " Manchester United beat which team in the 2017 Europa League final?",
            0,
            "Villarreal",
            "Chelsea",
            "Ajax",
            "Borussia Dortmund",
            3
        )
        mQuestionViewModel.addQuestion(generalTest2)

        var generalTest3: Question = Question(
            0,
            "Football: European Competitions",
            "Gareth Bale’s breakthrough moment came in the 2010-11 season, when he scored a second half hat-trick against which team?",
            0,
            "Inter Milan",
            "AC Milan",
            "Juventus",
            "Napoli",
            1
        )
        mQuestionViewModel.addQuestion(generalTest3)

        var generalTest4: Question = Question(
            0,
            "Football: European Competitions",
            "Which team did Porto beat in the 2004 Champions League final?",
            0,
            "Bayern Munich",
            "Deportivo La Coruña",
            "Barcelona",
            "Monaco",
            4
        )
        mQuestionViewModel.addQuestion(generalTest4)

        var generalTest5: Question = Question(
            0,
            "Football: European Competitions",
            "Which Serbian team scored beat Marseille on penalties to secure the 1991 European Cup?",
            0,
            "Slavia Prague",
            "Red Star Belgrade",
            "Galatasaray",
            "Spartak Trnava",
            2
        )
        mQuestionViewModel.addQuestion(generalTest5)

//            var generalTest7: Question = Question(0,"General Sports Quiz","", R.drawable.plug_image,
//                "", "",
//                "","", 1)
//            mQuestionViewModel.addQuestion(generalTest7)


    }

    fun addFootballWorldTest() {
        val mTestViewModel = TestViewModel(application)
        var generalTest: Test = Test(
            0,
            "Football: World",
            R.drawable.icontest_football_world_test,
            "Football",
            false,
            5,
            0
        )
        mTestViewModel.addTest(generalTest)
    }

    fun addFootballWorldTestQuestions() {
        val mQuestionViewModel = QuestionViewModel(application, selectedTest = "asd")
        var generalTest1: Question = Question(
            0,
            "Football: World",
            "Who is the current top scorer in the UEFA Champions League?",
            0,
            "Bergamo Calcio",
            "Inter Miami",
            "West London Blue",
            "The Potteries",
            2
        )
        mQuestionViewModel.addQuestion(generalTest1)

        var generalTest2: Question = Question(
            0,
            "Football: World",
            "You can find the oldest footballer in the world playing in which country?",
            0,
            "Malaysia",
            "Ecudaor",
            "Japan",
            "South Africa",
            3
        )
        mQuestionViewModel.addQuestion(generalTest2)

        var generalTest3: Question = Question(
            0,
            "Football: World",
            "Which overseas British territory became an official Fifa member in 2016?",
            0,
            "Pitcairn Islands",
            "Bermuda",
            "Cayman Islands",
            "Gibraltar",
            4
        )
        mQuestionViewModel.addQuestion(generalTest3)

        var generalTest4: Question = Question(
            0,
            "Football: World",
            "Which team has won the African Cup of Nations a record 7 times?",
            0,
            "Cameroon",
            "Egypt",
            "Senegal",
            "Ghana",
            2
        )
        mQuestionViewModel.addQuestion(generalTest4)

        var generalTest5: Question = Question(
            0,
            "Football: World",
            "In 2011, a 5th tier match in Argentina saw a record number of red cards. How many were given out?",
            0,
            "6",
            "11",
            "22",
            "36",
            4
        )
        mQuestionViewModel.addQuestion(generalTest5)

//            var generalTest7: Question = Question(0,"General Sports Quiz","", R.drawable.plug_image,
//                "", "",
//                "","", 1)
//            mQuestionViewModel.addQuestion(generalTest7)


    }

    fun addWeekTest() {
        val mTestViewModel = TestViewModel(application)
        var generalTest: Test = Test(
            0,
            "Sports quiz of the week",
            R.drawable.icontest_week_test,
            "Global sport",
            false,
            9,
            0
        )
        mTestViewModel.addTest(generalTest)
    }

    fun addWeekTestQuestions() {
        val mQuestionViewModel = QuestionViewModel(application, selectedTest = "asd")
        var generalTest1: Question = Question(
            0,
            "Sports quiz of the week",
            "The 150th Open is being played this weekend at St Andrews, the Home of Golf. Where were the first 12 Open championships held?",
            0,
            "St Andrews",
            "Prestwick",
            "Royal Portrush",
            "Muirfield",
            2
        )
        mQuestionViewModel.addQuestion(generalTest1)

        var generalTest2: Question = Question(
            0,
            "Sports quiz of the week",
            "The winner of the Open this weekend will receive \$2,500,000. What was the prize for the first champion in 1860?",
            0,
            "A belt",
            "A jug",
            "Seven pairs of socks",
            "A year’s supply of house plants",
            1
        )
        mQuestionViewModel.addQuestion(generalTest2)

        var generalTest3: Question = Question(
            0,
            "Sports quiz of the week",
            "Beth Mead scored a hat-trick for England against Norway at the Women’s Euros this week. Mead bought a dog during lockdown. What is it called?",
            0,
            "Rishi",
            "Boris",
            "Sir Patrick Vallance",
            "Rona",
            4
        )
        mQuestionViewModel.addQuestion(generalTest3)

        var generalTest4: Question = Question(
            0,
            "Sports quiz of the week",
            "Novak Djokovic started the Wimbledon fortnight as the world No 3. Where is he in the world rankings now?",
            0,
            "No 1",
            "No 3",
            "No 7",
            "No 9",
            3
        )
        mQuestionViewModel.addQuestion(generalTest4)

        var generalTest5: Question = Question(
            0,
            "Sports quiz of the week",
            "There are four huge rugby union internationals this weekend. Which of these best-of-three series is not tied at 1-1 before the final Test?",
            0,
            "England v Australia",
            "South Africa v Wales",
            "Argentina v Scotland",
            "All four series are tied",
            4
        )
        mQuestionViewModel.addQuestion(generalTest5)

        var generalTest6: Question = Question(
            0,
            "Sports quiz of the week",
            "Ireland have already made history on their tour by beating the All Blacks in New Zealand for the first time in their history. Who were the last visiting team to win a series in New Zealand (in 1994)?",
            0,
            "England",
            "The British and Irish Lions",
            "Wales",
            "France",
            4
        )
        mQuestionViewModel.addQuestion(generalTest6)

        var generalTest7: Question = Question(
            0,
            "Sports quiz of the week",
            "Alex Wrigley is playing at the Open this week. What is unusual about Wrigley?",
            0,
            "His father and grandfather have both won the Open",
            "His twin brother Sierra is also competing at the tournament",
            "His caddie has a better world ranking than he does",
            "He has played for Scotland in the Six Nations",
            3
        )
        mQuestionViewModel.addQuestion(generalTest7)

        var generalTest8: Question = Question(
            0,
            "Sports quiz of the week",
            "There is a big day of horse racing at Newbury on Saturday, but what is unusual about the final race of the day?",
            0,

            "The organisers are experimenting with a time-trial",
            "Four of the jockeys racing are brothers",
            "No jockeys are competing in the race",
            "All of the jockeys are women",
            3
        )
        mQuestionViewModel.addQuestion(generalTest8)

        var generalTest9: Question = Question(
            0,
            "Sports quiz of the week",
            "Raheem Sterling has moved from Liverpool to Manchester City to Chelsea. Which two other footballers have played for these three clubs in the Premier League? Daniel Sturridge and …",
            0,
            "Yossi Benayoun",
                    "Joe Cole",
                    "Craig Bellamy",
                    "Nicolas Anelka",
            4
        )
        mQuestionViewModel.addQuestion(generalTest9)

//            var generalTest7: Question = Question(0,"General Sports Quiz","", R.drawable.plug_image,
//                "", "",
//                "","", 1)
//            mQuestionViewModel.addQuestion(generalTest7)


    }

}