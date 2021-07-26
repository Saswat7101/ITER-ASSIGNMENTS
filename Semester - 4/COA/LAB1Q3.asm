; SASWAT MOHANTY
; 1941012407

; Addition of two 16bit numbers using indirect addressing mode

org 100h

MOV AX,2000H
MOV DS,AX
MOV SI,0400H
MOV AX ,[SI]         ; value stored at 20400 = 1111
INC SI               ; value stored at 20402 = 2222
INC SI
MOV BX,[SI] 
ADD AX,BX  
INC SI
INC SI
MOV [SI],AX 

hlt

ret




