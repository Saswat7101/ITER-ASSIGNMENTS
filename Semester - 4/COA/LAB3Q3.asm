; SASWAT MOHANTY
; 1941012407

; NOT of a 16 bit number using direct addressing mode
org 100h

mov ax,0000h
mov ds,ax
mov ax,[3000h]    ; Value stored at 3000 = 0202 -> 0000 0010 0000 0010
not ax            ;                              ------------------------
mov [3002h],ax    ;                         NOT -> 1111 1101 1111 1101 = FDFD
 
hlt

ret




