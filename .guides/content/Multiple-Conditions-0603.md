If you want to apply multiple conditions to your query, you need to make sure you specify the conditions in the same order you specify the values. As an example, here’s how you’d update records from the DRINK table where the name of the drink is “Latte”, or the drink description is “Our best drip coffee”.

![](.guides/img/23.png)

The condition values must be Strings, even if the column you’re applying the condition to doesn’t contain Strings. If this is the case, you need to convert your values to Strings. As an example, here’s how you’d return DRINK records where the _id is 1:

![](.guides/img/24.png)