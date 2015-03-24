#[2015-03-23] Challenge #207 [Easy] Bioinformatics 1: DNA Replication
# http://www.reddit.com/r/dailyprogrammer/comments/2zyipu/20150323_challenge_207_easy_bioinformatics_1_dna/

complements = {'A': 'T',
			   'T': 'A',
			   'G': 'C',
			   'C': 'G'}

testString = "A A T G C C T A T G G C"


arr = testString.split(" ")
result = ""
for i in arr:
	result += complements[i] + " "

print(result)
