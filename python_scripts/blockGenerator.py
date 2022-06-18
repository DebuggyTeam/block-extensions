import json
import os

from python_scripts.anApiThingy import ROOT_DIR

block_ex_block = input("Input Block-Ex block name: ")
minecraft_block = input("Input Minecraft block name: ")
namespace = input("Input mod namespace or skip if you're using the \"minecraft:\" namespace: ")

if len(namespace) == 0:
    namespace = "minecraft"

blockstate_dict = {
    "variants": {
        "": {"model": f"block_extensions:block/{block_ex_block}_block"}
    }
}

block_model = {
    "parent": "minecraft:block/cube_all",
    "textures": {
        "all": f"{namespace}:block/{minecraft_block}"
    }
}

item_dict = {
    "parent": f"block_extensions:block/{block_ex_block}_block"
}

files = [blockstate_dict, block_model, item_dict]
directories = [
    "assets\\block_extensions\\blockstates",
    "assets\\block_extensions\\models\\block",
    "assets\\block_extensions\\models\\item"
]

for i, j in zip(files, directories):
    os.chdir(f"{ROOT_DIR}\\src\\main\\resources\\{j}")
    with open(f"{block_ex_block}_block.json", "w") as file:
        json.dump(i, file, indent=4)
        file.close()
print(f"Files for {block_ex_block.title()} Block have been generated")
