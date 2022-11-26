#language:pt
  @register
  Funcionalidade: Como usuário, eu quero do site Register
    Eu desejo realizar um cadastro
    Para validar se o cadastro foi realizado com sucesso.



  @Test001
  Cenario: Validar cadastro com sucesso no site Register
    Dado que eu acesse o site Register
    Quando preencho o campo nome com valor "Bruno" e sobrenome com valor "Farias"
    E preencho o campo endereco com valor "Av. Celso Garcia, 1907"
    E preencho o campo email com valor "teste@teste.com"
    E preencho o campo telefone com valor "9-9999-9998"
    E clico no campo genero com valor Male e clico no campo hobie1 com valor Cricket e clico no campo hobie2 com valor Movies
    E clico no campo habilidade com valor XML

