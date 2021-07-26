; Saswat Mohanty
; 1941012407

; Addition of two 16 bit numbers using direct addressing mode

org 100h

mov ax,0000h
mov ds,ax
mov ax,[5000h]      ;VALUE STORED AT 5000 = 1111
mov bx,[5002h]      ;VALUE STORED AT 5002 = 2222
add ax,bx
mov [5004h],ax
hlt

ret




