#http://www.reddit.com/r/dailyprogrammer/comments/378h44/20150525_challenge_216_easy_texas_hold_em_1_of_3/
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



#deck = Deck()
#print(deck.cards)
