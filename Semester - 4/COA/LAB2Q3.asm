; Saswat Mohanty
; 1941012407

; Multiplication of two 16 bit numbers using direct addressing mode

org 100h

mov ax,0000h
mov ds,ax
mov ax,[3000h]      ;VALUE STORED AT 3000 = 1111
mov bx,[3002h]      ;VALUE STORED AT 3002 = 2222
mul bx
mov [3004h],ax
mov [3006h],dx
hlt

ret




