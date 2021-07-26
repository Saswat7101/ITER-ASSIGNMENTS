; SASWAT MOHANTY
; 1941012407

; Addition of two 16bit numbers using index addressing mode

org 100h

MOV AX,2000H
MOV DS,AX     
MOV SI,0700H           ;VALUES STORED AT 20700 = 1111
MOV AX,[SI+0]          ;VALUES STORED AT 20702 = 2222
MOV BX,[SI+2]
ADD AX,BX
MOV [SI+4],AX 

HLT

ret




