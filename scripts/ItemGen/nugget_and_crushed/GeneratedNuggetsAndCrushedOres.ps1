$data = Get-Content -Path data.txt
$registry = Get-Content -Path nuggetandcrushedoreregistry.txt
$nuggetmodel = Get-Content -Path nuggetmodel.txt
$crushedmodel = Get-Content -Path crushedoremodel.txt
$lang = Get-Content -Path nuggetandcrushedorelang.txt

foreach($d in $data){
    $lcApiName = $d.ToLower().Replace(' ', '_').Replace("'", '')
    $ucApiName = $d.ToUpper().Replace(' ', '_').Replace("'", '')

    $itemregistry = $registry.Replace('{API_NAME}', $ucApiName).Replace('{api_name}', $lcApiName)
    $itemregistry >> "Output\Registry.txt"
    #$itemregistry

    $nmodel = $nuggetmodel.Replace('{api_name}', $lcApiName)
    $nuggetfilename = $lcApiName + '_nugget'
    $nmodel | Out-File "Output\blockmodel\$nuggetfilename.json" -Encoding utf8
    
    $cmodel = $crushedmodel.Replace('{api_name}', $lcApiName)
    $crushedfilename = 'crushed_' + $lcApiName
    $cmodel | Out-File "Output\blockmodel\$crushedfilename.json" -Encoding utf8

    $itemlang = $lang.Replace('{api_name}', $lcApiName).Replace('{Api_name}', $d)
    $itemlang >> "Output\Lang.txt"
    #$itemlang
}