dictionary = {1: "Bacon, Egg & Cheese McGriddles Meal",
              2: "Sausage, Egg & Cheese McGriddles Meal",
              3: "Artisan Grilled Chicken Sandwich Meal",
              4: "Egg McMuffin Meal",
              5: "Sausage McGriddles Meal",
              6: "Sausage Burrito Meal",
              7: "Buttermilk Crispy Chicken Sandwich Meal",
              8: "Big Mac Meal",
              9: "Cheeseburger Meal",
              10: "$5 Meal Deal"}


userinput = input("Would you like to see the combo numbers, the combo names, or both? (cnums/cnames/both): ")

if userinput.lower() == "cnums":
    print(dictionary.keys())
elif userinput.lower() == "cnames":
    print(dictionary.values())
elif userinput.lower() == "both":
    print(dictionary)
