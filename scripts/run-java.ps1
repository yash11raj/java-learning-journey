param(
    [Parameter(Mandatory = $true)]
    [string]$RelPath
)

$root = Split-Path -Parent $PSScriptRoot
Set-Location $root

$binDir = Join-Path $root "bin"
if (-not (Test-Path $binDir)) {
    New-Item -ItemType Directory -Path $binDir | Out-Null
}

$fullPath = Join-Path $root $RelPath
& javac -d $binDir -cp $binDir $fullPath
if ($LASTEXITCODE -ne 0) { exit $LASTEXITCODE }

$relDir = Split-Path -Parent $RelPath
$className = [System.IO.Path]::GetFileNameWithoutExtension($RelPath)

if ($relDir -and $relDir -ne ".") {
    $pkg = $relDir -replace '[\\/]', '.'
    $fqcn = "$pkg.$className"
} else {
    $fqcn = $className
}

& java -cp $binDir $fqcn
exit $LASTEXITCODE
