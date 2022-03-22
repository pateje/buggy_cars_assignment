# buggy_cars_assignment

Test Approach for Assignment

Identifying defects present on the BuggyCars website firstly through exploratory testing. Note down unusual behaviour. Once complete, write bug reports for the defects. Analyse available automation frameworks. Choose one fit for purpose as per the assignment task then automate BuggyCars critical functionalities using chosen automation framework.

Top 5 Critical functionalities of BuggyCars
1. Registration
2. Log in
3. Update profile details
4. Voting with and without a comment
5. Log out

Bug Report
- Tester: Insert name here
- Scenario: Profile page log out
- Steps: Log in. Navigate to Profile. Press log out.
- Expected result: Main page is displayed once user is logs out.
- Actual result: User remains on the Profie page. User information in text boxes in Basic & Additional Info tabs are retained.
- Status: Fail

Bug Report 
- Tester: Insert name here
- Scenario: Popular Make page
- Steps: Log in. Navigate to Lamborghini page from main page (https://buggy.justtestit.org). Press 'Buggy Rating' text on top left of web page.
- Expected result: User is returned to the main page
- Actual result: Link does not work and user remains on the Popular Make page
- Status: Fail

Bug Report
- Tester: Insert name here
- Scenario: Overall Rating page
- Steps: Log in. Navigate to Overall Rating page from main page (https://buggy.justtestit.org). Vote on each car with a comment.
- Expected result: Date, author name & comment is printed correctly for each vote.
- Actual result: Models Diable and Murciélago have no author name. Model AVENDATOR has no comment. 
- Status: Fail

Prerequisites
- IntelliJ IDEA Ultimate
- Github
- Selenium UI Plugin
