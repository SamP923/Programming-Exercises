dict =       {"drink":["Water", "Lemonade"],
              "appetizer":["Cheese plate", "Fries", "Assorted Fruit"],
              "entree":["Hamburger", "Mac n' Cheese", "Steak"],
              "dessert":["Ice Cream", "Cotton Candy"]}

menuType = str(input("Would you like to see the drink, appetizer, entree, or dessert menu? "))

for x in dict[menuType]:
    print(x)
