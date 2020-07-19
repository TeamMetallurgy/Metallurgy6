$data = Get-Content -Path data.txt
$registry = Get-Content -Path registryblueprint.txt
$model = Get-Content -Path modelblueprint.txt
$lang = Get-Content -Path langblueprint.txt

foreach($d in $data){
    $lcApiName = $d.ToLower().Replace(' ', '_').Replace("'", '')
    $ucApiName = $d.ToUpper().Replace(' ', '_').Replace("'", '')

    $itemregistry = $registry.Replace('{API_NAME}', $ucApiName).Replace('{api_name}', $lcApiName)
    $itemregistry >> "Output\Registry.txt"

    $itemmodel = $model.Replace('{api_name}', $lcApiName)
    $itemmodel | Out-File "Output\blockmodel\$lcApiName.json" -Encoding utf8

    $itemLang = $lang.Replace('{api_name}', $lcApiName).Replace('{Api_name}', $d)
    $itemLang >> "Output\Lang.txt"
}