$tooldata = Get-Content -Path tool.txt
$material = Get-Content -Path toolmaterial.txt
$registry = Get-Content -Path toolregistry.txt
$model = Get-Content -Path toolmodel.txt
$lang = Get-Content -Path toollang.txt

foreach($td in $tooldata){
    $name,$hrv,$uses,$eff,$matAtkDmg,$ench,$swDmg,$swSpd,$pDmg,$pSpd,$shDmg,$shSpd,$aDmg,$aSpd,$hSpd = $td -split '\t'

    $lcApiName = $name.ToLower().Replace(' ', '_').Replace("'", '')
    $ucApiName = $name.ToUpper().Replace(' ', '_').Replace("'", '')

    $toolregistry = $registry.Replace('{API_NAME}', $ucApiName).Replace('{api_name}', $lcApiName).Replace('{pDmg}', $pDmg).Replace('{pSpd}', $pSpd).Replace('{aDmg}', $aDmg).Replace('{aSpd}', $aSpd).Replace('{shDmg}', $shDmg).Replace('{shSpd}', $shSpd).Replace('{swDmg}', $swDmg).Replace('{swSpd}', $swSpd).Replace('{hSpd}', $hSpd)
    $toolregistry >> "Output\Registry.txt"
    #$toolregistry

    $toolmaterial = $material.Replace('{API_NAME}', $ucApiName).Replace('{hrv}', $hrv).Replace('{uses}', $uses).Replace('{eff}', $eff).Replace('{matDmg}', $matAtkDmg).Replace('{ench}', $ench)
    $toolmaterial >> "Output\Material.txt"
    #$toolmaterial

    foreach($tool in 'sword','shovel','axe','pickaxe','hoe'){
        $toolmodel = $model.Replace('{api_name}', $lcApiName).Replace('{tool}', $tool)
        $filename = $lcApiName + '_' + $tool
        $toolmodel | Out-File "Output\blockmodel\$filename.json" -Encoding utf8
    }

    $toollang = $lang.Replace('{api_name}', $lcApiName).Replace('{Api_name}', $name)
    $toollang >> "Output\Lang.txt"
    #$toollang
}



