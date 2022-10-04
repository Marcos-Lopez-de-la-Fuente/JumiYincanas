import requests
from bs4 import BeautifulSoup

def get_price(url):
    html_text = requests.get(url).text
    soup = BeautifulSoup(html_text, 'html.parser')
    arrayResultado = soup.find_all("h2", {"class": "texto"})




    return arrayResultado



url = "http://www.frases1000.com/pagina/21"
arrayResultado = get_price(url)


contador = 1
for i in arrayResultado:
    print(i)
    print(contador)
    contador = contador + 1 
