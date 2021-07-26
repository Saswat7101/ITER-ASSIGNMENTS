; SASWAT MOHANTY
; 1941012407

;  Write a program to find 1's and 2's complement of a given number without 
;  using logical instructions.

org 100h

mov ax,0000h
mov ds, ax
mov ax,[3000h]   ; Value stored at 3000 = FFFF = 1111 1111 1111 1111
mov bx,[3002h]   ; Value stored at 3002 = 1234 = 0001 0010 0011 0100
sub ax,bx        ;                      (Subtract)
                 ;                      -----------------------------
mov [3004h],ax   ;             1's complement =  1110 1101 1100 1011 = EDCB 
inc ax           ;                             +                   1
mov [3006h],ax   ;                      -----------------------------
hlt              ;             2's complement =  1110 1101 1100 1100 = EDCC                 

ret

