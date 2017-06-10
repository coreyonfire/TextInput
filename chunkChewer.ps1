param (
    [Parameter(Mandatory=$true)][string]$inFileName,
    [string]$outFileName="output.txt",
    [int]$chunkSize = 256
 )

# get content of file
$counter = 0
$fileContent = Get-Content -Path $inFileName -Encoding Byte -ReadCount $chunkSize | foreach-object {
	$output = ""
	foreach ( $byte in $_ ) {
		$output += [System.Text.Encoding]::ASCII.GetString($byte)
	}
	$output | Set-Content "$counter-$outFileName" -encoding UTF8
	$counter = $counter+1
}




# USAGE: 
# cd to wherever the script is located, give fully qualified input file name
# PARAMETERS: 
# - inFileName : input file name
# - outFileName : output file name (OPTIONAL, default is "output.txt")
# - chunkSize : how many chunks per file (OPTIONAL, default is 256)
#PS C:\Users\corey\Desktop> .\chunkChewer.ps1 -inFileName ".\input.txt"
#PS C:\Users\corey\Desktop> .\chunkChewer.ps1 -inFileName ".\input.txt" -chunkSize 1024
#PS C:\Users\corey\Desktop>
#