; Saswat Mohanty
; 1941012407

; Subtraction of two 16 bit numbers using direct addressing mode

org 100h

mov ax,0000h
mov ds,ax
mov ax,[3000h]       ;VALUE STORED AT 3000 = 2222
mov bx,[3002h]       ;VALUE STORED AT 3002 = 1111
sub ax,bx
mov [3004h],ax
hlt

ret




