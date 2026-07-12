param(
    [Parameter(Mandatory = $true)][string]$WorkspaceRoot,
    [Parameter(Mandatory = $true)][string]$FullFileName
)

$ErrorActionPreference = "Stop"

$binDir = Join-Path $WorkspaceRoot "bin"
if (-not (Test-Path $binDir)) {
    New-Item -ItemType Directory -Path $binDir | Out-Null
}

& javac -d $binDir -sourcepath $WorkspaceRoot $FullFileName
if ($LASTEXITCODE -ne 0) { exit $LASTEXITCODE }

$relPath = $FullFileName.Substring($WorkspaceRoot.Length).TrimStart('\', '/')
$relNoExt = $relPath.Substring(0, $relPath.Length - [System.IO.Path]::GetExtension($relPath).Length)
$className = $relNoExt -replace '[\\/]', '.'

& java -cp $binDir $className
exit $LASTEXITCODE
