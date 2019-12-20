# LASKURI
# Ohjelma aloittaa laskurin
# Ohjelma lopettaa laskurin
# Ohjelma laskee kauanhko aikaa meni
# Käyttäjä haluaa nähdä tunnit ja minuutit, koska ne ovat helposti ymmärrettäviä
#
# Ohjelma kaipaa kovia muokkauksia
# Tällä hetkellä ohjelma toimii paremmin python-consolessa

import time

start = time.time()
print('Ajanlasku alkaa')
end = time.time()
tulos = end - start
# yritetään nollata desimalit 0.60:sta
# Ja lisätä kokonaislukuun 1
# Das isn't toimi:
if tulos > 0.59:
    tulos = +1.00-0.60
    print(tulos)
