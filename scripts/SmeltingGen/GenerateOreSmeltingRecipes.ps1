$data = Get-Content -Path data.txt
$template = Get-Content -Path smeltingtemplate.txt

foreach($d in $data){
    $name,$exp = $d -split '\t'

    $lcApiName = $name.ToLower().Replace(' ', '_').Replace("'", '')

    $recipe = $template.Replace('{api_name}', $lcApiName).Replace('{exp}', $exp)
    $fileName = $lcApiName + '_ingot.json'
    $recipe | Out-File "Output\$fileName" -Encoding utf8
}