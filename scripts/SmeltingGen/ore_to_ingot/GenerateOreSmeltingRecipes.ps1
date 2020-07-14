$data = Get-Content -Path data.txt
$template = Get-Content -Path smeltingtemplate.txt

foreach($d in $data){
    $name,$exp = $td -split '\t'

    $lcApiName = $name.ToLower().Replace(' ', '_').Replace("'", '')

    $recipe = $template.Replace('{api_name}', $lcApiName).Replace('{exp}', $exp)
    #$recipe | Out-File $lcApiName+'_ingot.json' -Encoding utf8
    $recipe
}