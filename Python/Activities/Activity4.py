print("Lets play Rock, Paper and Scissor game!")
player1_choice = input("Player1, what will you choose from rock, paper and scissor?").lower()
player2_choice = input("Player1, what will you choose from rock, paper and scissor?").lower()

if player1_choice == player2_choice:
    print("It's a tie!")
elif player1_choice == 'rock':
    if player2_choice == 'scissors':
        print("Rock wins!")
    else:
        print("Paper wins!")
elif player1_choice == 'scissors':
    if player2_choice == 'paper':
        print("Scissors win!")
    else:
        print("Rock wins!")
elif player1_choice == 'paper':
    if player2_choice == 'rock':
        print("Paper wins!")
    else:
        print("Scissors win!")

#extra line as per the answer
else:
    print("Invalid input! You have not entered rock, paper or scissors, try again.")

repeat = input("Players, do you want to play again?").lower()

if (repeat == "yes"):
    pass

elif (repeat == "no"):
    raise SystemExit
else:
        print("Invalid choice !")
        raise SystemExit