; SASWAT MOHANTY
; 1941012407

; Write a program to calculate average of N 16-bit numbers

org 100h

mov ax,0000h
mov ds,ax
mov si,1500h       ; total number of elements = 07
mov di,1510h       ; address value to store the output = average of the elements
mov ax,0000h                                 
mov cl,[si]        ; move the value at 1500 to cl
mov bl,cl          ; move the value of cl to bl
inc si             ; increment the value of si by 1
loop: add al,[si]  ; add and store the sum of elements in al
adc ah,00          
inc si             ; move to the next element in the array i.e. 1502
dec cl             ; decrease the count of cl by 1                         
jnz loop           ; repeat the loop until cl becomes 0                          
div bl             ; avg = (sum of elements) / (total no. of elements)
mov [di],ax        ; the average value is stored in the specified memory location
hlt

ret




