$data = Get-Content -Path data.txt

foreach($d in $data){
    $material,$rod = $d -split '\t'

    $lcApiName = $material.ToLower().Replace(' ', '_').Replace("'", '')

    $tools = 'pickaxe', 'axe', 'shovel', 'hoe', 'sword'
    foreach($tool in $tools){
        $blueprintName = $tool + 'blueprint.txt'
        $blueprint = Get-Content -Path $blueprintName

        $recipe = $blueprint.Replace('{rod}', $rod.ToLower()).Replace('{material}', $lcApiName)
        $filename = $lcApiName + '_' + $tool
        $recipe | Out-File "..\..\..\src\main\resources\data\metallurgy6\recipes\$filename.json" -Encoding utf8
    }
}