; SASWAT MOHANTY
; 1941012407

; Multiply two 16 bit numbers without using arithmetic instructions.

org 100h

mov ax, 0000h
mov ds, ax
mov ax,[3000h]    ; Value stored at 3000 = 0030
                  ; Binary of 0030 = 0000 0000 0011 0000                                 
mov cl, 02h       ; We have to perform 2 left shift                 
                  ; After 1st shift -> 0000 0000 0110 0000 = 0060
                  ; After 2nd shift -> 0000 0000 1100 0000 = 00C0
sal ax, cl        ; Output value = 00C0                   
mov [3002h], ax   ; Value at 3002 = 00C0
hlt

ret


