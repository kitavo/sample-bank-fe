Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

GivenStories: stories/CreateAccount.story

Scenario: Open deposit page
When User clicks on menu Deposit

Scenario: User on deposit Page
When User select his account <cpfNumber>
And User fills the amount input with value <amount>
And User clicks on deposit button
Then The return message for deposit is <message>
Examples:
| cpfNumber     || amount || message                                    |
|11111111111    || 100    || Operation completed with success           |
|11111111111    || 0      || The ammount is invalid for the operation   |
|22222222222    || 100    || Operation completed with success           |