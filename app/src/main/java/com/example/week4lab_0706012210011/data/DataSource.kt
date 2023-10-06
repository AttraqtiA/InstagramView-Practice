package com.example.week4lab_0706012210011.data

import com.example.week4lab_0706012210011.model.Explore
import com.example.week4lab_0706012210011.model.Feed
import com.example.week4lab_0706012210011.model.Story
import com.example.week4lab_0706012210011.model.Suggestion

class   DataSource {
    public fun loadFeed(): List<Feed>{
        return listOf<Feed>(
            Feed("john_doe", "profile_1", "content_1", true, false, 50, "Caption 1. This is a long and detailed caption that spans multiple paragraphs. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ac libero at purus scelerisque ultrices. Integer malesuada a justo eu facilisis. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nam vel nunc nec metus interdum efficitur. Nulla facilisi. Nulla rhoncus est et neque facilisis, vel venenatis quam blandit. Sed viverra justo at mi vestibulum eleifend. Vestibulum ut felis ut tortor tincidunt vehicula at id lacus. Donec feugiat dolor in metus congue, id vestibulum nulla posuere. Fusce a quam purus. Vivamus egestas et nisi in bibendum. Praesent id hendrerit ex. Nullam vel tortor nec neque pharetra congue.", "2023-10-01"),
            Feed("jane_smith", "profile_2", "content_2", false, true, 10000, "Caption 2. Another long caption to demonstrate multiline text. Duis vehicula, felis id cursus sollicitudin, ipsum arcu interdum libero, vel posuere lectus orci et odio. Sed tristique felis id vehicula laoreet. Suspendisse potenti. Nullam vitae aliquet elit. Etiam in lacinia est. Fusce eget iaculis arcu. Phasellus dictum viverra ex, ac dictum neque pellentesque sit amet. Nullam scelerisque ut velit et sollicitudin. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Donec vel neque eu leo rhoncus cursus. Sed at sapien ex. Praesent suscipit odio eget libero bibendum, id blandit justo sollicitudin. Cras euismod enim in nulla fringilla, quis dapibus est condimentum. Integer tincidunt nisl nec metus convallis, non bibendum libero elementum.", "2022-06-15"),
            Feed("alex123", "profile_3", "content_3", true, true, 5000, "Caption 3. A lengthy caption with multiple paragraphs. Vivamus convallis justo odio, et finibus metus laoreet ac. Proin volutpat, quam eget vehicula tincidunt, arcu tortor sollicitudin elit, nec placerat odio libero a libero. Phasellus id odio ac odio tempus lacinia. Donec congue nec nisi in tempor. Vestibulum quis sapien eget libero cursus vehicula. Fusce vestibulum rhoncus mi, id euismod justo laoreet et. Curabitur iaculis, purus in viverra consectetur, elit justo gravida urna, vel congue felis libero non elit. Cras a semper nisl. Aenean tristique tortor a scelerisque. Vivamus eget semper lorem. Duis lacinia libero et sollicitudin. In hac habitasse platea dictumst.", "2020-12-20"),
            Feed("emily_green", "profile_4", "content_4", false, true, 750, "Caption 4. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ac libero at purus scelerisque ultrices. Integer malesuada a justo eu facilisis. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nam vel nunc nec metus interdum efficitur. Nulla facilisi. Nulla rhoncus est et neque facilisis, vel venenatis quam blandit. Sed viverra justo at mi vestibulum eleifend. Vestibulum ut felis ut tortor tincidunt vehicula at id lacus. Donec feugiat dolor in metus congue, id vestibulum nulla posuere. Fusce a quam purus. Vivamus egestas et nisi in bibendum. Praesent id hendrerit ex. Nullam vel tortor nec neque pharetra congue.", "2018-11-03"),
            Feed("sam_wilson", "profile_5", "content_5", true, false, 2000, "Caption 5. Another long caption to demonstrate multiline text. Duis vehicula, felis id cursus sollicitudin, ipsum arcu interdum libero, vel posuere lectus orci et odio. Sed tristique felis id vehicula laoreet. Suspendisse potenti. Nullam vitae aliquet elit. Etiam in lacinia est. Fusce eget iaculis arcu. Phasellus dictum viverra ex, ac dictum neque pellentesque sit amet. Nullam scelerisque ut velit et sollicitudin. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Donec vel neque eu leo rhoncus cursus. Sed at sapien ex. Praesent suscipit odio eget libero bibendum, id blandit justo sollicitudin. Cras euismod enim in nulla fringilla, quis dapibus est condimentum. Integer tincidunt nisl nec metus convallis, non bibendum libero elementum.", "2022-08-22"),
            Feed("lisa_martin", "profile_6", "content_6", false, false, 3000, "Caption 6. A lengthy caption with multiple paragraphs. Vivamus convallis justo odio, et finibus metus laoreet ac. Proin volutpat, quam eget vehicula tincidunt, arcu tortor sollicitudin elit, nec placerat odio libero a libero. Phasellus id odio ac odio tempus lacinia. Donec congue nec nisi in tempor. Vestibulum quis sapien eget libero cursus vehicula. Fusce vestibulum rhoncus mi, id euismod justo laoreet et. Curabitur iaculis, purus in viverra consectetur, elit justo gravida urna, vel congue felis libero non elit. Cras a semper nisl. Aenean tristique tortor a scelerisque. Vivamus eget semper lorem. Duis lacinia libero et sollicitudin. In hac habitasse platea dictumst.", "2016-02-14"),
            Feed("mike_brown", "profile_7", "content_7", true, true, 1500, "Caption 7. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ac libero at purus scelerisque ultrices. Integer malesuada a justo eu facilisis. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nam vel nunc nec metus interdum efficitur. Nulla facilisi. Nulla rhoncus est et neque facilisis, vel venenatis quam blandit. Sed viverra justo at mi vestibulum eleifend. Vestibulum ut felis ut tortor tincidunt vehicula at id lacus. Donec feugiat dolor in metus congue, id vestibulum nulla posuere. Fusce a quam purus. Vivamus egestas et nisi in bibendum. Praesent id hendrerit ex. Nullam vel tortor nec neque pharetra congue.", "2005-05-10"),
            Feed("sara_jones", "profile_8", "content_8", false, false, 8000, "Caption 8. Another long caption to demonstrate multiline text. Duis vehicula, felis id cursus sollicitudin, ipsum arcu interdum libero, vel posuere lectus orci et odio. Sed tristique felis id vehicula laoreet. Suspendisse potenti. Nullam vitae aliquet elit. Etiam in lacinia est. Fusce eget iaculis arcu. Phasellus dictum viverra ex, ac dictum neque pellentesque sit amet. Nullam scelerisque ut velit et sollicitudin. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Donec vel neque eu leo rhoncus cursus. Sed at sapien ex. Praesent suscipit odio eget libero bibendum, id blandit justo sollicitudin. Cras euismod enim in nulla fringilla, quis dapibus est condimentum. Integer tincidunt nisl nec metus convallis, non bibendum libero elementum.", "2006-09-28"),
            Feed("chris_taylor", "profile_9", "content_9", true, true, 2500, "Caption 9. A lengthy caption with multiple paragraphs. Vivamus convallis justo odio, et finibus metus laoreet ac. Proin volutpat, quam eget vehicula tincidunt, arcu tortor sollicitudin elit, nec placerat odio libero a libero. Phasellus id odio ac odio tempus lacinia. Donec congue nec nisi in tempor. Vestibulum quis sapien eget libero cursus vehicula. Fusce vestibulum rhoncus mi, id euismod justo laoreet et. Curabitur iaculis, purus in viverra consectetur, elit justo gravida urna, vel congue felis libero non elit. Cras a semper nisl. Aenean tristique tortor a scelerisque. Vivamus eget semper lorem. Duis lacinia libero et sollicitudin. In hac habitasse platea dictumst.", "2001-01-12"),
            Feed("olivia_walker", "profile_10", "content_10", false, false, 4500, "Caption 10. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ac libero at purus scelerisque ultrices. Integer malesuada a justo eu facilisis. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nam vel nunc nec metus interdum efficitur. Nulla facilisi. Nulla rhoncus est et neque facilisis, vel venenatis quam blandit. Sed viverra justo at mi vestibulum eleifend. Vestibulum ut felis ut tortor tincidunt vehicula at id lacus. Donec feugiat dolor in metus congue, id vestibulum nulla posuere. Fusce a quam purus. Vivamus egestas et nisi in bibendum. Praesent id hendrerit ex. Nullam vel tortor nec neque pharetra congue.", "2017-12-05"),
            Feed("megan_white", "profile_11", "content_11", true, true, 1800, "Caption 11. Another long caption to demonstrate multiline text. Duis vehicula, felis id cursus sollicitudin, ipsum arcu interdum libero, vel posuere lectus orci et odio. Sed tristique felis id vehicula laoreet. Suspendisse potenti. Nullam vitae aliquet elit. Etiam in lacinia est. Fusce eget iaculis arcu. Phasellus dictum viverra ex, ac dictum neque pellentesque sit amet. Nullam scelerisque ut velit et sollicitudin. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Donec vel neque eu leo rhoncus cursus. Sed at sapien ex. Praesent suscipit odio eget libero bibendum, id blandit justo sollicitudin. Cras euismod enim in nulla fringilla, quis dapibus est condimentum. Integer tincidunt nisl nec metus convallis, non bibendum libero elementum.", "2013-06-17"),
            Feed("david_anderson", "profile_12", "content_12", false, true, 6000, "Caption 12. A lengthy caption with multiple paragraphs. Vivamus convallis justo odio, et finibus metus laoreet ac. Proin volutpat, quam eget vehicula tincidunt, arcu tortor sollicitudin elit, nec placerat odio libero a libero. Phasellus id odio ac odio tempus lacinia. Donec congue nec nisi in tempor. Vestibulum quis sapien eget libero cursus vehicula. Fusce vestibulum rhoncus mi, id euismod justo laoreet et. Curabitur iaculis, purus in viverra consectetur, elit justo gravida urna, vel congue felis libero non elit. Cras a semper nisl. Aenean tristique tortor a scelerisque. Vivamus eget semper lorem. Duis lacinia libero et sollicitudin. In hac habitasse platea dictumst.", "2008-03-24"),
            Feed("natalie_clark", "profile_13", "content_13", true, true, 3500, "Caption 13. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ac libero at purus scelerisque ultrices. Integer malesuada a justo eu facilisis. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nam vel nunc nec metus interdum efficitur. Nulla facilisi. Nulla rhoncus est et neque facilisis, vel venenatis quam blandit. Sed viverra justo at mi vestibulum eleifend. Vestibulum ut felis ut tortor tincidunt vehicula at id lacus. Donec feugiat dolor in metus congue, id vestibulum nulla posuere. Fusce a quam purus. Vivamus egestas et nisi in bibendum. Praesent id hendrerit ex. Nullam vel tortor nec neque pharetra congue.", "2014-10-08"),
            Feed("kevin_harris", "profile_14", "content_14", false, false, 4200, "Caption 14. Another long caption to demonstrate multiline text. Duis vehicula, felis id cursus sollicitudin, ipsum arcu interdum libero, vel posuere lectus orci et odio. Sed tristique felis id vehicula laoreet. Suspendisse potenti. Nullam vitae aliquet elit. Etiam in lacinia est. Fusce eget iaculis arcu. Phasellus dictum viverra ex, ac dictum neque pellentesque sit amet. Nullam scelerisque ut velit et sollicitudin. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Donec vel neque eu leo rhoncus cursus. Sed at sapien ex. Praesent suscipit odio eget libero bibendum, id blandit justo sollicitudin. Cras euismod enim in nulla fringilla, quis dapibus est condimentum. Integer tincidunt nisl nec metus convallis, non bibendum libero elementum.", "2022-02-01"),
            Feed("anna_moore", "profile_15", "content_15", true, false, 300, "Caption 15. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ac libero at purus scelerisque ultrices. Integer malesuada a justo eu facilisis. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nam vel nunc nec metus interdum efficitur. Nulla facilisi. Nulla rhoncus est et neque facilisis, vel venenatis quam blandit. Sed viverra justo at mi vestibulum eleifend. Vestibulum ut felis ut tortor tincidunt vehicula at id lacus. Donec feugiat dolor in metus congue, id vestibulum nulla posuere. Fusce a quam purus. Vivamus egestas et nisi in bibendum. Praesent id hendrerit ex. Nullam vel tortor nec neque pharetra congue.", "2023-09-11"),
            Feed("peter_jackson", "profile_16", "content_16", false, true, 5600, "Caption 16. A lengthy caption with multiple paragraphs. Vivamus convallis justo odio, et finibus metus laoreet ac. Proin volutpat, quam eget vehicula tincidunt, arcu tortor sollicitudin elit, nec placerat odio libero a libero. Phasellus id odio ac odio tempus lacinia. Donec congue nec nisi in tempor. Vestibulum quis sapien eget libero cursus vehicula. Fusce vestibulum rhoncus mi, id euismod justo laoreet et. Curabitur iaculis, purus in viverra consectetur, elit justo gravida urna, vel congue felis libero non elit. Cras a semper nisl. Aenean tristique tortor a scelerisque. Vivamus eget semper lorem. Duis lacinia libero et sollicitudin. In hac habitasse platea dictumst.", "2023-04-30"),
            Feed("oliver_miller", "profile_17", "content_17", true, false, 7800, "Caption 17. Another long caption to demonstrate multiline text. Duis vehicula, felis id cursus sollicitudin, ipsum arcu interdum libero, vel posuere lectus orci et odio. Sed tristique felis id vehicula laoreet. Suspendisse potenti. Nullam vitae aliquet elit. Etiam in lacinia est. Fusce eget iaculis arcu. Phasellus dictum viverra ex, ac dictum neque pellentesque sit amet. Nullam scelerisque ut velit et sollicitudin. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Donec vel neque eu leo rhoncus cursus. Sed at sapien ex. Praesent suscipit odio eget libero bibendum, id blandit justo sollicitudin. Cras euismod enim in nulla fringilla, quis dapibus est condimentum. Integer tincidunt nisl nec metus convallis, non bibendum libero elementum.", "2022-03-12"),
            Feed("mia_davis", "profile_18", "content_18", false, true, 9200, "Caption 18. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ac libero at purus scelerisque ultrices. Integer malesuada a justo eu facilisis. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nam vel nunc nec metus interdum efficitur. Nulla facilisi. Nulla rhoncus est et neque facilisis, vel venenatis quam blandit. Sed viverra justo at mi vestibulum eleifend. Vestibulum ut felis ut tortor tincidunt vehicula at id lacus. Donec feugiat dolor in metus congue, id vestibulum nulla posuere. Fusce a quam purus. Vivamus egestas et nisi in bibendum. Praesent id hendrerit ex. Nullam vel tortor nec neque pharetra congue.", "2020-11-20")
        )
    }

    public fun loadStory(): List<Story>{
        return listOf<Story>(
            Story("john_doe", "profile_1", true, false),
            Story("jane_smith", "profile_2", false, true),
            Story("alice_johnson", "profile_3", true, true),
            Story("david_williams", "profile_4", false, false),
            Story("emily_brown", "profile_5", true, false),
            Story("michael_davis", "profile_6", false, true),
            Story("susan_jackson", "profile_7", true, true),
            Story("robert_jones", "profile_8", false, false),
            Story("lisa_anderson", "profile_9", true, false),
            Story("william_taylor", "profile_10", false, true),
            Story("elizabeth_martin", "profile_11", true, true),
            Story("james_johnson", "profile_12", false, false),
            Story("natalie_rodriguez", "profile_13", true, false),
            Story("peter_white", "profile_14", false, true),
            Story("olivia_lee", "profile_15", true, true),
            Story("thomas_wilson", "profile_16", false, false),
            Story("grace_martin", "profile_17", true, false),
            Story("jacob_hernandez", "profile_18", false, true)
        )
    }

    public fun loadSuggestion(): List<Suggestion>{
        return listOf<Suggestion>(
            Suggestion("lisa_anderson", "profile_9", true, false),
            Suggestion("jane_smith", "profile_2", false, true),
            Suggestion("elizabeth_martin", "profile_11", true, true),
            Suggestion("olivia_lee", "profile_15", true, true),
            Suggestion("david_williams", "profile_4", false, false),
            Suggestion("emily_brown", "profile_5", true, false),
            Suggestion("susan_jackson", "profile_7", true, true),
            Suggestion("grace_martin", "profile_17", true, false),
            Suggestion("robert_jones", "profile_8", false, false),
            Suggestion("william_taylor", "profile_10", false, true),
            Suggestion("natalie_rodriguez", "profile_13", true, false),
            Suggestion("john_doe", "profile_1", true, false),
            Suggestion("james_johnson", "profile_12", false, false),
            Suggestion("alice_johnson", "profile_3", true, true),
            Suggestion("peter_white", "profile_14", false, true),
            Suggestion("thomas_wilson", "profile_16", false, false),
            Suggestion("michael_davis", "profile_6", false, true),
            Suggestion("jacob_hernandez", "profile_18", false, true)
        )
    }

    public fun loadExplore(): List<Explore>{
        return listOf<Explore>(
            Explore("content_1"),
            Explore("content_2"),
            Explore("content_3"),
            Explore("content_4"),
            Explore("content_5"),
            Explore("content_6"),
            Explore("content_7"),
            Explore("content_8"),
            Explore("content_9"),
            Explore("content_10"),
            Explore("content_11"),
            Explore("content_12"),
            Explore("content_13"),
            Explore("content_14"),
            Explore("content_15"),
            Explore("content_16"),
            Explore("content_17"),
            Explore("content_18"),
            Explore("content_19"),
            Explore("content_20"),
            Explore("content_21"),
            Explore("content_22"),
            Explore("content_23"),
            Explore("content_24"),
            Explore("content_25"),
            Explore("content_26"),
            Explore("content_27"),
            Explore("content_28"),
            Explore("content_29"),
            Explore("content_30"),
            Explore("content_31"),
            Explore("content_32"),
            Explore("content_33"),
            Explore("content_34"),
            Explore("content_35"),
            Explore("content_36"),
            Explore("content_37"),
            Explore("content_38"),
            Explore("content_39"),
            Explore("content_40"),
            Explore("content_41"),
            Explore("content_42"),
            Explore("content_43"),
            Explore("content_44"),
            Explore("content_45"),
            Explore("content_46"),
            Explore("content_47"),
            Explore("content_48"),
            Explore("content_49"),
            Explore("content_50"),
            Explore("content_51"),
            Explore("content_52"),
            Explore("content_53"),
            Explore("content_54"),
            Explore("content_55"),
            Explore("content_56"),
            Explore("content_57"),
            Explore("content_58"),
            Explore("content_59"),
            Explore("content_60"),
            Explore("content_61"),
            Explore("content_62"),
            Explore("content_63"),
            Explore("content_64"),
            Explore("content_65"),
            Explore("content_66"),
            Explore("content_67"),
            Explore("content_68"),
            Explore("content_69"),
            Explore("content_70"),
            Explore("content_71"),
            Explore("content_72"),
            Explore("content_73"),
            Explore("content_74"),
            Explore("content_75"),
            Explore("content_76"),
            Explore("content_77"),
            Explore("content_78"),
            Explore("content_79"),
            Explore("content_80")
        )
    }
}