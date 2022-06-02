# G = (V, E)

from collections import namedtuple

print("Import Complete")

bibimbopUniverse = namedtuple("BibimbopUniverse", ["vertices", "edges"])

kingdoms = ["Rice Castle", "Carrot City", "Onion City", "Mushroom City", "Zucchinni City", "Spicy Pork City", "Gochujjang River", "Bulgogi City", "Ground Beef City", "Tofu City",
            "Galbi City", "Poultry Deadlands", "Outcast Vegetable Lands", "Eggplant City"]

edges = [
    ("Rice Castle", "Carrot City"),
    ("Rice Castle", "Onion City"),
    ("Rice Castle", "Mushroom City"),
    ("Rice Castle", "Zucchinni City"),
    ("Rice Castle", "Spicy Pork City"),
    ("Spicy Pork City", "Tofu City"),
    ("Spicy Pork City", "Eggplant City"),
    ("Spicy Pork City", "Gochujjang River"),
    ("Gochujjang River", "Tofu City"),
    ("Gochujjang River", "Poultry Deadlands"),
    ("Gochujjang River", "Eggplant City"),
    ("Gochujjang River", "Galbi City"),
    ("Gochujjang River", "Bulgogi City"),
    ("Gochujjang River", "Outcast Vegetable Lands"),
    ("Bulgogi City", "Ground Beef City"),
    ("Ground Beef City", "Galbi City"),
    ("Tofu City", "Outcast Vegetable Lands"),
    ("Eggplant city", "Outcast Vegetable Lands"),
]
