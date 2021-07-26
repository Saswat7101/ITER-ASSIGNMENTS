// Name: Saswat Mohanty
// Registration No.: 1941012407
// Branch: CSE
// Section: D

import java.util.*;
public class EncryptByPin {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		// Inputing 4 numbers . . 
		System.out.println("Enter 4 numbers:");
		String a = sc.nextLine(), b = sc.nextLine(), c = sc.nextLine(), d = sc.nextLine(), pin="", encrypt="", en="";;
		int c1 = 0, tmp;
		char ch1,ch2;
		// Inputing the string . . 
		System.out.println("Enter your message:");
		String msg = sc.nextLine();
		// Making the alphabet to lower case letters . . 
		msg = msg.toLowerCase();
        // REplace All Space to no space . . 
        msg = msg.replaceAll(" ","");
        // To find the length of the integers inputed  as String ..
        int l = a.length();
        // To make the pin to be Encripted in the message . . 
        for(int i=0;i<l;i++)
        {
            if(a.charAt(i)<b.charAt(i) && a.charAt(i)<c.charAt(i) && a.charAt(i)<d.charAt(i))
            {
                pin = pin + a.charAt(i);
            }
            else if(b.charAt(i)<c.charAt(i) && b.charAt(i)<d.charAt(i))
            pin = pin + b.charAt(i);

            else if(c.charAt(i)<d.charAt(i))
            pin = pin + c.charAt(i);

            else

                pin = pin + d.charAt(i);
            }
        System.out.println("Encrypted using the pin " + pin);
        // Taking to make the pin of that length as the message . . 
         for(int i=0; i<msg.length(); i++)
        {
            char ch=msg.charAt(i);
            en=en+ch;
        }
        msg=en;
        // Adding the Created message sized pin in the message inputed by the user .  .
        for(int i=0; i<msg.length(); i++,c1++)
        {
            if(c1==(pin.length()))
                c1=0;
            ch1=msg.charAt(i);
            ch2=pin.charAt(c1);
            tmp=(int)ch2;
            tmp=tmp-48;
            ch1=(char)((int)ch1+tmp);
            if(ch1>122)
            {
                ch1=(char)((int)ch1-122);
                ch1=(char)((int)ch1+96);
            }
            encrypt=encrypt+ch1;
        }
        // Making all character to the upper case .  .
        encrypt=encrypt.toUpperCase();
        // Printing the String in uppercase . . 
        System.out.println("Encrypted Message :"+encrypt);

	}

}
