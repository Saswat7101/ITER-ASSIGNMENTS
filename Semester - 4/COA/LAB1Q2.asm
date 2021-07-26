; SASWAT MOHANTY
; 1941012407

; Addition of two 16bit numbers using direct addressing mode

org 100h

MOV AX,0000H
MOV DS,AX
ADD AX,[2000H]      ; value stored at 2000 = 1111
MOV BX ,[2100H]     ; value stored at 2100 = 2222
ADD AX,BX
MOV [3004H],AX 

hlt

ret




