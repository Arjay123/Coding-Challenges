#http://www.reddit.com/r/dailyprogrammer/comments/378h44/20150525_challenge_216_easy_texas_hold_em_1_of_3/
class Card:
	suit = ''
	value = ''

	def __init__(self, suit, value):
		self.suit = suit
		self.value = value

	def printCard(self):
		print(self.value + ' of ' + self.suit)


#card = Card("Spades", "10")
#card.printCard()
