; SASWAT MOHANTY
; 1941012407

; Write a program to find the sum of two BCD numbers.

org 100h  

mov ax,0000h
mov ds,ax
mov al,[3000h]    ; Value stored at 3000 = 3333             
mov bl,[3002h]    ; Value stored at 3002 = 1111           
add al,bl                                        
daa               ;           BCD code for 3333 :	0011 0011 0011 0011
mov [3004h],al    ;           BCD code for 1111 :	0001 0001 0001 0001
mov al,[3001h]    ;           ------------------------------------------
mov bl,[3003h]    ;                    Addition :   0100 0100 0100 0100
adc al,bl         ;                   BCD Value :      4    4    4    4       	
daa                                  
mov [3005h],al    ; So final BCD addition value is 4444
mov al,00         
adc al,al         
mov [3006h],al    
hlt               
                  
ret                 
                  
                  