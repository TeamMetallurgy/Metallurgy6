$ingots = Get-Content -Path ingots.txt
$tagblueprint = Get-Content -Path tagblueprint.txt

foreach($ingot in $ingots){
    $lcApiName = $ingot.ToLower().Replace(' ', '_').Replace("'", '')
    $ingotName = $lcApiName + '_ingot'

    $dustmodel = $tagblueprint.Replace('{api_name}', $ingotName)
    $dustmodel | Out-File "..\..\src\main\resources\data\forge\tags\items\ingots\$lcApiName.json" -Encoding utf8
}