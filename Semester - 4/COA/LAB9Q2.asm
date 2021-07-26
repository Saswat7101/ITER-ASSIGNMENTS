; SASWAT MOHANTY
; 1941012407

; Write a program to determine the smallest number in an array.

org 100h

mov ax,0000h
mov ds,ax
mov si,1500h    ; Total number of elements = 03
mov di,1510h    ; Memory address for storing the output
mov cl,[si]     ; Assign the value at 1500 to cl
inc si          ; increment si i.e. to memory location 1501
mov al,[si]     ; assign the value at 1501 to al
dec cl          ; decrease the value of cl by 1
l1: inc si      ; imcrement si i.e. to memory location 1502
    mov bl,[si] ; assign the value at 1502 to bl
    cmp al,bl   ; compare al and bl to check which value is smaller
    jc again    ; after comparison if there is carry then jump to "again" pointer
    mov al,bl   ; if there is no carry the it will assign the value in bl to al
again: dec cl   ; decrease the cl count by 1
       jnz l1   ; until cl count is zero the program wil keep on moving to "l1" pointer
mov [di],al     ; move the value in al to di i.e. to 1510 memory location
hlt

ret




