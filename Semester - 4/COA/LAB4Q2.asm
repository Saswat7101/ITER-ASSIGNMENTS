; SASWAT MOHANTY
; 1941012407

; Divide two 16 bit numbers without using arithmetic instructions.

org 100h

mov ax, 0000h
mov ds, ax
mov ax,[3000h]    ; Value stored at 3000 = 0064
                  ; Binary of 0064 = 0000 0000 0110 0100
mov cl,02h        ; So we have to perform 2 right shift 
                  ; After 1st shift -> 0000 0000 0011 0010 = 0032
                  ; After 2nd shift -> 0000 0000 0001 1001 = 0019
shr ax,cl         ; Output = 0019
mov [3002h], ax   ; Value at 3002 = 0019
hlt

ret




