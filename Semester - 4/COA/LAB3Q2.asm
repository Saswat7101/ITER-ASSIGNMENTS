; SASWAT MOHANTY
; 1941012407

; OR two 16 bit numbers using direct addressing mode
org 100h

mov ax,0000h
mov ds,ax
mov ax,[3000h]    ; Value stored at 3000 = 0202 -> 0000 0010 0000 0010
mov bx,[3002h]    ; Value stored at 3002 = 0303 -> 0000 0011 0000 0011
or ax,bx          ;                              -----------------------------
mov [3004h],ax    ;                          OR -> 0000 0011 0000 0011 = 0303
 
hlt

ret




