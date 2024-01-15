# Exercise 1

```
As a supermarket shopper,
So that I can pay for products at checkout,
I'd like to be able to know the total cost of items in my basket.
```

```
As an organised individual,
So that I can evaluate my shopping habits,
I'd like to see an itemised receipt that includes the name and price of the products
I bought as well as the quantity, and a total cost of my basket.
```

| Classes        | Methods                                      | Scenario                    | Outputs                                                                                      |
|----------------|----------------------------------------------|-----------------------------|----------------------------------------------------------------------------------------------|
| ShoppingBasket | calculateTotalCost(ArrayList\<ShoppingItem>) | No items in basket          | Returns 0                                                                                    |
|                |                                              | One or more items in basket | Returns the total cost of the items                                                          |
|                | generateReceipt(ArrayList\<ShoppingItem>)    | No items in basket          | Returns null                                                                                 |
|                |                                              | One or more items in basket | Returns formatted string with item names, quantity and prices with the total cost at the end |
