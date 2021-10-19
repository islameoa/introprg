#################################
EXPRESSIONS AMB OPERADORS LÒGICS
#################################

la Clara és més jove que tu:
    - edatClara < edatUsuari
    
la Clara i el Marc són més joves que tu:
    - edatClara && edatMarc < edatUsuari

la Clara és més jove que tu i tu ets més jove que el Marc:
    - edatClara < edatUsuari < edatMarc

la Clara no és més jove que el Marc:
    - edatClara > edatMarc

no és cert que el Marc sigui més jove que la Clara:
    - (edatMarc < edatClara) == false
    
Ni el Marc és més jove que la Clara ni tu ets més jove que el Marc:
    - edatUsuari > edatClara > edatMarc

Tu ets més gran que la Clara i el Marc junts o bé la Clara i el Marc tenen la mateixa edat:
    - edatUsuari > edatClara + edatMarc || edatClara == edatMarc
    
Jo peso més que el meu germà pero menys que el meu pare:
    - pesUsuari > pesGerma && pesUsuari < pesPare
    
És mentida que tingui més anys que el meu pare:
    - edatUsuari > edatPare == false
