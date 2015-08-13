#http://www.reddit.com/r/dailyprogrammer/comments/378h44/20150525_challenge_216_easy_texas_hold_em_1_of_3/
from random import shuffle

class Card:
	suit = ''
	value = ''

	def __init__(self, suit, value):
		self.suit = suit
		self.value = value

	def __str__(self):
		return(self.value + ' of ' + self.suit)

	def __repr__(self):
		return(self.value + ' of ' + self.suit)

class Deck:
	cards = []
	suits = ["Spades", "Clubs", "Diamonds", "Hearts"]
	values = ["Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"]

	def __init__(self):
		self.reset()

	#reset the list of cards
	def reset(self):
		self.cards = []
		for suit in self.suits:
			for value in self.values:
				self.cards.append(Card(suit, value))
		shuffle(self.cards)

	def draw(self):
		return list.pop(self.cards)

class Player():
	name = ""
	hand = []
	chips = 0

	def __init__(self, name):
		self.name = name

	def changeHand(self, newHand):
		self.hand = newHand


def deal(deck, num):
		hand = []
		for x in range(0, num):
			hand.append(list.pop(deck.cards))
		
		return hand

def play():
	deck = Deck()
	players = []
	playerCt = 0
	while(playerCt < 2 or playerCt > 8):
		playerCt = int(input("How many players (2-8)? "))
		if(playerCt < 2):
			print("Feeling lonely?")
		elif(playerCt > 8):
			print("Table's a bit small...")
	print()

	#Deal player hand
	player = Player("Player 1")
	player.changeHand(deal(deck, 2))
	players.append(player)

	#Deal CPU Hands
	for x in range(1, playerCt):
		cpu = Player("CPU "+ str(x))
		cpu.changeHand(deal(deck, 2))
		players.append(cpu)

	#print all hands
	for p in players:
		print(p.name + "'s Hand: ", end='') 
		print(p.hand)
	print()

	#deal flop
	flop = deal(deck, 3)
	print("Flop: ", end='')
	print(flop)

	#deal turn
	turn = deal(deck, 1)
	print("Turn: ", end='')
	print(turn)

	#deal river
	river = deal(deck, 1)
	print("River: ", end='')
	print(river)
	#print(len(deck.cards))
	#print(deck.draw())
	#print(len(deck.cards))


play()