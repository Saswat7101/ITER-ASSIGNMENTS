; SASWAT MOHANTY
; 1941012407

; Addition of two 16bit numbers using base index addressing mode

org 100h             
                     
MOV AX,0000H         ;value stored at 0000 = 1111
MOV DS,AX
MOV BX,3000H     
MOV SI,0500H         ;value stored at 3500 = 2222

MOV CX,[BX+SI]       ;value stored at 3502 = 3333
MOV DX,[BX+SI+02]
MOV AX,CX
ADD AX,DX

HLT

ret                        



