$data = Get-Content -Path data.txt
$registry = Get-Content -Path dustregistry.txt
$model = Get-Content -Path dustmodel.txt
$tinymodel = Get-Content -Path tinydustmodel.txt
$lang = Get-Content -Path dustlang.txt

foreach($d in $data){
    $lcApiName = $d.ToLower().Replace(' ', '_').Replace("'", '')
    $ucApiName = $d.ToUpper().Replace(' ', '_').Replace("'", '')

    $dustregistry = $registry.Replace('{API_NAME}', $ucApiName).Replace('{api_name}', $lcApiName)
    $dustregistry >> "Output\Registry.txt"
    #$dustregistry

    $dustmodel = $model.Replace('{api_name}', $lcApiName)
    $filename = $lcApiName + '_dust'
    $dustmodel | Out-File "Output\blockmodel\$filename.json" -Encoding utf8
    
    $tinydustmodel = $tinymodel.Replace('{api_name}', $lcApiName)
    $tinyfilename = 'tiny_' + $lcApiName + '_dust'
    $tinydustmodel | Out-File "Output\blockmodel\$tinyfilename.json" -Encoding utf8

    $dustLang = $lang.Replace('{api_name}', $lcApiName).Replace('{Api_name}', $d)
    $dustLang >> "Output\Lang.txt"
    #$dustLang
}