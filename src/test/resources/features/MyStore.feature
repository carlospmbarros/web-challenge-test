#language:pt
Funcionalidade: Adicionar produtos no carrinho

  Contexto:
    Dado que esteja logado na pagina My Store com os dados
      | email    | datumqatest@soprock.com |
      | password | datum2021               |

  @adicionaProduto
  Cenario: adiciono produtos

    Dado que esteja na pagina principal de My Store
    Quando seleciono o produto alterando as opcoes do produto
      | nome                        | quantidade | tamanho | cor   |
      | Printed Chiffon Dress       |            | M       | verde |
      | Faded Short Sleeve T-shirts |            |         | azul  |
      | Blouse                      | 2          |         |       |
      | Printed Dress               |            |         |       |
    Entao valido que possuo "5" itens no carrinho