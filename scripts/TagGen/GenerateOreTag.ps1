$ingots = Get-Content -Path ingots.txt
$tagblueprint = Get-Content -Path tagblueprint.txt

foreach($ingot in $ingots){
    $lcApiName = $ingot.ToLower().Replace(' ', '_').Replace("'", '')
    $oreName = $lcApiName + '_ore'

    $dustmodel = $tagblueprint.Replace('{api_name}', $oreName)
    $dustmodel | Out-File "..\..\src\main\resources\data\forge\tags\items\ores\$lcApiName.json" -Encoding utf8
}