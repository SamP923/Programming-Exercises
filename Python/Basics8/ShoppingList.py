dictionary = {0: "$5 Meal Deal",
              1: "Bacon, Egg & Cheese McGriddles Meal",
              2: "Sausage, Egg & Cheese McGriddles Meal",
              3: "Artisan Grilled Chicken Sandwich Meal",
              4: "Egg McMuffin Meal",
              5: "Sausage McGriddles Meal",
              6: "Sausage Burrito Meal",
              7: "Buttermilk Crispy Chicken Sandwich Meal",
              8: "Big Mac Meal",
              9: "Cheeseburger Meal"}

shoppingList = []
shoppingNum = []
doneShopping = False

print(dictionary)

while doneShopping == False:
    item = input("What item would you like to buy (item#)? ")
    if item == "done":
        doneShopping == True
        break
    howMany = int(input("How many would you like to buy (#)? "))
    shoppingList.append(item)
    shoppingNum.append(howMany)

count = 0;
for x in shoppingList:
    print("You bought " + str(shoppingNum[count]) + " " + dictionary[int(x)])
    count +=1
    
