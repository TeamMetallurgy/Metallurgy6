$oredata = Get-Content -Path data.txt
$registry = Get-Content -Path Registry.txt
$blockstate = Get-Content -Path Blockstate.txt
$lang = Get-Content -Path Lang.txt
$blockmodel = Get-Content -Path BlockModel.txt
$itemmodel = Get-Content -Path ItemModel.txt
$loottable = Get-Content -Path LootTable.txt

foreach($ore in $oredata){
    $name,$temp,$rarity,$offX,$offy,$maxY,$maxVein = $ore -split '\t'

    $orename = $name.ToLower() + "_ore"

    $oreregistry = $registry.Replace('{API_NAME}', $name.ToUpper()).Replace('{api_name}', $name.ToLower()).Replace('{temp}', $temp).Replace('{rarity}', $rarity).Replace('{offx}', $offX).Replace('{offy}', $offY).Replace('{maxy}', $maxY).Replace('{maxvein}', $maxVein)
    $oreregistry >> "Output\Registry.txt"
    
    $oreblockstate = $blockstate.Replace('{api_name}', $name.ToLower())
    $oreblockstate | Out-File "Output\blockstate\$orename.json" -Encoding utf8

    $orelang = $lang.Replace('{Api_name}', $name).Replace('{api_name}', $name.ToLower())
    $orelang >> "Output\Lang.txt"

    $oreblockmodel = $blockmodel.Replace('{api_name}', $name.ToLower())
    $oreblockmodel | Out-File "Output\blockmodel\$orename.json" -Encoding utf8

    $oreitemmodel = $itemmodel.Replace('{api_name}', $name.ToLower())
    $oreitemmodel | Out-File "Output\itemmodel\$orename.json" -Encoding utf8

    $oreloottable = $loottable.Replace('{api_name}', $name.ToLower())
    $oreloottable | Out-File "Output\loottable\$orename.json" -Encoding utf8
}
