Meta:

Narrative:
In order to withdraw
As an admin
I want to fill the input, submit the form and check the return message

GivenStories: stories/Deposit.story

Scenario: Open withdraw Page
When User clicks on menu Withdrawn

Scenario: User on withdraw Page
When User select his account <cpfNumber>
And User fills the amount input with value <amount>
And User clicks on withdraw button
Then The return message for withdraw is <message>
Examples:
| cpfNumber     || amount  || message                                   |
|11111111111    || 100     || Operation completed with success          |
|11111111111    || 0       || The ammount is invalid for the operation  |