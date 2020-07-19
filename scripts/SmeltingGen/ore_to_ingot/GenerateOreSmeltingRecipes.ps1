$data = Get-Content -Path data.txt
$template = Get-Content -Path smeltingtemplate.txt
$btemplate = Get-Content -Path blastingtemplate.txt

foreach($d in $data){
    $name,$exp = $d -split '\t'

    $lcApiName = $name.ToLower().Replace(' ', '_').Replace("'", '')

    $recipe = $template.Replace('{api_name}', $lcApiName).Replace('{exp}', $exp)
    $filename = $lcApiName+'_ingot.json'
    $recipe | Out-File "Output\$filename" -Encoding utf8

    $recipe = $btemplate.Replace('{api_name}', $lcApiName).Replace('{exp}', $exp)
    $filename = $lcApiName+'_ingot_from_blasting.json'
    $recipe | Out-File "Output\$filename" -Encoding utf8
}