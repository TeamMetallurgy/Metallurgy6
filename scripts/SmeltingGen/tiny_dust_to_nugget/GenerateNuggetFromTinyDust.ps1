$data = Get-Content -Path data.txt
$template = Get-Content -Path smeltingtemplate.txt

foreach($d in $data){
    $lcApiName = $d.ToLower().Replace(' ', '_').Replace("'", '')

    $recipe = $template.Replace('{api_name}', $lcApiName)
    $fileName = $lcApiName + '_nugget_from_tiny_dust.json'
    $recipe | Out-File "Output\$fileName" -Encoding utf8
}