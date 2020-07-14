$data = Get-Content -Path data.txt
$registry = Get-Content -Path ingotregistry.txt
$model = Get-Content -Path ingotmodel.txt
$lang = Get-Content -Path ingotlang.txt

foreach($d in $data){
    $lcApiName = $d.ToLower().Replace(' ', '_').Replace("'", '')
    $ucApiName = $d.ToUpper().Replace(' ', '_').Replace("'", '')

    $ingotregistry = $registry.Replace('{API_NAME}', $ucApiName).Replace('{api_name}', $lcApiName)
    $ingotregistry >> "Output\Registry.txt"
    #$ingotregistry

    $ingotmodel = $model.Replace('{api_name}', $lcApiName)
    $filename = $lcApiName + '_ingot'
    $ingotmodel | Out-File "Output\blockmodel\$filename.json" -Encoding utf8

    $ingotlang = $lang.Replace('{api_name}', $lcApiName).Replace('{Api_name}', $d)
    $ingotlang >> "Output\Lang.txt"
    #$ingotlang
}