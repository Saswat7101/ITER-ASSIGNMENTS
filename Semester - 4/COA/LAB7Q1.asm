; SASWAT MOHANTY
; 1941012407

; Write a program to swap the upper nibble of a word with the lower nibble 
; content of an accumulator.

org 100h 

mov ax,0000h
mov ds,ax
mov ax,[5000h]   ; Input Value at 5000 = 1234 =    0001 0010 0011 0100

mov cl,08h       ; For swapping, we have to rotate 8 bits

rol ax,cl        ; Rotating left first 4 bits =    0010 0011 0100 0001 = 2341
                 ; Rotating left the next 4 bits = 0011 0100 0001 0010 = 3412

mov [5002h],ax   ; Output value at 5002 = 3412
hlt

ret
